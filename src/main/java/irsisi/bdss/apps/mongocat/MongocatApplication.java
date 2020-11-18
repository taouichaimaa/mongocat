package irsisi.bdss.apps.mongocat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class MongocatApplication {



    public static void main(String[] args) {
        SpringApplication.run(MongocatApplication.class, args);

    }


}
