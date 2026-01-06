package com.yeditepe.finalexam.repository

import com.yeditepe.finalexam.api.TaskApi
import com.yeditepe.finalexam.model.Task
import jdk.internal.org.jline.utils.ShutdownHooks.Task

class TaskRepository(private val api: TaskApi) {

    @GET("tasks")
    suspend fun fetchTasks(): List<Task> {
        // TODO 1: Call API
        // TODO 2: Convert TaskDto list to Task list
        return TODO("Provide the return value")
    }
}
