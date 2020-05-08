package py.lpz.nelson.pd.abstractfactory.accounts.gold;

import py.lpz.nelson.pd.abstractfactory.accounts.Account;

public class GoldAccount implements Account {

    @Override
    public String view() {
        return "Cuenta Oro";
    }
}
