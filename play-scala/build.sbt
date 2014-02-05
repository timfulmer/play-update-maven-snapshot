name := "play-scala"

version := "1.0-SNAPSHOT"

resolvers += "Local Maven Repository" at "file://"+Path.userHome.absolutePath+"/.m2/repository"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

libraryDependencies+= "play-update-maven-snapshot" % "gradle-java" % "1.0-SNAPSHOT"

play.Project.playScalaSettings
