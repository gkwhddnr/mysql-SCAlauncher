package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class GameRoomService (val repo: GameRoomRepository, val userRepo: UserRepository, val mapRepo: MapRepository) {
    fun create(userId: Long, mapId: Long, isPrivate: Boolean): GameRoom {
        val user = userRepo.findById(userId).orElseThrow()
        val map = mapRepo.findById(mapId).orElseThrow()
        return repo.save(GameRoom(host = user, map = map, isPrivate = isPrivate))
    }
    fun getAll() = repo.findAll()
}