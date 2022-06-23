/*Write a Java program to check whether the triangle is equilateral, isosceles or scalene triangle. */


import java.util.*;

class Tri2
{

public static void main(String[] args) 

    {
 
Scanner sc=new Scanner(System.in);

System.out.println("\n\t\t\tEnter sides of Triangle ");
 System.out.print("\n\t\t\tEnter first side of Triangle: ");
 
double S1=sc.nextDouble();

System.out.print("\n\t\t\tEnter Second side Triangle: ");
 
double S2=sc.nextDouble();

System.out.print("\n\t\t\tEnter Third side of Triangle: ");
 
double S3=sc.nextDouble();
 
if(S1==S2 && S2==S3)
System.out.println("\n\t\t\tTriangle is Equilateral Triangle.");


else if(S1==S2 || S2==S3 || S3==S1)
System.out.println("\n\t\t\tTriangle is Isosceles Triangle.");


else
System.out.println("\n\t\t\tTriangle is Scalene Triangle.");



               }

}