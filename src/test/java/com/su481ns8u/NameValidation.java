package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class NameValidation {
    UserRegistration userRegistration = new UserRegistration();
    private String keys;
    private boolean values;

    public NameValidation(String keys, boolean values){
        this.keys = keys;
        this.values = values;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testForFName(){
        Object[][] testingFirstNames = new Object[][]{
                {"Sudhanshu", true},
                {"sudhanshu", false},
                {"Su",false},
                {"SUDhanshu",false}
        };
        return Arrays.asList(testingFirstNames);
    }

    @Test
    public void validateFirstName() {
        boolean result = userRegistration.firstNameValidation(keys);
        Assert.assertEquals(result,values);
    }

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
        boolean result = userRegistration.lastNameValidation(keys);
        Assert.assertEquals(result,values);
    }
}
