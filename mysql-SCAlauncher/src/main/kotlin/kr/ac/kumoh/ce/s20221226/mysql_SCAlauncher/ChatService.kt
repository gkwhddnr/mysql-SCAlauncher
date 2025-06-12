package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class ChatService(val repo: ChatRepository) {
    fun getByRoom(roomId: Long): List<ChatLog> = repo.findAll().filter { it.room.roomId == roomId }
}