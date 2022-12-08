def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Build") {
               steps {
                   sh 'free -g'                 
               }
           }
           stage("Checkout Code") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("Closing") {
               steps {
                   echo "New demo"
               }
           }
       }
}
}
