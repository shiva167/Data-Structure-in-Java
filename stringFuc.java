import java.util.*;
class stringFun{
public static void main(String args[]){
String t ="kamlaNehru";
String n ="KAMLANEHRU";

String j ="JawaharlalNehru";
Scanner sc = new Scanner(System.in);
int y =  sc.nextInt();

switch(y){
case 1:
         System.out.println(t.length()); 
         break;
case 2:
       
         System.out.println(t.charAt(4)); 
         break;  
case 3:
  
         System.out.println(t.toLowerCase()); 
         break;
case 4:

         System.out.println(t.toUpperCase()); 
         break;
case 5:

         System.out.println(t.concat(j)); 
         break;
case 6:
         System.out.println(t.equals(j)); 
         break;
case 7:
         System.out.println(j.equalsIgnoreCase(n)); 
         break;
case 8:
         System.out.println(t.compareTo(j)); 
         break;
case 9:
        String m = "Happy Birthday";
         System.out.println(m.endsWith("Birthday")); 
         break;
case 10:
        String w = "Happy Birthday";
         System.out.println(w.startsWith("Birthday")); 
         break;
default:
 

        System.out.println("Please Enter valid number between 1 to 10 "); 
}
}
}
