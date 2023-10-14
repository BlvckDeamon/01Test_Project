package interface_practice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	//	Scanner scan = new Scanner(System.in);
		
		
		System.out.println("please enter the  number between 1 to 5");
		int i = 2;
//		int i = scan.nextInt();

		Car car = new Car();

		int ans = 5;

		

			if (i == 1) {
				car.start();
				ans = ans-1;
			} 
			else if (i == 2) {
				car.move();
				ans = ans-1;
			} 
			else if (i == 3) {
				car.left();
				ans = ans-1;
			}
			else if (i == 4) {
				car.right();
				ans = ans-1;
			}
			else if (i == 5) {
				car.stop();
				ans = ans-1;
			}

		

	}

}
