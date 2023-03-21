import java.util.*;
public class Type{
public static void main(String args[]){
StringBuilder s = new StringBuilder("T");
s.append("O");
s.append("Y");
s.append("L");
s.append("O");
System.out.println(s);
s.insert(3,'P');
s.setCharAt(0,'y');
s.delete(3,5);
System.out.println(s);
System.out.print(s.length());
}
}