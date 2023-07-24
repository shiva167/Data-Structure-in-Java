public class first {

// public static int  PrintNumber(int n){
//     int sum=0;
//     if(n==0){
//         return 0;
//     }
//     // System.out.println(n);
//   return n+ PrintNumber(n-1);
// }

// public static int PrintNumber(int n){
 
//     if(n==0||n==1){
//         return n;
//     }
//   return  PrintNumber(n-1)+ PrintNumber(n-2);

// }
// public static int FirstOcc(int arr[],int i,int key){
//     if(i==arr.length){
//         return -1;
//     }
//     if(arr[i]==key){
//         return i;
//     }
//     return FirstOcc(arr, i+1, key);
// }
// public static int LastOcc(int arr[],int i,int key){
//     if(i==-1){
//         return -1;
//     }
//     if(arr[i]==key){
//         return i;
//     }
//     return LastOcc(arr, i-1, key);
// }
// public static int LastOcc(int arr[],int i,int key){
    

//     if(i==arr.length){
//         return -1;
//     }
// int isfound=LastOcc(arr, i+1, key);
//     if(arr[i]==key&&isfound==-1){
//         return i;
//     }
//     return isfound;
// }
// public static boolean PrintNumber(int arr[],int i){
 
//     if(i==arr.length-1){
//         return true;
//     }
//     if(arr[i]>arr[i+1]){
//   return false;
//     }
//       return PrintNumber(arr, i+1);
// }
public static int PowerOpt(int x,int n){
    if(n==0){
        return 1;
    }
    int hasPor = PowerOpt(x,n/2);
    int hasPorsqr = hasPor*hasPor;
    if(n%2!=0){
        hasPorsqr=x*hasPorsqr;
    }
    return hasPorsqr;
}
public static int Power(int x,int n){
    if(n==0){
        return 1;
    }
    return x*Power(x,n-1);
}

    public static void main(String[] args) {
        int n=6;
        int arr[]={3,3,4,5,5};
    //    System.out.println(PrintNumber(n));
    //    System.out.println(LastOcc(arr,0,3));

       System.out.println(PowerOpt(2,8  ));

    }

}
