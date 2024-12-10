package com.routek.totask.data.dao

import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.routek.totask.data.model.TimerModel

interface  TimerDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTimer(timer: TimerModel)

    @Update
    suspend fun updateTimer(timer: TimerModel)

    @Query("SELECT * FROM timer WHERE taskId = :taskId")
    suspend fun getTimerForTask(taskId: Int): List<TimerModel>
}