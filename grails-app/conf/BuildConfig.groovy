grails.servlet.version = "2.5"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.resolution = {
  inherits("global") {
    // uncomment to disable ehcache
    // excludes 'ehcache'
  }
  log "warn"
  checksums true

  repositories {
    inherits true
    grailsPlugins()
    grailsHome()
    grailsCentral()
  }
  dependencies {
    runtime 'mysql:mysql-connector-java:5.1.16'
  }

  plugins {
    compile ":hibernate:$grailsVersion"
    compile ":jquery:1.6.1.1"
    compile ":resources:1.1.5"
    compile ":simple-blog:0.2.1"
    compile ":taggable:1.0.1"
    compile ":commentable:0.8.1"
    compile ":feeds:1.5"
    compile ":spring-security-core:1.2.7.2"
    compile ":twitter-bootstrap:2.0.1.19"
    test ":geb:0.6.3"
    test ":spock:0.6"
    
    build ":tomcat:$grailsVersion"
  }
}
