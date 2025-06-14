// MapDTO
package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import java.time.LocalDateTime

data class MapDTO(
    val mapId: Long,
    val mapName: String,
    val description: String?,
    val uploaderUsername: String?,
    val uploadDate: LocalDateTime
)
