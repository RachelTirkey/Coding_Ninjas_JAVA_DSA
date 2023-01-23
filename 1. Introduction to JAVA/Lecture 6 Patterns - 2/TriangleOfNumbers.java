/*
Print the following pattern for the given number of rows.
Pattern for N = 4
...1
..232
.34543
4567654
The dots represent spaces.

Input format :
Integer N (Total no. of rows)

Output format :
Pattern in N lines

Constraints :
0 <= N <= 50

Sample Input 1:
5

Sample Output 1:
           1
         232
       34543
     4567654
   567898765

Sample Input 2:
4

Sample Output 2:
           1
         232
       34543
     4567654
 */




 import java.util.Scanner;

 public class TriangleOfNumbers {
 
     public static void main(String[] args) {
        
         Scanner sc=new Scanner(System.in);
 int n=sc.nextInt();
     int i=1;
 while(i<=n)
 {  
  int space=1;
  while(space<=n-i)
 {
      System.out.print(" ");
      space++;
 }
      int j = 1;
     int p = i;
     while(j<=i)
     {
         System.out.print(p);
             p++;
             j++;
     }
      j=1;
      p= (i-1)*2;
     while(j<=i-1)
     {
        System.out.print(p);
         p--;
         j++;
     }
 i++;
     System.out.println();
     sc.close();
 }
     }
 }
 