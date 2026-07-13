# journalApp_V1
This Application is used to track the user flow, and it is build using Java,Spring Boot for now.
It doesn't use database here, simply store data in Map Interface and restarting the server will delete the previous data.
So, again we have to insert the data using POST mapping.
In next version it will use mongoDB as a database to store data.


# journalApp_V2
We have created seperate package for controller (end point), service (business logic) and repository (interact with db)
In version 2, it uses mongoDB to store data using Spring Data MongoDB.
@Document annotation is used to map class to mongoDB collection and @Id annotation is uses to set a primary key.
in next version, we will add ResponseEntity to show the status code while sending data to collection.


# journalApp_V2
In version 3, we have added ResponseEntity class for the Http Status code in the controller package in JournalEntryControllerV2.java
