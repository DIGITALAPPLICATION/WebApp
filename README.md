# DevOpsWebApp

mvn clean test

mvn clean install

mvn tomcat:deploy

mvn checkstyle:checkstyle checkstyle:check

mvn checkstyle:checkstyle checkstyle:check -Dcheckstyle.failOnViolation=false

mvn checkstyle:checkstyle checkstyle:check -Dcheckstyle.failOnError=false

mvn clean install -Pjacoco


