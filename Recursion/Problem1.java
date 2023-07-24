public class Problem1 {
public static int Tilling(int n){
    if(n==0||n==1){  ///flore size 2*n
         return 1;
    }
    return Tilling(n-1)+Tilling(n-2);
} 
    public static void main(String[] args) {
        System.out.println(Tilling(4));
    }
}

