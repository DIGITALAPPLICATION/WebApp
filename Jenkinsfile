pipeline {
  agent any
  stages {
    stage('checkout') {
      steps {
        git(url: 'https://github.com/venkatasykam/DevOpsWebApp.git', branch: 'master', credentialsId: 'jenkinsgithub', poll: true)
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
    stage('deploy') {
      parallel {
        stage('deploy') {
          steps {
            timeout(time: 1, activity: true) {
              echo 'hello world'
              echo 'namaste world'
              echo 'Hiii Hello'
            }

            echo 'adab india'
          }
        }
        stage('parallel-deploy') {
          steps {
            retry(count: 3) {
              echo 'hello child'
            }

          }
        }
      }
    }
    stage('test') {
      parallel {
        stage('test') {
          steps {
            build 'afterbackup'
          }
        }
        stage('parallel-test') {
          steps {
            sleep(time: 1, unit: 'MINUTES')
          }
        }
      }
    }
    stage('stage') {
      parallel {
        stage('stage') {
          steps {
            pwd(tmp: true)
            isUnix()
          }
        }
        stage('prallel-stage') {
          steps {
            fileExists 'Jenkinsfile'
            input(message: 'Please enter your valid input', id: 'InputId', submitter: 'devops2018')
          }
        }
      }
    }
  }
}