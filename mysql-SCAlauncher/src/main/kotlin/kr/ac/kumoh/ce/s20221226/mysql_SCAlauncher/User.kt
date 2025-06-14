
package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import java.time.LocalDateTime

@Entity
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val userId: Long = 0,
    val username: String,
    val password: String,
    val email: String?,
    val joinDate: LocalDateTime = LocalDateTime.now()
)
