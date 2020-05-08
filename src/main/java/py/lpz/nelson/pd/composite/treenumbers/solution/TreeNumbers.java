package py.lpz.nelson.pd.composite.treenumbers.solution;

public interface TreeNumbers {
    void add(TreeNumbers treeNumbers);

    void remove(TreeNumbers treeNumbers);

    int number();

    int sum();

    int higher();
}
