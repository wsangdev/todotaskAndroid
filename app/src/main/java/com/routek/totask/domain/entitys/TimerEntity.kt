package com.routek.totask.domain.entitys

data class TimerEntity(
    val id: Int,
    val taskId: Int,
    val startTime: Long,
    val endTime: Long?,
    val elapsedTime: Long,
)