# gradle-testng-allure-tests

note: allure is configured to use in both ways - via gradle, and via console command line

Commands:
to run all tests: ./gradlew clean test
To run particular tests: ./gradlew clean test --tests CalcTests
To generate allure report and open it : 
  - via CLI: allure serve build/allure-results
  - via gradle: ./gradlew allureServe
To run previously failed tests if there was no clean up : ./gradlew test -Dsuite="build/reports/tests/test/testng-failed.xml"
To run tests using testng.xml file configuration: ./gradlew clean test -Dsuite="testng.xml" 

Used technologies:
java
gradle
testNg
jackson
lombok
allure
the owner lib (for props initing)
appache commons (with jackson together to write failed tests to file)
