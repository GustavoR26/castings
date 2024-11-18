package entities;

public class Account {
    public Integer number;
    public String holder;
    public Double balance;

    public Account(){

    }

    public Account(int number, String holder, double balance){
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance(){
        return balance;
    }

    public void withDraw(Double amount){
        amount += balance;
    }

    public void deposit(Double amount){
        amount -= balance;
    }
}
