import java.util.InputMismatchException;
import java.util.Scanner;
public class main {
	public static void main(String[]args) {
		Scanner scan = new Scanner(System.in);
		bottle b = new bottle();
		int action;
		while(true) {
		try {
		do {
		System.out.println("You see a bottle.\n You can:\n 1.) Open the bottle\n 2.) Close the bottle\n 3.) Take a closer look ");
		action = scan.nextInt();
		}while(action<=0 || action>=4);
		
		switch(action) {
		case 1:
			b.unscrew();
			break;
		case 2:
			b.screw();
			break;
		case 3:
			b.bottleInfo();
			break;
		}
		}
		catch(InputMismatchException e){
			System.out.println("Invalid data type input!");	
		}
		}
	}
}


