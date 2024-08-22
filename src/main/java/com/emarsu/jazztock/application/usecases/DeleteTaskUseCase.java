package com.emarsu.jazztock.application.usecases;

import com.emarsu.jazztock.domain.ports.TaskDeletion;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;

public class DeleteTaskUseCase implements TaskDeletion {

    private final TaskRepositoryPort taskRepositoryPort;

    public DeleteTaskUseCase(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public boolean deleteTask(Long id) {
        
        return taskRepositoryPort.deleteById(id);
    }

}
