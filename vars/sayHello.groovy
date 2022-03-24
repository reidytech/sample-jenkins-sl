#!/usr/bin/env groovy

def call(Map m) {
    // echo "Hello, ${name}."
    // dir("test app") {
    //     checkout(
    //         [
    //             $class: 'GitSCM',
    //             branches: [[name: 'master']],
    //             userRemoteConfigs: [[url: 'https://github.com/reidytech/sample-jenkins-pipeline']]
    //         ]
    //     )
    // }
    // def scriptOutput = sh(
    //     script: '''
    //         #!/bin/bash
    //         pwd
    //         ls
    //     '''
    // )
    // echo "Checking out SCM ONCE again"
    // checkout scm
    echo "${m.TERRAGUARD}"
    echo "${m.APP_NAME}"

}