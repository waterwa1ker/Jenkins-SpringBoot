pipeline {
    agent none
    stages {
        stage('Build'){
            agent { docker 'maven:3-alpine' }
            steps {
                echo 'Hello, maven'
                sh 'mvn -B -DskipTests clean package'
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