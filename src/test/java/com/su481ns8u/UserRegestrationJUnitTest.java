package com.su481ns8u;

import org.junit.Assert;
import org.junit.Test;

public class UserRegestrationJUnitTest {
    UserRegestrationMain userRegestrationMain = new UserRegestrationMain();
    boolean result;

    @Test
    public void fistNameValidation_returnsTrue_ifFirstNameProper() {
        result = userRegestrationMain.firstNameValidation("Sudhanshu");
        Assert.assertTrue(result);
    }

    @Test
    public void firstNameValidation_returnsFalse_ifNumberOfCharsDosentMatch() {
        result = userRegestrationMain.firstNameValidation("Su");
        Assert.assertFalse(result);
    }

    @Test
    public void firstNameValidation_returnsFalse_ifFirstCharNotUpper() {
        result = userRegestrationMain.firstNameValidation("sudhanshu");
        Assert.assertFalse(result);
    }
}
