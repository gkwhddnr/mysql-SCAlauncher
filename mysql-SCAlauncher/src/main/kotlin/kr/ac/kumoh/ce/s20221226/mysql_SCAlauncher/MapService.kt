package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class MapService(val repo: MapRepository, val userRepo: UserRepository) {
    fun register(map: Map, userId: Long): Map {
        val user = userRepo.findById(userId).orElseThrow()
        return repo.save(map.copy(uploader = user))
    }
    fun getAll() = repo.findAll()
}