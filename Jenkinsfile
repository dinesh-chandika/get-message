pipeline {
    agent any

    stages {
        stage ('Compile Stage') {
            steps {
                withMaven {
                    bat 'mvn clean install'
                }
            }
        }

        stage ('Docker Build') {
            	agent any
              steps {
              	bat 'docker build -f Dockerfile -t get-message .'
              }
        }

    }
}