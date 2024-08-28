///usr/bin/env jbang "$0" "$@" ; exit $?

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.io.IOException;

public class qlogging {

    public static void main(String[] args) {
        String filePath = "src/main/resources/application.properties";
        String loggingConfig = "\n#Logging\n" +
                               "quarkus.log.console.format=%-5p [%c{2.}] (%t) %s%e%n\n" +
                               "quarkus.log.level=INFO\n" +
                               "quarkus.log.category.\"io.arrogantprogrammer\".level=DEBUG\n";

        try {
            Files.write(Paths.get(filePath), loggingConfig.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Logging configuration added successfully.");
        } catch (IOException e) {
            System.err.println("Failed to add logging configuration: " + e.getMessage());
        }
    }
}
