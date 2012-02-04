organization := "name.guxg"

name := "Toy"

scalaVersion := "2.8.1"

version := "0.1"

logLevel := Level.Info

libraryDependencies ++= {
   val liftVersion = "2.4"
   Seq(
      "net.liftweb" %% "lift-webkit" % liftVersion  % "compile->default",
      "net.liftweb" %% "lift-util" % liftVersion % "compile->default"
   )
}

libraryDependencies += "org.slf4j" % "slf4j-log4j12" % "1.6.1" % "compile->default"


//publishTo <<= version apply { (v:String) => 
//  if( v endsWith "-SNAPSHOT" )
//    Some("snapshot" at "xx" )
//  else
//    Some("releases" at "yy" )
//}


EclipseKeys.configurations := Set(Compile,Test)

EclipseKeys.withSource := false

//EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.Source,EclipseCreateSrc.Resource)


