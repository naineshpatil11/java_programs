package com.bridgelabz.clinique;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Utility 
{
	

			static int count = 0;
			public static Scanner scanner = new Scanner(System.in);
			public static Pattern pattern = null;

			public static String inputString(String string) {
				System.out.println(string);
				return (scanner.nextLine());
			}

			public static int inputInteger(String string) {
				System.out.println(string);
				return (Integer.parseInt(scanner.nextLine()));
			}
			public static int inputIntegerValue() {
				return Integer.parseInt(scanner.next());
  }
			public static long inputLong(String string) {
				System.out.println(string);
				return (Long.parseLong(scanner.nextLine()));
			}

			public static double inputDouble(String string) {
				System.out.println(string);
				return (Double.parseDouble(scanner.nextLine()));
			}

			/******************
			 * static method for taking input as String
			 **************************/
			public static String inputString() {
				return (scanner.nextLine());
				// sc.close();

			}

			public static String getStringValue() {
				return (scanner.next());
			}

			public static String inputStringValue() {
				return (scanner.next());

			}
		

			/**
			 * This method takes integer input from user
			 * 
			 * @return integer value
			 */
			public static int getInt() {
				int integer = scanner.nextInt();
				return integer;
			}

			/**
			 * This method is used to take long input from user
			 * 
			 * @return long value
			 */
			public static long getLong() {
				long longValue = scanner.nextLong();
				return longValue;
			}

			/**
			 * This method is used to take double input from user
			 * 
			 * @return double value
			 */
			public static double getDouble() {
				double doubleValue = scanner.nextDouble();
				return doubleValue;
			}

			/**
			 * This method is used to take float input from user
			 * 
			 * @return float value
			 */
			public static float getFloat() {
				float floatValue = scanner.nextFloat();
				return floatValue;
			}

			/**
			 * This method is used to take String input from user
			 * 
			 * @return String
			 */
			public static String getString() {
				String string = scanner.nextLine();
				return string;
			}

			public static boolean getBoolean() {
				boolean booleanValue = scanner.nextBoolean();
				return booleanValue;
			}

}
