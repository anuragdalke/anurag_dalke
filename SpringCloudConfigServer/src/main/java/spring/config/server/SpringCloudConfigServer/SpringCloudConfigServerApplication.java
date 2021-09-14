package spring.config.server.SpringCloudConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringCloudConfigServerApplication {
	public static void main(String[] args) {
		System.out.println("Spring Config Server");
		SpringApplication.run(SpringCloudConfigServerApplication.class, args);
		
	
	}

}
