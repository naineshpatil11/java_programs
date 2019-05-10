 package com.bridgelabz.objectoriented.addressbook;

public class PhoneNumber
{
		long mobileNumber;
		@Override
		public String toString() {
			return "PhoneNumber [mobileNumber=" + mobileNumber + "]";
		}
		public long getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(long mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
}
