package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class ChatService(val repo: ChatRepository) {
    fun getAllChats(): List<ChatDTO> {
        return repo.findAll().map { chat ->
            ChatDTO(
                chatId = chat.chatId,
                userId = chat.user.userId,
                username = chat.user.username,
                roomId = chat.room.roomId,
                message = chat.message,
                sentAt = chat.sentAt
            )
        }
    }
}