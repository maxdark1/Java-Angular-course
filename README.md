# Java-Angular-course

To run the project you must have JAVA_HOME enviroment variable configurated & mvn enviroment variable then you can
run the project with this line:

TO ADD VARS TO PATH EDIT THIS FILE: vim ~/.zshrc
EXAMPLE OF PATH:
export JAVA_HOME=/Users/jlara/Documents/Cursos/jdk-18/Contents/Home
export PATH=/Users/jlara/Documents/Cursos/apache-maven-3.8.6/bin:$PATH

mvn spring-boot:run

Run this line to Install dependencies:
mvn install

To run MicroserviciosUsuario you have to build First de Project "commons-microservicios" with this line:
mvn install -DskipTests

