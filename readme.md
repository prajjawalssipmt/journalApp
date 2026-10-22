# Version One
1. This is the initial setup of journalApp.
2. In version one we have just created the JournalEntry POJO class.
3. Created api using GET, POST, PUT, DELETE of JournalEntry.
4. Also, we do not have db in version one so the entries got deleted after we close the server.

# Version Two
1. Integrated with mongoDB database.
2. Package created controller → service → repository.

# Version Three
1. Added ResponseEntity HTTP Status Code in controller class i.e. 201,204,404,401 and many more.
2. Add Lombok library dependency in pom.xml then sync with project.