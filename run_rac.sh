export OPENJML_JAR_PATH=~/Downloads/openjml
export OPENJML_COMPILER_JAR=$OPENJML_JAR_PATH/openjml.jar
export OPENJML_RUNTIME_JAR=$OPENJML_JAR_PATH/openjml.jar

java -jar $OPENJML_COMPILER_JAR -compile -cp $PWD/rss-hamstersimulator-2.0.0.jar -specspath . de/unistuttgart/iste/rss/oo/hamstersimulator/TestOpenJML.java de/unistuttgart/iste/rss/oo/hamstersimulator/external/model/Hamster.java
java -jar $OPENJML_COMPILER_JAR -rac -racCompileToJavaAssert -cp $PWD/rss-hamstersimulator-2.0.0.jar -specspath . de/unistuttgart/iste/rss/oo/hamstersimulator/external/model/Hamster.java
java -cp $OPENJML_RUNTIME_JAR:.:$PWD/rss-hamstersimulator-2.0.0.jar -ea de.unistuttgart.iste.rss.oo.hamstersimulator.TestOpenJML