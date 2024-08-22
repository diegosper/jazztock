package com.emarsu.jazztock.application.usecases;

import com.emarsu.jazztock.domain.models.AdditionalTaskInfo;
import com.emarsu.jazztock.domain.ports.GettingAdditionalTaskInfo;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;

public class GetAdditionalTaskInfoUseCase implements GettingAdditionalTaskInfo {

    private final TaskRepositoryPort taskRepositoryPort;

    public GetAdditionalTaskInfoUseCase(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return taskRepositoryPort.getAdditionalTaskInfo(id);
    }

}
