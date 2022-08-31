pipeline {
        agent any
        tools {
            maven 'maven'
        }
        stages{
            stage("buld maven"){
                steps{
                    checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '941942cc-8a7f-4331-9ede-218f140669ca', url: 'https://github.com/gaurav050996/mongodb.git']]])
                    bat 'mvn clean install'
                }
            }
            stage("docker image"){
                steps{
                    bat 'docker build -t devops-int .'
                }
            }
            stage("push to docker hub"){
                steps{
                    withCredentials([string(credentialsId: 'docker', variable: 'dockerhubpwd')]) {
                        bat 'docker login -u gaurav05 -p Gaurav@05'
                        bat 'docker tag devops-int gaurav05/mongodb:devops-image'
                        bat 'docker push gaurav05/mongodb:devops-image'
                    }
                }
            }
        }
}