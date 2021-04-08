package Glava10;

public class Class1 {
   public static int counts = 0;
   static int x;
   int y= 12;

   static void go(final int x){

       System.out.println(x);
   }
   static {
       counts = 200;
   }
   Class1(){
       counts++;
   }
   public  void test(){
       System.out.println(counts);
       System.out.println(x);
   }


}
