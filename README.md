# hello-world-gui
Test Project for a Hello World GUI.

Goals:
* Use java-modules for my own code.
* Be able to use old non-module jar files such as eclipse SWT.
* Create a binary that can be run on computers without java.

It is done by creating a modular maven project. With one module for the Java app. One that creates the jlink JVM. And finally an assembly module that package everything together.

Possible v2:
* Multiplatform with both windows and linux.

Since Java runs on both and SWT support both it should be doable. But jlink is a problem, how could i create a linux jvm on windows and vice versa?
