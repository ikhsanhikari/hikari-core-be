package id.hikari.core.be.hikaricorebe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories({"id.hikari.core.be.hikaricorebe.dao"})
@EntityScan({"id.hikari.core.be.hikaricorebe.data.model"})
@SpringBootApplication
public class HikariCoreBeApplication {

	public static void main(String[] args) {
		SpringApplication.run(HikariCoreBeApplication.class, args);
	}

}
