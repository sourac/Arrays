package atul.learning.arrays;

import java.util.Arrays;

/*Majority element:-
 * Majority element in an array A[] of size n is an element that appears
 * more than n/2 times.*/
public class MajorityTest {
public static void main(String[] args) {
//	int[] ary={3,3,4,2,4,4,2,4,4};
	int[] ary={3,5,2,2,2,2};
	System.out.println("length of the array provided :  "+(ary.length));
	int num=majority(ary);
	System.out.println("majority element is : " + num);
}

private static int majority(int[] ary) {
 int count=0,maj=0;
 for(int i=0;i<ary.length;i++){
	 if(count==0){
		 maj=ary[i];
		 count=1;
	 }
	 else if(maj==ary[i])
		 count++;
	 else
		 count--;
	}
return maj;
 
}
}
