#!/usr/bin/env groovy18

println 'hej'


import groovy.json.*

String getItemData(String item) {
    def jsonSlurper = new JsonSlurper()
    def reader = new BufferedReader(new InputStreamReader(new FileInputStream("./data.json"),"UTF-8"))
    data = jsonSlurper.parse(reader)  
    data.MODULENAME.each { println  it."$item" }

    data
}

Map ngetItemData(String module, String item) {
    def jsonSlurper = new JsonSlurper()
    def reader = new BufferedReader(new InputStreamReader(new FileInputStream("./data.json"),"UTF-8"))
    data = jsonSlurper.parse(reader)  

    return data."$module" //."$item"
}


//getItemData("STAGE_ENV")

//getItemData("TAGS")
//nn = getItemData("mail")

nn = ngetItemData("MODULENAME2", "mail")

nn = ngetItemData("MODULENAME2", "STAGE_ENV")
println nn.getClass()

//def map = Eval.me(nn)

println nn."mail"
println nn."STAGE_ENV"

//def map = evaluate(nn)
