package com.routek.totask.data.model

import androidx.room.Embedded
import androidx.room.Relation

data class TaskTimerModel (
    @Embedded val task: TaskModel,
    @Relation(
        parentColumn = "id",
        entityColumn = "taskId"
    )
    val timers: List<TimerModel>
)