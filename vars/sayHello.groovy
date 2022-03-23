#!/usr/bin/env groovy

def call(String name = 'human') {
    echo "Hello, ${name}."
    dir("test app") {
        checkout(
            [
                $class: 'GitSCM',
                brances: [[name: master]],
                userRemoteConfigs: [[url: 'https://github.com/reidytech/sample-jenkins-pipeline']]
            ]
        )
    }
}