// Added by the Spring Security Core plugin:
grails.plugin.springsecurity.useBasicAuth = true
grails.plugin.springsecurity.userLookup.userDomainClassName = 'fr.mbds.frameworkgrails.tp1.User'
grails.plugin.springsecurity.userLookup.authorityJoinClassName = 'fr.mbds.frameworkgrails.tp1.UserRole'
grails.plugin.springsecurity.authority.className = 'fr.mbds.frameworkgrails.tp1.Role'
grails.plugin.springsecurity.requestMap.className = 'fr.mbds.frameworkgrails.tp1.UserRole'
grails.plugin.springsecurity.securityConfigType = 'Annotation'
grails.plugin.fields.disableLookupCache = true



grails.plugin.springsecurity.logout.postOnly= false

grails.plugin.springsecurity.controllerAnnotations.staticRules = [
        [pattern: '/', access: ['permitAll']],
        [pattern: '/error', access: ['permitAll']],
        [pattern: '/index', access: ['permitAll']],
        [pattern: '/index.gsp', access: ['permitAll']],
        [pattern: '/shutdown', access: ['permitAll']],
        [pattern: '/assets/**', access: ['permitAll']],
        [pattern: '/**/js/**', access: ['permitAll']],
        [pattern: '/**/css/**', access: ['permitAll']],
        [pattern: '/**/images/**', access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        //[pattern: '/dbconsole/**',   access: ['permitAll']],
        [pattern: '/dbconsole/**', access: ['ROLE_ADMIN']],
        [pattern: '/user/**', access: ['ROLE_ADMIN']],
        [pattern: '/message/**', access: ['ROLE_ADMIN']],
        [pattern: '/match/**', access: ['ROLE_ADMIN']],
        //[pattern: '/user/*',         access: ['permitAll']],
        [pattern: '/api/logout', access: ['isAuthenticated()']],

        [pattern: '/**', access: ['ROLE_ADMIN']]


]

grails.plugin.springsecurity.filterChain.chainMap = [

        //[pattern: '/apiprod/**', filters: 'JOINED_FILTERS,-anonymousAuthenticationFilter,-exceptionTranslationFilter,-authenticationProcessingFilter,-securityContextPersistenceFilter,-rememberMeAuthenticationFilter'],

        [pattern: '/assets/**', filters: 'none'],
        [pattern: '/**/js/**', filters: 'none'],
        [pattern: '/**/css/**', filters: 'none'],
        [pattern: '/**/images/**', filters: 'none'],
        [pattern: '/**/favicon.ico', filters: 'none'],
        [pattern: '/**', filters: 'JOINED_FILTERS']
]



grails.plugin.springsecurity.interceptUrlMap = [
        [pattern: '/',               access: ['permitAll']],
        [pattern: '/error',          access: ['permitAll']],
        [pattern: '/index',          access: ['permitAll']],
        [pattern: '/index.gsp',      access: ['permitAll']],
        [pattern: '/shutdown',       access: ['permitAll']],
        [pattern: '/assets/**',      access: ['permitAll']],
        [pattern: '/**/js/**',       access: ['permitAll']],
        [pattern: '/**/css/**',      access: ['permitAll']],
        [pattern: '/**/images/**',   access: ['permitAll']],
        [pattern: '/**/favicon.ico', access: ['permitAll']],
        [pattern: '/login/**',       access: ['permitAll']],
        [pattern: '/logout/**',      access: ['permitAll']]
]