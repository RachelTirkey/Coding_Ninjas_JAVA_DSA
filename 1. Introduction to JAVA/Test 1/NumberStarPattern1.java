/*
 Print the following pattern for given number of rows.

 Input format :
Integer N (Total number of rows)

Output Format :
Pattern in N lines

Sample Input :
   5

   Sample Output :
 5432*
 543*1
 54*21
 5*321
 *4321
 */





 import java.util.Scanner;
public class NumberStarPattern1 {

	public static void main(String[] args) {
		// Write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
//         int i, j, k;
//         for(int i = 1; i < n+1; i++)
//         {
//             for(int j = 0; j < n-i; j++)
//             {
//                 System.out.println(n-j);

//             }
            
//             System.out.println("*");
            
//             for(int k = i-1; k > 0; k--)
//             {
//                 System.out.println(k);

//             }
//         System.out.println("");
    
//         }
        
        
        int a,b;  
    for(a=1;a<=n;a++){  
       for(b=n;b>=1;b--){  
           if(b!=a)  
            System.out.print(b);  
            else  
             System.out.print("*");  
    }   
    System.out.println("");  
    }  
    sc.close();
	}
}
