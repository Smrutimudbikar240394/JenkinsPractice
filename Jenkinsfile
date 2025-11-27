pipeline {
    agent any

    stages {

        stage('Checkout Code') {
            steps {
                echo "Cloning repository..."
                git branch: 'master',
                    url: 'https://github.com/Smrutimudbikar240394/JenkinsPractice.git'
            }
        }

        stage('Build') {
            steps {
                echo "Build Stage: Running build steps..."
                // Example Windows commands:
                 bat 'mvn clean install'
                bat 'echo Build completed'
            }
        }

        stage('Test') {
            steps {
                echo "Test Stage: Running test steps..."
             bat 'mvn test'
                bat 'echo Tests executed'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploy Stage..."
                bat 'echo Deployment completed'
            }
        }
    }

    post {
        always {
            echo "Pipeline Completed."
        }
        success {
            echo "Pipeline SUCCEEDED 🎉"
        }
        failure {
            echo "Pipeline FAILED ❌"
        }
    }
}
