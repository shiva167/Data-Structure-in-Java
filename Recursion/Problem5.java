public class Problem5 {
public static void Print(int arr[],int i){
    while(i<arr.length){
        System.out.println(arr[i++]);
    }
}
    public static void MergeSort(int arr[],int s,int e){
        if(s>=e){
  return ;
        }
        int mid = s+(e-s)/2;
        MergeSort(arr,s,mid);
        MergeSort(arr, mid+1, e);
        Merge(arr,s,mid,e);
    }
    public static void Merge(int arr[],int s ,int mid,int e){
        int i=s,j=mid+1,k=0;
        int temp[]=new int[e-s+1];
   
        while(i<=mid&&j<=e){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
            }else{
                temp[k]=arr[j];
               j++;
            }
            k++;
        }
        while(i<=mid){
            temp[k++]=arr[i++];
        }
                while(j<=e){
            temp[k++]=arr[j++];
        }
        for(k=0,i=s;k<temp.length;k++,i++){
            arr[i]=temp[k];
        }
    }
    public static void main(String[] args) {
int arr[]={9,4,3,2,8,4,2};
MergeSort(arr, 0,arr.length-1);
Print(arr, 0);        
    }
}
