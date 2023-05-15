import java.util.*;
class Testing{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
int result=0;
System.out.println("Enter 1 for Unary operators \n Enter 2 for Binary operators \nEnter 3 for Ternary operators \n Enter 4 for Exit");
int c = sc.nextInt();
int a=0,b=0;
if(c<4){
  a = sc.nextInt();
  b = sc.nextInt();
}
switch(c){
 case 1:

System.out.println("Enter 1 for increment \nEnter 2 for decrement ");
   int type = sc.nextInt();
     if(type==1){
       a++;
       b++;
     }else{
       a--;
       b--;
}
System.out.println("value of a = "+a + "value of b = "+b);   
break;



case 2:
System.out.println("Enter 1 for Arithmetic operators \n Enter 2 for Relational operators \nEnter 3 for Assignment operators ");
   int sype = sc.nextInt();
if(sype==1){
System.out.println(" Enter 1 for +, 2 for -, 3 for *,4 for / ");
int k = sc.nextInt();
switch(k){
case 1:
    result = a+b;  
     break;
  case 2:

   result = a-b;
  
break;

case 3:
result = a*b;
break;

case 4:
result = a/b;
break;
}
}else if(sype==2){
System.out.println(" Enter 1 for >, 2 for <, 3 for ==,4 for != ");
int k = sc.nextInt();

switch(k){
case 1:
    if(a>b){
     System.out.println(" a is bigger");
}else{
     System.out.println(" b is bigger");
}    
     break;
  case 2:
    if(a<b){
     System.out.println(" a is smaller");
}else{
     System.out.println(" b is smaller");
} 
  break;

case 3:
   if(a!=b){
     System.out.println(" a is not equal to  b");
}else{
 System.out.println("a is equal to b");
}
break;

case 4:
  if(a==b){
     System.out.println(" a is equal to  b");
}else{
 System.out.println("a is not equal to b");
}
break;
}
}else{

 System.out.println("Enter 1 for a and 2 for b");
int k = sc.nextInt();
if(k==1){
result = a;
}else{
result= b;
}

}
 break;
 case 3:

result = a>b?a:b;
break;

default:
System.out.println("Try again ");
}
`if(result>0){
System.out.println("result = "+ result);
}
}
}
