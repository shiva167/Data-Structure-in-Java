import java.util.*;
public class Type{
public static void main(String args[]){
StringBuilder s = new StringBuilder("Tonney");
for(int i=0;i<s.length()/2;i++){
int front = i;
int back = s.length()-1-i;
char frontchar = s.charAt(front);
char backchar = s.charAt(back);
 s.setCharAt(front,backchar);
s.setCharAt(back,frontchar);
}
System.out.print(s);





}
}