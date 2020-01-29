package cors.test

class UrlMappings {

    static mappings = {
        "/"(controller: 'application', action:'index', method: 'GET')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
