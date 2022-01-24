import java.util.Scanner;
public class Circle_Prameters
{ 	
    public static void main(String[] args)
    {			
      	double Area,Radius,Circumference;
      	Scanner sc = new Scanner(System.in);	
      	System.out.print("Enter the Radius : ");	
      	    Radius = sc.nextDouble(); 	
      	      Area = 3.14*Radius*Radius;	
       System.out.println(" Radius of Circle = " +Area);	 	 	
          Circumference = 2 * 3.14 * Radius;	
       System.out.println(" Circumference of Circle = " +Circumference);	 
      
     }
}
