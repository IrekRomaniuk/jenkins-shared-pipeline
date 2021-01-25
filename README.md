# jenkins-shared-pipeline
Jenkins shared libraries

Resources:

- https://github.com/devbyaccident/demo-shared-pipeline

- sixeyed/jenkins-pipeline-demo-library

Requirements:

- Pipeline: Shared Groovy Libraries through HTTP retrieval

Example of jenkinsfile:

```
@Library('github.com/IrekRomaniuk/jenkins-shared-pipeline@main') _

echoPipeline {
    message = "I tried to ping a thousand times."
}

```

