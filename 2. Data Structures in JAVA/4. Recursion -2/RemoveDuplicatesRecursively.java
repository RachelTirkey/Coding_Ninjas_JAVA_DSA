/*
Given a string S, remove consecutive duplicates from it recursively.
Input Format :
String S
Output Format :
Output string
Constraints :
1 <= |S| <= 10^3
where |S| represents the length of string
Sample Input 1 :
aabccba
Sample Output 1 :
abcba
Sample Input 2 :
xxxyyyzwwzzz
Sample Output 2 :
xyzwz

 */




 public class RemoveDuplicatesRecursively {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
int len = s.length();
        String ans = "";
        
        if(len==1){
            return s;
        }
        
        // if(s.charAt(0)==s.charAt(1)){
        //     ans = s.charAt(1) + removeConsecutiveDuplicates(s.substring(2,len));
        //     return ans;
        // }
        
                
        if(s.charAt(0)!=s.charAt(1)){
            ans = ans + s.charAt(0);
            //return ans;
        }
        
        
            String Smallans = removeConsecutiveDuplicates(s.substring(1,len));
            return ans + Smallans;
	}

}