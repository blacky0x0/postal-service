## Compile
```
mvn clean package
```

## New Project
```
mvn archetype:generate \
    -DarchetypeGroupId=org.apache.maven.archetypes \
    -DarchetypeArtifactId=maven-archetype-quickstart \
    -DgroupId=com.github.blacky.post \
    -DartifactId=service \
    -Dversion=1.0-SNAPSHOT \
    -Dpackage=com.github.blacky.post
```

## Links
* [MVN Repository - JUnit]
* [MVN Repository - Apache Maven Compiler Plugin]
* [Maven Quickstart Archetype]

[MVN Repository - JUnit]: https://mvnrepository.com/artifact/junit/junit
[MVN Repository - Apache Maven Compiler Plugin]: https://mvnrepository.com/artifact/org.apache.maven.plugins/maven-compiler-plugin
[Maven Quickstart Archetype]: http://maven.apache.org/archetypes/maven-archetype-quickstart/