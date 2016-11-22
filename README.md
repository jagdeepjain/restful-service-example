# restful-service-example
Sample Project Demonstrating Testing of REST API using application/json

## Usage
```
$ mvn verify -Dmaven.test.skip=true
$ mvn package -Dmaven.test.skip=true
$ java -jar target/dependency/jetty-runner.jar target/app.war
```

Above will start server...
```
2016-11-21 00:55:38.728:INFO:oejs.AbstractConnector:main: Started ServerConnector@60099951{HTTP/1.1,[http/1.1]}{0.0.0.0:8080}
2016-11-21 00:55:38.729:INFO:oejs.Server:main: Started @5108ms
```

Now you can open browser and enter the service URL as below:

http://localhost:8080/app/api/conversion/toCentigrade/<number>

http://localhost:8080/app/api/conversion/toFahrenheit/<number>



It will convert 70 Degree Fahrenheit to equivalent Centigrade.

## Test Execution
```
$ mvn clean test
```

## Test Output
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.example.jagdeep.restful.service.tests.ConversionTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 3.195 sec - in org.example.jagdeep.restful.service.tests.ConversionTest

Results :

Tests run: 2, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 9.414 s
[INFO] Finished at: 2016-11-21T11:16:16+05:30
[INFO] Final Memory: 21M/279M
[INFO] ------------------------------------------------------------------------
jagdeepjain:restful-service-example jagdeepjain$
```

## TODO
XML based responses -> https://github.com/rest-assured/rest-assured/wiki/Usage#example-2---xml

## References
https://github.com/rest-assured/rest-assured

https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured

http://joel-costigliola.github.io/assertj/

http://junit.org/junit5/docs/current/user-guide/


