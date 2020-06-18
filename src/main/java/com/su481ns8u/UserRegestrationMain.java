package com.su481ns8u;

public class UserRegestrationMain {

    public boolean firstNameValidation (String fname) {
        return fname.matches("^[A-Z]{1}[a-zA-Z]{2,}");
    }
}
