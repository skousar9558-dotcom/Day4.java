class parent{
    void name(){
        system.out.println("This is parent");
    }
}
class child1 extends parent{
    child(){
       system.out.println("This is child");
    }
}
class child2 extends parent{
    child2(){
       system.out.println("This is child2");
    }
}
class Main{
    public static void main(String[]args){
        child1 ch1=new child1();
        ch1.name();
        child ch2=new child2();
        ch2.name();
    }
}