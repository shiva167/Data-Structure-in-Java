public class Supers {
    public static void main(String[] args) {
   Madras n = new Madras();       
   System.out.println(n.temple); 
    }
}
class Channai{
    String temple;
Channai(){
     System.out.println("This is a Channai constructor");
    
}
}
class Madras extends Channai{
    Madras(){

        super.temple="jai bhole baba";
      //  super();
     System.out.println("This is a Madras constructor");
    }
}