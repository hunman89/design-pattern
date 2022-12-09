package design.pattern.adaptorpattern;

import design.pattern.adaptorpattern.security.LoginHandler;
import design.pattern.adaptorpattern.security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("hunman", "hunman");

        System.out.println(login);
    }
}
