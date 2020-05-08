package py.lpz.nelson.pd.abstractfactory.accounts.ten;

import py.lpz.nelson.pd.abstractfactory.accounts.Account;

public class TenAccount implements Account {

    @Override
    public String view() {
        return "Cuenta 10";
    }
}
