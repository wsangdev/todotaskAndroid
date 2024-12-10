package com.routek.totask.data.mapper

import com.routek.totask.data.model.TaskModel
import com.routek.totask.domain.entitys.TaskEntity

// Task(Model) DATA  => Task(Entity) DOMAIN
fun TaskModel.toDomain(): TaskEntity {
    return TaskEntity(
        id = id,
        title = title,
        description = description,
        isCompleted = isCompleted,
        creationDate = createdAt,
        updateDate = updateAt
    )
}

// Task(Entity) DOMAIN => Task(Model) DATA
fun TaskEntity.toData(): TaskModel {
    return TaskModel(
        id = id,
        title = title,
        description = description,
        isCompleted = isCompleted,
        createdAt = creationDate,
        updateAt = updateDate,
    )
}