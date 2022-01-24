import java.util.*; 
public class Cube
{ 	
     public static void main(String[] args) 
    	{ 		
    	    int Num, Result;	 
    	    Scanner sc = new Scanner(System.in);
    	  		System.out.println("Enter Number:");	
    	  		  	Num = sc.nextInt();			 
    	  		if (Num % 5 == 0)	 	
    	    {	
    	       Result = (Num*Num*Num);
	        System.out.println("Yes \n" +Num + " is divisible by 5");	
	        System.out.println("Number is : " +Num +" and cube of " +Num +" is : "+Result); 	
    	   	 }	 	 	
    	    else	 
    	    {	
    	       System.out.println("No, It is not divisible by 5 Enter Appropriate Number");
    	     }
      }
}
