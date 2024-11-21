package com.ubaldo.tasks.infrastructure.config;

import com.ubaldo.tasks.application.services.TaskService;
import com.ubaldo.tasks.application.usecases.*;
import com.ubaldo.tasks.domain.models.Task;
import com.ubaldo.tasks.domain.ports.in.GetAdditionalTaskInfoUseCase;
import com.ubaldo.tasks.domain.ports.in.RetrieveTaskUseCase;
import com.ubaldo.tasks.domain.ports.out.ExternalServicePort;
import com.ubaldo.tasks.domain.ports.out.TaskRepositoryPort;
import com.ubaldo.tasks.infrastructure.adapters.ExternalServiceAdapter;
import com.ubaldo.tasks.infrastructure.repositories.JpaTaskRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public TaskService taskService(TaskRepositoryPort taskRepositoryPort, GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase) {
        return new TaskService(
                new CreateTaskUseCaseImpl(taskRepositoryPort),
                new DeleteTaskUseCaseImpl(taskRepositoryPort),
                getAdditionalTaskInfoUseCase,
                new RetrieveTaskUseCaseImpl(taskRepositoryPort),
                new UpdateTaskUseCaseImpl(taskRepositoryPort)
        );
    }

    @Bean
    public TaskRepositoryPort taskRepositoryPort (JpaTaskRepositoryAdapter jpaTaskRepositoryAdapter) {
        return jpaTaskRepositoryAdapter;
    }

    @Bean
    public GetAdditionalTaskInfoUseCase getAdditionalTaskInfoUseCase (ExternalServicePort externalServicePort) {
        return new GetAdditionalTaskInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort () {
        return new ExternalServiceAdapter();
    }
}
