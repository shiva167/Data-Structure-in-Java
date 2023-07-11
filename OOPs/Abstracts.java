abstract class Animal{
int p;
Animal(){
    System.out.println("This is Animal constructer");
}
void change(){
    p=45;
}
abstract void Run();
}
class Dog extends Animal{
 Dog(){
    System.out.println("This is Dog constructer");
}

    void Run(){
System.out.println("This is Dog class");
    }
    // Animal a = new Animal(); ///ye nahi kar sakte
}
abstract class Cat extends Animal{
    Cat(){
    System.out.println("This is Cat constructer");
}
    void Run(){
        System.out.println("This is Cat class");
    }
    // Cat t = new Cat();  ///main me cat ka constructor unlimited called hoga
}
class Camel extends Cat{
    void Run(){
        System.out.println("this is Camel classs");
    }
    Camel(){
        System.out.println("this is Camel constructor");
    }
}


class Abstracts {
    public static void main(String args[]){
//   Animal a = new Animal();  yaha pr bhi nhi
//Cat c = new Cat();///phle animal fir cat ka constructor called hoga
Camel c = new Camel();
c.change();

System.out.println(c.p);
c.p=89;

System.out.println(c.p);
c.change();
System.out.println(c.p);
c.Run();  
    }
}