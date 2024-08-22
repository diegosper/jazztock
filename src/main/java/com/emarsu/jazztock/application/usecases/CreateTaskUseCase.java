package com.emarsu.jazztock.application.usecases;

import com.emarsu.jazztock.domain.models.Task;
import com.emarsu.jazztock.domain.ports.TaskCreation;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;

public class CreateTaskUseCase implements TaskCreation {

    private final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCase(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        
        return taskRepositoryPort.save(task);
    }

}
