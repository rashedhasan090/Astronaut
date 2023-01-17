# Astronaut
Source code repository for Astronaut project.

To build this project, run this command in the root folder of this project:
```
sbt assembly
```

This will create a jar file at _target/scala-x.x.x/astraonaut.jar_

This jar file will not work in local enviornment directly. As there is database dependency, sources need to be properly placed. 

If the tool is placed on a server it has to be properly configured with the database and a Key needs to be developed to run the tool.

