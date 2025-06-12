package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
data class Map(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val mapId: Long = 0,
    val mapName: String,
    val description: String?,
    @ManyToOne @JoinColumn(name = "upload_user_id")
    val uploader: User?,
    val uploadDate: LocalDateTime = LocalDateTime.now()
)
