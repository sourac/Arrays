package atul.learning.Numbers;

import java.util.Scanner;

public class Numb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=0;
		System.out.println("Enter the number to reverse");
		num=sc.nextInt();
		int numn=reverse(num);
		System.out.println("Reversed Number is : " + numn);
		
	}

	private static int reverse(int num) {
		int rev=0;
		while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
		
	}
	
	
}
