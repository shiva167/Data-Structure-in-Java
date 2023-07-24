
public class Problem4 {
    public static boolean isSafe(char board[][],int row,int col){
   for(int i=row-1;i>=0;i--){
    if(board[i][col]=='Q'){
        return false;
    }
   }
    for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
    if(board[i][j]=='Q'){
        return false;
    }
   }
   for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
    if(board[i][j]=='Q'){
        return false;
    }
   }
   return true;
    }
    public static void Print(char board[][]){
            System.out.println("-----chess board-----");

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+ " ");
            }
            System.out.println();
        }
    }
     static int count=0;
    public static boolean NQueens(char board[][],int row){
     
        if(row==board.length){
        ///print 
        // for(int i=0;i<board.length;i++){
        //     System.out.println("-----chess board-----");
        //     for(int j=0;j<board.length;j++){
        //         System.out.print(board[i][j]+ " ");
        //     }
        //     System.out.println();
        // }
        //count++;
        return true;
        }
        for(int j=0;j<board.length;j++){
            if(isSafe(board,row,j)){
                board[row][j]='Q';
               if( NQueens(board, row+1)){
                    return true;
               }

                board[row][j]='x';
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
    
        char board[][] = new char[4][4];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='x';
            }
        }
       if(NQueens(board, 0)){
System.out.println("Solution is possible : ");
Print(board);
       }else{
        System.out.println("Solution is not possible : ");
       }
    // System.out.println(count);
    }
    
}
