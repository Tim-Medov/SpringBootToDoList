
package enterprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        // page url: http://localhost:8080/toDoList
        SpringApplication.run(Application.class, args);
    }
}
