# Ana imaj olarak OpenJDK 11 kullanalım
FROM adoptopenjdk/openjdk11:latest

# Uygulama dizinini oluşturalım
RUN mkdir /app

# Uygulama dosyalarını /app dizinine kopyalayalım
COPY target/my-application.jar /app/my-application.jar

# Uygulama dizinine geçelim
WORKDIR /app

# Uygulama portunu dış dünyaya açalım (varsayılan olarak 8000)
EXPOSE 8000

# Uygulamayı çalıştıralım
CMD ["java", "-jar", "my-application.jar"]