package Behavioural.State;

public class StartState implements State{

    @Override
    public void doAction(StateContext context) {
        System.out.println("User is in start state");
        context.setState(this);
    }

    @Override
    public String toString() {
        return "Start State";
    }
}
