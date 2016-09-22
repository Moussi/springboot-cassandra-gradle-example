== OCTOPUS DATA ACCESS LAYER

SpringBoot 1.3.0
Spring Data Cassandra 1.3.1
Gradle 1.2.5

This is an getting started project for our data access layer

We will create the keyspace and the table on our Cassandra database:

    CREATE KEYSPACE IF NOT EXISTS example WITH replication = {'class': 'SimpleStrategy', 'replication_factor': '1'}  AND durable_writes = true;
    CREATE TABLE IF NOT EXISTS example.greetings (
        user text,
        id timeuuid,
        greet text,
        creation_date timestamp,
        PRIMARY KEY (user, id)
    ) WITH CLUSTERING ORDER BY (id DESC);

We can run a file containing cql statements by using cqlsh:

    cqlsh -f database_creation.cql

Cassandra connection information will reside on META-INF/cassandra.properties:

    cassandra.host=localhost
    cassandra.port=9042
    cassandra.keyspace=octopus

You can run unit tests by running the following command at the command prompt:

    gradle clean test

You can run integration tests by running the following command at the command prompt:

    gradle clean integrationTest

You can run all tests by running the following command at the command prompt:

    gradle clean test integrationTest
    
You can run the full build (that runs all tests) by running the following command at the command prompt:

    gradle clean build

You can can run the Spring Boot web application by the following command at the command prompt:

    gradle bootRun
    
When the application is running, you can access it by going to the url address:

    http://localhost:8080/greeting

When the application is running, you can post new greeting it by going to the url address:

    POST : http://localhost:8080/greeting
    Body : {"id":"8f2b5231-9c17-11e5-ad64-9f5c5a4cc1cf","user":"moussi","greet":"thank you","creationDate":"2014-06-20T18:20:00Z"}


