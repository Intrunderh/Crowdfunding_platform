package com.example.demo;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "Crowdfunding platform API", // title — название приложения
                description = "API краудфандинговой платформы",
                version = "1.0.0", // version — версия API
                contact = @Contact( // contact — информация об ответственных за API
                        name = "Albert",
                        email = "kakoito@email.com",
                        url = "https://albert.dev"
                )
        )
)
public class OpenApiConfig {
    // Конфигурация для Swagger
}

/*  Нужно ли вставить все это в UserController, чтобы
    Swagger все собрал автоматом?
@Tag(
    name = "User Controller",
    description = "Контроллер для управления пользователями",
    externalDocs = @ExternalDocumentation(
        description = "Ссылка на общую документацию",
        url = "https://example.com/docs/user-controller"
    )
)
public class UserController {
    // ... Контент контроллера ...
}

То есть мы просто фигачим аннотациями и всякими сваггеровскими
штуками все наши контроллеры, дтошки и тд и он сам выдает нам
готовую спецификацию на основе того, что мы пометили и указали?
 */