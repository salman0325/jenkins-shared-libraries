def call(String Project, String ImageTag, String dockerhubuser){
  withCredentials{(usernamePassword(credentialsId: 'docker-hub-credi',passwordVariable: 'dockerpass', usernameVariable: 'dockeruser')}){
    sh "docker login -u ${dockeruser} -p ${dockerpass}"    
  }
    sh "docker push ${dockeruser}/${Project}:${ImageTag}"
                 
}
