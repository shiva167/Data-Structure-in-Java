public class trappedwater {
    public static void trappedwaters(int height[]){
        int n= height.length;
        int leftmax[]=new int[n];
        leftmax[0]=height[0];
        for(int i=1;i<n;i++){
            leftmax[i]= Math.max(leftmax[i-1],height[i]);
            
        }
        int rightmax[]=new int[n];
        rightmax[n-1]=height[n-1];
        for(int i=n-2;i>=0;i--){
            rightmax[i]= Math.max(rightmax[i+1],height[i]);
    }
        int trapped=0;
        for(int i=0;i<n;i++){
            int waterwidth = Math.min(leftmax[i],rightmax[i]);
            trapped+=waterwidth-height[i];
        }
        System.out.println("Cover area = "+ trapped);
 }   
    public static void main(String args[]){
            int height[]={4,2,0,6,3,2,5};

            trappedwaters(height);
        }

}
