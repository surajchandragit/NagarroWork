node {
          
          stage('Checkout Code'){
          
        
          
          }
          
          stage("build & SonarQube analysis") {
              withSonarQubeEnv('sonar') {
                 sh 'mvn org.sonarsource.scanner.maven:sonar-maven-plugin:3.9.1.2184:sonar'
              }
          }
      }  
