FROM java:8
MAINTAINER duyunzelx@outlook.com
ADD discover-eureka-0.0.1.jar /app.jar
EXPOSE 8761
ENTRYPOINT ["/usr/bin/java", "-jar", "app.jar"]