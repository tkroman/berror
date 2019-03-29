name:="root"

Global / bloopAggregateSourceDependencies := true

lazy val root = Project(id="root", base=file("."))

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % "test"
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.5"
// https://mvnrepository.com/artifact/org.pegdown/pegdown
libraryDependencies += "org.pegdown" % "pegdown" % "1.6.0" % Test

Global / testOptions ++= Seq(
  Tests.Argument(
    TestFrameworks.ScalaTest,
    "-l", 
    "CiOnly"
  )
) ++ Seq(Tests.Argument(TestFrameworks.ScalaTest, "-h", "target/test-reports"))
