pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                git branch: 'master',
                    url: 'https://github.com/Smrutimudbikar240394/JenkinsPractice.git'
            }
        }

        stage('Build') {
            steps {
                echo "This is a Jenkins Practice Pipeline Build"
            }
        }

        stage('Test') {
            steps {
                echo "Running Test Stage..."
            }
        }

        stage('Deploy') {
            steps {
                echo "Deployment Step (Demo Only)"
            }
        }
    }

    post {
        success {
            echo "Pipeline SUCCEEDED"
        }
        failure {
            echo "Pipeline FAILED"
        }
    }
}
