package ru.kalen.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

/**
 * Класс точки входа в приложение.
 */
@SpringBootApplication
public class ApiGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    /**
     * Бин для конфигурации Spring Gateway где определяется пользовательский маршрутизатор для перенаправления запросов
     *
     * @param builder построитель маршрутов.
     * @return маршрутизатор.
     */
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("PickUpPoint", r -> r.path("/api/orders/**")
                        .uri("http://localhost:8081/")).build();
    }

    /**
     * Бин для конфигурации Spring Gateway где определяется пользовательский маршрутизатор  для перенаправления запросов
     *
     * @param builder построитель маршрутов.
     * @return маршрутизатор.
     */
    @Bean
    public RouteLocator EmployeeRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("EmployeeCustomerService", r -> r.path("/api/customer/**")
                        .uri("http://localhost:8082/")).build();
    }

    /**
     * Бин для конфигурации Spring Gateway где определяется маршрутизатор представления для перенаправления запросов
     *
     * @param builder построитель маршрутов.
     * @return маршрутизатор.
     */
    @Bean
    public RouteLocator WebClientRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("WebClient", r -> r.path("/web/**")
                        .uri("http://localhost:8080/")).build();
    }
}
