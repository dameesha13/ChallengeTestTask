# UI Automation

This project contains automated test cases for a Amazon.com site.

#### **Technology Stack**

 List of technologies used within the project,
* Java
* Selenium
* TestNG
* Maven
* Git

###### Checkout the branch
      git clone (https://github.com/dameesha13/ChallengeTestTask.git)

###### Run the code using maven goal

```
mvn clean install test -DsuiteXmlFile="AmazonUIAutomation.xml" 
```

Project structure as below.

``` bash
.
├── src
    ├── main
       ├── java
    ├── test
        ├── java
            ├── functions
            ├── pageObjects
            ├── tests
            ├── utils
        ├── resources
            ├── testng # TestNG xml files are located in src/test/resources/testng/ directory.
   ├── pom.xml
   ├── README.md   
...


