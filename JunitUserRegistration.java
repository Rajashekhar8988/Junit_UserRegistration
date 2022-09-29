package bridgeLabz.JunitUserRegistration;

import java.util.Scanner;
import java.util.regex.*;

public class JunitUserRegistration {
	//Checking for first name start with capital and has minimum 3 characters 
	public static boolean isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
	}
	//Checking for last name start with capital and has minimum 3 characters 
	public static boolean isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-z]{3,}$");
		Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
	}
	//method to check for a valid Email
	public static boolean isValidEmail(String email) {
	Pattern pattern = Pattern.compile("^[a][b][c].[x][y][z][@][b][l].[c][o].[i][n]$");
	Matcher matcher = pattern.matcher(email);
    return matcher.matches();
	}
	//method to check for a valid mobile number
	public static boolean isValidMobileNumber(String phoneNumber) {
		Pattern pattern = Pattern.compile("^[+][1-9]{1,3} [0-9]{10}$");
		Matcher matcher = pattern.matcher(phoneNumber);
	    return matcher.matches();    
		}	
	//method to check for a valid password
	//Rule-1: has minimum 8 characters
	//Rule-2: atleast 1 upper case
	//Rule-3:atleast 1 numeric number
	public static boolean isValidPassword(String password) {
		Pattern pattern = Pattern.compile("(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[#?!@$%^&*-]).{8,}$");
		Matcher matcher = pattern.matcher(password);
	    return matcher.matches();
	}
	//method to check for a valid for different Emails
	public static boolean isValidUserEmail(String emalId) {
		Pattern pattern = Pattern.compile("^[a-zA-Z-9]+([._+-]*[0-9A-Za-z]+)*@[a-zA-Z0-9]+.[a-zA-Z]{2,4}([.][a-z]{2,4})?$");
		Matcher matcher = pattern.matcher(emalId);
	    return matcher.matches();
		}
}