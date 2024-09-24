# SprintSecurityAuth2

This project demonstrates the implementation of OAuth2 authentication in a Spring Boot application using Google and GitHub as identity providers.

## Prerequisites

- Java 8 or higher
- Maven or Gradle
- Google and GitHub developer accounts to obtain client IDs and secrets

## Configuration

1. Clone the repository:
    ```sh
    git clone https://github.com/Jay100202/Spring-security-oauth2.git
    cd SprintSecurityAuth2
    ```

2. Update the `application.properties` file with your Google and GitHub OAuth2 credentials:

    ```properties
    spring.application.name=SprintSecurityAuth2

    spring.security.oauth2.client.registration.google.client-id=YOUR_GOOGLE_CLIENT_ID
    spring.security.oauth2.client.registration.google.client-secret=YOUR_GOOGLE_CLIENT_SECRET

    spring.security.oauth2.client.registration.github.client-id=YOUR_GITHUB_CLIENT_ID
    spring.security.oauth2.client.registration.github.client-secret=YOUR_GITHUB_CLIENT_SECRET
    ```

## Running the Application

1. Build the project using Maven or Gradle:
    ```sh
    # Using Maven
    mvn clean install

    # Using Gradle
    gradle build
    ```

2. Run the application:
    ```sh
    # Using Maven
    mvn spring-boot:run

    # Using Gradle
    gradle bootRun
    ```

3. Access the application at `http://localhost:8080`.

## Usage

- Navigate to the login page.
- Choose either Google or GitHub to authenticate.
- Upon successful authentication, you will be redirected to the application's home page.

## Dependencies

- Spring Boot Starter Web
- Spring Boot Starter Security
- Spring Security OAuth2 Client

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- [Spring Security OAuth2 Documentation](https://docs.spring.io/spring-security/site/docs/current/reference/html5/#oauth2)
- [Google Developers Console](https://console.developers.google.com/)
- [GitHub Developer Settings](https://github.com/settings/developers)
