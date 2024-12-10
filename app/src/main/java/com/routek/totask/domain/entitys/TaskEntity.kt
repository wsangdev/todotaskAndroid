package com.routek.totask.domain.entitys

data class TaskEntity(
    val id: Int,
    val title: String,
    val description: String,
    val isCompleted: Boolean,
    val creationDate: Long,
    val updateDate: Long,
)