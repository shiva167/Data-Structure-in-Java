public class daigonal{
    public static void Diagonal(int arr[][]){
     int sum =0;
        for(int i=0;i<arr.length;i++){
        sum +=arr[i][i];
         sum +=arr[i][arr.length-1-i];
     }
     System.out.println("Sum of diagonal = "+sum);
    }
    public static void main(String args[]){
        int arr[][]={{3,4,2},{5,2,1},{4,6,3}};
        Diagonal(arr);
    }
}