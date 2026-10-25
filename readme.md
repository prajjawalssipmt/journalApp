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

# Version Four
1. Created User Pojo
2. Created UserController, UserService, UserRepository
3. User should be unique in JournalApp
4. Every User will have its own JournalEntry.
5. Reference created of journalEntry to every User means we will store the objectId reference of journalEntry in users table.
6. @DBRef is used to map journalEntry of each User.
7. Build relation b/w user and journalEntry collection.
8. Added @Transasctional, means if any error occurred b/w saving an entry then it will roll back.

# Version 5
1. Build a connection b/w local to mongodb atlas server database.
2. Adding spring security
3. Added user roles.
4. Add UserDetailServiceImpl in service package which find user using userName & is used for the authentication and authorization based on roles.