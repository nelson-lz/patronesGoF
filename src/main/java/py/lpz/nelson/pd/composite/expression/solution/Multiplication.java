package py.lpz.nelson.pd.composite.expression.solution;

public class Multiplication extends Operation {

    public Multiplication(Expression expression1, Expression expression2) {
        super(expression1, expression2);
    }

    @Override
    public int operate() {
        return this.getExpression1().operate() * this.getExpression2().operate();
    }

    @Override
    protected String operationString() {
        return "*";
    }

}
