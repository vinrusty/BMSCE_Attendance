package com.eventsapp.bmsceattendance;

public class HelperClass {
    String name, email, usn, password;

    public HelperClass() {
    }

    public HelperClass(String name, String email, String usn, String password) {
        this.name = name;
        this.email = email;
        this.usn = usn;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsn() {
        return usn;
    }

    public void setUsn(String usn) {
        this.usn = usn;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
