package py.lpz.nelson.pd.abstractfactory.accounts.gold;

import py.lpz.nelson.pd.abstractfactory.accounts.CreditCard;

public class GoldCreditCard implements CreditCard {

    @Override
    public String view() {
        return "Tarjeta de Crédito Oro";
    }
}
