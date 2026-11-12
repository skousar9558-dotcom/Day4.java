class GrantParents{
    void name() {
        System.out.println("This is parent");
    }
}
class parent extends GrantParents{
    parent(){
        System.out.println("This is child1");
    }
}
class child extends parent{
    child(){
        System.out.println("This is child");
    }
}
class Main{
    public static void main(String[]args){
            child ch=new child();
            ch.name();
        }
    }