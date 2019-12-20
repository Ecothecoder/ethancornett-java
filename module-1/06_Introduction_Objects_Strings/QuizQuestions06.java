import java.util.Scanner;

public class QuizQuestions06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

/*
		int answer = 0;		
		for(int i = 0; i < 10; i++) {
		
		    if(i % 3 != 0) {
		
		        answer = answer + i;
		
		    }
		
		}
		
		System.out.println(answer);
		int sum = 0;

		for(int i = 10; i > 0; i -= 5) {

		    sum += i;

		}

		System.out.println(sum);*/

		/*int[] numbers = new int[10];
		
		int sum = 0;
		
		for(int ix = 0; ix < numbers.length; ix++) {
		
		    sum += ix;
		
		    numbers[ix] = sum;
		
		}	
		
		
		
		int result = numbers[4];*/
		
		//convert array of strings to an array of integers
		String [] existingStrArray = {"1","2","15"}; 
		int [] convertedArray = stringArToIntAr(existingStrArray);
		
			
		String htmlAddress = "www.techelevator.com";
		String [] myArray = htmlAddress.split("el"); 
		
		//int [] myArray = new int[myArray.length]; 
		int [] myIntArray; //{1,5,7,9};
		int arraySize=5; 
		int [] anotherOne = new int [arraySize]; 
		
		int x; 
		x = 5; 


	}
	
	public static  int[] stringArToIntAr (String[] originalArray) {
		int [] newArray = new int [originalArray.length];
		
		for (int i =0; i<originalArray.length;i++) {
			/*
			String strToConvert = originalArray[i];
			int newInt = Integer.parseInt(strToConvert);
			newArray[i] = newInt; 
			*/			
			
			newArray[i] = Integer.parseInt(originalArray[i]);
		}
		
		return newArray;
		
	}

}
