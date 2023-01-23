/*
 * Print the following pattern

 Pattern for N = 4

 *000*000*
0*00*00*0
00*0*0*00
000***000


Input Format :
N (Total no. of rows)

Output Format :
Pattern in N lines

Sample Input 1 :
3

Sample Output 1 :
*00*00*
0*0*0*0
00***00

Sample Input 2 :
5

Sample Output 2 :
*0000*0000*
0*000*000*0
00*00*00*00
000*0*0*000
0000***0000
 */
    



 import java.util.Scanner;
public class ZerosStarsPattern {

	public static void main(String[] args) {

		/*  Read input as specified in the question.
    		 * Print output as specified in the question.
    		 */
		 Scanner s=new Scanner(System.in);
        int n=s.nextInt();

    int k,l;  
    for(k=1;k<=n;k++){ 
      for(l=1;l<=n;l++){
          if(k==l)  
             System.out.print("*");  
            else  
           System.out.print("0");  
      }  
      l--;  
       System.out.print("*");  
      while(l>=1){ 
          if(k==l)  
           System.out.print("*");  
          else  
           System.out.print("0");  
          l--;  
      }  
    System.out.println("");  
  }  
	}	

}
