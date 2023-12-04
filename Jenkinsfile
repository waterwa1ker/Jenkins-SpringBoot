pipeline {
    agent none
    stages {
        stage('Build'){
            agent { sudo docker 'maven' }
            steps {
                echo 'Hello, maven'
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Run') {
            agent { sudo docker 'openjdk' }
            steps {
                echo 'Hello, JDK'
                sh 'java -jar /target/jenkins-0.0.1-SNAPSHOT.jar'
            }
        }
    }
}