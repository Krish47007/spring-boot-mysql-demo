FROM eclipse-temurin:21-jdk
WORKDIR /my_app
COPY ./build/libs/spring-boot-mysql-demo.jar /my_app
EXPOSE 8181
CMD ["java","-jar","spring-boot-mysql-demo.jar"]