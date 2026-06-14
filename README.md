# Spring MVC Model, ModelMap and ModelAndView Example

## Project Description

This is a simple Spring MVC web application developed to demonstrate different ways of passing data from the Controller to JSP pages using Model, ModelMap, and ModelAndView.

The project helps beginners understand how data is transferred between the Controller and View layers in Spring MVC.

---

## Features

* Send Data using Model
* Send Data using ModelMap
* Send Data using ModelAndView
* Display Data in JSP Pages
* Expression Language (EL) Usage
* Spring MVC Request Handling

---

## Technologies Used

* Java
* Spring MVC
* JSP
* Maven
* Apache Tomcat
* Eclipse IDE

---

## Concepts Used

* Spring MVC Architecture
* DispatcherServlet
* @Controller
* @RequestMapping
* Model
* ModelMap
* ModelAndView
* JSP
* Expression Language (EL)
* Annotation-Based Configuration

---

## Project Structure

src/main/java

├── com.configuration

│   └── Myconfig.java

└── com.controller

```
└── TestController.java
```

src/main/webapp

├── dev.jsp

├── msg.jsp

├── data.jsp

└── index.jsp

---

## Endpoints

### Model Example

URL:

/model

Data Passed:

* Name
* Salary

View:

dev.jsp

---

### ModelMap Example

URL:

/msg

Data Passed:

* Age
* Name

View:

msg.jsp

---

### ModelAndView Example

URL:

/data

Data Passed:

* King
* Queen

View:

data.jsp

---

## Spring MVC Annotations Used

### @Controller

Marks the class as a Spring MVC Controller.

### @RequestMapping

Maps HTTP requests to Controller methods.

### Model

Used to transfer data from Controller to View.

### ModelMap

Used to store and pass data to JSP pages.

### ModelAndView

Used to send both Model data and View name together.

### @Configuration

Defines Spring Configuration Class.

### @ComponentScan

Automatically scans Spring components.

---

## Sample Output

### Model Example

Name : Pradeep

Salary : 1cr

### ModelMap Example

Age : 33

Name : Pradeep

### ModelAndView Example

King : ABC

Queen : XYZZ

---

## Learning Outcomes

* Understanding Spring MVC Architecture
* Using Model to Transfer Data
* Using ModelMap to Transfer Data
* Using ModelAndView to Transfer Data
* JSP Integration with Spring MVC
* Expression Language (EL) Usage

---

## Future Enhancements

* Form Handling using @ModelAttribute
* Spring Validation
* JDBC Integration
* Hibernate Integration
* Spring Boot Migration
* CRUD Operations

---

## Author

Pradeep Bhat

MCA Student | Java Full Stack Developer
