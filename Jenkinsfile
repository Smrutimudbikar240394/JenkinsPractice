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
                // Add build commands here, example:
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                echo "Test Stage: Running test steps..."
                // Add test commands here, example:
                sh 'mvn test'
            }
        }

        stage('Deploy') {
            steps {
                echo "Deploy Stage: Running deployment steps..."
                // Add deploy commands here
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
