# URL Hit Counter

## Frameworks and Languages used:
* `Java 17`
* `Maven 4.0.0`
* `Spring Boot 3.0.5(Framwork)`
* `IntelliJ IDEA 2023.1 (Community Edition)`


## Data Flow:
1. #### Model: 
    Created UrlHit class along with properties like username, hitCount, totalHitCount and create a constructor, and getters and setters.
1. #### Controller: 
    Created UrlHitController class in which we created a GET mapping for end-point to get the count of specific user and get the total no of count .
1. #### Service: 
    Created UrlHiService class in which added the buisness logic for method getUserHitCount to count the url hits for every specific user and writting business logic for method getTotalHitCount to count the total number of URL hits count .

### Data Structure
Used HashMap to store the <username,hitCount>. 

### Project Summary
In this spring boot application we store/track and show the number of hits URL endpoint for every specific user and also show the total no of hits URL.At many times we need to monitor the people visiting a website. This project can be used to count and display the visitor's name and count entering the website.