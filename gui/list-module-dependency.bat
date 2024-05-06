@echo off
jdeps --list-deps --ignore-missing-deps --multi-release 21 target/dependency/*.jar
pause