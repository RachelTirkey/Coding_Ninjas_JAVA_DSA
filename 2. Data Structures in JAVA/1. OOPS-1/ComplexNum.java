/*
A ComplexNumber class contains two data members : one is the real part (R) and the other is imaginary (I) (both integers).

Implement the Complex numbers class that contains following functions -

1. constructor
You need to create the appropriate constructor.

2. plus -
This function adds two given complex numbers and updates the first complex number.
e.g.
if C1 = 4 + i5 and C2 = 3 +i1
C1.plus(C2) results in: 
C1 = 7 + i6 and C2 = 3 + i1

3. multiply -
This function multiplies two given complex numbers and updates the first complex number.
e.g.
if C1 = 4 + i5 and C2 = 1 + i2
C1.multiply(C2) results in: 
C1 = -6 + i13 and C2 = 1 + i2

4. print -
This function prints the given complex number in the following format :
a + ib

Note : There is space before and after '+' (plus sign) and no space between 'i' (iota symbol) and b.

Input Format :
Line 1 : Two integers - real and imaginary part of 1st complex number
Line 2 : Two integers - real and imaginary part of 2nd complex number
Line 3 : An integer representing choice (1 or 2) (1 represents plus function will be called and 2 represents multiply function will be called)

Output format :
Check details of 'print' function given above.

Sample Input 1 :
4 5
6 7
1

Sample Output 1 :
10 + i12

Sample Input 2 :
4 5
6 7
2

Sample Output 2 :
-11 + i58

 */




 public class ComplexNum {
	// Complete this class
	private int real;
   private int imaginary;
   public ComplexNum(int real, int imaginary){
       this.real = real;
       this.imaginary = imaginary;
   }
   public int getReal(){
       return real;
   }
   public int getImaginary(){
       return imaginary;
   }
   public void setReal(int real){
       this.real = real;
   }
   public void setImaginary(int imaginary){
       this.imaginary = imaginary;
   }
   public void plus(ComplexNum c2){
       this.real = this.real + c2.real;
       this.imaginary = this.imaginary + c2.imaginary;
   }
   public static ComplexNum plus(ComplexNum c1, ComplexNum c2){
       int real = c1.real + c2.real;
       int imaginary = c1.imaginary + c2.imaginary;
       return new ComplexNum(real, imaginary);
   }
   public void multiply(ComplexNum c2){
       int real= this.real * c2.real - this.imaginary * c2.imaginary;
       int imaginary= this.real * c2.imaginary + c2.real * this.imaginary;
       this.real=real;
       this.imaginary=imaginary;
   }
   public static ComplexNum multiply(ComplexNum c1, ComplexNum c2){
       int real = c1.real * c2.real - c1.imaginary * c2.imaginary;
       int imaginary = c1.real * c2.imaginary + c2.real + c1.imaginary;
    
       return new ComplexNum(real, imaginary);
   }
   public ComplexNum conjugate(){
       int imaginary = -this.imaginary;
       int real = this.real;
       return new ComplexNum(real, imaginary);
   }
   public void print(){
       System.out.println(this.real + " + i" + this.imaginary);
   }
}
