name:="root"

Global / bloopAggregateSourceDependencies := true

lazy val root = Project(id="root", base=file(".")).aggregate(foo,bar).dependsOn(foo,bar)

lazy val foo = RootProject(file("foo"))
lazy val bar = RootProject(file("bar"))

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