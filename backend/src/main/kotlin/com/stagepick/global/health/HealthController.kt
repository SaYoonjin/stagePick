package com.stagepick.global.health

import org.springframework.data.redis.core.StringRedisTemplate
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/health")
class HealthController(
    private val jdbcTemplate: JdbcTemplate,
    private val redisTemplate: StringRedisTemplate
) {

    @GetMapping
    fun health(): Map<String, Any> {
        val dbResult = jdbcTemplate.queryForObject("SELECT 1", Int::class.java)

        redisTemplate.opsForValue().set("stagepick:health", "ok")
        val redisResult = redisTemplate.opsForValue().get("stagepick:health")

        return mapOf(
            "status" to "UP",
            "database" to dbResult.toString(),
            "redis" to redisResult.orEmpty()
        )
    }
}