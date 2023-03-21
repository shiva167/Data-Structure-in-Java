import java.util.*;
 public class Tree{
  public static void main(String []args){
   Scanner t =new Scanner(System.in);
   int n=t.nextInt();
int rev=0;
int result;

while(n>0){
  result=n%10;
  rev=rev*10+result;
  n=n/10;
}
System.out.print(rev);
}
}