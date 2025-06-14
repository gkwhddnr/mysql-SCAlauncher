package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.stereotype.Service

@Service
class UserService(val repo: UserRepository) {
    fun getAllUsers(): List<UserDTO> {
        return repo.findAll().map { user ->
            UserDTO(
                userId = user.userId,
                username = user.username,
                email = user.email,
                joinDate = user.joinDate
            )
        }
    }

    fun getUserById(id: Long): UserDTO {
        val user = repo.findById(id).orElseThrow { NoSuchElementException("사용자 없음") }
        return UserDTO(
            userId = user.userId,
            username = user.username,
            email = user.email,
            joinDate = user.joinDate
        )
    }
}