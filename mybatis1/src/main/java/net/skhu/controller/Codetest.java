package net.skhu.controller;

import java.util.Scanner;

public class Codetest {

	public String solution(String str, String str2) {

		StringBuffer sb = new StringBuffer();
		String answer = "";

		for ( int i = 0; i < str.length(); i ++) {
			int pos1 = 0;
			int pos2 = str.indexOf(str.charAt(i));
			int min = 0;
			int prepos =0;
			while ( pos1 < 0 ) {
				min = Math.min(pos2 - pos1, prepos);
				pos1 = str.indexOf(str2, pos1);
				prepos = pos1;
			}
			answer += String.valueOf(min);
		}

		return answer;

	}

	public static void main(String[] args) {

		Codetest T = new Codetest();
		Scanner in = new Scanner(System.in);
	    String input1 = in.next();
	    String input2 = in.next();

	    System.out.println(T.solution(input1, input2));
	}




}
