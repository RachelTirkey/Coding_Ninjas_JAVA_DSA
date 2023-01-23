/*
Aadil has been provided with a sentence in the form of a string as a function parameter. The task is to implement a function so as to print the sentence such that each word in the sentence is reversed.

Example:
Input Sentence: "Hello, I am Aadil!"
The expected output will print, ",olleH I ma !lidaA".

Input Format:
The first and only line of input contains a string without any leading and trailing spaces. The input string represents the sentence given to Aadil.

Output Format:
The only line of output prints the sentence(string) such that each word in the sentence is reversed. 

Constraints:
0 <= N <= 10^6
Where N is the length of the input string.

Time Limit: 1 second

Sample Input 1:
Welcome to Coding Ninjas

Sample Output 1:
emocleW ot gnidoC sajniN

Sample Input 2:
Always indent your code

Sample Output 2:
syawlA tnedni ruoy edoc
 */



 public class ReverseEachWord {
    
    public static String reverseWord(String s){
        StringBuffer rev = new StringBuffer("");
        
        for(int i = s.length()-1; i>=0; i--){
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }

	public static String reverseEachWord(String str) {
		//Your code goes here
        String[] store = str.split(" ");
        
        StringBuffer reverse = new StringBuffer("");
        
        for(int i = 0; i<store.length; i++){
            reverse.append(reverseWord(store[i]));
            reverse.append(" ");
        }
        return reverse.toString();
	}

}
