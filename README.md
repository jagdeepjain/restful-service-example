# restful-service-example
Sample Project Demonstrating Testing of REST API

## Usage
```
$ mvn verify
$ mvn package
$ java -jar target/dependency/jetty-runner.jar target/app.war
```

Above will start server...
```
2016-11-21 00:55:38.728:INFO:oejs.AbstractConnector:main: Started ServerConnector@60099951{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
2016-11-21 00:55:38.729:INFO:oejs.Server:main: Started @5108ms
```

Now you can open browser and enter the service URL as:
http://localhost:8080/app/api/ftoc/70

It will convert 70 Degree Fahrenheit to equivalent Centigrade.

## Test Execution
```
$ mvn test -Dtest=ConversionTest
```

## Test Output
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.example.jagdeep.restful.service.tests.ConversionTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 2.725 sec - in org.example.jagdeep.restful.service.tests.ConversionTest

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 8.055 s
[INFO] Finished at: 2016-11-21T01:12:24+05:30
[INFO] Final Memory: 20M/278M
[INFO] ------------------------------------------------------------------------
jagdeepjain:restful-service-example jagdeepjain$
```
