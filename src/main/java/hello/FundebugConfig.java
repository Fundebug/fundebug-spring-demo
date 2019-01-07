package hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.fundebug.Fundebug;
import com.fundebug.SpringConfig;

@Configuration
@Import(SpringConfig.class)
public class FundebugConfig {
	@Bean
	public Fundebug getBean() {
		return new Fundebug("apikey");
	}
}