package fr.mbds.frameworkgrails.tp1

class ApiController {

    def index() {
        switch (request.getMethod())
        {
            case "POST":
                render text "POST"
                print()
                break;
            case "GET":
                render text "GET"


        }
    }
}
