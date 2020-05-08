package py.lpz.nelson.pd.abstractfactory.accounts.ten;

import py.lpz.nelson.pd.abstractfactory.accounts.CreditCard;

public class TenCreditCard implements CreditCard {

    @Override
    public String view() {
        return "Tarjeta de Crédito 10";
    }
}
