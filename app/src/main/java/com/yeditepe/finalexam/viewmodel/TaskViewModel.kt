package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel
import jdk.internal.org.jline.utils.ShutdownHooks.Task

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    init {
        val samplelist = ListOf(
            Task(id=1,title="loginscreen" ,isCompleted=yes)
            Task(id=2,title="fakeAPIconnection", iscompleted=)
        )
        Task.values=_samplelist
    }

    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        var toggleTask: Boolean =
            RadioButton(toggleTask() onClick= {
                selected = !selected
            })
    }
}
