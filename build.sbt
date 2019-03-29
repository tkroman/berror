name:="root"

Global / bloopAggregateSourceDependencies := true

lazy val root = Project(id="root", base=file("."))

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"

Global / testOptions ++= Seq(
  Tests.Argument(
    TestFrameworks.ScalaTest,
    "-l", 
    "CiOnly"
  )
)
