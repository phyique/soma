name := "soma"

version := "1.0"

lazy val `soma` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.12.3"

resolvers += "scalaz-bintray" at "https://dl.bintray.com/scalaz/releases"

resolvers += "Akka Snapshot Repository" at "http://repo.akka.io/snapshots/"

libraryDependencies ++= Seq( jdbc , ehcache , ws , specs2 % Test, guice,
                             "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.1" % Test)

unmanagedResourceDirectories in Test +=  baseDirectory(_ / "target/web/public/test").value
