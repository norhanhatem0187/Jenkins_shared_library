#!usr/bin/env groovy

def call(String OpenShiftCredentialsID, String openshiftClusterurl, String openshiftProject, String imageName) {

    // Update deployment.yaml with new Docker Hub image
    sh "sed -i 's|image:.*|image: ${imageName}:${BUILD_NUMBER}|g' deployment.yml"

    // login to OpenShift Cluster via cluster url & service account token
    
            sh "oc apply -f ."
   

}
