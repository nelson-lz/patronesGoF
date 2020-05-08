package py.lpz.nelson.pd.abstractfactory.accounts.young;

import py.lpz.nelson.pd.abstractfactory.accounts.Account;

public class YoungAccount implements Account {

    @Override
    public String view() {
        return "Cuenta Joven";
    }
}
