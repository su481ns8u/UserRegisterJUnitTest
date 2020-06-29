package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class EmailValidation {
    UserRegistration userRegistration = new UserRegistration();

    String key;
    Boolean val;

    private String keys;
    private boolean values;

    public EmailValidation(String keys, boolean values) {
        this.keys = keys;
        this.values = values;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testForEmail() {
        Object[][] testingEmails = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.net", true},
                {"abc@1.com", true},
                {"abc@gmail.com.com", true},
                {"abc+100@gmail.com", true},
                {".abc@gmail.com", false},
                {"alice.@example.c", false},
                {"alice@example.dd..com", false},
                {"alice:;@example.com", false},
                {"?alice.@example.com", false}
        };
        return Arrays.asList(testingEmails);
    }

    @Test
    public void validateEmail() {
        boolean result = userRegistration.emailValidation(keys);
        Assert.assertEquals(result, values);
    }
}
