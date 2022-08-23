package Behavioural.State;

public class Main {
    public static void main(String[] args) {
        StateContext context = new StateContext();
        StartState start = new StartState();
        StopState stop = new StopState();

        start.doAction(context);
        System.out.println(context.getState().toString());
        stop.doAction(context);
        System.out.println(context.getState().toString());

    }
}
