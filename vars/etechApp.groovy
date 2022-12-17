def call(String repoUrl){
    pipeline {
       agent any
       stages {
           stage("Kelechi") {
               steps {
                   sh 'lscpu'
                   sh 'java -version'
               }
           }
           stage("Fidel") {
               steps {
                   git branch: 'main',
                          url: "${repoUrl}"
               }
           }
           stage("Okey") {
               steps {
                   sh 'whoami'
               }
           }
           stage("Esther") {
               steps {
                   sh 'pwd'
               }
           }
           stage("Anthony") {
               steps {
                   sh 'df -h'
               }
           }
           stage("Ntui") {
               steps {
                   sh 'htop'
               }
           }
           stage("Uche") {
               steps {
                   sh 'lsblk'
               }
           }
       }
}
}