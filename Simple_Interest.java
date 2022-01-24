import java.util.*; 
public class Simple_Interest
{	
     public static void main(String args[])	
     {		
        float k, c, l, Simple_Interest;
        Scanner sc = new Scanner(System.in);	
        System.out.println("\nEnter principal amount:");	
            	k=sc.nextFloat();			
        System.out.println("\nEnter time period:");		
             c=sc.nextFloat();		
      		System.out.println("\nEnter rate of interest:");	
      		     	l=sc.nextFloat();	
      		Simple_Interest = (k*c*l)/100;	
      		System.out.println("\nSimple Interest is="+Simple_Interest);
      		
      	}
}
