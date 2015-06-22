# functional-programming-java7-to-scala
* Please make sure you have the [Java 8 JDK](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) installed on your machine.
* You don't need to install Gradle on your machine, as this repo contains the Gradle wrapper.

## Getting Started
* Clone the repo
* Open IntelliJ
* File > Import Project...
  * Select the root directory of the project (`functional-programming-java7-to-scala`)
  * Select "import project from external model" > Gradle
  * Keep the defaults for the Gradle project on the following screen
  * Select "Finish"

* Try running the projects and the tests. Gradle is supposed to set up your JDK and Language Level for you, but it may not be smart enough all the time.
  * If you encounter any compile errors, go to Project Settings (`⌘ ;`) and change the Project Language Level to "8 - Lambdas, type annotations etc". Make sure you also have the correct JDK set.
