package com.emarsu.jazztock.infrastructure.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.emarsu.jazztock.application.services.TaskService;
import com.emarsu.jazztock.application.usecases.CreateTaskUseCase;
import com.emarsu.jazztock.application.usecases.DeleteTaskUseCase;
import com.emarsu.jazztock.application.usecases.GetAdditionalTaskInfoUseCase;
import com.emarsu.jazztock.application.usecases.RetrieveTaskUseCase;
import com.emarsu.jazztock.application.usecases.UpdateTaskUseCase;
import com.emarsu.jazztock.domain.ports.ExternalServicePort;
import com.emarsu.jazztock.domain.ports.GettingAdditionalTaskInfo;
import com.emarsu.jazztock.domain.ports.TaskCreation;
import com.emarsu.jazztock.domain.ports.TaskRepositoryPort;
import com.emarsu.jazztock.infrastructure.adapters.ExternalServiceAdapter;
import com.emarsu.jazztock.infrastructure.repositories.JpaTaskRepositoryAdapter;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort,
            GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {

        CreateTaskUseCase createTaskUseCase = new CreateTaskUseCase(taskRepositoryPort);
        RetrieveTaskUseCase retrieveTaskUseCase = new RetrieveTaskUseCase(taskRepositoryPort);
        UpdateTaskUseCase updateTaskUseCase = new UpdateTaskUseCase(taskRepositoryPort);
        DeleteTaskUseCase deleteTaskUseCase = new DeleteTaskUseCase(taskRepositoryPort);

        return new TaskService(
                createTaskUseCase,
                retrieveTaskUseCase,
                updateTaskUseCase,
                deleteTaskUseCase,
                // VERIFICAR ESTE ÚLTIMO
                getAdditionalTaskInfoUseCase);

    }


    @Bean
    public TaskRepositoryPort taskRepositoryPort (JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter){
        
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GettingAdditionalTaskInfo gettingAdditionalTaskInfo (ExternalServicePort externalServicePort){
        return new GetAdditionalTaskInfoUseCase(externalServicePort);

    }

    @Bean
    public ExternalServicePort externalServicePort (){
        return new ExternalServiceAdapter();
    }

}
