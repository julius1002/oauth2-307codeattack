FROM openjdk:17-jdk
VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
ADD . .
RUN ./gradlew build -x test
EXPOSE 8080
ENTRYPOINT exec ./gradlew bootRun