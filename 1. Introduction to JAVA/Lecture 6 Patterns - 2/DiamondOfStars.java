/*
Print the following pattern for the given number of rows.

Note: N is always odd.

Pattern for N = 5
..*
.***
*****
.***
..*
The dots represent spaces.

Input format :
N (Total no. of rows and can only be odd)

Output format :
Pattern in N lines

Constraints :
1 <= N <= 49

Sample Input 1:
5

Sample Output 1:
  *
 ***
*****
 ***
  *

Sample Input 2:
3

Sample Output 2:
  *
 ***
  *

 */




 import java.util.Scanner;
 public class DiamondOfStars {
     
     public static void main(String[] args) {
         // Write your code here
         
         Scanner sc = new Scanner(System.in);
         int row = sc.nextInt();
 
         int i, j, space, decider;
         decider = row / 2;
         for (i = 0; i < row; i++) {
             if (i <= decider) {
                 for (space = i; space < decider; space++)
                     System.out.print(" ");
                 for (j = 0; j < (i * 2) + 1; j++)
                     System.out.print("*");
                 System.out.print("\n");
             } else {
                 for (space = i; space > decider; space--)
                     System.out.print(" ");
                 for (j = (row * 2) - 1; j > (i * 2); j--)
                     System.out.print("*");
                 System.out.print("\n");
             }
         }
     }
 }