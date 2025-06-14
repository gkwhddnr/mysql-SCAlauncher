// RecordDTO.kt
package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import java.time.LocalDateTime

data class RecordDTO(
    val rank: Int,
    val userId: Long,
    val username: String,
    val mapName: String,
    val clearCounts: Int,
    val points: Int?,
    val duration: Int,
    val playedAt: LocalDateTime
)
