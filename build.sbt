name := """minimal-akka-java"""

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies ++= Seq(
  // https://mvnrepository.com/artifact/com.typesafe.akka/akka-actor_2.11
  "com.typesafe.akka" % "akka-actor_2.11" % "2.4.12",
// https://mvnrepository.com/artifact/org.scalatest/scalatest_2.11
  "org.scalatest" % "scalatest_2.11" % "2.2.6",
  // https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit_2.11,
  "com.typesafe.akka" % "akka-testkit_2.11" % "2.4.16",  
  "junit" % "junit" % "4.12" % "test",
  "com.novocode" % "junit-interface" % "0.11" % "test")



fork in run := true


licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))
