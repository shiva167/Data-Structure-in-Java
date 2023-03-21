import java.util.*;
public class Func{

public static void myName(String name){
System.out.print(name);
}
public static int calCu(int a,int b){
 return a+b;
}
public static void main(String args[]){
Scanner t =  new Scanner(System.in);
String name = t.nextLine();
 int a= t.nextInt();
int b= t.nextInt();
 myName(name);
  int s = calCu(a,b);
System.out.print(s);
}
}