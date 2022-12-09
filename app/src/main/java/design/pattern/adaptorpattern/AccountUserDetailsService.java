package design.pattern.adaptorpattern;

import design.pattern.adaptorpattern.security.UserDetails;
import design.pattern.adaptorpattern.security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        // TODO Auto-generated method stub
        Account accountByUsername = accountService.findAccountByUsername(username);
        return new AccountUserDetails(accountByUsername);
    }

}
