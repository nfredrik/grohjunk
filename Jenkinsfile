#!/usr/bin/env groovy

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

 

node {
    
stage ('Stage 1'){



  echo "BUILD_URL"    
  echo "BUILD_URL=${env.BUILD_NUMBER}"

    echo "${env.BUILD_NUMBER}"
    //def nn = ngetItemData("MODULENAME2", "STAGE_ENV")
    def reader = readFile encoding: 'utf-8', file: "${WORKSPACE}/data.json"
    echo 'we ${reader}'
 
} //stage 1 

stage ('Stage 2') { 
    
     
     def workspace = pwd()
  echo "workspace"
  echo "workspace=${workspace}"
  
     }

} // node

Map ngetItemData(String module, String item) {
    def jsonSlurper = new JsonSlurper()
    def reader = new BufferedReader(new InputStreamReader(new FileInputStream("${WORKSPACE}/data.json"),"UTF-8"))
    data = jsonSlurper.parse(reader)  
    
    //return data."$module" //."$item"
}
