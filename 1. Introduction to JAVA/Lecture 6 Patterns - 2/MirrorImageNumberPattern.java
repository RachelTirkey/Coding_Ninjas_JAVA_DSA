/*
Print the following pattern for the given N number of rows.
Pattern for N = 4
...1
..12
.123
1234
The dots represent spaces.


Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 50

Sample Input 1:
3

Sample Output 1:
     1 
    12
   123

Sample Input 2:
4

Sample Output 2:
    1 
   12
  123
 1234
 */



 import java.util.Scanner;
 public class MirrorImageNumberPattern {
 
 
     public static void main(String[] args) {
         
         
          Scanner sc = new Scanner(System.in);
     int N = sc.nextInt();
     for(int i=1;i<=N;i++)
     {   int space=1;
         while(space<=N-i)
         {
             System.out.print(" ");
             space=space+1;
         }
      for(int j=1;j<=i;j++)
      {
          System.out.print(j);
      }
      System.out.println();
      sc.close();
     }
         
         
     }
 
 }
 