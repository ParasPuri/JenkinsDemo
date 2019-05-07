FROM java

MAINTAINER Paras Puri

WORKDIR /app

RUN wget "http://10.127.127.160:8040/artifactory/paras/1/Sum/0.0.1-SNAPSHOT/Sum-0.0.1-SNAPSHOT.jar"

CMD /bin/bash -c "java -jar Sum-0.0.1-SNAPSHOT.jar"