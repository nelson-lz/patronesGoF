package py.lpz.nelson.pd.abstractfactory.accounts.gold;

import py.lpz.nelson.pd.abstractfactory.accounts.DebitCard;

public class GoldDebitCard implements DebitCard {

    @Override
    public String view() {
        return "Tarjeta de Debito Oro ";
    }
}
