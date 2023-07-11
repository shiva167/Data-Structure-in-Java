// public class Interfaces {
//     public static void main(String[] args) {
//          Carnivore t = new Safe();
//          Safe s = new Safe();
//          Harbivore h = new Safe(); 
//          t.Mental();
//          s.Mental();
//          h.intelligent();
//          s.intelligent();
//          h.Mental();
//          h.display();
//         //  t.intelligent();  ///yaha access nahi kar payenge
//           }
// }
// interface Carnivore{
//     void Mental();
// int t=44;
// } 
// interface Harbivore extends Carnivore{
// String k = "kanya kumari";
// void intelligent();    
// void display();
// } 
// class Safe implements Carnivore,Harbivore{
//   public  void Mental(){   /////Use public keyword
//         System.out.println( "this is Mental class method " );
//     }
//    public void intelligent(){
//         System.out.println("This is intelligent class method");
//     }
//     public void display(){
//         System.out.println(t);
//     }
// }