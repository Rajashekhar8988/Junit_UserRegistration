package bridgeLabz.JunitUserRegistration;

import org.junit.Assert;
import org.junit.Test;

public class JunitUserRegistrationTest {

	JunitUserRegistration junitUserRegistration = new JunitUserRegistration();
//JUnit Test to validate the User entry for First Name, Last Name,Email, Mobile, and Password.
	@Test
	public void givenFirstNameIsProperReturnTrue() {
		boolean actualResult = junitUserRegistration.isValidFirstName("Rajashekhar");
		Assert.assertEquals(true, actualResult);
	}

	@Test
	public void givenFirstNameIsProperReturnFalse() {
		boolean actualResult = junitUserRegistration.isValidFirstName("rajashekhar");
		Assert.assertEquals(false, actualResult);
	}

	@Test
	public void givenLastNameIsProperReturnTrue() {
		boolean actualResult = junitUserRegistration.isValidLastName("Reddy");
		Assert.assertEquals(true, actualResult);

	}

	@Test
	public void givenlastNameIsProperReturnFalse() {
		boolean actualResult = junitUserRegistration.isValidLastName("reddy");
		Assert.assertEquals(false, actualResult);
	}
	@Test
	public void givenemailIdIsProperReturnTrue() {
		boolean actualResult = junitUserRegistration.isValidEmail("abc.xyz@bl.co.in");
		Assert.assertEquals(true, actualResult);
	}
	@Test
	public void givenemailIdIsProperReturnFalse() {
		boolean actualResult = junitUserRegistration.isValidEmail("abc.xyzbl");
		Assert.assertEquals(false, actualResult);
	}
	@Test
	public void givenmobileNumberProperReturnTrue() {
		boolean actualResult = junitUserRegistration.isValidMobileNumber("+91 9876543211");
		Assert.assertEquals(true, actualResult);
	}
	@Test
	public void givenmobileNumberProperReturnFalse() {
		boolean actualResult = junitUserRegistration.isValidMobileNumber("9876543211");
		Assert.assertEquals(false, actualResult);
	}
	@Test
	public void givenPasswordProperReturnTrue() {
		boolean actualResult = junitUserRegistration.isValidPassword("R@ja12345");
		Assert.assertEquals(true, actualResult);
	}
	@Test
	public void givenPasswordProperReturnFalse() {
		boolean actualResult = junitUserRegistration.isValidPassword("raja12345");
		Assert.assertEquals(false, actualResult);
	}
}
