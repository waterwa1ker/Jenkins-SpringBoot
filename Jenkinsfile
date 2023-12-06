pipeline {
    agent none
    stages {
        stage('Build'){
            agent { docker 'maven' }
            steps {
                echo 'Hello, maven'
                sh 'mvn -e -B -u root -DskipTests clean package'
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