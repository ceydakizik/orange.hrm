
                                          # ORANGE HRM 

## **What Is This Repository About?**
* This repo contains example code for OrangeHRM website's tech challenge
* Maven is used as build tool in this project
* Cucumber is used as testing framework for organizing and running tests and performing Assertions

## **Build With**
* Tool: Selenium
* Programming Language: Java
* Framework: Cucumber BDD 
* Version Control: Github

## **Test Covered In This Project**
* All the tests are written in the login and recruitment class
* The first test tests the to login with user information
* The second test verifies that you can add candidates from the candidate page


## **Test Strategy**
* Page Object model has been used in this project as it helps in better readability and maintainability
* Hence, separate page classes have been created that houses the WebElements of the respective page
* DriverManager class has been created to take care of the drivers required to run the test.
* Chrome, Firefox and Edge browsers are supported in this project

## **Prerequaities To Run The Test**
*  Add Selenium Java 4.6.0 dependency in pom.xml>> https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.6.0
*  Install cucumber for java>> https://mvnrepository.com/artifact/io.cucumber/cucumber-java/7.8.1
*  Install this for cucumber reports >>https://mvnrepository.com/artifact/com.vimalselvam/cucumber-extentsreport/3.0.2
*  Clone the repository on Github >>https://github.com/ceydakizik/orange.hrm.git

## **Running The Tests**
* To test the @run tag must be added to the scenario in the orangehrm.feature file
* You need to run the tests in the Runner class
* To access reporting >>>>>>> Target/Cucumber reports html

### **Contact Information**
* ceydaozcann@gmail.com
* https://www.linkedin.com/in/ceydakizik/


