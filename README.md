# restful-service-example
I have developed two services using REST API specifically for demonstrating testing of REST API. There are two services, one is returning JSON and the other one is returning XML output. RestAssured provides you a way where you can test JSON as well as XML response. These services are deployed on Jetty Runner.

## Start Web Service Using Jetty Runner
```
$ mvn verify -Dmaven.test.skip=true
$ mvn package -Dmaven.test.skip=true
$ java -jar target/dependency/jetty-runner.jar --port 4444 target/app.war
.
.
.
.
2016-11-22 13:39:13.364:INFO:oejs.AbstractConnector:main: Started ServerConnector@6c1a5b54{HTTP/1.1,[http/1.1]}{0.0.0.0:4444}
2016-11-22 13:39:13.375:INFO:oejs.Server:main: Started @10654ms
```

Now you can open browser and enter the service URL.

fahrenheit to centigrade conversion service, returning JSON body:

http://localhost:4444/app/api/conversion/toCentigrade/100

centigrade to fahrenheit conversion service, returning XML body:

http://localhost:4444/app/api/conversion/toFahrenheit/100


## Test Execution
```
$ mvn test
```

## Test Output
```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running org.example.jagdeep.restful.service.tests.ConversionTest
Tests run: 12, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 4.519 sec - in org.example.jagdeep.restful.service.tests.ConversionTest

Results :

Tests run: 12, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 12.343 s
[INFO] Finished at: 2016-11-22T11:17:00+05:30
[INFO] Final Memory: 21M/275M
[INFO] ------------------------------------------------------------------------
jagdeepjain:restful-service-example jagdeepjain$
```

## TODO


## References
https://github.com/rest-assured/rest-assured/wiki/Usage#example-2---xml

https://github.com/rest-assured/rest-assured

https://semaphoreci.com/community/tutorials/testing-rest-endpoints-using-rest-assured

http://joel-costigliola.github.io/assertj/

http://junit.org/junit5/docs/current/user-guide/


