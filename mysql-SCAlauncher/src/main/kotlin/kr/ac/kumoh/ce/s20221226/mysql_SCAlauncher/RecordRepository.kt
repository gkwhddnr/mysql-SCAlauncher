package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param

interface RecordRepository : JpaRepository<Record, Long> {
    @Query("""
    SELECT r FROM Record r
    JOIN FETCH r.user u
    JOIN FETCH r.room gr
    JOIN FETCH gr.map m
    WHERE m.mapName = :mapName
""")
    fun findAllByMapName(@Param("mapName") mapName: String): List<Record>
}

