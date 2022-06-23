/* 11 Write a Java program to input electricity unit charges and calculate total electricity bill according to the given condition:
For first 50 units Rs. 0.50/unit
For next 100 units Rs. 0.75/unit
For next 100 units Rs. 1.20/unit
For unit above 250 Rs. 1.50/unit
An additional surcharge of 20% is added to the bill */

import java.util.*;

class Electricity
 {
  
 public static void main(String[]args)

   {
 
  Scanner sc=new Scanner(System.in);
 
  System.out.print("\n\t\t\tEnter Electricity Units : ");
  double Unit=sc.nextDouble();

  if(Unit<=50)
  {
  double Bill= Unit*0.50;
  System.out.println("\n\t\t\tYour total electricity bill is : " +Bill);
  }
				
  else if(Unit<=100)
   {
  double Bill= Unit*0.75;
  System.out.println("\n\t\t\tYour total electricity bill is : " +Bill);
    }

  else if(Unit<=200)
    {
    double Bill= Unit*1.20;
    System.out.println("\n\t\t\tYour total electricity bill is : " +Bill);
     }
					
   else if(Unit>250)
   {
     double Bill= Unit*1.50;
     double Charges = Bill*0.2;
     double Amt=Bill+Charges;
     System.out.println("\n\t\t\tYour total electricity bill is : " +Amt);
			 
  }
						
							
        }
}