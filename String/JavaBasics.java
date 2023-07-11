

class Solution {
    public int maxSubArray(int[] nums) {
       

    int c=nums[0],mn=nums[0];
  for(int j=1;j<nums.length;j++){
    c=Math.max(nums[j],c+nums[j]);
    mn=Math.max(mn,c);
    
    }
return mn;
}
}

public class JavaBasics{
 public static void Pair(int arr[]){

      int c=0,t=0,mn =Integer.MIN_VALUE;
for(int i=0;i<arr.length;i++){
  if(arr[i]>=0){
    break;
  }else{
    mn = Math.max(arr[i], mn);
    t++;
  }
}
if(t==arr.length){
  System.out.println("Max sum = "+mn);
}else{
mn =Integer.MIN_VALUE;
  for(int j=0;j<arr.length;j++){
    c=c+arr[j];
      if(arr[j]<0){
        c =0;
      }
      mn = Math.max(c,mn);
    }
  System.out.println("Max sum = "+mn);

  }
}
   public static void main(String args[]){
 int  arr[]= {-2,-3,0,-4,-7};
  Pair(arr);
    
    }
} 