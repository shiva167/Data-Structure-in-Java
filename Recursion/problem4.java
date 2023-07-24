public class problem4 {
    public static void PrintAllZeroOne(int n ,int lastplace,String str){
if(n==0){
    System.out.println(str);
    return ;
}
    PrintAllZeroOne(n-1,0,str+'0');
if(lastplace==0){
    PrintAllZeroOne(n-1,1,str+'1');
}
    }
    
    public static void main(String[] args) {
        PrintAllZeroOne(3,0,"");
    }
}
