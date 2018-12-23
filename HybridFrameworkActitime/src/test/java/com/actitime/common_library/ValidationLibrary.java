package com.actitime.common_library;

import org.testng.Assert;

public class ValidationLibrary 
{
	public static String verifyTitle(String expTitle,String actTitle)
	{
		try
		{
			Assert.assertEquals(expTitle, actTitle);
			return "Pass";
		}
		catch(AssertionError rv)
		{
			return "Fail";
		}
		
	}
	
	public static String verifySucessMsg(String expSuccesMsg,String actSuccesMsg)
	{
		try
		{
			Assert.assertEquals(expSuccesMsg, actSuccesMsg);
			return "Pass";
		}
		catch(AssertionError rv)
		{
			return "Fail";
		}
		
	}
	public static String verifyErrorMsg(String expErrorMsg,String actErrorMsg)
	{
		try
		{
			Assert.assertEquals(expErrorMsg, actErrorMsg);
			return "Pass";
		}
		catch(AssertionError rv)
		{
			return "Fail";
		}
			
	}
}
