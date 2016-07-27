package atul.learning.arrays;

/*this method findingThePairs(numbers,9);
 * basically takes the integer array as an input along with a
 * int value, which then scan the array and find all pairs in array of integer
 * whose sum equal given number  
 * */
public class TestArray {
	public static void main(String[] args) {
		
		int[] numbers={2,4,3,5,7,8,9};
		findingThePairs(numbers,9);
		
	}

	private static void findingThePairs(int[] numbers, int x) {
	for(int i=0;i<numbers.length;i++){
		int first=numbers[i];
		for(int j=i+1;j<numbers.length;j++){
			int second=numbers[j];
			
			if((first+second)==x){
				System.out.println("the pairs are : " +first+","+second);
//				System.out.printf("%d%d%n", first,second);
			}
			
		}
	}
		
	}

}
