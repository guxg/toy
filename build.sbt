

name := "Toy"

scalaVersion := "2.8.1"

version := "0.1"

logLevel := Level.Info

libraryDependencies += "net.liftweb" %% "lift-webkit" % "2.4"  % "compile->default"

libraryDependencies += "net.liftweb" %% "lift-util" % "2.4" % "compile->default"

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.1" % "compile->default"


publishTo <<= version apply { (v:String) => 
  if( v endsWith "-SNAPSHOT" )
    Some("snapshot" at "xx" )
  else
    Some("releases" at "yy" )
}
