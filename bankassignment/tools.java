package bankassignment;
import java.util.*;
import java.io.*;
public class tools{
	public static double takeNum(){
		Scanner scan = new Scanner(System.in);
		while (true) {
			String num = scan.nextLine();
			try{
				double attempt = Double.parseDouble(num);
				return attempt;
			} catch (NumberFormatException e) {
				System.out.println("Invalid. Please enter a number.");
			}
		}
	}
	public static String takeString(){
		Scanner scan = new Scanner(System.in);
		while (true){
			String string = scan.nextLine();
			for (int i=0; i < string.length(); i++){
				char letter = string.charAt(i);
				if ( (letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z') || letter == '-' || letter == '.'){
					if (i==string.length()-1){
						return string;
					}
				} else{
					System.out.println("Invalid. Please enter letters.");
					break;
				}
			}
		}
	}
}
