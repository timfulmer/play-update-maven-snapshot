name := "play-scala"

version := "1.0-SNAPSHOT"

resolvers += Resolver.mavenLocal

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

libraryDependencies+= "play-update-maven-snapshot" % "gradle-java" % "1.0-SNAPSHOT"

play.Project.playScalaSettings
