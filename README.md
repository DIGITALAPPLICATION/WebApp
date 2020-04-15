# DevOpsWebApp

Configure a jenkins pipeline job and use the belo0w Jenkinsfile

    pipeline {
        agent any
        stages {
          stage('docker image') {
          steps {
            script{
              node('linux') {
                  git branch: 'dockerfile', credentialsId: 'jenkinsGitHub', url: 'https://github.com/DIGITALAPPLICATION/WebApp.git'
                def maven = docker.image('maven:3.3.3-jdk-8')
                maven.pull() // make sure we have the latest available from Docker Hub
                maven.inside {
                    sh "mvn -V clean install"
                }
                def myWeb = docker.build 'mywebapp:1.0'
              }
            }
          }
        }
      }
    }

#### Once the build is done run the below command:

    docker run -d --name mywebs -p 8089:8080 mywebapp:1.0

