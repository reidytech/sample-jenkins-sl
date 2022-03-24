#!/usr/bin/env groovy

def call(String name = 'human') {
    echo "Hello, ${name}."
    dir("test app") {
        checkout(
            [
                $class: 'GitSCM',
                branches: [[name: 'master']],
                userRemoteConfigs: [[url: 'https://github.com/reidytech/sample-jenkins-pipeline']]
            ]
        )
    }
    def scriptOutput = sh(
        script: '''
            #!/bin/bash
            pwd
            ls
        '''
    )
    echo "Checking out SCM ONCE again"
    checkout scm
}