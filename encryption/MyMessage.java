package com.encryption;

import java.security.Key;
import java.util.Arrays;
import java.util.Scanner;
import com.decryption.*;

public class MyMessage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String encryptedUserMessageInBytes = null;
		String encryptedUserMessageInChars = null;
		String decryptedUserMessageInChars = null;
		Key myKey = SecretKeyGenerator.myKeyGen();

		System.out.println("Please Enter The Message You Would Like To Keep Secret:");

		String userMessage = sc.nextLine();

		byte[] encryptedUserMessage = EncryptMessage.EncryptMe(userMessage, myKey);

		encryptedUserMessageInBytes = Arrays.toString(encryptedUserMessage);
		encryptedUserMessageInChars = new String(encryptedUserMessage);

		System.out.println("Your message in Characters is:\n" + encryptedUserMessageInChars);
		System.out.println("Your message in Numbers is:\n" + encryptedUserMessageInBytes);

		byte[] decryptedUserMessage = DecryptMessage.DecryptMe(encryptedUserMessage, myKey);
		decryptedUserMessageInChars = new String(decryptedUserMessage);
		System.out.println("Your Decoded message is:\n" + decryptedUserMessageInChars);

		sc.close();
	}

}
