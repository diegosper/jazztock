package com.emarsu.jazztock.domain.ports;

import com.emarsu.jazztock.domain.models.Task;

public interface CreateTaskUseCase {

    Task createTask (Task task);
}
