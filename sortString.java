import java.io.*;
import java.util.*;
public class sortString{
	
	public static void main(String [] args){
		String [] a;
		String c,d="";
		Scanner b= new Scanner(System.in);
		System.out.println("Enter a number");
		c=b.nextLine();
		a=c.split("");
		Arrays.sort(a);
		System.out.println("After sort :");
		for(int i=0; i>a.length; i++){
			d=d+a[i];
		}
		System.out.println(d);
		      		 
	}
}
