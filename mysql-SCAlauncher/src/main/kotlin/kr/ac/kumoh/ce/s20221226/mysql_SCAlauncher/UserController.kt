package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/users")
class UserController(@Autowired val userRepo: UserRepository) {

    @GetMapping
    fun getAllUsers(): List<User> = userRepo.findAll()
}