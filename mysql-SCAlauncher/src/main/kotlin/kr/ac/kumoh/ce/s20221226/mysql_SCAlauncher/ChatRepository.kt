package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.data.jpa.repository.JpaRepository

interface ChatRepository : JpaRepository<ChatLog, Long>