lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      scalaVersion := "2.13.0"
    )),
    libraryDependencies ++= Seq(
      "com.lihaoyi" % "ammonite" % "1.6.0" cross CrossVersion.full
    )
  )
