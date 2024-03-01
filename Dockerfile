FROM maven:latest

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file to the container
COPY pom.xml /app/

# Copy the entire project to the container
COPY src/main/java/org/example /app

# Package your application
RUN mvn package

# Run the main class (assuming your application has a main class)
CMD  ["java", "-jar", "target/interconversions.jar"]
