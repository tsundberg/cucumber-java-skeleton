# Cucumber-Java Skeleton

This is the simplest possible build script setup for Cucumber using Java.
There is nothing fancy like a webapp or browser testing. All this does is to show you how
to install and run Cucumber!

There is a single feature file with one scenario. The scenario has three steps, two of them pending. See if you can make them all pass!

## Get the code

Git:

    git clone https://github.com/cucumber/cucumber-java-skeleton.git
    cd cucumber-java-skeleton

Or [download a zip](https://github.com/cucumber/cucumber-java-skeleton/archive/master.zip) file.

## Use Maven

Open a command window and run:

    ./mvnw test

This runs Cucumber features using the JUnit Platform. The `@Suite` annotation on the `RunCukesTest`
class tells JUnit Platform to use the Cucumber engine.

## Use Gradle

Open a command window and run:

    ./gradlew test

This runs Cucumber features using the JUnit Platform. The `@Suite` annotation on the `RunCukesTest`
class tells JUnit Platform to use the Cucumber engine.

## Overriding options

Cucumber options can be overridden using system properties. The most commonly used properties are:

- `cucumber.plugin` — comma-separated list of plugins (e.g. `pretty`, `html:target/report.html`)
- `cucumber.filter.tags` — tag expression to select scenarios (e.g. `@smoke and not @wip`)
- `cucumber.features` — path to feature files
- `cucumber.glue` — package name for step definitions

Using Maven:

    ./mvnw -Dcucumber.plugin="pretty" -Dcucumber.filter.tags="@smoke" test

Using Gradle:

    ./gradlew -Dcucumber.plugin="pretty" -Dcucumber.filter.tags="@smoke" test

### Run a subset of Features or Scenarios

Specify scenarios by *tag*:

    -Dcucumber.filter.tags="@bar"

Specify a particular feature file:

    -Dcucumber.features="src/test/resources/skeleton/belly.feature"

### Specify a different plugin

For example an HTML report:

    -Dcucumber.plugin="html:target/cucumber-report.html"
