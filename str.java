import java.util.*;
public class Team{
public static void main(String []args){
Scanner t =new Scanner(System.in);
  String s = t.nextLine();
  String p = "I Love You ";
  String k  = p+s;
  System.out.println("It's confession for that girl : " + "\n" + k);
for(int i=0;i<k.length();i++){
System.out.println(k.charAt(i));
}
if(s.compareTo(p)==0){

System.out.print("String are equal ");
}else{

System.out.print("String are not equal");
}
if(new String("Money")==new String("Money")){
System.out.print("String are equal");
}else{

System.out.print("String are not equal");
}
}
}