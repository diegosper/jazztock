package com.emarsu.jazztock.infrastructure.repositories;

import java.util.List;
import java.util.Optional;

import com.emarsu.jazztock.domain.models.AdditionalTaskInfo;
import com.emarsu.jazztock.domain.models.Task;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;
import com.emarsu.jazztock.infrastructure.entities.TaskEntity;
import java.util.stream.Collectors;


public class JpaTaskRepositoryAdapter implements TaskRepositoryPort {

    private final JpaTaskRepository jpaTaskRepository;

    public JpaTaskRepositoryAdapter(JpaTaskRepository jpaTaskRepository) {
        this.jpaTaskRepository = jpaTaskRepository;
    }

    @Override
    public Task save(Task task) {
        
        TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
        TaskEntity savedTaskEntity = jpaTaskRepository.save(taskEntity);

        return savedTaskEntity.toDomainModel();
    }

    @Override
    public Optional<Task> findById(Long taskId) {
        
        return jpaTaskRepository.findById(taskId).map(TaskEntity::toDomainModel);
    }

    @Override
    public List<Task> findAll() {
        
        return jpaTaskRepository.findAll().stream().map(TaskEntity::toDomainModel).collect(Collectors.toList());        
    }

    @Override
    public Optional<Task> updateTask(Task task) {
        
        if (jpaTaskRepository.existsById(task.getId())) {
            TaskEntity taskEntity = TaskEntity.fromDomainModel(task);
            TaskEntity updateTaskEntity = jpaTaskRepository.save(taskEntity);
            return Optional.of(updateTaskEntity.toDomainModel());
        }
        
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long taskId) {
        
        if (jpaTaskRepository.existsById(taskId)) {
            jpaTaskRepository.deleteById(taskId);
            return true;
        }

        return false;
    }


    //PENDIENTE XXXXXXXXX
    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long taskId) {
        
        return null;
    }

}
