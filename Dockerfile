FROM docker.io/houssemeddinebenhmida/tomcat8jdk8mvn3
COPY . /home/centos/project/
RUN rm -Rf /usr/local/tomcat/webapps/*
WORKDIR /home/centos/project/
RUN /home/centos/libs/apache-maven-3.5.4/bin/mvn clean install 
COPY target/Hello-world-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
RUN chgrp -R 0 /usr/local/tomcat/ && \
    chmod -R g=u /usr/local/tomcat/
CMD ["catalina.sh", "run"]
EXPOSE 8080
