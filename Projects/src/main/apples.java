package main;
import java.util.Scanner;
public class apples {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int n = 0;
		int scores[]=new int[n];
		System.out.println("Enter number of test scores to average: ");
		n = scan.nextInt();
		
		for(int i = 0; i<n;i++) {
			int scoreInput = scan.nextInt();
			sum = sum+scoreInput;
		}
		System.out.println("Average score: "+sum/n);
		
	}
}
