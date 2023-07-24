public class Problem7 {
  //   public static int SortRotArray(int arr[] ,int target ,int s,int e){
  //       if(s>e){
  //           return -1;
  //       }
        
  //       int mid = s+(e-s)/2;
  //       if(arr[mid]==target){
  //           return mid;
  //       }

  // if(arr[mid]<target){
  //      if(arr[s]<=target&&target<=arr[mid]){    ////target mean to what to want which searching element
  //       return SortRotArray(arr, target, s, mid-1);
  //       }else{
  //       return SortRotArray(arr, target, mid+1, e);
  //       }
  // }else{
  //        if(arr[mid]<=target&&target<=arr[e]){
  //        return   SortRotArray(arr, target, mid+1, e);
  //        }else{
  //          return SortRotArray(arr, target, s, mid-1);
  //        }
  // }

  //   }
    public static int SortRotArray(int arr[] ,int target ,int s,int e){
        
        int mid = s+(e-s)/2;
        e=e-1;
     while(s<=e){
        if(arr[mid]==target){
            return mid;
        }

     if(arr[s]<=arr[mid]){
       if(arr[s]<=target&&target<arr[mid]){    ////target mean to what to want which searching element
          e=mid-1;
      }else{
       s=mid+1;
           }
  }else{
         if(arr[mid]<target&&target<=arr[e]){
                s=mid+1;
        }else{
        e=mid-1; 
        }
       
  }
   mid=s+(e-s)/2;
     }
     return -1;
    }
    public static void main(String[] args) {
        int arr[]={6,7,8,12,3,4,5};
        int target=3;
        System.out.println(SortRotArray(arr, target, 0, arr.length));
    }
}
