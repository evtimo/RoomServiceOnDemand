package university.project.roomserviceondemand.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"university.project.roomserviceondemand"})
@EntityScan(basePackages = "university.project.roomserviceondemand.models")
public class RoomserviceondemandApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoomserviceondemandApplication.class, args);
	}

}
