public class Statics {
    public static void main(String[] args) {
        Normal n= new Normal();
        n.j= 33;
        Normal p = new Normal();  /// particular new object ke liye value change karne par previous obj me bhi value change hogi 
                                      /// sabhi obj ke liye value ek hee rahege
        p.j=44;
        System.out.println(p.j + " "+ n.j);
        System.out.println(p.Marks(32,22,12) + " "+ n.Marks(44,33,22)); ///static func rkhne pr multiple creation nahi hoga us function ka 
        
        
    }
}
class Normal{
    static int j;
    String p;
    int q;
    static int Marks(int i,int m,int l){
        return i+m+l;
    }
}