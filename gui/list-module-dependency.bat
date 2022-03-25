@echo off
jdeps --list-deps --ignore-missing-deps --multi-release base target/dependency/*.jar
pause