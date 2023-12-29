# Git Log visualizer

This application pulls recent commit history using GitHub API and displays it in the browser
in a more readable format.

# Execution
```bash
./gradlew run
```
# Usage
After running the application input into browser's address line `http://0.0.0.0:8080/?owner=<repo-owner>&repo=<repo-name>`

## Examples
Kotlin repository: 
http://0.0.0.0:8080/?owner=jetbrains&repo=kotlin

Ganttproject: 
http://0.0.0.0:8080/?owner=bardsoftware&repo=ganttproject
