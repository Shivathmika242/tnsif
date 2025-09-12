package javatraining;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		 
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter a number:");
		 int number = sc.nextInt();
		 
		 int original=number;
		 int result=0;
		 int digits = String.valueOf(number).length();
		 
		 while(number>0) {
			 int digit = number%10;
			 result+=Math.pow(digit,digits);
			 number/=10;
		 }
		 if(result==original) {
			 System.out.println(original + " is an Armstrong number");
		 }
		 else {
			 System.out.println(original + " is not a Armstrong number");
		 }
			 

	}

}
