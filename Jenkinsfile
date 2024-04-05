pipeline {
    agent any

    tools {
        nodejs 'nodejs'
    }
      environment {
        DOCKER_IMAGE_Back_NAME = 'brahim98/devops_project_test:Springimage'

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
                       '-Dsonar.projectKey=test ' +
                       '-Dsonar.projectName=test ' +
                       '-Dsonar.host.url=http://192.168.33.10:9000 ' +
                       '-Dsonar.login=sqp_5fe374f67d2af5b8898c815a4bb8cc5376796d70'
                    '-Dsonar.jacoco.reportPaths=target/jacoco.exec ' + // Path to the JaCoCo execution data file
                    '-Dsonar.coverage.jacoco.xmlReportPaths=target/site/jacoco/jacoco.xml'
                }
            }
        }


stage('Build image spring') {
            steps {
                script {
                    // Build the Docker image for the Spring Boot app
                    sh "docker build -t $DOCKER_IMAGE_Back_NAME ."
                }
            }
        }

        stage('Push image spring') {
            steps {
                script {
                    withDockerRegistry([credentialsId: 'docker-hub-creds',url: ""]) {
                        // Push the Docker image to Docker Hub
                        sh "docker push $DOCKER_IMAGE_Back_NAME"
                    }
                }
            }}

      
  }




    












}
