# Hello, JDK Flight Recorder and Cryostat

## Mac Instructions

Gunnar Morling's blog post: https://www.morling.dev/blog/running-jmc-on-apple-m1/

```xml
<array>
      <string>-keyring</string>
      <string>~/.eclipse_keyring</string>
     <string>-vm</string>
      <string>/Users/jeremydavis/.sdkman/candidates/java/current/bin/java</string>  		
</array>
```

## Application

application.properties

```
#Logging
quarkus.log.console.format=%-5p [%c{2.}] (%t) %s%e%n
quarkus.log.level=INFO
quarkus.log.category."io.arrogantprogrammer".level=DEBUG
```
