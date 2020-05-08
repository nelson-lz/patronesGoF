package py.lpz.nelson.pd.abstractfactory.accounts.young;

import py.lpz.nelson.pd.abstractfactory.accounts.DebitCard;

public class YoungDebitCard implements DebitCard {

    @Override
    public String view() {
        return "Tarjeta de Débito Joven";
    }
}
