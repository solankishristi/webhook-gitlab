pipeline {
    agent any
    stages {
        stage('Preparation') {
            steps {
               checkout scm
            }
        }
        stage('Build') {
            steps {
              echo "building project"
            }
        }
        stage('Test') {
            steps {
                echo "running test"
            }
        }
    }
}

