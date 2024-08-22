package com.emarsu.jazztock.domain.ports;

import java.util.List;
import java.util.Optional;

import com.emarsu.jazztock.domain.models.AdditionalTaskInfo;
import com.emarsu.jazztock.domain.models.Task;

public interface TaskRepositoryPort {

    Task save (Task task);

    Optional<Task> findById (Long taskId);

    List<Task> findAll();

    Optional<Task> updateTask (Task task);

    boolean deleteById (Long taskId);

    AdditionalTaskInfo getAdditionalTaskInfo (Long taskId);  

}
