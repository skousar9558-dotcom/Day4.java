class parent{
    void name(){
        system.out.println("This is parent");
    }
}
class child extends parent{
    child(){
        system.out.println("This is child")
    }
}
class Main{
    public static void maun(String[]args){
        child ch=new child();
        ch.name();
    }
}