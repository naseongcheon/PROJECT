package net.skhu.controller;

import java.util.Scanner;

public class Codetest {

	public int[] solution(String str, char str2) {
		int[] answer = new int [str.length()];
		int p =1000;

		for(int i =0; i < str.length();i++) {
			if(str.charAt(i) == str2)
				p=0;
			else
				p++;

			answer[i] = p;
		}

		p =1000;
		for(int i = str.length()-1; i >= 0; i--) {
			if(str.charAt(i) == str2)
				p=0;
			else
				p++;

			answer[i] = Math.min(answer[i], p);
		}

		return answer;

	}

	public static void main(String[] args) {

		Codetest T = new Codetest();
		Scanner in = new Scanner(System.in);
	    String input1 = in.nextLine();
	    char input2 = in.next().charAt(0);

	    for(int i : T.solution(input1, input2)) {
	    	System.out.print(i + " ");
	    }
	    //System.out.println(T.solution(input1, input2));
	}




}
