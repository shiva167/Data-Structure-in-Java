public class spiral {
    public static void Spiral(int arr[][]){
        int sr = 0;
        int sc=0;
        int er=arr.length;
        int ec=arr[0].length;
        
        while(sr<er&&sc<ec){

        // top
        for(int i=sc;i<ec;i++){
            System.out.print(arr[sr][i]+" ");
        }
        // right
        for(int i=sr+1;i<er;i++){
            System.out.print(arr[i][ec-1]+" ");
        }
        // bottom
        for(int i=ec-2;i>=sc;i--){
            if(sr==er){
                break;
            }
            System.out.print(arr[er-1][i]+" ");
        }
        // left
        for(int i=er-2;i>sr;i--){
                      if(sc==ec){
                break;
            }
            System.out.print(arr[i][sc]+" ");
        }
sr++;
sc++;
er--;
ec--;
        }
     System.out.println();   
    }
    public static void main(String args[]){
        int arr[][]={{37,84,86,62},{13,14,16,12},{23,24,36,92},{73,54,36,22}};
    
Spiral(arr);
    }

}
