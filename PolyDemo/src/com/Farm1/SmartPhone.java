package com.Farm1;

public class SmartPhone extends Phone{
	public void sendEmail(String message, String address) {
		System.out.println("SmartPhone: Sending Email");
		/* logic to send email message */
	}

	public String retrieveEmail() {
		System.out.println("SmartPhone: Retrieving Email");
		String messages = new String();
		/* Return a String containing all of the messages */
		return messages;
	}

	public boolean isRinging() {
		System.out.println("SmartPhone: Checking if phone is ringing");
		boolean ringing = false;
		/* Check for email activity and only continue when their is none. */
		/* Check if the phone is ringing and set the ringing variable */
		return ringing;
	}
}
