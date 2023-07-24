public class Problem5 {
// public static int Gridways(int i,int j,int n,int m){
//     if(i==n-1&&j==m-1){
//         return 1;
//     }else if(i==n||j==m){
//         return 0;
//     }
//     int w1= Gridways(i+1, j, n, m);
//         int w2= Gridways(i, j+1, n, m);
//         return w1+w2;
// }
public static int Fact(int n){
    if(n==0){
  return 1;
    }
return n*Fact(n-1);
}
public static int Gridways(int i,int j,int n,int m){
return Fact((n+m)/Fact(n))/Fact(m);

}
  public static void main(String[] args) {
        int n=4,m=4;
  System.out.println(Gridways(0, 0,n, m));
//   System.out.println(Fact(n,m));    
}
    
}
