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
    def reader = readFile encoding: 'utf-8', file: "${WORKSPACE}/data.json"
    def nn = ngetItemData(reader, "MODULENAME2", "STAGE_ENV")
    echo "${nn}"
} //stage 1 

stage ('Stage 2') { 
    
     
     def workspace = pwd()
  echo "workspace"
  echo "workspace=${workspace}"
  
     }

} // node

Map ngetItemData(String content, String module, String item) {

    println "${content}"
    def jsonSlurper = new JsonSlurper()
    data = jsonSlurper.parseText(content)  
    
    return data."$module"."$item"
}
