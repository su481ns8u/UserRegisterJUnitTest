package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    private String keys;
    private boolean values;

    public UserRegistrationTest(String keys, boolean values){
        this.keys = keys;
        this.values = values;
    }

    /* ----- First Name Validation ----- */
//    @Parameterized.Parameters
//    public static Collection<Object[]> testForFName(){
//        Object[][] testingFirstNames = new Object[][]{
//                {"Sudhanshu", true},
//                {"sudhanshu", false},
//                {"Su",false},
//                {"SUDhanshu",false}
//        };
//        return Arrays.asList(testingFirstNames);
//    }

    @Test
    public void validateFirstName() {
        boolean result = userRegistration.firstNameValidation(keys);
        Assert.assertEquals(result,values);
    }

    /* ---- Last Name Validation ----- */
//    @Parameterized.Parameters
//    public static Collection<Object[]> testForLName(){
//        Object[][] testingLastNames = new Object[][]{
//                {"Ghinmine", true},
//                {"ghinmine", false},
//                {"gh",false}
//        };
//        return Arrays.asList(testingLastNames);
//    }

    @Test
    public void validateLastName() {
        boolean result = userRegistration.lastNameValidation(keys);
        Assert.assertEquals(result,values);
    }

    /* ----- Validation for all conditions of email ----- */
//    @Parameterized.Parameters
//    public static Collection<Object[]> testForEmail(){
//        Object[][] testingEmails = new Object[][]{
//                {"abc@yahoo.com", true},
//                {"abc-100@yahoo.com", true},
//                {"abc.100@yahoo.com", true},
//                {"abc111@abc.com", true},
//                {"abc-100@abc.net", true},
//                {"abc.100@abc.com.net", true},
//                {"abc@1.com", true},
//                {"abc@gmail.com.com", true},
//                {"abc+100@gmail.com", true},
//                {".abc@gmail.com", false},
//                {"alice.@example.c", false},
//                {"alice@example.dd..com", false},
//                {"alice:;@example.com", false},
//                {"?alice.@example.com", false}
//        };
//        return Arrays.asList(testingEmails);
//    }

    @Test
    public void validateEmail() {
        boolean result = userRegistration.emailValidation(keys);
        Assert.assertEquals(result,values);
    }

    /* ----- Phone Number Validation ----- */
//    @Parameterized.Parameters
//    public static Collection<Object[]> testForMobileNum(){
//        Object[][] testingMobile = new Object[][]{
//                {"91 9822917991", true},
//                {"91   9822917991", false},
//                {"913 9822917991", true},
//                {"9822917991", false}
//        };
//        return Arrays.asList(testingMobile);
//    }

    @Test
    public void validateMobileNumber() {
        boolean result = userRegistration.mobileValidation(keys);
        Assert.assertEquals(result,values);
    }

    /* ----- Validation for password ----- */
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