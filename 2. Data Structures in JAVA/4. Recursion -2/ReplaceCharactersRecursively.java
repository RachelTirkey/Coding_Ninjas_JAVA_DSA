/*
Given an input string S and two characters c1 and c2, you need to replace every occurrence of character c1 with character c2 in the given string.
Do this recursively.
Input Format :
Line 1 : Input String S
Line 2 : Character c1 and c2 (separated by space)
Output Format :
Updated string
Constraints :
1 <= Length of String S <= 10^6
Sample Input :
abacd
a x
Sample Output :
xbxcd
 */




 public class ReplaceCharactersRecursively {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
 int len = input.length();
        String ans = "";
        
        if (len==0){
            return input;
        }
        
        if(input.charAt(0) == c1){
            ans = c2 + replaceCharacter(input.substring(1,len), c1, c2); 
            return ans;
        }
        
        else{
            ans = input.charAt(0) + replaceCharacter(input.substring(1,len), c1, c2);
            return ans;
        }
	}
}
