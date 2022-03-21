@echo off
cd /D "%~dp0"
"bin\java" -jar "gui-${project.version}.jar" %*
