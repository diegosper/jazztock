package com.emarsu.jazztock.domain.ports;

import com.emarsu.jazztock.domain.models.Task;

public interface TaskCreation {

    Task createTask (Task task);
}
