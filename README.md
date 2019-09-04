# Kotlin Starter Project

This is an empty(ish) project you can use to quickly set up a new Kotlin project. It has a `build.gradle` configured to use Kotlin and JUnit 5.

To use:

* Clone the project (replace `<project-folder>` with the name of the folder you want to check out to)
```bash
$ git clone git@github.com:tumbarumba/kotlin-starter.git <project-folder>
```
* Remove the git remote origin (unless you want to send a PR to this project)
```bash
$ git remote remove origin
```
* Modify `settings.gradle` to put in actual name of your project
* Verify that everything is working by running Gradle:
```bash
$ ./gradlew build
```
* Replace `Example` and `ExampleTest` with your own code.
