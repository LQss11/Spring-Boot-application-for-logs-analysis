# Spring-Boot-application-for-logs-analysis
This project contains a dockerized spring boot app with the implementation of the ELK (Elasticsearch, Logstash and Kibana) Stack in order to collect logs and visualize them easily
# Quick Start
You will need to do the following steps to get the stack and spring boot app running on your computer:
1. `Clone project`: git clone https://github.com/LQss11/Spring-Boot-application-for-logs-analysis.git
1. `Move to the created directory of cloned project`: cd Spring-Boot-application-for-logs-analysis
1. `Run the project with the specified stack`: docker-compose up --build

# Quick Test
Once the application is running and no errors occured due the execution or configuration, you will need to do few things to check whether everything works fine:

1. `Visit Swagger UI` by visiting http://localhost:8080/swagger-ui.html#
1. `Run one of the APIs generated`
1. `Check whether data added properly using h2 database`: http://localhost:8080/h2 -> make sure you enter the right h2 information to login.
1. `Kibana Url`: http://localhost:5601/app/kibana
1. `Go to discover` and create the elasticsearch index

Now that you have finished all the required steps you will have a ready to use environement for log analysis of a spring boot application.

Make sure to change spring code to follow your needs (Maven was used in this project)


