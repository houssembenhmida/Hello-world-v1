FROM docker.io/tomcat:8
RUN rm -Rf /usr/local/tomcat/webapps/*
COPY target/Hello-world-1.0-SNAPSHOT.war /usr/local/tomcat/webapps/ROOT.war
RUN chgrp -R 0 /usr/local/tomcat/ && \
    chmod -R g=u /usr/local/tomcat/
CMD ["catalina.sh", "run"]
EXPOSE 8080
