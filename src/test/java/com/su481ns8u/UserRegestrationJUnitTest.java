package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegestrationJUnitTest {
    UserRegestrationMain userRegestrationMain = new UserRegestrationMain();

    private String keys;
    private boolean values;

    public UserRegestrationJUnitTest(String keys, boolean values){
        this.keys = keys;
        this.values = values;
    }

    /* ----- First Name Validation ----- */
    @Parameterized.Parameters
    public static Collection<Object[]> testForFName(){
        Object[][] testingFirstNames = new Object[][]{
                {"Sudhanshu", true},
                {"sudhanshu", false},
                {"Su",false}
        };
        return Arrays.asList(testingFirstNames);
    }

    @Test
    public void validateFirstName() {
        boolean result = userRegestrationMain.firstNameValidation(keys);
        Assert.assertEquals(result,values);
    }

    /* ---- Last Name Validation ----- */
    @Parameterized.Parameters
    public static Collection<Object[]> testForLName(){
        Object[][] testingLastNames = new Object[][]{
                {"Ghinmine", true},
                {"ghinmine", false},
                {"gh",false}
        };
        return Arrays.asList(testingLastNames);
    }

    @Test
    public void validateLastName() {
        boolean result = userRegestrationMain.lastNameValidation(keys);
        Assert.assertEquals(result,values);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testForEmail(){
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
                {"?alice.@example.com", false},
        };
        return Arrays.asList(testingEmails);
    }

    @Test
    public void validateEmail() {
        boolean result = userRegestrationMain.lastNameValidation(keys);
        Assert.assertEquals(result,values);
    }
}