package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/rooms")
class GameRoomController(val service: GameRoomService) {
    @PostMapping
    fun create(@RequestParam userId: Long, @RequestParam mapId: Long, @RequestParam isPrivate: Boolean) =
        service.create(userId, mapId, isPrivate)
    @GetMapping
    fun list() = service.getAll()
}