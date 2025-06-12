package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Record(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val recordId: Long = 0,
    @ManyToOne @JoinColumn(name = "user_id")
    val user: User,
    @ManyToOne @JoinColumn(name = "room_id")
    val room: GameRoom,
    val clearCounts: Int,
    val points: Int?,
    val duration: Int,
    val playedAt: LocalDateTime = LocalDateTime.now()
)
