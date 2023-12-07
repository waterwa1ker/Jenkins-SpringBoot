pipeline {
    agent any
    stages {
            stage('Build') {
               agent {
                       docker {
                           image 'maven:3-alpine'
                           args '-u root'
                       }
               }
               steps {
                    echo 'Hello, maven'
                    sh 'mvn -e -DskipTests clean package'
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
