import java.util.*;
public class Main{
public static void main(String []args){
Scanner t  = new Scanner(System.in);
int n = t.nextInt();
for(int i=0;i<n;i++){
for(int j=0;j<n-i;j++){
System.out.print(" " );
}
for(int j=0;j<i;j++){
System.out.print("*" );
} 
System.out.print("\n");
}
}
}