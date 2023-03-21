import java.util.*;
public class Simple{
public static void main(String []args){
Scanner t =new Scanner(System.in);
  int n = t.nextInt();
 for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
if((i+j)%2==0){
System.out.print("1");
}else{
System.out.print("0");
}
}
System.out.print("\n");
}
}
}