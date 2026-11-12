abstract class parent{
    abstract void loan();
    void printing(){
        System.out.println("Welcome to sBI");
    }
}
class Child extends parent{
    void loan(){
        System.out.println("Loan Accepted!!");
    }
}
class Abstract{
    public static void main(String[]args){
        Child ch = new Child();
        ch.loan();
        ch.printing();
    }
}