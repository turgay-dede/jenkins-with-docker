# Ana imaj olarak OpenJDK 11 kullanalım
FROM adoptopenjdk/openjdk11:latest

# Uygulama dizinini oluşturalım
RUN mkdir /app

# Uygulama dosyalarını /app dizinine kopyalayalım
COPY target/jenkins-with-docker-0.0.1-SNAPSHOT.jar /app/jenkins-with-docker-0.0.1-SNAPSHOT.jar

# Uygulama dizinine geçelim
WORKDIR /app

# Uygulama portunu dış dünyaya açalım (varsayılan olarak 8000)
EXPOSE 8000

# Uygulamayı çalıştıralım
CMD ["java", "-jar", "jenkins-with-docker-0.0.1-SNAPSHOT.jar"]