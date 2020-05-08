package py.lpz.nelson.pd.abstractfactory.accounts.young;

import py.lpz.nelson.pd.abstractfactory.accounts.Account;
import py.lpz.nelson.pd.abstractfactory.accounts.AccountFactory;
import py.lpz.nelson.pd.abstractfactory.accounts.CreditCard;
import py.lpz.nelson.pd.abstractfactory.accounts.DebitCard;

public class YoungAccountFactory extends AccountFactory {

    private Account account = null;

    private DebitCard debitCard = null;

    private CreditCard creditCard = null;

    @Override
    public Account getAccount() {
        if (this.account == null) {
            this.account = new YoungAccount();
        }
        return this.account;
    }

    @Override
    public DebitCard getDebitCard() {
        if (this.debitCard == null) {
            this.debitCard = new YoungDebitCard();
        }
        return this.debitCard;
    }

    @Override
    public CreditCard getCreditCard() {
        if (this.creditCard == null) {
            this.creditCard = new YoungCreditCard();
        }
        return this.creditCard;
    }

}
