package com.rsa.newwebservicetest;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LoginPojo {

    @SerializedName("message")
    @Expose
    private Message message;

    public Message getMessage() {
        return message;
    }

    public void setMessage(Message message) {
        this.message = message;
    }

    public class Message
    {
        @SerializedName("success")
        @Expose
        private String success;

        @SerializedName("data")
        @Expose
        private Data data;



        public String getSuccess() {
            return success;
        }

        public void setSuccess(String success) {
            this.success = success;
        }
        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

        public class Data
        {
            @SerializedName("result")
            @Expose
            private List<Result> result = null;

            public List<Result> getResult() {
                return result;
            }

            public void setResult(List<Result> result) {
                this.result = result;
            }

            public class Result
            {
                @SerializedName("userid")
                @Expose
                private String userid;
                @SerializedName("user_name")
                @Expose
                private String userName;
                @SerializedName("user_password")
                @Expose
                private Object userPassword;
                @SerializedName("user_display_name")
                @Expose
                private String userDisplayName;
                @SerializedName("user_role")
                @Expose
                private String userRole;
                @SerializedName("profile_img_path")
                @Expose
                private String profileImgPath;
                @SerializedName("version")
                @Expose
                private String version;
                @SerializedName("leads")
                @Expose
                private String leads;
                @SerializedName("point")
                @Expose
                private String point;
                @SerializedName("appstoreurl")
                @Expose
                private String appstoreurl;
                @SerializedName("ios_version")
                @Expose
                private String iosVersion;
                @SerializedName("storeurl")
                @Expose
                private String storeurl;
                @SerializedName("email")
                @Expose
                private String email;
                @SerializedName("city")
                @Expose
                private String city;

                public String getUserid() {
                    return userid;
                }

                public void setUserid(String userid) {
                    this.userid = userid;
                }

                public String getUserName() {
                    return userName;
                }

                public void setUserName(String userName) {
                    this.userName = userName;
                }

                public Object getUserPassword() {
                    return userPassword;
                }

                public void setUserPassword(Object userPassword) {
                    this.userPassword = userPassword;
                }

                public String getUserDisplayName() {
                    return userDisplayName;
                }

                public void setUserDisplayName(String userDisplayName) {
                    this.userDisplayName = userDisplayName;
                }

                public String getUserRole() {
                    return userRole;
                }

                public void setUserRole(String userRole) {
                    this.userRole = userRole;
                }

                public String getProfileImgPath() {
                    return profileImgPath;
                }

                public void setProfileImgPath(String profileImgPath) {
                    this.profileImgPath = profileImgPath;
                }

                public String getVersion() {
                    return version;
                }

                public void setVersion(String version) {
                    this.version = version;
                }

                public String getLeads() {
                    return leads;
                }

                public void setLeads(String leads) {
                    this.leads = leads;
                }

                public String getPoint() {
                    return point;
                }

                public void setPoint(String point) {
                    this.point = point;
                }

                public String getAppstoreurl() {
                    return appstoreurl;
                }

                public void setAppstoreurl(String appstoreurl) {
                    this.appstoreurl = appstoreurl;
                }

                public String getIosVersion() {
                    return iosVersion;
                }

                public void setIosVersion(String iosVersion) {
                    this.iosVersion = iosVersion;
                }

                public String getStoreurl() {
                    return storeurl;
                }

                public void setStoreurl(String storeurl) {
                    this.storeurl = storeurl;
                }

                public String getEmail() {
                    return email;
                }

                public void setEmail(String email) {
                    this.email = email;
                }

                public String getCity() {
                    return city;
                }

                public void setCity(String city) {
                    this.city = city;
                }
            }
        }
    }
}
