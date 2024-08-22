package com.emarsu.jazztock.domain.ports;

import java.util.Optional;

import com.emarsu.jazztock.domain.models.Task;

public interface TaskUpdate {

    Optional<Task> updateTask (Long id, Task updateTask);

}
