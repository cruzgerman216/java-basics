package com.qa.java.stringmanipulation;

public class StringManipulation {
	public static void main(String[] args) {
		String str1 = "yesterday it was raining";
		String str2 = "today it is sunny";
		String con = str1.toUpperCase() + str2.toUpperCase();
		System.out.println(con);
		String mySubString1 = str2.substring(0, 11);
		String mySubString2 = str1.substring(16, 24);
		System.out.println(mySubString1 + mySubString2);
		System.out.println(getNumberOfWords("hey there I'm jane."));
		printVerticalSentence("Hey there I'm jane.");
		printReverseVerticalSentence("Hey there I'm jane.");
		
		System.out.println(findMessage("hey","hey there i'm jane"));
	}
	
	public static int getNumberOfWords(String str) {
		int count = 1;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				count++;
			}
		}
		return count;
	}
	
	public static void printVerticalSentence(String str) {
		String word = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == ' ') {
				System.out.println(word);
				word = "";
			}else {
				word += str.charAt(i);
			}
		}
		System.out.println(word);
	}
	
	public static void printReverseVerticalSentence(String str) {
		int first = str.length();
		int last = 0;
		for(int i  = str.length()-1; 0 < i; i--) {
			if(str.charAt(i) == ' ') {
				System.out.println(str.substring(i+1, first));
				first = i;
			}else if(i-1 == 0) {
				System.out.println(str.substring(0, first));
			}
			
		}
	}
	
	public static boolean findMessage(String message, String longmessage) {
		return longmessage.contains(message);
	}
}
