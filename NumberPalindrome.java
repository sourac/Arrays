package atul.learning.Numbers;

import java.util.Scanner;

public class NumberPalindrome {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number to check whether it's a palindrome or not");
	int num=sc.nextInt();
	if(num<10){
		System.out.println("enter number greater or equal 10");
	}
	else{
	int rnum=reverse(num);
	if(num==rnum)
		System.out.println("entered number is palindrome");
	else
		System.out.println("entered number is not palindrome");
	}
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
