FROM openjdk:11
MAINTAINER abel "abelqian@asshecloud.com"
VOLUME /tmp 
# 将jar包添加到容器中并更名为app.jar
ADD custdemo-0.0.1-SNAPSHOT.jar custdemo.jar 
# 运行jar包
RUN bash -c 'touch /custdemo.jar'
EXPOSE 8090
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-Duser.timezone=GMT+08", "-jar", "/custdemo.jar"]
