instead of going to subpackage, compile HelloWorld.java from the top_level:

$javac -cp . importpackage/subpackage/HelloWorld.java

compile CallPackage.java in the same way:

$javac -cp . CallPackage.java

run the file using the class path also:

$java -cp . CallPackage