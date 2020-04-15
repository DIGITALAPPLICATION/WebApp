FROM tomcat:7-jre8
ADD target/DevOpsWebApp-*.war /usr/local/tomcat/webapps/
ADD tomcat-users.xml /usr/local/tomcat/conf/
