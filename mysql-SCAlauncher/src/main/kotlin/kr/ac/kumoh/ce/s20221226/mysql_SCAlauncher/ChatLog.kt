package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class ChatLog(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val chatId: Long = 0,
    @ManyToOne @JoinColumn(name = "room_id")
    val room: GameRoom,
    @ManyToOne @JoinColumn(name = "user_id")
    val user: User,
    val message: String,
    val sentAt: LocalDateTime = LocalDateTime.now()
)
