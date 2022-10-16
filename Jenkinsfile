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

    }

}