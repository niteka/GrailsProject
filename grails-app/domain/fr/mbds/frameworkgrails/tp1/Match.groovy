package fr.mbds.frameworkgrails.tp1

class Match {

    User winner
    int winnerScore
    User looser
    int looserScore

    Date dateCreated

    static constraints = {
    }
}
