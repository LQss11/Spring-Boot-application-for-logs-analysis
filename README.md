# Spring-Boot-application-for-logs-analysis
This project contains a dockerized spring boot app with the implementation of the ELK (Elasticsearch, Logstash, and Kibana) Stack in order to collect logs and visualize them easily
# Quick Start
You will need to do the following steps to get the stack and spring boot app running on your computer:
- Clone project: 
```sh
git clone https://github.com/LQss11/Spring-Boot-application-for-logs-analysis.git
```
- Move to the created directory of the cloned project: 
```sh
cd Spring-Boot-application-for-logs-analysis
```
- Run the project with the specified stack: 
```sh
docker-compose up --build
```
# Screenshots
**Kibana Logs Discovery**
<p align="center">
  <img src="https://raw.githubusercontent.com/LQss11/Spring-Boot-application-for-logs-analysis/master/screenshots/kibana.png" title="Logs Discovery">
</p> 

**Swagger APIs Documentation**
<p align="center">
  <img src="https://raw.githubusercontent.com/LQss11/Spring-Boot-application-for-logs-analysis/master/screenshots/swagger.png" title="Swagger APIs Documentation">
</p> 

**H2 Database**
<p align="center">
  <img src="https://raw.githubusercontent.com/LQss11/Spring-Boot-application-for-logs-analysis/master/screenshots/h2.png" title="Swagger APIs Documentation">
</p> 

# Info
Once the application is running and no errors occurred due to the execution or configuration, you will need to do a few things to check whether everything works fine:
- Try to test one of the APIs through swagger.
- An index with the name **Springlogs** will be generated to be used with Elasticsearch where you will be able to visualize your logs with Kibana. (Username: `elastic` | Password: `changeme`)
- You can also check that the data have been added to your H2 test database.
## URLs
| Tool | URL |
| ------ | ------ |
| Swagger UI | http://localhost:8080/swagger-ui.html# |
| H2 | http://localhost:8080/h2 |
| Kibana | http://localhost:5601/app/kibana |

### H2 Settings
Those are the default settings of our H2 DB and you can change this settings inside the application.properties file in the resources folder.

1. Driver Class: `org.h2.Driver`
2. JDBC URL: `jdbc:h2:mem:test`
3. User Name: `root`
4. Password: `root`

