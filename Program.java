package code;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Create a Scanner object
		int current=0;
				do {
					String input = scanner.nextLine(); // Read user input
					current = Integer.parseInt(input);		

					if(current==0) {
					break;
						
					}
					if(current==1) {
						System.out.println(0);
						
					}else {
						for(int a=0;a<100;a++) {
							double bottom=0.5*a*a-0.5*a+2;
							double top=0.5*a*a+0.5*a+1;
							if(current>=bottom&&current<=top) {
								System.out.println(a);
								break;
							}
						}
					}
					
				} while (current!=0);
	}
}
