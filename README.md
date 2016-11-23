# restful-service-example
Sample Project Demonstrating Testing of REST API using application/json

## Start Web Service Container
```
$ mvn verify -Dmaven.test.skip=true
$ mvn package -Dmaven.test.skip=true
$ java -jar target/dependency/jetty-runner.jar --port 4444 target/app.war
```

It will look like as below:

```
2016-11-22 13:39:13.364:INFO:oejs.AbstractConnector:main: Started ServerConnector@6c1a5b54{HTTP/1.1,[http/1.1]}{0.0.0.0:4444}
2016-11-22 13:39:13.375:INFO:oejs.Server:main: Started @10654ms
```

Now you can open browser and enter the service URL.

fahrenheit to centigrade coversion service:

http://localhost:4444/app/api/conversion/toCentigrade/numberForConversion

centigrade to fahrenheit coversion service:

http://localhost:4444/app/api/conversion/toFahrenheit/numberForConversion


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


