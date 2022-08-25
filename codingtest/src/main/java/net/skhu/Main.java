package net.skhu;
import java.util.Scanner;

public class Main {
	  public int solution(int num, String str) {
		  int answer = 1;
		  String[] strAry = str.split(" ");
		  int n = Integer.parseInt(strAry[0]);

		  for(int i=1; i<num; i++) {
			  int tmp = Integer.parseInt(strAry[i]);

			  if( tmp > n ) {
				  n = tmp;
				  answer++;
			  }

		  }

		  return answer;

		}

		public static void main(String[] args) {

			Main T = new Main();
			Scanner in = new Scanner(System.in);
		    int input1 = in.nextInt();
		    in.nextLine();
		    String input2 = in.nextLine();

		    System.out.println(T.solution(input1, input2));

		}
	}