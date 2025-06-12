package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import jakarta.persistence.EntityManager
import jakarta.persistence.PersistenceContext
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class RecordService (
    @Autowired private val repo: RecordRepository,
    @PersistenceContext private val entityManager: EntityManager
) {
    fun save(userId: Long, roomId: Long, clearCounts: Int, points: Int?, duration: Int): Record {
        val user = entityManager.getReference(User::class.java, userId)
        val room = entityManager.getReference(GameRoom::class.java, roomId)
        return repo.save(Record(user = user, room = room, clearCounts = clearCounts, points = points, duration = duration))
    }

    fun getByUser(userId: Long): List<Record> =
        repo.findAll().filter { it.user.userId == userId }

    fun getTopAndUserRecords(mapName: String, userId: Long): List<Record> =
        repo.findAll()
            .filter { it.room.map.mapName == mapName && (it.user.userId == userId || true) }
            .sortedByDescending { it.clearCounts }
            .distinctBy { it.user.userId }
}
