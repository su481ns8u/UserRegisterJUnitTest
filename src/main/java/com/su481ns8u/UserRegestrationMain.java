package com.su481ns8u;

public class UserRegestrationMain {

    public boolean firstNameValidation (String fname) {
        return fname.matches("^[A-Z]{1}[a-z]{2,}");
    }

    public boolean lastNameValidation (String lname) {
        return lname.matches("^[A-Z]{1}[a-z]{2,}");
    }

    public boolean emailValidation (String email) {
        return email.matches("^[a-zA-Z0-9]+(([._+-]?)[a-zA-Z0-9]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-zA-Z]{2,3})*$");
    }

    public boolean mobileValidation (String mobile) {
        return mobile.matches("^[1-9]+[0-9]+[\\ ]?+[1-9]{1}[0-9]{9}$");
    }

    public boolean passwordValidation (String password) {
        return password.matches("^[a-zA-Z0-9]{8,}$");
    }
}