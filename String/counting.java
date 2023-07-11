public class counting {
public static void Counting(int arr[]){
    int largests = Integer.MIN_VALUE;
    
    for(int i=0;i<arr.length;i++){
       largests = Math.max(largests,arr[i]);
    }
    int count[]=new int[largests+1];
    for(int i=0;i<arr.length;i++){
        count[arr[i]]++;
    }
    int j=0;
    for(int i=0;i<count.length;i++){ 
        
        while(count[i]>0){
           arr[j]=i;
           j++;
           count[i]--;
        }
    }
    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
}
public static void main(String args[]){

  int arr[]={2,39,7,5,433,5,2,3,4,7,6,5,43,2,11,1,9};
Counting(arr);


}
}