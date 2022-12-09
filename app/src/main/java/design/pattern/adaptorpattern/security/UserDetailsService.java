package design.pattern.adaptorpattern.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
