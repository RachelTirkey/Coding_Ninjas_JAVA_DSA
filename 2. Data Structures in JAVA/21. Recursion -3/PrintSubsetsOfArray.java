/*
Given an integer array (of length n), find and print all the subsets of input array.
Subsets are of length varying from 0 to n, that contain elements of the array. But the order of elements should remain same as in the input array.
Note : The order of subsets are not important. Just print the subsets in different lines.
Input format :
Line 1 : Integer n, Size of array
Line 2 : Array elements (separated by space)
Constraints :
1 <= n <= 15
Sample Input:
3
15 20 12
Sample Output:
[] (this just represents an empty array, don't worry about the square brackets)
12 
20 
20 12 
15 
15 12 
15 20 
15 20 12 
 */




 public class PrintSubsetsOfArray {
	public static void printSubsets(int input[]) {
		// Write your code here
		printSubsetsHelper(input,0,new int[0]);
	}
    
    private static void printSubsetsHelper(int[] input, int startIndex, int[] output)
    {
        //Base case  - If start index = input.length, print the output and return
        if (startIndex==input.length)
        {
            for (int i=0;i<output.length;i++)
            {
                System.out.print(output[i]+" ");
            }
            System.out.println();
            return;
        }
        
        //Case one, output contains element of input array at startIndex 
        int[] newOutput = new int[output.length+1];
        for (int i=0;i<output.length;i++)
        {
            newOutput[i]=output[i];
        }
        newOutput[output.length]=input[startIndex];
        printSubsetsHelper(input,startIndex+1,newOutput);
        
        //Case 2, output does not contain element of input array at startIndex
        printSubsetsHelper(input,startIndex+1,output);

	}
}
