public class stock {

public static void Stocks(int prices[]){
    int n  = prices.length,max=0;
    int buyprice= Integer.MAX_VALUE;
    for(int i=0;i<n;i++){
  if(buyprice<prices[i]){
     int profit = prices[i]-buyprice;
     max =Math.max(max,profit);
  }else{
    buyprice= prices[i];
  }
}
System.out.println("Maximum profit equal = "+max);
}
    public static void main(String args[]){
        int arr[]={9,3,5,3,5,7,4};
        Stocks(arr);
    }
}
