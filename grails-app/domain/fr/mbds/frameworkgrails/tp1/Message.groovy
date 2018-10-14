package fr.mbds.frameworkgrails.tp1

import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes='content')
@ToString(includes='content', includeNames=true, includePackage=false)

class Message implements Serializable {
    User author
    User target
    String content
    boolean status

    static constraints = {
        author nullable: false, blank: false
        target nullable: false, blank: false
    }
}

