# S4.02 - API REST with Springboot Framework & MongoDB

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Maven](https://img.shields.io/badge/apache_maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-4EA94B?style=for-the-badge&logo=mongodb&logoColor=white)
![Postman](https://img.shields.io/badge/Postman-FF6C37?style=for-the-badge&logo=Postman&logoColor=white)
![IntelliJ](https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Docker](https://img.shields.io/badge/Docker%20Compose-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Git](https://img.shields.io/badge/GIT-E44C30?style=for-the-badge&logo=git&logoColor=white)

## Summary
In this task you will do a CRUD (Create, Read, Update, Delete)
with 3 different databases.
You will learn how to correctly use HTTP verbs and how
to manage response codes.

In addition, we will use Spring events to test an event-publisher 
that is launched when a value (int quantityKilos) or a method 
(delete) is executed.

-----
## 📄 LVL 3: Spring & MongoDB
### Key Components

* We have an **Entity** called "Fruit", which has the following
  properties:
    * int id --> (String id)
    * String name
    * int quantityKilos

* **MYSQL Database**
* Subpackages:
    * **Controllers**
    * **Model**
    * **Services**
    * **Repository**
    * **Exception**

-----
## 🔧 Technologies
- **Java 21**: Core programming language
- **Maven**: Build and dependency management
- **MongoDB**: Non-Relational Database
- **Git/GitHub**: version control
- **Additional dependencies**:
    - Spring Data MongoDB
    - Lombok
    - Postman
    - Docker compose

-----

### 🛠️ SCRIPTS
```bash
mvn compile          # Compile project
mvn package          # Package in .jar
mvn clean            # Clean the project
mvn spring-boot:run  # Execute the app
docker-compose up -d  # Run docker container
docker-compose stop   # Stop docker container
docker-compose down -v  # Shutdown docker container
docker-compose ps # See logs container
```

### 🛠️ HTTP requests to update and consult information (POSTMAN)
```bash
URL base:
http://localhost:8080/fruits

(POST):
http://localhost:8080/fruits + raw JSON:
{
  "name": "Golden Banana",
  "quantityKilos": 213
}

(GET):
http://localhost:8080/fruits/{id}
http://localhost:8080/fruits

(PUT):
http://localhost:8080/fruits/{id}

(DELETE):
http://localhost:8080/fruits/{id}

```
-----
## 📚 Additional Resources
- [Badges](https://github.com/alexandresanlim/Badges4-README.md-Profile?tab=readme-ov-file#-frameworks--library-)
- [Spring-MongoDB](https://www.geeksforgeeks.org/springboot/spring-boot-crud-operations-using-mongodb/)
- [@Component-@Repository-@Services](https://www.baeldung.com/spring-component-repository-service)
- [SpringEvents](https://www.baeldung.com/spring-events)
- [HTTP](https://www.restapitutorial.com/httpstatuscodes)
- [Docker](https://docs.docker.com/engine/containers/start-containers-automatically/#use-a-restart-policy)

[Back to top](#top)