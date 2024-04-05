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

  

      stage('Build') {
            steps {
                // Build the project using Maven
                sh 'mvn clean package ' // Adjust this to your actual build command
            }
        }

  stage('Unit Tests') {
            steps {
                sh 'mvn test'  // Assuming you use Maven and JUnit for testing
            }
        }



       stage('SonarQube Analysis') {
            steps {
                script {
               sh 'mvn clean verify sonar:sonar ' +
                       '-Dsonar.projectKey=sonar ' +
                       '-Dsonar.projectName=sonar ' +
                       '-Dsonar.host.url=http://192.168.33.10:9000 ' +
                       '-Dsonar.login=sqp_13b892f1b17552cb3fd831321e86e82b2dc493b0'
                    '-Dsonar.jacoco.reportPaths=target/jacoco.exec ' + // Path to the JaCoCo execution data file
                    '-Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml'
                }
            }
        }

      
  }
















}
