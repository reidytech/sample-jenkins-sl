#!/usr/bin/env groovy

def call(Map scm) {
    echo "${scm}"

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
    echo "${scriptOutput}"

}