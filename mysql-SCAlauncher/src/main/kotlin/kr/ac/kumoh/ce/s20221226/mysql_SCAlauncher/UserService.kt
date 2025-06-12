package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class UserService(val repo: UserRepository) {
    fun register(user: User) = repo.save(user)
    fun findById(id: Long) = repo.findById(id)
}