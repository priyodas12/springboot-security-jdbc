package io.springlab.springbootsecurityjdbc.config;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.sql.DataSource;


@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication()
                .dataSource(dataSource);
                /*.withDefaultSchema()
                .withUser(
                        User.withUsername("user")
                        .password("pass123")
                        .roles("USER")
                ).withUser(
                User.withUsername("admin")
                        .password("pass123")
                        .roles("ADMIN")
                );*/
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/prod").hasRole("PROD")
                .antMatchers("/dev").hasAnyRole("PROD","DEV")
                .antMatchers("/test").hasAnyRole("PROD","DEV","TEST")
                .antMatchers("/").permitAll()
                .and()
                .formLogin();
    }

    @Bean
    PasswordEncoder getPasswordEncoded(){
        return NoOpPasswordEncoder.getInstance();
    }
}
