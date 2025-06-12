package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class GameRoom(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val roomId: Long = 0,
    @ManyToOne @JoinColumn(name = "host_user_id")
    val host: User,
    @ManyToOne @JoinColumn(name = "map_id")
    val map: Map,
    val isPrivate: Boolean = false,
    val createdAt: LocalDateTime = LocalDateTime.now()
)
