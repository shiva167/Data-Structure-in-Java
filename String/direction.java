public class direction{
    public static void Shortest(String str){
        int x =0,y=0;
        char dir;
        for(int i=0;i<str.length();i++){
            dir=str.charAt(i);
            if(dir=='s'){
                y--;
            }else if(dir=='n'){
                y++;
            }else if(dir=='e'){
             x++;
            }else{
                x--;
            }
        }
        float x2= x*x;
        float y2=y*y;
        System.out.print((float)Math.sqrt(x2+y2));
    }
    public static void main(String args[]){
        String str= "wneenesennn";
        Shortest(str);
    }
}