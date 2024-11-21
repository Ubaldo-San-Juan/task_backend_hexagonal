package com.ubaldo.tasks.domain.ports.in;

import com.ubaldo.tasks.domain.models.Task;

import java.util.List;
import java.util.Optional;

public interface RetrieveTaskUseCase {
    Optional<Task> getTask(Long id);

    List<Task> getAllTasks();
}
