package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class PhoneNumberValidation {
    UserRegistration userRegistration = new UserRegistration();

    private String keys;
    private boolean values;

    public PhoneNumberValidation(String keys, boolean values){
        this.keys = keys;
        this.values = values;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testForMobileNum(){
        Object[][] testingMobile = new Object[][]{
                {"91 9822917991", true},
                {"91   9822917991", false},
                {"913 9822917991", true},
                {"9822917991", false}
        };
        return Arrays.asList(testingMobile);
    }

    @Test
    public void validateMobileNumber() {
        boolean result = userRegistration.mobileValidation(keys);
        Assert.assertEquals(result,values);
    }
}
