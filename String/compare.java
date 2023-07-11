public class compare {
 public static String Compare(String str[]){
    String largest;
    int i=0;
    largest=str[0];
    while(i<str.length){

        if(str[i].compareTo(largest)>0){
         largest=str[i];
        }
      i++;
  }
  return largest;
    }
 
 
 
    public static void main(String args[]){

    String str[]={"Mayank","Kajal","Shiva","Shauraya","Shikha","Mohit","Shantanu"};
System.out.println(Compare(str));
 }   
}
