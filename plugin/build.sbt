import sbtbuildinfo.Plugin._

sbtPlugin := true

name := "sbt-plugin"

scalacOptions in Compile += "-deprecation"

libraryDependencies += "com.earldouglas" % "xsbt-web-plugin" % "0.4.2" extra ("scalaVersion" -> CrossVersion.binaryScalaVersion("2.10.2"),  "sbtVersion" -> "0.13")

buildInfoSettings

sourceGenerators in Compile <+= buildInfo

buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion)

buildInfoPackage := "play2sae"
