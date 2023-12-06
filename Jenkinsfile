pipeline {
    agent none
    stages {
            stage('Build') {
               agent {
                       docker {
                           image 'maven:3-alpine'
                           args '-u root'
                       }
                   }
            }
            stage('Run') {
                agent { docker 'openjdk' }
                steps {
                    echo 'Hello, JDK'
                    sh 'java -jar /target/jenkins-0.0.1-SNAPSHOT.jar'
                }
            }
    }
}