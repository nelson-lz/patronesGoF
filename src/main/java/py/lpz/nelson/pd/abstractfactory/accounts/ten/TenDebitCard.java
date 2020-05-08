package py.lpz.nelson.pd.abstractfactory.accounts.ten;

import py.lpz.nelson.pd.abstractfactory.accounts.DebitCard;

public class TenDebitCard implements DebitCard {

    @Override
    public String view() {
        return "Tarjeta de Débito 10";
    }
}
