package com.emarsu.jazztock.domain.ports;

import java.util.Optional;

import com.emarsu.jazztock.domain.models.Task;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask (Long id, Task updateTask);

}
