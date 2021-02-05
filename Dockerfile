FROM tomcat:jdk8-openjdk-slim-buster

LABEL maintainer=”oouklich@student.1337.ma”

ADD target/spring-mvc-demo.war /usr/local/tomcat/webapps/

EXPOSE 8080

CMD ["catalina.sh", "run"]
