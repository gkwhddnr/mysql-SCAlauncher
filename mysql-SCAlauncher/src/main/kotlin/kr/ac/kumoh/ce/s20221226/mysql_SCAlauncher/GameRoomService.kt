package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class GameRoomService (val repo: GameRoomRepository, val userRepo: UserRepository, val mapRepo: MapRepository) {
    fun getAllRooms(): List<GameRoomDTO> {
        return repo.findAll().map { room ->
            GameRoomDTO(
                roomId = room.roomId,
                hostUserId = room.host.userId,
                hostUsername = room.host.username,
                mapName = room.map.mapName,
                isPrivate = room.isPrivate,
                createdAt = room.createdAt
            )
        }
    }
}