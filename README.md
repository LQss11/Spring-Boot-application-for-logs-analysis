# Spring-Boot-application-for-logs-analysis
This project contains a dockerized spring boot app with the implementation of the ELK (Elasticsearch, Logstash and Kibana) Stack in order to collect logs and visualize them easily
# Quick Start
You will need to do the following steps to get the stack and spring boot app running on your computer:
- Clone project: 
```sh
git clone https://github.com/LQss11/Spring-Boot-application-for-logs-analysis.git
```
- Move to the created directory of cloned project: 
```sh
cd Spring-Boot-application-for-logs-analysis
```
- Run the project with the specified stack: 
```sh
docker-compose up --build
```
# Quick Test
Once the application is running and no errors occured due the execution or configuration, you will need to do few things to check whether everything works fine:
- Try to test one of the APIs through swagger.
- An index with name **Springlogs** will be generated to be used with Elasticsearch where you will be able to visualize you logs with Kibana. (Username: `elastic` | Password: `changeme`)
- You can also check that the data have been added to you H2 test database .
# URLs
| Tool | URL |
| ------ | ------ |
| Swagger UI | http://localhost:8080/swagger-ui.html# |
| H2 | http://localhost:8080/h2 |
| Kibana | http://localhost:5601/app/kibana |
| Swagger UI | http://localhost:8080/swagger-ui.html# |

### H2 Settings
Thos are the default settings of our H2 DB and you can change thos settings inside the application.properties file in the resources folder.

1. Driver Class: `org.h2.Driver`
2. JDBC URL: `jdbc:h2:mem:test`
3. User Name: `root`
4. Password: `root`

# Screenshots

<p align="center">
  <img src="https://raw.githubusercontent.com/LQss11/Spring-Boot-application-for-logs-analysis/master/screenshots/kibana.png" title="Logs Discovery">
</p> 