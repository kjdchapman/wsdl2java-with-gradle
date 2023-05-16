import io.mateo.cxf.codegen.wsdl2java.Wsdl2Java

plugins {
    java
    id("io.mateo.cxf-codegen") version "1.2.1"
}

repositories {
    mavenCentral()
}

dependencies {
    cxfCodegen("ch.qos.logback:logback-classic:1.2.10")
    cxfCodegen("jakarta.xml.ws:jakarta.xml.ws-api:2.3.3")
    cxfCodegen("jakarta.annotation:jakarta.annotation-api:1.3.5")
}

cxfCodegen {
    cxfVersion.set("3.2.0")
}

tasks.register("generate", Wsdl2Java::class) {
    toolOptions {
        wsdl.set(file("drs.wsdl"))
        outputDir.set(file("$buildDir/generated-java"))
        markGenerated.set(true)
        extraArgs.set(listOf("-server"))
    }
}
