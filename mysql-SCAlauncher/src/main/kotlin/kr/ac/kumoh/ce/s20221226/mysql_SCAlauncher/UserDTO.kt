// UserDTO.kt
package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import java.time.LocalDateTime

data class UserDTO(
    val userId: Long,
    val username: String,
    val email: String?,
    val joinDate: LocalDateTime
)
