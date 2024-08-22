package com.emarsu.jazztock.application.usecases;

import java.util.Optional;

import com.emarsu.jazztock.domain.models.Task;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;
import com.emarsu.jazztock.domain.ports.TaskUpdate;

public class UpdateTaskUseCase implements TaskUpdate {

    private final TaskRepositoryPort taskRepositoryPort;

    public UpdateTaskUseCase (TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> updateTask(Long id, Task updateTask) {
        
        return taskRepositoryPort.updateTask(updateTask);
    }

}
