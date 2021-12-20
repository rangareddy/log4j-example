# Log4j Example

## Run the Log4jExample class without passing any arguments 

```sh
log4j-example % java -jar target/log4j-example-1.0.0-SNAPSHOT.jar                 
```

```sh
2021-12-20 15:33:35,549 [INFO] com.ranga.log4j.Log4jExample main - Hello, Ranga Reddy
Hello, Ranga Reddy
```

## Run the Log4jExample class without passing any arguments

```sh
log4j-example % java -jar target/log4j-example-1.0.0-SNAPSHOT.jar \${java:version}
```

```sh
2021-12-20 15:30:39,433 [INFO] com.ranga.log4j.Log4jExample main - Hello, Java version 1.8.0_282
Hello, ${java:version}
 ```