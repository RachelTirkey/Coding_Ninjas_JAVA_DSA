/*
Given a string, compute recursively a new string where all 'x' chars have been removed.
Input format :
String S
Output format :
Modified String
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string S. 
Sample Input 1 :
xaxb
Sample Output 1:
ab
Sample Input 2 :
abc
Sample Output 2:
abc
Sample Input 3 :
xx
Sample Output 3:
 */




 public class RemoveX {

	// Return the changed string
	public static String removeX(String s){
		// Write your code here
// if(input.length()==0)
//             return input;

//         if(input.charAt(0)=='x')
//             return removeX(input.substring(1));

//         else
//             return input.charAt(0)+removeX(input.substring(1));

        
        
        if(s.length()==0)
            return s;

        if(s.charAt(0)=='x')
            return removeX(s.substring(1));

        else
            return s.charAt(0)+removeX(s.substring(1));

	}
}
