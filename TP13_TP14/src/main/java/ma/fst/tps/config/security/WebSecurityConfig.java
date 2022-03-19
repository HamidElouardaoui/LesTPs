package ma.fst.tps.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	PasswordEncoder passwordEncoder;
	
	/* 1. Authentification */
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// TODO Auto-generated method stub
		//super.configure(auth);
		auth.inMemoryAuthentication()
		    .passwordEncoder(passwordEncoder)
		    .withUser("user").password(passwordEncoder.encode("123456")).roles("USER")
		    .and()
		    .withUser("admin").password(passwordEncoder.encode("123456")).roles("ADMIN");
	}
	
	/* 2. Autorisation */
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		http.authorizeRequests()
		.antMatchers("/add-client","/show-client/**")
		.hasRole("USER")
		.antMatchers("/delete-client/**")
		.hasRole("ADMIN")
		.antMatchers("/clients","/")
		.permitAll()
		.anyRequest()
		.authenticated()
		.and()
		.formLogin()
		.defaultSuccessUrl("/clients")
		.and()
		.exceptionHandling().accessDeniedPage("/accessdenied");
	}

}
