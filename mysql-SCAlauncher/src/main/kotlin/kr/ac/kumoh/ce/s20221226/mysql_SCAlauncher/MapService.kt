package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class MapService(val repo: MapRepository) {
    fun getAllMaps(): List<MapDTO> {
        return repo.findAll().map { map ->
            MapDTO(
                mapId = map.mapId,
                mapName = map.mapName,
                description = map.description,
                uploaderUsername = map.uploader?.username,
                uploadDate = map.uploadDate
            )
        }
    }
}