package com.emarsu.jazztock.domain.ports;

import java.util.List;
import java.util.Optional;

import com.emarsu.jazztock.domain.models.Task;

public interface TaskRetrieval {

    Optional<Task> getTask (Long id);

    List<Task> getAllTasks ();

}
