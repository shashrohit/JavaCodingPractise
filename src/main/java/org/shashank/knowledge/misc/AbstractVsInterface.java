package org.shashank.knowledge.misc;

abstract class Bank{
    public void deposit(int amount){
        System.out.println("Depositing account - "+ amount);
    }
    public void withdraw(int amount){
        System.out.println("Withdrawing account - "+ amount);
    }
    abstract int calculateInterest();
}

class HDFC extends Bank{

    int calculateInterest(){
        System.out.println("Calculating interest for HDFC");
        return 0;
    }

}

class SBI extends Bank{

    int calculateInterest(){
        System.out.println("Calculating interest for SBI");
        return 0;
    }

}

interface IBank {
    void deposit(int amount);
    void withdraw(int amount);
    int calculateInterest();
}


public class AbstractVsInterface {
}
