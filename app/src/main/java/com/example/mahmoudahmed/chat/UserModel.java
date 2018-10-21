package com.example.mahmoudahmed.chat;

public class UserModel {
    private String Name;
    private String State;
    private String UserId;
    private String EmailAddress;
    private String PhoneNumber;
    private String Verification;
    private String Password;

    public UserModel() {
    }

    public UserModel(String name, String state, String userId, String emailAddress, String phoneNumber, String verification, String password) {
        Name = name;
        State = state;
        UserId = userId;
        EmailAddress = emailAddress;
        PhoneNumber = phoneNumber;
        Verification = verification;
        Password = password;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getVerification() {
        return Verification;
    }

    public void setVerification(String verification) {
        Verification = verification;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
