package com.routek.totask.data.dao

import androidx.room.Query
import androidx.room.Transaction
import com.routek.totask.data.model.TaskTimerModel

interface TaskTimerDao {
    @Transaction
    @Query("Select * from task Where id = :taskId")
    suspend fun getTaskWithTimer(taskId: Int): TaskTimerModel
}