# 基于哪个镜像
FROM openjdk:8

# 维护者
MAINTAINER tianxuanling

# 拷贝文件到容器，也可以直接写成ADD docker-spring-boot-demo-0.0.1-SNAPSHOT.jar /tianxuanling.jar
ADD tianxuanling-0.0.1-SNAPSHOT.jar /tianxuanling-0.0.1.jar
RUN bash -c 'touch /tianxuanling-0.0.1.jar'

#容器对外开放端口
#EXPOSE 8080

# 设置java运行环境
ENV JAVA_OPTS=""

# 配置容器启动后执行的命令
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/tianxuanling-0.0.1.jar"]