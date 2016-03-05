enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
"org.scala-js" %%% "scalajs-dom" % "0.9.0",
"be.doeraene" %%% "scalajs-jquery" % "0.9.0",
"com.greencatsoft" %%% "scalajs-angular" % "0.6"
)

skip in packageJSDependencies := false
jsDependencies ++= Seq(
"org.webjars" % "jquery" % "2.1.4" / "jquery.js",
"org.webjars" % "angular-ui-router" % "0.2.17" / "angular-ui-router.js",
"org.webjars" % "angularjs" % "1.5.0" / "angular.js"
)

jsDependencies += RuntimeDOM

// uTest settings
libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % "test"
testFrameworks += new TestFramework("utest.runner.Framework")

persistLauncher in Compile := true
persistLauncher in Test := false
