import java.util.*;
public class Neme{
public static void main(String []args){

Scanner t=new Scanner(System.in);
int key =34;
int []arr=new int[7];
for(int i=0;i<7;i++){
    arr[i]=t.nextInt();
}

for(int i=0;i<7;i++){

if(arr[i]==key){
key = i;
}
}
System.out.print(key);
}
}