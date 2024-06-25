#!usr/bin/env groovy

def call(){ 
    withSonarQubeEnv(installationName: 'sq' ) { 

        sh"./gradlew sonarqube \
  -Dsonar.projectKey=final \
  -Dsonar.host.url=http://52.3.247.241:9000 \
  -Dsonar.login=sonarqube"

    }

}
