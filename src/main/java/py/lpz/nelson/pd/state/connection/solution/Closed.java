package py.lpz.nelson.pd.state.connection.solution;

import py.lpz.nelson.pd.state.connection.State;

public class Closed extends AbstractState {

    @Override
    public void open(Connection connection) {
        connection.setAbstractState(new Ready());
    }

    @Override
    public void close(Connection connection) {
        // Empty on purpose
    }

    @Override
    public State state() {
        return State.CLOSED;
    }

}
