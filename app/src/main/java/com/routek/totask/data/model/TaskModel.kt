package com.routek.totask.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "task")
data class TaskModel(
    @PrimaryKey(autoGenerate = true) val id: Int=0, // Id unico para cada tarea
    val title: String,
    val description: String, // Breve descripcion de la tarea
    val isCompleted: Boolean = false, // Indica si la tarea esta completa
    val createdAt: Long = System.currentTimeMillis(),
    val updateAt: Long = System.currentTimeMillis(),
)





