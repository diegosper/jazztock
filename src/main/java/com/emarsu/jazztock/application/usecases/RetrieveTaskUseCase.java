package com.emarsu.jazztock.application.usecases;

import java.util.List;
import java.util.Optional;

import com.emarsu.jazztock.domain.models.Task;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;
import com.emarsu.jazztock.domain.ports.TaskRetrieval;

public class RetrieveTaskUseCase implements TaskRetrieval {

    private final TaskRepositoryPort taskRepositoryPort;

    public RetrieveTaskUseCase (TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Optional<Task> getTask(Long id) {
        
        return taskRepositoryPort.findById(id);
    }

    @Override
    public List<Task> getAllTasks() {
        
        return taskRepositoryPort.findAll();
    }

}
