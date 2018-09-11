#!/bin/sh
ant jar.server
mv /home/dillon/Projects/DSoftQBWCSoapService/service/build/lib/DSoftQBWCSoapService.aar /home/dillon/apache-tomcat-9.0.11.8081/webapps/axis2/WEB-INF/services/
ant clean
