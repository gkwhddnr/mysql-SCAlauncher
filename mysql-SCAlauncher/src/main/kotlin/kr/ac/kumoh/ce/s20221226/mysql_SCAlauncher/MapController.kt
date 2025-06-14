package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/maps")
class MapController(val service: MapService) {
    @GetMapping
    fun getAllMaps(): List<MapDTO> = service.getAllMaps()
}