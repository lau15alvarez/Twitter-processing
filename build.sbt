name := "KafkaStreamTFM"

version := "0.1"

scalaVersion := "2.12.8"

scalacOptions := Seq("-Xexperimental", "-unchecked", "-deprecation")

// Kafka
libraryDependencies += "org.apache.kafka" % "kafka-streams" % "0.11.0.0"
// JSON
libraryDependencies += "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.8.8"
// logging
libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.7.25"
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.5.0"