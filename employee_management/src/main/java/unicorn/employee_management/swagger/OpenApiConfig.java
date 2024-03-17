//OpenApiConfig.java
package unicorn.employee_management.swagger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI usersMicroserviceOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("Project Unicorn: Employee Management API")
                                 .description("API Documentation for Employee Management Springboot Backend")
                                 .version("1.0"));
    }
}