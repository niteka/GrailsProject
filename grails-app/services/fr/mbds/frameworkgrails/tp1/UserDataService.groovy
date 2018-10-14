package fr.mbds.frameworkgrails.tp1

import grails.gorm.services.Service

@Service(User)
interface UserDataService {
    User get(Long id)
    List<User> list(Map args)
    Number count()
    void delete(Serializable id)
    User update(Serializable id, Long version, String username)
    User update(Serializable id, Long version, byte[] featuredImageBytes, String featuredImageContentType) // <1>
    User save(String username)
}
