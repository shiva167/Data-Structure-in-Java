public class bubble {
    public static void Bubble(int arr[]){
        int swap=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1;j++){

                if(arr[j]>arr[j+1]){
                 int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }else{
                    swap++;
                }
            }
            if(swap==arr.length-1){
                break;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,5,22};
        Bubble(arr);
    }
}
