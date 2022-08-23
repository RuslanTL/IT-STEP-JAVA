package Behavioural.State;

public class StopState implements State{

    @Override
    public void doAction(StateContext context) {
        System.out.println("User is in stop state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Stop State";
    }
}