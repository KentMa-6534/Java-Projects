package main;
import java.util.Scanner;
public class credit {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		long cc;
		int i = 0;
		
		do {
			System.out.println("Credit Card Number: ");
			cc = scan.nextLong();
		}while(cc<0);
		long n = cc;
		while(n>0) {
			n=n/10;
			i++;
		}
		if(i!=13 && i!=15 && i!=16) {
			System.out.println("INVALID\n");
			System.exit(0);
		}
		long sum1 = 0;
		long sum2 = 0;
		long x = cc;
		long total = 0;
		long mod1;
		long mod2;
		long d1;
		long d2;
		
		do {
			mod1 = x%10;
			x = x/10;
			sum1 = sum1+mod1;
			
			mod2 = x%10;
			x = x/10;
			
			mod2 = mod2*2;
			d1 = mod2%10;
			d2 = mod2/10;
			sum2 = sum2+d1+d2;
			
		}while(x>0);
		total = sum1+sum2;
		if(total%10!=0) {
			System.out.println("INVALID\n");
			System.exit(0);
		}
		long start = cc;
		do {
			start = start/10;
		}while(start>100);
		
		if(start/10==4) {
			System.out.println("VISA\n");
		}
		else if((start/10==3) && (start%10==4||start%10==7)){
			System.out.println("AMEX\n");
		}
		else if((start/10==5) && (0<start%10 && start%10<6)) {
			System.out.println("MASTERCARD\n");
		}
		else {
			System.out.println("INVALID\n");
		}
		
	}

}
