package py.lpz.nelson.pd.abstractfactory.accounts.young;

import py.lpz.nelson.pd.abstractfactory.accounts.CreditCard;

public class YoungCreditCard implements CreditCard {

    @Override
    public String view() {
        return "Tarjeta de Crédito Joven";
    }
}
