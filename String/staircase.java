public class  staircase{
    public static void Staircase(int arr[][],int key){
        int row=-1,col=-1,i=0,j=arr[0].length-1;
        while(i<arr.length&&j>=0){
            if(key==arr[i][j]){
            
                row =i;
                col=j;
                break;
            }else if(key<arr[i][j]){
                j--;
            }else{
                i++;
            }
        }
if(row==-1&&col==-1){
        System.out.println("Key is not present !");
}else{
            System.out.println("Key is  present ! "+row +"," +col);
}

}
    public static void main(String args[]){
        int arr[][]={{10,20,30},{15,25,35},{32,33,39}};
    Staircase(arr,39);
    }
}