import java.util.*; 
public class Vowel
{
    	public static void main(String args[])	
    	{		
    	   char val;		
    	   Scanner sc =new Scanner(System.in);		
    	 		System.out.println("Enter the character:");	
    	 		val=sc.next().charAt(0);	
    				switch(val)
    			{		
    			   	case 'a':				System.out.println("It is vowel:"+val);			
    			   	break;					
    			   	case 'e':				System.out.println("It is vowel:"+val);		
    			   	break;					
    			   	case 'i':				System.out.println("It is vowel:"+val);		
    			   	break;				
    			  		case 'o':				System.out.println("It is vowel:"+val);			
    			  		break;					
    			  		case 'u':				System.out.println("It is vowel:"+val);		
    			  		break;					
    			  		default:				System.out.println("It is not a vowel:"+val);		
    			  		break;		
    					}
    	}
	}