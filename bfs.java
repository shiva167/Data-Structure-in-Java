import java.util.*;
public class Neme{
public static int bFs(int arr[],int size ,int key){
int s=0,e=size-1;
int mid = s+(e-s)/2;
while(s<=e){
if(arr[mid]==key){
return mid;
}else if(arr[mid]<key){
 s=mid+1;
}else{
e=mid-1;
}
mid=s+(e-s)/2;
}
return -1;
}
public static void main(String []args){

Scanner t=new Scanner(System.in);
int key =34;
int []arr=new int[7];
System.out.println("Enter Sorted array ");
for(int i=0;i<7;i++){
    arr[i]=t.nextInt();
}
int s =  bFs(arr,7,key);
System.out.print(s);
}
}