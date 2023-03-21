import java.util.*;
public class Patt{
public static void main(String []args){
   Scanner t = new Scanner(System.in);
    int a = t.nextInt();
    for(int i=0;i<a;i++){
  for(int j=0;j<a-i;j++){
  System.out.print(" ");
}
 for(int j=0;j<i;j++){
  System.out.print(" * ");
}
System.out.print("\n");
}
}
}