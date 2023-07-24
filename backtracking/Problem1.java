

class Problem1{
  public static void Back(int arr[],int i ,int val){
    if(i==arr.length){
    PrintArr(arr);
    return;
    }
    arr[i]=val;
    Back(arr, i+1, val+1);
    arr[i]=arr[i]-2;
  } 
  public static void PrintArr(int arr[]){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
    public static void main(String[] args) {
   int arr[]={4,3,2,77,54,32,12};        
Back(arr, 0, 1);    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }

}

}