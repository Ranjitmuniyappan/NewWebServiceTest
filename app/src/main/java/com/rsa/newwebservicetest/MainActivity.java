package com.rsa.newwebservicetest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    EditText UserId;
    Button Login;
    TextView show;

    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        apiInterface  = ApiClient.getClient().create(ApiInterface.class);

        UserId = (EditText) findViewById(R.id.UserId);
        Login = (Button) findViewById(R.id.Login);
        show = (TextView) findViewById(R.id.show);

        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                getData(UserId.getText().toString());
            }
        });
    }

    public void getData(String userName)
    {
        String appVersion = "1.2";
        String os =  "Android";

        Call<LoginPojo> callData = apiInterface.putLogin(Iconstants.PUT_LOGIN ,userName, appVersion, os);
        callData.enqueue(new Callback<LoginPojo>() {
            @Override
            public void onResponse(Call<LoginPojo> call, Response<LoginPojo> response) {

                if (response.isSuccessful() && response.body().getMessage().getSuccess().equals("true"))
                {
                    for (LoginPojo.Message.Data.Result result : response.body().getMessage().getData().getResult())
                    {
                        show.setText(result.getUserDisplayName().toString());
                    }
                }
            }

            @Override
            public void onFailure(Call<LoginPojo> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.toString(), Toast.LENGTH_SHORT).show();

            }
        });
    }
}