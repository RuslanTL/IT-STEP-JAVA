package Behavioural.ChainOfResponsibility;

import java.util.Scanner;

public class Main {
    private DispenseChain c1;

    public Main(){
        this.c1 = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3  = new Dollar10Dispenser();

        c1.setNextChain(c2);
        c2.setNextChain(c3);

    }
    public static void main(String[] args) {
        /*Currency money = new Currency(384571);

        Dollar50Dispenser fifty = new Dollar50Dispenser();
        Dollar20Dispenser twenty = new Dollar20Dispenser();
        Dollar10Dispenser ten = new Dollar10Dispenser();

        fifty.setNextChain(twenty);
        twenty.setNextChain(ten);

        System.out.println("total money to dispense: " + money.getAmount() + "$");
        fifty.dispense(money);*/

        Main main = new Main();
        while(true) {

            System.out.println("enter amount to dispense: ");
            Scanner scanner = new Scanner(System.in);
            try{
                int amount = scanner.nextInt();
                main.c1.dispense(new Currency(amount));
            }catch(Exception e){
                System.out.println(e);
                continue;
            }


        }
    }
}
