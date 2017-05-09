import java.io.*;
import java.util.Scanner;
public class toUpperCase{
	public static void main(String [] args){
		String M;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		M=sc.next();
		System.out.println("String Entered is..: "+M);
		System.out.println("Converting to uppercase: "+ M.toUpperCase());
		
	}
}
