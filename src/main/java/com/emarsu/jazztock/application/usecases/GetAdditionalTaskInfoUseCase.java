package com.emarsu.jazztock.application.usecases;

import com.emarsu.jazztock.domain.models.AdditionalTaskInfo;
import com.emarsu.jazztock.domain.ports.ExternalServicePort;
import com.emarsu.jazztock.domain.ports.GettingAdditionalTaskInfo;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;

public class GetAdditionalTaskInfoUseCase implements GettingAdditionalTaskInfo {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalTaskInfoUseCase(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public AdditionalTaskInfo getAdditionalTaskInfo(Long id) {
        return externalServicePort.getadAdditionalTaskInfo(id);
    }

}
