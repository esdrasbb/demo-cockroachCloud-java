# demo-cockroachCloud-java
Demo code for cockroach cloud DB - Java version using Spring Boot

Test java (JDBC) with CockroachDB.

More details in https://cockroachlabs.cloud/

Used https://start.spring.io/ to create an empty project

Importants points:

- It's necessary an account in https://cockroachlabs.cloud/

- It's necessary to create a database with 'bank' name

- Don't forget JAVA_HOME
```
$env:JAVA_HOME="C:\Users\esdra\Documents\workspace\jdk-15"
```

- Console output
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.2)
...
2021-07-14 16:19:32.076  INFO 11044 --- [           main] c.c.c.d.service.CustomerService          : Number of customers: 0
2021-07-14 16:19:32.076  INFO 11044 --- [           main] c.c.c.d.service.CustomerService          : Saving new customer...
2021-07-14 16:19:33.320  INFO 11044 --- [           main] c.c.c.d.service.CustomerService          : Number of customers: 1
```