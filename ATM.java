import java.util.*;
public class ATM {
    public int pin = 0000;
    private double balance = 200;
    public void setPin(){
        Scanner privateScan = new Scanner(System.in);
        if(pin != 0000){
            System.out.println("Enter your pin");
            int a = privateScan.nextInt();
            if (a != pin){
                System.out.println("ERROR: INCORRECT PIN!");
                endProgram();
            }
            privateScan.close();
        }
        pin = (int)(Math.random()*9999 + 1);
        if (pin < 10){
            pin = pin * 1000;
        }else if (pin < 100){
            pin = pin * 100;
        }else if(pin < 1000){
            pin = pin * 10;
        }
        System.out.println("Your current pin is: " + pin);
        
    }
    public void withDraw(double x){
        if (x > balance){
            System.out.println("ERROR: Insufficient funds!");
        }else{
            balance = balance - x;
        }
        System.out.println("You withdrew: $" + x);
        System.out.println("Your new balance is: " + balance);
        
    }
    public void deposit(double y){
        balance = balance + y;
        System.out.println("You deposited: " + y + "\n" + "Your new balance is: " + balance);
        
    }
    public void getBalance(){
        System.out.println("Your balance is: " + balance);
    }
    public void endProgram(){
        System.out.println("Thank you for using BOI ATM!");
        System.exit(0);
    }
}