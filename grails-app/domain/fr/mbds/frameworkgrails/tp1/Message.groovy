package fr.mbds.frameworkgrails.tp1

class Message {
    User author
    User target
    String content
    boolean status

    static constraints = {
    }
}

