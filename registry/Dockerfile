FROM java:8-jre
MAINTAINER Alexander Lukyanchikov <sqshq@sqshq.com>

ADD ./target/registry.jar /app/
ENV CONFIG_SERVICE_PASSWORD=password
CMD ["java", "-Xmx200m", "-jar", "/app/registry.jar"]

EXPOSE 8761
