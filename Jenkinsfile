pipeline {
    agent any
    tools{
        jdk 'LOcalSDK'
    }

    stages {
        stage ('Compile Stage') {

            steps {
                
                    bat 'mvn clean compile'
                    
            }
        }
        
         stage('Creating Instance'){
          steps{
             withCredentials([[$class: 'AmazonWebServicesCredentialsBinding', accessKeyVariable: 'AWS_ACCESS_KEY_ID', credentialsId: 'ec2Instance',
                               secretKeyVariable: 'AWS_SECRET_ACCESS_KEY']]) {
                  sh 'terraform init -input=false'
                  sh 'terraform apply -input=false -auto-approve'
                //    sh 'ssh -o StrictHostKeyChecking=no ec2-user@ec2-3-83-246-232.compute-1.amazonaws.com'
                  //sh 'ssh ec2-user@ec2-3-83-246-232.compute-1.amazonaws.com sudo docker run paraspuri04/pipelinep-demodocker'
                  
              }
          }
      }

      
}
}






  /*
              

        stage ('Testing Stage') {

            steps {
                    bat 'mvn test'
                    echo " SUCCESSSS"
                    echo " Not deployed becuase it needs changes in pom file"
                }
            }
        
        
        stage ('SonarQube analysis') {
            steps{
    withSonarQubeEnv('SonarQubeLocal') {
      // requires SonarQube Scanner for Maven 3.2+
      bat 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.2:sonar'
                }
            }
        }
        
        
          stage('Email Notification'){
            steps{
           mail bcc: '', body: '''Hi,
Welcome to jenkins,
Your build is successful.

            Thanks,
            Paras''', cc: '', from: '', replyTo: '', subject: 'Jenkins job', to: 'paras.puri95work@gmail.com'

        }
    }
            
       
        


        // stage ('Deployment Stage') {
        //     steps {
        //             echo " yet to be depolyed ( need changes in pom file)"
        //         }
        //     }
        // }
    }
    */
