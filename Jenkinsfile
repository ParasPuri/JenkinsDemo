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
        
        


        // stage ('Deployment Stage') {
        //     steps {
        //             echo " yet to be depolyed ( need changes in pom file)"
        //         }
        //     }
        // }
    }
    
    post {
        always {
            archiveArtifacts artifacts: 'build/*.jar', fingerprint: true
            junit 'build/reports/**/*.xml'
        }
    }
}
