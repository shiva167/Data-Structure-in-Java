public class Problem6 {
public static void Print(int arr[]){
    int i=0;
    while (i<arr.length) {
        System.out.println(arr[i]);
    i++;
    }
}
    public static void Quick(int arr[],int s,int e){
        if(s>=e){
            return ;
        }                                        ///worst case time complexity (0^2) in quick sort
                                                  /////Worst case occurs when pivot is always smallest or largest element
        int pivot = Partition(arr, s,e);
        Quick(arr, s, pivot-1);
        Quick(arr, pivot+1, e);
    }
    public static int Partition(int arr[],int s,int e){
        int  i=s-1;
        int pivot = arr[e];
        for(int j=s;j<e;j++){
            if(arr[j]<=pivot){
            i++;
                int temp= arr[j];
                arr[j]=arr[i];
                arr[i]=temp; 
            }

        }
        i++;
            int temp= pivot;
                arr[e]=arr[i];
                arr[i]=temp;
            return i;
    }
    public static void main(String[] args) {
int arr[]={5,7,8,4,2,3,1};
Quick(arr, 0,arr.length-1);
Print(arr);        
    }
}
