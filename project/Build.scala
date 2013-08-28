import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {
  val appName = "play20-mongodb-sample"
  val appVersion = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "com.novus" %% "salat-core" % "1.9.2",
    "io.backchat.inflector" %% "scala-inflector" % "1.3.5"
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    resolvers += "Novus Release Repository" at "http://repo.novus.com/releases/",
    resolvers += "Novus Snapshots Repository" at "http://repo.novus.com/snapshots/"
  )
}
