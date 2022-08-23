package Behavioural.State;

public class StateContext {
    private State state;

    public StateContext(){
        state=null;
    }
    public StateContext(State st){
        state=st;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
