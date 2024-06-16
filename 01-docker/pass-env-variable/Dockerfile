FROM alpine
RUN apk add openjdk8
WORKDIR /usr/share/udemy
ADD Test.java Test.java
ENTRYPOINT javac Test.java && java Test $NUMBER