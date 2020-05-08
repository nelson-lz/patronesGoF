package py.lpz.nelson.pd.abstractfactory.accounts.ten;

import py.lpz.nelson.pd.abstractfactory.accounts.Account;
import py.lpz.nelson.pd.abstractfactory.accounts.AccountFactory;
import py.lpz.nelson.pd.abstractfactory.accounts.CreditCard;
import py.lpz.nelson.pd.abstractfactory.accounts.DebitCard;

public class TenAccountFactory extends AccountFactory {

    private Account account = null;

    private DebitCard debitCard = null;

    private CreditCard creditCard = null;

    @Override
    public Account getAccount() {
        if (this.account == null) {
            this.account = new TenAccount();
        }
        return this.account;
    }

    @Override
    public DebitCard getDebitCard() {
        if (this.debitCard == null) {
            this.debitCard = new TenDebitCard();
        }
        return this.debitCard;
    }

    @Override
    public CreditCard getCreditCard() {
        if (this.creditCard == null) {
            this.creditCard = new TenCreditCard();
        }
        return this.creditCard;
    }

}
