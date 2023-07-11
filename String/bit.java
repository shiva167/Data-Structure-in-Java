public class bit{
    public static void Setbit1(int n,int i){
    System.out.println(n|1>>i);
    }
        public static void Getbit(int n,int i){
    System.out.println(n&1<<i);
    }
        public static void Setbit0(int n,int i){
    System.out.println(n& ~(1<<i)); 
    } 
    public static void main(String args[]){
Setbit0(5, 1);
 
}
}
