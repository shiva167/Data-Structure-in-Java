public class selection {

    public static void Selection(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
                  int key=i;
            for(int j=i+1;j<arr.length;j++){

                if(arr[key]>arr[j]){
                 key=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[key];
            arr[key]=temp;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={12,3,9,5,2};
        Selection(arr);
    }
}

