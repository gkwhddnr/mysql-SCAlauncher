// ChatDTO.kt
package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import java.time.LocalDateTime

data class ChatDTO(
    val chatId: Long,
    val userId: Long,
    val username: String,
    val roomId: Long,
    val message: String,
    val sentAt: LocalDateTime
)
