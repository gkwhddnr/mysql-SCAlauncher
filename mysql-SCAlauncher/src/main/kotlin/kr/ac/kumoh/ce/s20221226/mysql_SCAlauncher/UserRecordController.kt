package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/records")
class UserRecordController(@Autowired val service: RecordService) {

    @PostMapping
    fun save(
        @RequestParam userId: Long,
        @RequestParam roomId: Long,
        @RequestParam clearCounts: Int,
        @RequestParam points: Int?,
        @RequestParam duration: Int
    ): Record = service.save(userId, roomId, clearCounts, points, duration)

    @GetMapping("/{userId}")
    fun getByUser(@PathVariable userId: Long): List<Record> = service.getByUser(userId)

    @GetMapping("/ranking")
    fun getTopAndUserRecords(
        @RequestParam mapName: String,
        @RequestParam userId: Long
    ): List<Record> = service.getTopAndUserRecords(mapName, userId)
}
