# jenkins-shared-pipeline
Jenkins shared libraries

Resources:

- https://github.com/devbyaccident/demo-shared-pipeline

- github.com/sixeyed/jenkins-pipeline-demo-library

- github.com/FeynmanFan/JenkinsDocker

Requirements:

- Pipeline: Shared Groovy Libraries through HTTP retrieval

Example of jenkinsfile:

```
@Library('github.com/IrekRomaniuk/jenkins-shared-pipeline@main') _

echoPipeline {
    message = "I tried to ping a thousand times."
}

```

