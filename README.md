# SpeakEasy
Messing about with spring, spring data, websockets and mongodb. The intention is to create a web-chat application
just for fun while learning some new front end tricks and re-familiarize myself with Spring. 
The _My setup_ sections contains the setups that have been tested o

## Setup
Project has been created using IntelliJ's Spring Boot template, which defaults to Maven for package handling.
The project should be compatible with most IDE's.

Use the appropriate _mvnw_ script to set up the project via the commandline (came with the template, not tested).

#### My setup
One of the reasons for making this projects was to get to know IntelliJ. But I plan to
test setting the project up with other IDEs.

## Config
_application.properties_ contains the connection properties for mongodb. The _spring.data.mongodb_ property in the
 .properties file will have to be set as [described in the documentation](https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-nosql.html#boot-features-connecting-to-mongodb)

When running Mongodb 3 and above we can use _.URI_, but while using 2.x we need to specify _host_, _port_ and 
(__TODO__) credentials.

#### My setup
I have tried running a local MongoDB instance, on a virtual machine (Debian) and using the 
[official MongoDB docker container](https://hub.docker.com/_/mongo/).
