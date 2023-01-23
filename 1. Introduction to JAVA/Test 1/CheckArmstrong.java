/*
 * Write a Program to determine if the given number is Armstrong number or not. Print true if number is armstrong, otherwise print false.

 An Armstrong number is a number (with digits n) such that the sum of its digits raised to nth power is equal to the number itself.

 For example,
371, as 3^3 + 7^3 + 1^3 = 371
1634, as 1^4 + 6^4 + 3^4 + 4^4 = 1634
I
nput Format :
Integer n

Output Format :
true or false

Sample Input 1 :
1

Sample Output 1 :
true

Sample Input 2 :
103

Sample Output 2 :
false
 */




 import java.util.Scanner;
public class CheckArmstrong {
	
	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        int temp = n, count = 0, arm =0;
        
        while(temp != 0)
        {
            
            temp/=10;
            count++;
            
        }
        
        temp = n;
        
        while(temp != 0)
        {
            int t1 = temp%10;
            int t2 = count;
            int t3 = t1;
            
            while(t2 != 1)
            {
                t3 = t3*t1;
                t2--;
                
            }
            arm = arm + t3;
            temp/=10;
            
        }
        
        if(arm == n){
            System.out.println("true");
        }
        else{
            System.out.println("false");

        }
        
        
//         int count=0;
//         int rem=0;
//         int i;
//           double power=0;
//        int temp=N;
//         while(temp!=0)
//         {

//             temp=temp/10;
//             count++;
//         }

//        int k=N;
//         for(i=1;i<=count ;i++)
//         {
//             rem=k%10;
//             power=power+Math.pow(rem,count);
//             k=k/10;
//         }
//         if((int)power==N)
//         {
//             System.out.println("true");
//         }
//         else
//             System.out.println("false");

s.close();
	}
}
