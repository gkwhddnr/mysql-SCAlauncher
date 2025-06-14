// GameRoomDTO.KT
package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import java.time.LocalDateTime

data class GameRoomDTO(
    val roomId: Long,
    val hostUserId: Long,
    val hostUsername: String,
    val mapName: String,
    val isPrivate: Boolean,
    val createdAt: LocalDateTime
)
