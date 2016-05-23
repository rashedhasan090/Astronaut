name := "Astronaut"

version := "1.0"

scalaVersion := "2.10.4"

libraryDependencies += "org.jdom" % "jdom" % "2.0.2"

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.32"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"

libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.4.1" % "provided"

libraryDependencies += "com.esotericsoftware.kryo" % "kryo" % "2.24.0"

assemblyJarName in assembly := "astronaut.jar"

mainClass in assembly := Some("edu.virginia.cs.Main")