node {
          
          stage('Checkout Code'){
          
          checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [],
                    userRemoteConfigs: [[credentialsId: 'f5f493e3-0eac-427e-b615-4ed967627e85', url: 'https://github.com/surajchandragit/NagarroWork.git']]])
          
          }
          
          stage("build & SonarQube analysis") {
              withSonarQubeEnv('sonar') {
                 sh 'mvn sonar:sonar'
              }
          }
      }  
