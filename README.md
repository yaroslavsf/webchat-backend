## 📝Table of Contents
- [Getting started](#getting_started)
- [Swagger](#swagger)
- [Credentials](#credentials)
- [Migration](#migration)


## 🏁Getting started <a name = "getting_started"></a>
### Database:
- Create ``.env`` file from ``.env.sample`` and configure db 
- Run database
    ```
    docker-compose up
    ```
### Application
- [Configure JDK](./HELP.md)

## Swagger <a name = "swagger"></a>
http://localhost:8080/swagger-ui/index.html

## 🔒Credentials <a name = "credentials"></a>
Admin<br>
login: admin@example.com<br>
pass: 1234

User<br>
login: user@example.com<br>
pass: 1234

## 🔧Migration <a name = "migration"></a>
### Database:
Change
1) .env credentials
2) application.properties database configuration 