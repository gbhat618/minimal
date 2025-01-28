# minimal
Simple HTTP API to demonstrate the Jenkins shows `Login` for logged-in user, when the HTTP API errors in the backend and goes to page,
```
Oops!
A problem occurred while processing the request.
Logging ID=b5c97be8-dbaa-4a0b-bfb0-ab390b5b7c1a
```

## Installation
* `mvn clean package -Pquick-build`
* Ensure the artifact is generated in `target` folder as `minimal.hpi`
* Install the plugin via `Manage Jenkins -> Plugins -> Advanced Settings` -> `Choose File` -> `Deploy`
