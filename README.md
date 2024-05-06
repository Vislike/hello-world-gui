# hello-world-gui v2.0
Test Project for a Hello World GUI.

Goals:
* Use java-modules for my own code.
* Be able to use old non-module jar files such as eclipse SWT.
* Create a binary that can be run on computers without java.
* Multiplatform with both windows and linux.

It is done by creating a modular maven project. With one module for the Java app.
One that creates the jlink JVM. And finally an assembly module that package everything together.

Possible v3:
* v2 added a linux-dist and some maven profiles to handle linux and windows respectively.
  But module-info.java had to go, since it needs some dynamic way to require different SWT module on linux that i have not figured out yet.
  But it is probably possible adding modules dynamically with some maven plugin.