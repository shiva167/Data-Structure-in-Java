class Problem2{
    public static void PrintStr(String str ,String ans,int i){
        if(str.length()==i){
            if(i==0){
           System.out.println("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
       
        PrintStr(str, ans+str.charAt(i), i+1);
     PrintStr(str, ans, i+1);
    }
    public static void main(String[] args) {
        PrintStr("abc"," ", 0);
    }
}