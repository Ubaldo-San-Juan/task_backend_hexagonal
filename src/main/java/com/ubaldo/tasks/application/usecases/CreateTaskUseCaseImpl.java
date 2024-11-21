package com.ubaldo.tasks.application.usecases;

import com.ubaldo.tasks.domain.models.Task;
import com.ubaldo.tasks.domain.ports.in.CreateTaskUseCase;
import com.ubaldo.tasks.domain.ports.out.TaskRepositoryPort;

public class CreateTaskUseCaseImpl implements CreateTaskUseCase {
    final TaskRepositoryPort taskRepositoryPort;

    public CreateTaskUseCaseImpl(TaskRepositoryPort taskRepositoryPort) {
        this.taskRepositoryPort = taskRepositoryPort;
    }

    @Override
    public Task createTask(Task task) {
        return taskRepositoryPort.save(task);
    }
}
