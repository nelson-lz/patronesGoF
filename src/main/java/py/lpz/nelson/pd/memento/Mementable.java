package py.lpz.nelson.pd.memento;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);

}
