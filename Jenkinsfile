pipeline {
    agent any

    tools {
        nodejs 'nodejs'
    }
      environment {
        DOCKER_IMAGE_Back_NAME = 'brahim98/devops_project_Test:Springimage'

    }


  stages {
        stage('Checkout') {
            steps {
                // Checkout the code from the GitHub repository
                checkout([$class: 'GitSCM', branches: [[name: 'main']], userRemoteConfigs: [[url: 'https://github.com/Brahim98-cell/SpringTest.git']]])
            }
        }

  }
}
  
