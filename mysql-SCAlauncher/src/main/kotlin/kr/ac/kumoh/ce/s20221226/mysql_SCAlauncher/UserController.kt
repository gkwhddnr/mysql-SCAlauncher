package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/users")
class UserController(@Autowired val service : UserService) {

    @GetMapping
    fun getAllUsers(): List<UserDTO> = service.getAllUsers()

    @GetMapping("/{id}")
    fun getUserById(@PathVariable id: Long): UserDTO = service.getUserById(id)
}