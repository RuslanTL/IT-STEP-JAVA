package Behavioural.ChainOfResponsibility;

public class Dollar20Dispenser implements DispenseChain{
    private DispenseChain chain;
    private int dispenseAmount=20;

    @Override
    public void setNextChain(DispenseChain next) {
        this.chain=next;
    }

    @Override
    public void dispense(Currency cur) {
        if(cur.getAmount()>=dispenseAmount){
            int num = cur.getAmount()/dispenseAmount;
            int remainder = cur.getAmount()%dispenseAmount;
            System.out.println("dispensing " + num + " " + dispenseAmount +"$ notes");
            if(remainder!= 0){
                this.chain.dispense(new Currency(remainder));
            }
        }else{
            this.chain.dispense(cur);
        }
    }
}
