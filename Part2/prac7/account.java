import java.util.Date;

public class account {

  private int id;
  private double balance;
  private double annualInterestrate;
  private double monthlyInterestrate;
  private double withdrawAmount;
  private double depositeAmount;
  private Date currentdate;

  public account() {
    id = 0;
    balance = 500;
    annualInterestrate = 0.07;
    currentdate = new Date();
  }

  public account(int id, double balance) {
    this.id = id;
    this.balance = balance;
    this.annualInterestrate = 0.07;
    this.currentdate = new Date();
  }

  public Date getdate() {
    return currentdate;
  }

  public int getid() {
    return id;
  }

  public void setid(int id) {
    this.id = id;
  }

  public double getbalance() {
    return balance;
  }

  public void setbalance(double balance) {
    this.balance = balance;
  }

  public double getArate() {
    return annualInterestrate;
  }

  public void setArate(double annualInterestrate) {
    this.annualInterestrate = annualInterestrate;
  }

  public double getMrate() {
    return annualInterestrate / 12;
  }

  public double getMinterest() {
    return (getMrate() / 100) * balance;
  }

  public void withdraw(double withdrawAmount) {
    this.withdrawAmount = withdrawAmount;
    if (balance >= withdrawAmount) {
      balance -= withdrawAmount;
    } else System.out.println("Can't withdraw");
  }

  public void deposite(double depositeAmount) {
    this.depositeAmount = depositeAmount;
    balance += depositeAmount;
  }

  public void display() {
    System.out.println("Id is : " + getid());
    System.out.println("Balance  is : " + getbalance());
    System.out.println("Enter Date : " + getdate());
    System.out.println("Annualrate is in percentage : " + getArate());
    System.out.println("Monthlyrate is in percentage : " + getMrate());
    System.out.println("Monthly interest : " + getMinterest());
  }
}
