package com.emarsu.jazztock.application.services;

import java.util.List;
import java.util.Optional;

import com.emarsu.jazztock.application.usecases.CreateTaskUseCase;
import com.emarsu.jazztock.application.usecases.DeleteTaskUseCase;
import com.emarsu.jazztock.application.usecases.GetAdditionalTaskInfoUseCase;
import com.emarsu.jazztock.application.usecases.RetrieveTaskUseCase;
import com.emarsu.jazztock.application.usecases.UpdateTaskUseCase;
import com.emarsu.jazztock.domain.models.AdditionalTaskInfo;
import com.emarsu.jazztock.domain.models.Task;
import com.emarsu.jazztock.domain.ports.GettingAdditionalTaskInfo;
import com.emarsu.jazztock.domain.ports.TaskCreation;
import com.emarsu.jazztock.domain.ports.TaskDeletion;
import com.emarsu.jazztock.domain.ports.TaskRetrieval;
import com.emarsu.jazztock.domain.ports.TaskUpdate;

public class TaskService implements TaskCreation, TaskRetrieval, TaskUpdate, TaskDeletion, GettingAdditionalTaskInfo{


    private final TaskCreation taskCreation;
    private final TaskRetrieval taskRetrieval;
    private final TaskUpdate taskUpdate;
    private final TaskDeletion taskDeletion;
    private final GettingAdditionalTaskInfo gettingAdditionalTaskInfo;

    

    public TaskService(TaskCreation taskCreation, TaskRetrieval taskRetrieval, TaskUpdate taskUpdate,
            TaskDeletion taskDeletion, GettingAdditionalTaskInfo gettingAdditionalTaskInfo) {
        this.taskCreation = taskCreation;
        this.taskRetrieval = taskRetrieval;
        this.taskUpdate = taskUpdate;
        this.taskDeletion = taskDeletion;
        this.gettingAdditionalTaskInfo = gettingAdditionalTaskInfo;
    }

    @Override
    public Task createTask(Task task) {
        
        return taskCreation.createTask(task);
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        
        return gettingAdditionalTaskInfo.getAdditionalTaskInfo(id);
    }

    @Override
    public boolean deleteTask(Long id) {
        
        return taskDeletion.deleteTask(id);
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        
        return taskUpdate.updateTask(id, updateTask);
    }

    @Override
    public Optional<Task> getTask(Long id) {
        
        return taskRetrieval.getTask(id);
    }

    @Override
    public List<Task> getAllTasks() {
        
        return taskRetrieval.getAllTasks();
    }



}
