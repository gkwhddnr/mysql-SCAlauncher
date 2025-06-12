package kr.ac.kumoh.ce.s20221226.mysql_SCAlauncher

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/web")
class WebBrowser {
    @GetMapping("/test")
    fun simulateRequest(): String = "웹 브라우저에서 요청 테스트 성공"
}