
/*
Print the following pattern for the given number of rows.

Pattern for N = 5

E
DE
CDE
BCDE
ABCDE

Input format :
N (Total no. of rows)

Output format :
Pattern in N lines

Constraints
0 <= N <= 26

Sample Input 1:
8

Sample Output 1:
H
GH
FGH
EFGH
DEFGH
CDEFGH
BCDEFGH
ABCDEFGH

Sample Input 2:
7

Sample Output 2:
G
FG
EFG
DEFG
CDEFG
BCDEFG
ABCDEFG
 */




 import java.util.Scanner;
public class InterestingAlphabets {
	public static void main(String[] args) {
		//Your code goes here
     Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        // int m;
        char c = (char) (65 + N);
        for (int i = 1; i <= N; i++) {
            c = (char) (c - i);
            for (int j = 0; j < i; j++) {
                System.out.print(c);
                c++;
            }
            System.out.print("");
            sc.close();
        }

		
    }
}