class T{
    String n;
    int q;
    int marks[];
    // ///copy constructor
    // T(T t){
    //     marks= new int[3];
    //     this.n= t.n;
    //     this.marks=t.marks;  ////shalow copy means orignal array ko hee manuplate karein 
                
    // }
    ///copy constructor
    T(T t){
        marks=new int[3];
        this.n= t.n;
                                               ////deep copy means orignal array copy hoga new array me 
           for(int i=0;i<3;i++){
            this.marks[i]=t.marks[i];
           }     
    }
    T(String x,int y){
        this.n= x;
        this.q=y;
        marks=new int[3];
    }
    T(){
        marks=new int[3];
        
        System.out.println("This is a default constructor");
    }
 String Get(){
    return this.n;
 }
 int Geti(){
    return this.q;
 }
}

public class P {
    public static void main(String args[]){
     T t= new T("Mahesh",44);
     T n = new T();
      t.marks[0]=33;
      t.marks[1]=31;
      t.marks[2]=13;
   for(int i=0;i<t.marks.length;i++){
     System.out.println(t.marks[i]);
    
   }
      System.out.println(t.Get());
   T s = new T(t);
   t.marks[2]=11;
   for(int i=0;i<s.marks.length;i++){
     System.out.println(s.marks[i]);
    
   }
         System.out.println(s.Geti());  ////isne value to copy nahi kee tab bhi default value dega

          System.out.println(t.Geti());
}    
        }
