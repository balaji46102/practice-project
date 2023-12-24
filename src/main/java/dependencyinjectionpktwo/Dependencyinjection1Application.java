package dependencyinjectionpktwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import dependencyinjectionpktwo.models.Car;

@SpringBootApplication
public class Dependencyinjection1Application {

	public static void main(String[] args) {
	ConfigurableApplicationContext context =	SpringApplication.run(Dependencyinjection1Application.class, args);
	Car car = context.getBean(Car.class);
		System.out.println(car.getEngineDetails());
	}

}
