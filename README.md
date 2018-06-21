# DevOpsWebApp

mvn clean package

mvn clean verify

mvn clean test

mvn clean install

mvn tomcat7:deploy (Make sure tomcat server is online)

mvn checkstyle:checkstyle checkstyle:check

mvn checkstyle:checkstyle checkstyle:check -Dcheckstyle.failOnViolation=false

mvn checkstyle:checkstyle checkstyle:check -Dcheckstyle.failOnError=false

mvn clean install -Pjacoco


