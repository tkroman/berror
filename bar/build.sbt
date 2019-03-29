name:="bar"
lazy val bar = Project(id="bar",base=file(".")).aggregate(mod).dependsOn(mod)
lazy val mod = RootProject(file("../mods/mod"))

Global / bloopAggregateSourceDependencies := true

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.14.0" % "test"

Global / testOptions ++= Seq(
  Tests.Argument(
    TestFrameworks.ScalaTest,
    "-l", 
    "CiOnly"
  )
)
