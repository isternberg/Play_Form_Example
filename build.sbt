name := "my-first-app"

version := "1.0"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  cache,
  javaWs,
  filters,
  javaCore,
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "com.adrianhurt" %% "play-bootstrap3" % "0.4.4-P24",
  "org.mockito" % "mockito-core" % "1.9.5" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.47.1" % "test",
  "mysql" % "mysql-connector-java" % "5.1.18"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

dependencyOverrides += "junit" % "junit" % "4.12" % "test"
dependencyOverrides += "selenium-firefox-driver" % "selenium-firefox-driver" % "2.47.1" % "test"
dependencyOverrides += "com.google.guava" % "guava" % "18.0"
dependencyOverrides += "commons-logging" % "commons-logging" % "1.1.3"
dependencyOverrides += "org.apache.httpcomponents" % "httpclient" % "4.3.4"
dependencyOverrides += "org.apache.httpcomponents" % "httpcore" % "4.3.2"
dependencyOverrides += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.3"
dependencyOverrides += "org.scala-lang.modules" %% "scala-xml" % "1.0.3"
dependencyOverrides += "org.hamcrest" % "hamcrest-core" % "1.3"
shellPrompt := (_ => "> ")
