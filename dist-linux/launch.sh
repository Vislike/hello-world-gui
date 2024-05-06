#!/bin/bash
cd "${0%/*}"
"bin/java" -jar "gui-${project.version}.jar" "$@"
