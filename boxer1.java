/* (5) In boxing the weight class of a boxer is decided as per the following
table. Write a program that receives weight as input and prints out
the boxer’s weight class.
Boxer Class  Weight in Pounds  
Flyweight    < 115
Bantamweight  115 - 121
Featherweight  122 - 153
Middleweight  154 – 189
Heavyweight    >= 190
*/


import java.util.*;
class boxer1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the weight of boxer:");
int x=sc.nextInt();
if(x<155)
{
System.out.println("Flyweight:");
}

 else if ((x>=115) && (x<121))

{
System.out.println("Bantamweight:");
}

 else if ((x>=122) && (x<153))

{
System.out.println("Featherweight:");
}
 else if ((x>=154) && (x<189)) 

{
System.out.println("Middleweight:");
}
 else if (x>=190)

{
System.out.println("Heavyweight:");
}
}
}