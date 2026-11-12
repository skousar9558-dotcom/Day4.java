class Bank{
    void Deposit(int a){
        System.out.println("Deposit:"+a);
    }
    void Deposit(double a){
        System.out.println("Deposit:"+a);
    }
}
Class Loan {
    void Interest(double p){
        System.out.println("Interest:"+(p*0.05));
    }
    void Interest(double p,int y){
        System.out.println("Interest:"+(p*0.07*y))
    }
}
Class Bank{
    public static void main(string[]args){
      Bank b=new Bank();
        b.deposit(1000);
        b.deposit(500.0);

        Loan|=new Loan();~
        |.Interest(10000);
        |.Interest(10000,2);
    }
}