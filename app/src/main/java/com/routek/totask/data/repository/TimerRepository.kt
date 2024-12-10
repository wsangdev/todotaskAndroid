package com.routek.totask.data.repository

import com.routek.totask.data.dao.TimerDao
import com.routek.totask.data.model.TimerModel

class TimerRepository(private val timerDao: TimerDao) {
    suspend fun insertTimer(timer: TimerModel) = timerDao.insertTimer(timer)
    suspend fun updateTimer(timer: TimerModel) = timerDao.updateTimer(timer)
    suspend fun getTimerForTask(taskId:Int) = timerDao.getTimerForTask(taskId)
}