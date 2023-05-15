import java.util.*;
class A{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
switch(n){
case 1: 
         try{
     int a = 45/0;       
   System.out.println(a);
           }
         catch(Exception e){
          System.out.println(e);
           }
          break;

case 2 : 
         try{
String b = null;         
     System.out.println(b.length());
            }
         catch(Exception e){
            System.out.println(e);
              }
           break;

case 3 : 
          try{
           int arr[] = {5,7,3,54,22};         
     System.out.println(arr[7]);
            }
         catch(Exception e){
            System.out.println(e);
              }
          break;

}
}
}
           
             
