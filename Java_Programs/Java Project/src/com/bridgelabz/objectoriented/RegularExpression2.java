/*
 * Purpose:  Read in the following message: Hello <<name>>, We have your full name as <<full name>> in our system.
 *			 your contact number is 91-xxxxxxxxxx.Use Regex to replace name, full name, Mobile#, and Date with 
 *			 proper value.
 *	@author: Nainesh R Patil.
 */		
package com.bridgelabz.objectoriented;

//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RegularExpression2 
{
	public static void regexExpression(String fullName, String mobile, String firstName) 
	{
		String Message = "Hello <<name>>, We have your full name "
				+ "as <<full name>> in our system. \n\t\tYour contact number is +91­xxxxxxxxxx. \n\tPlease,let us "
				+ "know in case of any clarification.\n\t\t\t Thank you!!!\n\t\t\tBridgeLabz 01/01/2016. ";
		// create regex
		String regexName = "<<name>>";
		String regexFname = "<<full name>>";
		String regexNum = "­xxxxxxxxxx";
		String regexDate = "01/01/2016";
		SimpleDateFormat Date = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date(); // to get current time and date
		String fdate = Date.format(date);

		Message = Message.replaceAll(regexName, firstName); 
		Message = Message.replaceAll(regexFname, fullName); 
		Message = Message.replaceAll(regexNum, mobile); 
		Message = Message.replaceAll(regexDate, fdate); 
		System.out.println(Message);//display modified message
	}
	public static void main(String[] args)
	{
		regexExpression("Nainesh Patil", "7798353210", "Nainesh");
	}
}

