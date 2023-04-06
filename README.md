# Application Details
This application is a simple java microservice written using Spring boot framework. All the required maven dependencies are already added.
The application has two controller java classes, but it is missing some code to be able to run as expected
* ## UserController.java
The goal of this controller is provide the endpoints necessary to perform read/write operations within the H2 in-memory database.UserRepository interface and the require JPA User entity has been added to facilitate the CRUD operations in H2 database. On application startup it populates some test data to the database (see the image below).

![image](https://user-images.githubusercontent.com/7077582/109755324-6e97d380-7bab-11eb-871f-4da39c03f085.png)

* ## ChuckNorrisController.java
The goal of this controller is to expose an endpoint that can provide some crazy facts about Chuck Norris by calling a public API that's already available.

# Task

Please follow the hints given within //TODO comments and add the missing code in both the controllers

![image](https://user-images.githubusercontent.com/7077582/109719873-e85d9c00-7b6e-11eb-8b54-cde294409176.png)

![image](https://user-images.githubusercontent.com/7077582/228735219-1923769e-471b-48aa-93f7-1e38b10ab900.png)


