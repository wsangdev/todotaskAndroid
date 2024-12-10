package com.routek.totask.data.mapper

import com.routek.totask.data.model.TimerModel
import com.routek.totask.domain.entitys.TimerEntity


// Timer(Model) DATA => DOMAIN Timer(Entity)
fun TimerModel.toDomain(): TimerEntity {
    return  TimerEntity(
        id = id,
        taskId = taskId,
        startTime = startTime,
        endTime = endTime,
        elapsedTime = elapsedTime,
    )
}

// Timer(Entity)  DOMAIN  => DATA Timer(Model)
fun TimerEntity.toData(): TimerModel {
    return TimerModel(
        id = id,
        taskId = taskId,
        startTime = startTime,
        endTime = endTime,
        elapsedTime = elapsedTime
    )
}