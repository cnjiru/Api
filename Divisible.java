import java.io.*;
import java.util.Scanner;
public class Divisible{
	public static void main(String [] args){
		int v,d=0;
		Scanner n =new Scanner(System.in);		
		System.out.println("Enter a number");
		v=n.nextInt();
		for(int i=1; i<v; i++){
			if(i%3==0 || i%5==0){
				d=d+i;
			}
		}
		System.out.println(d);
	}
}
