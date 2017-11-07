#!groovy
 
/**
        * Sample Jenkinsfile for Jenkins2 Pipeline
        * from https://github.com/hotwilson/jenkins2/edit/master/Jenkinsfile
        * by wilsonmar@gmail.com 
 */

import groovy.json.* 
import hudson.model.*
import hudson.EnvVars
import groovy.json.JsonSlurperClassic
import groovy.json.JsonBuilder
import groovy.json.JsonOutput
import java.net.URL

 
 
Map ngetItemData(String module, String item) {
    echo "beginning"
    def jsonSlurper = new JsonSlurper()
    def reader = new BufferedReader(new InputStreamReader(new FileInputStream("./data.json"),"UTF-8"))
    data = jsonSlurper.parse(reader)  

    echo "the end"
    return data."$module" //."$item"
}
 

node {
    
stage ('Stage 1'){



  echo "BUILD_URL"    
  echo "BUILD_URL=${env.BUILD_NUMBER}"

    echo "${env.BUILD_NUMBER}"
     //def example = load './first.groovy'
     def nn = example.ngetItemData("MODULENAME2", "STAGE_ENV")
     echo 'we ${nn}'
 
} //stage 1 

stage ('Stage 2') { 
    
     
     def workspace = pwd()
  echo "workspace"
  echo "workspace=${workspace}"
  
     }

} // node
