package py.lpz.nelson.pd.abstractfactory.concrete1;

import py.lpz.nelson.pd.abstractfactory.AbstractFactory;
import py.lpz.nelson.pd.abstractfactory.ProductA;
import py.lpz.nelson.pd.abstractfactory.ProductB;

public class Concrete1Factory extends AbstractFactory {

    private ProductA productA;

    private ProductB productB;

    @Override
    public ProductA getProductA() {
        if (productA == null) {
            productA = new ProductA1();
        }
        return productA;
    }

    @Override
    public ProductB getProductB() {
        if (productB == null) {
            productB = new ProductB1();
        }
        return productB;
    }

    @Override
    public String toString() {
        return "FabricaConcreta1";
    }

}
