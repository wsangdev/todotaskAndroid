package com.routek.totask.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "task")
data class TaskEntity(
    @PrimaryKey(autoGenerate = true) val id: Int=0, // Id unico para cada tarea
    val title: String,
    val description: String, // Breve descripcion de la tarea
    val isCompleted: Boolean = false, // Indica si la tarea esta completa
    val timer: Long = 0L, // tiempo en 2dos usado por el Cronometro
    val isRuning: Boolean = false, // Indica si el Cronometro esta en ejecucion
    val createdAt: Long = System.currentTimeMillis(),
    val updateAt: Long = System.currentTimeMillis(),
)





