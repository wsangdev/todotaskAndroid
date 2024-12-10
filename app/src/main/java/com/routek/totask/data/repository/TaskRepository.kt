package com.routek.totask.data.repository

import com.routek.totask.data.dao.TaskDao
import com.routek.totask.data.model.TaskModel
import kotlinx.coroutines.flow.Flow

// El Repositorio es el que interactua con los DAOS
class TaskRepository(private val taskDao: TaskDao) {
    suspend fun insertTask(task: TaskModel) = taskDao.insertTask(task)
    suspend fun updateTask(task: TaskModel) = taskDao.updateTask(task)
    suspend fun deleteTask(task: TaskModel) = taskDao.deleteTask(task)
    suspend fun getTaskById(taskId: Int) = taskDao.getTaskById(taskId)
    fun getAllTasks(): Flow<List<TaskModel>> = taskDao.getAllTasks()
}