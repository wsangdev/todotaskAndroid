package com.routek.totask.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.routek.totask.data.model.TaskModel
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTask(task: TaskModel)

    @Update
    suspend fun updateTask(task: TaskModel)

    @Delete
    suspend fun deleteTask(task: TaskModel)

    @Query("SELECT * FROM task Where id =:taskId")
    suspend fun getTaskById(taskId: Int): TaskModel?

    @Query("SELECT * FROM task ORDER BY createdAt DESC")
    fun getAllTasks(): Flow<List<TaskModel>>

}