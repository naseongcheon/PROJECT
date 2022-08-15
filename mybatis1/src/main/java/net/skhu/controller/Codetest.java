package net.skhu.controller;

import java.util.Scanner;

public class Codetest {

	public String solution(String str) {
		char[] charArray = str.toCharArray();
		char[] charArray2 = str.toCharArray();

		for(int i=0; i < charArray.length; i++) {
			if (( charArray[i] >= 65 && charArray[i] <= 90) ||
				( charArray[i] >= 97 && charArray[i] <= 122) ) {
				charArray2[charArray.length -1-i] = charArray[i];
			}
		}

		String a= new String(charArray2);
		return a;

	}

	public static void main(String[] args) {

		Codetest T = new Codetest();

		Scanner in = new Scanner(System.in);
	    String input1 = in.next();

	    System.out.println(T.solution(input1));
	}




}
