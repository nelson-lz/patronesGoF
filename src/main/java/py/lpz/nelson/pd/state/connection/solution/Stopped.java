package py.lpz.nelson.pd.state.connection.solution;


import py.lpz.nelson.pd.state.connection.State;

public class Stopped extends AbstractState {

    @Override
    public void start(Connection connection) {
        connection.setAbstractState(new Ready());
    }

    @Override
    public void stop(Connection connection) {
        // Empty on purpose
    }

    @Override
    public State state() {
        return State.STOPPED;
    }

}
