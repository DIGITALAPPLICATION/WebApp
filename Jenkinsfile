pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/venkatasykam/DevOpsWebApp.git', branch: 'master', credentialsId: 'jenkinsgithub')
      }
    }
    stage('Build') {
      parallel {
        stage('Build') {
          steps {
            echo 'Building my maven web project'
            bat 'mvn clean package'
          }
        }
        stage('print') {
          steps {
            echo 'Hello BlueOcean'
          }
        }
      }
    }
  }
}