import java.io.*;
class Thistest {
   int age;
   String name;
   public Test( int age){
	System.out.println("My age is:"+ age);
   }

   public void setName(String Name){
  	name=Name;
   }

   public String getName(){
	return name;
   }
   public static void main(String []args) {
      for(int i = 0; i<args.length; i++) {
         System.out.println("args[" + i + "]: " +  args[i]);
      }
   }
}
