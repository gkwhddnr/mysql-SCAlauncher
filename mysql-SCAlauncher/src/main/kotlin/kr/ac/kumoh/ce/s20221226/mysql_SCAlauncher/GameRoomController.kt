package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/rooms")
class GameRoomController(val service: GameRoomService) {
    @GetMapping
    fun getAllRooms(): List<GameRoomDTO> = service.getAllRooms()
}