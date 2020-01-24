package dog.ceo.msbreed;

import dog.ceo.msbreed.facade.BreedDogFacadeImp;
import dog.ceo.msbreed.manager.FlowManagerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MsBreedApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsBreedApplication.class, args);
	}

	@Bean
	public FlowManagerFactory flowManagerFactory() {
		return new FlowManagerFactory();
	}
}
