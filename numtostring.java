import java.io.*;
import java.util.Scanner;
public class numtostring
{
	
	public static String ones[]={"one","two","three","four","five","six"," seven", "eight","nine","ten","eleven","twelve","thirteen","forteen","fifteen","sixteen","seventeen","eighteen","ninteen"};      
        public static String tens[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};       
public static void main(String a[]) throws Exception
	{
        Scanner sc=new Scanner(System.in);
        int num,rem,t;   
 
      
         System.out.println("Enter the number:");
          num=sc.nextInt();
	  num =String.valueOf(num);
          System.out.println("Entered number is:");
      /*write down your logic here*/
         System.out.println(num);
	     rem=num.split("");
	     if(rem[0]==5){
	         System.out.println(tens[rem-2]);
	     }
        }//main 


	 
}  
  
  







  












