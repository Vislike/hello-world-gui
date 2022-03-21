@echo off
jdeps --list-deps --ignore-missing-deps target/dependency/*.jar
pause