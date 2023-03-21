import java.util.*;
public class Simple{
public static void main(String []args){
Scanner t =new Scanner(System.in);
int sum=0;
  int n = t.nextInt();
 for(int i=0;i<n;i++){
for(int j=0;j<=i;j++){
System.out.print(sum++);
}
System.out.print("\n");
}
}
}