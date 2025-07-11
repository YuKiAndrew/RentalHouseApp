package org.andrew.fileHandler;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
@EnableCaching
@ConfigurationPropertiesScan
public class FileHandlerApplication {
    public static void main(String[] args) {
        SpringApplication.run(FileHandlerApplication.class, args);
    }

    @Bean
    CommandLineRunner printDbConfig(Environment env) {
        return args -> {
            System.out.println(">>> spring.datasource.url      = "
                    + env.getProperty("spring.datasource.url"));
            System.out.println(">>> spring.datasource.username = "
                    + env.getProperty("spring.datasource.username"));
            // 密码就不用打印了
        };
    }

}
