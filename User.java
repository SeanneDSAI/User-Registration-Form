package com.mycompany.registrationform;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JANE
 */
public class User {
    String name = "";
    String address = "";
    String email = "";
    String phoneNumber = "";
    String username = "";
    String gender = "";
    private char[] password = new char[5]; 
    private boolean checkSocialOn = false;
    private boolean checkGoogleOn = false;
    private boolean checkFriendsOn = false;
    private boolean checkOtherOn = false;
    private int satisfaction = 0;
    
    public User(String name, String phoneNumber, String address, String gender, String ageCat, String email, String username, char[] password, boolean social,boolean google, boolean friend, boolean other, int satisfaction){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.gender = gender;
        this.email = email;
        this.username = username;
        this.password = password;
        this.checkSocialOn = social;
        this.checkGoogleOn = google;
        this.checkFriendsOn = friend;
        this.checkOtherOn = other;
        this.satisfaction = satisfaction;
        
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public boolean isCheckSocialOn() {
        return checkSocialOn;
    }

    public void setCheckSocialOn(boolean checkSocialOn) {
        this.checkSocialOn = checkSocialOn;
    }

    public boolean isCheckGoogleOn() {
        return checkGoogleOn;
    }

    public void setCheckGoogleOn(boolean checkGoogleOn) {
        this.checkGoogleOn = checkGoogleOn;
    }

    public boolean isCheckFriendsOn() {
        return checkFriendsOn;
    }

    public void setCheckFriendsOn(boolean checkFriendsOn) {
        this.checkFriendsOn = checkFriendsOn;
    }

    public boolean isCheckOtherOn() {
        return checkOtherOn;
    }

    public void setCheckOtherOn(boolean checkOtherOn) {
        this.checkOtherOn = checkOtherOn;
    }

    public int getSatisfaction() {
        return satisfaction;
    }

    public void setSatisfaction(int satisfaction) {
        this.satisfaction = satisfaction;
    }
    
    
   
}
