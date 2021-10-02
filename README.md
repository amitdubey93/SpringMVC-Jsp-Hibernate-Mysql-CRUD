# SpringMVC-Jsp-Hibernate-Mysql-CRUD
This project is developed in eclipse maven-archtype-webapp with all defaults. So when you try to run you’ll face problems. I’ve solution to the problem given below.
What I did for running this project in ecliplse ide.

# What I’m using: 
1. Eclipse photon.	
2. Tomcat server 9.0.
3. Java 8

# Now..
1.	Download or git clone the project.
2.	Import project in eclipse.
3.	Add dependency list.
```
  <dependency>
    <groupId>javax.servlet</groupId>
    <artifactId>javax.servlet-api</artifactId>
    <version>3.1.0</version>
    <scope>provided</scope>
  </dependency>
  <dependency>
    <groupId>javax.servlet.jsp</groupId>
    <artifactId>jsp-api</artifactId>
    <version>2.2</version>
    <scope>provided</scope>
  </dependency>
```

4.	Edit 

```
<installed facet="jst.web" version="2.3"/>
<installed facet="java" version="1.5"/>
```

to

```
<installed facet="jst.web" version="4.0"/>
<installed facet="java" version="1.8"/>
```

in .setting/org.eclipse.wst.common.project.facet.core file.

5.	Change build path, project facets and java compiler to 1.8.
6.	Change web.xml header <web-app> section to text given at the end.

```
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns="http://xmlns.jcp.org/xml/ns/javaee"
	xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_4_0.xsd"
	id="WebApp_ID" version="4.0">
```

7.	Create database named ‘springjdbc’ in MySQL.

Add this in pom.xml before dependencies so your compiler version doesn’t changes to default when maven is updated.

```
<properties>
<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
	<maven.compiler.source>1.8</maven.compiler.source>
	<maven.compiler.target>1.8</maven.compiler.target>
</properties>		
```
# OR.............
Just add runtime environment i.e. Tomcat server leaving all defaults as it is and run.

# NOTE: 
Your project will not be configured for java 8 or above.
Sharing this because it burnt so many hours of mine and now i'm enjoying editing this README.md file.
All these updates are best to knowledge and i could be wrong.. Thanks.
