package cors.test

class ApplicationController {
    static responseFormats = ['json']

    def index() {
        render '{"message": "Hello, World!"}'
    }
}
