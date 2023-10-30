

public class Problem2 {
    
    public static void main(String[] args) {
        String str = "shiva";
    DuplicateStr(str,0,new StringBuilder(""),new boolean[26]);    
    }
    public static void DuplicateStr(String str,int inx,StringBuilder newstr,boolean map[]){
    if(inx==str.length()){
        System.out.println(newstr);
        return;
    
    }
    char currChar = str.charAt(inx);
    if(map[currChar-'a']==true){
        DuplicateStr(str,inx+1,newstr,map);
    }else{
        map[currChar-'a']=true;
        DuplicateStr(str,inx+1,newstr.append(currChar),map);
    }
    
}
}
