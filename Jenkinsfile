pipeline {
    agent any

    tools {
        maven 'Maven3'
        jdk 'JDK17'
    }

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'main',
                    url: 'https://github.com/niteshsharma99/maven-testng-jenkins.git'
            }
        }

        stage('Build & Run Tests') {
            steps {
                bat 'mvn clean test'
            }
        }

        stage('Archive Test Reports') {
            steps {
                archiveArtifacts artifacts: 'target/surefire-reports/*.xml', fingerprint: true
            }
        }
    }

    post {
        success {
            echo 'Build Successful !!!'
        }
        failure {
            echo 'Build Failed'
        }
    }
}