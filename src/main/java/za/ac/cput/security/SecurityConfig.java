package za.ac.cput.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
       http.httpBasic()
               .and()
               .authorizeRequests()
               .antMatchers(HttpMethod.POST, "**/create").hasRole("ADMIN")
               .antMatchers(HttpMethod.POST, "**/update").hasRole("ADMIN")
               .antMatchers(HttpMethod.GET, "**/getall").hasRole("ADMIN")
               .antMatchers(HttpMethod.GET, "**/getall").hasRole("MEMBER")
                .and()
               .csrf().disable()
               .formLogin().disable();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
       auth.inMemoryAuthentication()
               .withUser("Admin")
               .password("{noop}admin123")
               .roles("ADMIN")
               .and()
               .withUser("trainer")
               .password("{noop}trainer123")
               .roles("USER")
               .and()
               .withUser("member")
               .password("{noop}member123")
               .roles("USER");
    }
}
