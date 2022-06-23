

/*3 If the three sides of a triangle are entered through the keyboard,
write a program to check whether the triangle is valid or not. The
triangle is valid if the sum of two sides is greater than the largest of
the three sides.*/

import java.util.*;

class TRI

  {
 
    public static void main(String[]args)

        {

        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t\t\tEnter Sides of Triangle ");


        System.out.print("\n\t\t\tEnter First Side of Triangle: ");

        int S1=sc.nextInt();

        System.out.print("\n\t\t\tEnter Second Side of Triangle: ");

        int S2=sc.nextInt();

        System.out.print("\n\t\t\tEnter Third Side Triangle: ");

        int S3=sc.nextInt();

        if(S1+S2>S3 || S1+S3>S2 || S2+S3>S1)

        System.out.println("\n\t\t\tIt is A Valid Triangle");

       else 

       System.out.println("\n\t\t\tIt is not A Valid Triangle");
   
        }
}

