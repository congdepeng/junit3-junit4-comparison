junit3-junit4-comparison
========================


# 1 Junit 3

[Junit3](http://junit.sourceforge.net/junit3.8.1/)

##  1.1 How to write test case
    1. extends TestCase
    2. test prefix method name

## 1.2 How to run

### Compile & Run

 - Compile: mvn compile or "javac  -cp ../lib/junit.jar  com/depeng/Money.java"
 - Run:
    1. cd target
    2. text-based UI
        - java -cp /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/test-classes:/Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/classes:/Users/depeng/.m2/repository/junit/junit/3.8.1/junit-3.8.1.jar junit.textui.TestRunner  com.depeng.MoneyTest
    3. GUI
        - java -cp /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/test-classes:/Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/classes:/Users/depeng/.m2/repository/junit/junit/3.8.1/junit-3.8.1.jar junit.swingui.TestRunner  com.depeng.MoneyTest


### maven run: mvn test
```java
 depeng@congs-mbp ~/github/junit3-junit4-comparison/junit3-showcase master  mvn test
[INFO] Scanning for projects...
[INFO]
[INFO] ------------------------------------------------------------------------
[INFO] Building junit-showcase 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ junit3-showcase ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/src/main/resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:compile (default-compile) @ junit3-showcase ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ junit3-showcase ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/src/test/resources
[INFO]
[INFO] --- maven-compiler-plugin:2.5.1:testCompile (default-testCompile) @ junit3-showcase ---
[INFO] Nothing to compile - all classes are up to date
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ junit3-showcase ---
[INFO] Surefire report directory: /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.depeng.MathTest
Tests run: 2, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.017 sec
Running com.depeng.MoneyTest
Tests run: 2, Failures: 1, Errors: 1, Skipped: 0, Time elapsed: 0.004 sec <<< FAILURE!
testCurrency(com.depeng.MoneyTest)  Time elapsed: 0.001 sec  <<< FAILURE!
junit.framework.AssertionFailedError: expected:<1> but was:<2>
        at junit.framework.Assert.fail(Assert.java:47)
        at junit.framework.Assert.failNotEquals(Assert.java:282)
        at junit.framework.Assert.assertEquals(Assert.java:64)
        at junit.framework.Assert.assertEquals(Assert.java:201)
        at junit.framework.Assert.assertEquals(Assert.java:207)
        at com.depeng.MoneyTest.testCurrency(MoneyTest.java:29)

testAmount(com.depeng.MoneyTest)  Time elapsed: 0 sec  <<< ERROR!
java.lang.AssertionError
        at com.depeng.MoneyTest.testAmount(MoneyTest.java:24)


Results :

Failed tests:   testCurrency(com.depeng.MoneyTest): expected:<1> but was:<2>

Tests in error:
  testAmount(com.depeng.MoneyTest)

Tests run: 4, Failures: 1, Errors: 1, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 2.712s
[INFO] Finished at: Tue Mar 25 22:06:01 SGT 2014
[INFO] Final Memory: 8M/222M
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project junit3-showcase: There are test failures.
[ERROR]
[ERROR] Please refer to /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException

```



### IDEA run
```java
   java -ea
    -classpath "/Applications/IntelliJ IDEA 13.app/lib/idea_rt.jar:
    /Applications/IntelliJ IDEA 13.app/plugins/junit/lib/junit-rt.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/ant-javafx.jar/Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/dt.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/javafx-doclet.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/javafx-mx.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/jconsole.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/sa-jdi.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/lib/tools.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/charsets.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/deploy.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/htmlconverter.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/javaws.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/jce.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/jfr.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/jfxrt.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/jsse.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/management-agent.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/plugin.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/resources.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/rt.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/ext/dnsns.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/ext/localedata.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/ext/sunec.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:
    /Library/Java/JavaVirtualMachines/jdk1.7.0_51.jdk/Contents/Home/jre/lib/ext/zipfs.jar:
    /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/test-classes:
    /Users/depeng/github/junit3-junit4-comparison/junit3-showcase/target/classes:
    /Users/depeng/.m2/repository/junit/junit/3.8.1/junit-3.8.1.jar"

    com.intellij.rt.execution.application.AppMain
    com.intellij.rt.execution.junit.JUnitStarter
    -ideVersion5
    com.depeng.MoneyTest

```

## 1.3 How to package test case and run?

```java
    public class PackageTestCases {
        public static Test onlyOne() {
            return new TestSuite(MathTest.class);
        }

        public static Test multiple() {
            TestSuite suite = new TestSuite("multiple tests");

            suite.addTestSuite(MathTest.class);
            suite.addTestSuite(MoneyTest.class);

            return suite;
        }

        public static void main(String args[]) {
            junit.textui.TestRunner.run(onlyOne());
            junit.textui.TestRunner.run(multiple());
        }
    }

```


## 1.4 How Junit3 find the test method? use java reflection?

