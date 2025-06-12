package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/maps")
class MapController(val service: MapService) {
    @PostMapping
    fun register(@RequestBody map: Map, @RequestParam userId: Long) = service.register(map, userId)
    @GetMapping
    fun getAll() = service.getAll()
}