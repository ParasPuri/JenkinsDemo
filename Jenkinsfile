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
            Welcome to Jenkins job.
            Your build is successful.

            Thanks
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
    
   // post {
     //   always {
       //    archiveArtifacts artifacts: 'target', fingerprint: true
            //junit 'build/reports/**/*.xml'
        //}
    //}
}
