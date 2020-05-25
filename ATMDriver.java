import java.util.*;
public class ATMDriver {
    
    public static void main(String[]args){
        ATM BOI = new ATM();
        Scanner scan = new Scanner(System.in);
        boolean usingATM;
        BOI.setPin();
        System.out.println("Enter your pin");
        int pinCheck = scan.nextInt();
        if(pinCheck != BOI.pin){
            usingATM = false;
        }else{
            usingATM = true;
        }
        while(usingATM == true){
            System.out.println("What will you do?\n" + "1.set new pin?\n" + "2.withdraw money?\n" + "3.deposit money?\n" + "4.check balance?\n" + "Cancel?"); 
            int action = scan.nextInt();
            if (action == 1){
                BOI.setPin();
                usingATM = false;
            }
            else if (action == 2){
                BOI.withDraw(20);
                usingATM = false;
            }
            else if (action == 3){
                BOI.deposit(20);
                usingATM = false;
            }
            else if (action == 4){
                BOI.getBalance();
            }
            else if (action == 5){
                System.out.println("You choose to do nothing.");
                usingATM = false;
            }
        }
        System.out.println("Thank you for using BOI ATM");
        scan.close();
    }

}