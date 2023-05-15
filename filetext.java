import java.io.File;
class fileHandling{
public static void main(String args[]){
try{
File io = new File("C://Users/Shikh/java/text.txt");
System.out.println("File is created ");
}catch(Exception e){
System.out.println(e);
}
}
}