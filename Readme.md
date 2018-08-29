

# Automation Setup Indications**





## *Author: Iulian Ionel Marin*





STEPS:

Downloads:
Download and install Java JDK  from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
Download and install intelliJ from [here](https://www.jetbrains.com/idea/download/download-thanks.html?platform=windows&code=IIC)
Add xPath Helper to chrome from Chrome Web Store (Restart Browser after adding)
	

Access add environment variables interface:
	Open Windows Search interface and write ‘Environment Variables’
	Click ‘Edit the system environment variables’ button  
	Click ‘Environment Variables’ button  


Add the following environment variables
	JAVA_HOME   /  Value: address to the java installation. Example: C:\Program Files\Java\jdk1.8.0_171

Add the following to ‘path’ variable
	%JAVA_HOME%\bin;

 


Project Set-up IntelliJ
1. Start new project
2. Setup project SDK and path to Java installation
3. JUnit add to pom.xml from [here](https://mvnrepository.com/artifact/junit/junit/4.12)
4. Logs add to pom.xml from [here](https://mvnrepository.com/artifact/net.logstash.logback/logstash-logback-encoder/5.2)
5. Selenium add to pom.xml from [here](https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.14.0)
	




