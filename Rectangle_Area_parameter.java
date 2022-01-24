import java.util.*; 
class Rectangle_Area_parameter 
{ 
    public static void main(String arr[])
    { 
      float Length,Breadth,Area,Perimeter;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Length:");
          Length=sc.nextFloat();
      System.out.println("Enter the Breadth:");
          Breadth=sc.nextFloat(); 
          
           Area = Length * Breadth; 
           Perimeter = 2*(Length + Breadth);
      System.out.println("Area Of Rectangle : \n "+ " Length * Breadth = " +Area );
      System.out.println("Perimeter Of Rectangle : \n "+ " 2*(Length + Breadth) = " +Perimeter);
      } 
     
}
