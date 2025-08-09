Spring Boot Backend (MySQL)
---------------------------

Prerequisites:
- Java 17 (or compatible)
- Maven
- MySQL server running

Steps:
1. Create database and import SQL (optional):
   - Edit and run the included SQL file `doctorsearch_init.sql` in your MySQL server:
     mysql -u root -p < doctorsearch_init.sql
   - Or create a database named `doctorsearchdb` and user as you prefer.

2. Update DB credentials in `src/main/resources/application.properties`:
   spring.datasource.username=YOUR_DB_USER
   spring.datasource.password=YOUR_DB_PASSWORD

3. Run the project:
   mvn spring-boot:run

The API will be available at http://localhost:8080/api/doctors
