

public class insertion {
    public static void Isertion(int arr[]){
        for(int i=0;i<arr.length;i++){
            int j=i-1;
            int curr = arr[i];
            while(j>=0&&arr[j]>curr){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=curr;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={3,9,6,3,1};
        Isertion(arr);
    }
}
