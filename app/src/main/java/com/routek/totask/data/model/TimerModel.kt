package com.routek.totask.data.model

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.Index
import androidx.room.PrimaryKey


@Entity(
    tableName = "timer",
    foreignKeys = [ForeignKey(
        entity = TaskModel::class,
        parentColumns = ["id"],
        childColumns = ["taskId"],
        onDelete = ForeignKey.CASCADE, // Se elimina una tarea y tambien sus Cronometros
    )],
    indices = [Index(value = ["taskId"])], // Mejora el Rendimiento por consultas PorId
    )
data class TimerModel(
    @PrimaryKey(autoGenerate = true) val id: Int=0, // id unicio para cronometro
    val taskId: Int,
    val startTime: Long,
    val endTime: Long? = null, // Fin del Intervalo(Null, si esta en ejecucion)
    val elapsedTime: Long = 0L // Tiempo acumulado (en milisegundos)
)