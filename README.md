# Spring boot rest sample

A sample of a rest end-point that uses SpringBoot.

## Executing project 
### Generating package
It is possible to generate package by Maven (if it is installed on the current machine) or by Maven Wrapper.

By Maven: `mvn clean package`
By Maven Wrapper: `./mvnw clean package` 

If the build was successful, it will be created a `.jar` file in `target` folder. 

### Running project

On `target` folder, it is necessary to run the created `.jar` file. Using the commands: `java -jar spring-boot-rest-sample-0.0.1-SNAPSHOT.jar`

## Reference
https://spring.io/guides/gs/rest-service/