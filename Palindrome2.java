public class Palindrome2{
	
	public static void main(String [] args){
		String  word="nyoka";
	        String  myList="";
		for(int i=word.length()-1; i>=0; i--){
			myList=myList+word.charAt(i);
		}
		if(myList.equals(word)){
			System.out.println("Hello World");
		}
		else{
			System.out.println("Hello");
		}
	}
}



