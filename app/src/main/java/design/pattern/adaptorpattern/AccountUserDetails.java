package design.pattern.adaptorpattern;

import design.pattern.adaptorpattern.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        // TODO Auto-generated method stub

        return this.account.getName();
    }

    @Override
    public String getPassword() {
        // TODO Auto-generated method stub
        return this.account.getPassword();
    }

}
