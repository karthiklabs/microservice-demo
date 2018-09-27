FROM java:8-jre
MAINTAINER Karthik

ADD ./target/config.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config.jar"]
ENV CONFIG_SERVICE_PASSWORD="password"
HEALTHCHECK --interval=30s --timeout=30s CMD curl -f http://config:8888/actuator/health || exit 1

EXPOSE 8888