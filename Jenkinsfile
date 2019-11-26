pipeline {
    agent any
    tools {
        maven "Default"
        jdk 'Default'
    }
    stages {
        stage('record test') {
            steps {
                git 'https://github.com/nagarjunagr8/testsuite.git'
                bat "mvn clean test"
                junit 'target/surefire-reports/*.xml'
            }
        }
    }
}
