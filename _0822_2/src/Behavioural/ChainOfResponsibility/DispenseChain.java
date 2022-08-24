package Behavioural.ChainOfResponsibility;

public interface DispenseChain {
    void setNextChain(DispenseChain next);
    void dispense(Currency cur);

}
