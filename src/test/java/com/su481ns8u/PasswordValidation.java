package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PasswordValidation {
    UserRegistration userRegistration = new UserRegistration();

    private String keys;
    private boolean values;

    public PasswordValidation(String keys, boolean values){
        this.keys = keys;
        this.values = values;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testForPassword(){
        Object[][] testingPasswords = new Object[][]{
                {"Sudh123ansh@u", true},
                {"sudha12nsh$u", false},
                {"@Su123sdh",true},
                {"Su1dh",false},
                {"Su768hjbmn",false},
                {"Sushahsna",false}
        };
        return Arrays.asList(testingPasswords);
    }

    @Test
    public void validatePassword() {
        boolean result = userRegistration.passwordValidation(keys);
        Assert.assertEquals(result,values);
    }
}
