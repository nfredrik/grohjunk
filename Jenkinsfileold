pipeline {
    agent any 

    stages {
        stage('Build') { 
            steps { 
                 echo 'build'
                 def example = load './first.groovy'
                 def nn = example.ngetItemData("MODULENAME2", "STAGE_ENV")
                 echo 'we done'
            }
        }
        stage('Test'){
            steps {
                echo 'test'
            }
        }
        stage('Deploy') {
            steps {
                echo 'deploy'
            }
        }
    }
}