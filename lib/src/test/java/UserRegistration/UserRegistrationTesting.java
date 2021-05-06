package UserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTesting {

    @Test
    public void FirstName() {
        UserRegistration1 user = new UserRegistration1();
        boolean result = user.CheckFirstName("Kailashnath");
        Assert.assertTrue(result);
    }

    @Test
    public void LastName() {
    	UserRegistration1 user = new UserRegistration1();
        boolean result = user.CheckLastName("Vishwakarma");
        Assert.assertTrue(result);
    }

    @Test
    public void Mail() {
    	UserRegistration1 user = new UserRegistration1();
        boolean result = user.Email("nathkailash2020@gmail.com");
        Assert.assertTrue(result);
    }

    @Test
    public void Number() {
    	UserRegistration1 user = new UserRegistration1();
        boolean result = user.PhoneNumber("91 9205267464");
        Assert.assertTrue(result);
    }

    @Test
    public void PasswordTest() {
    	UserRegistration1 user = new UserRegistration1();
        boolean result = user.Password("baba@Kailash97");
        Assert.assertTrue(result);
    }
}


