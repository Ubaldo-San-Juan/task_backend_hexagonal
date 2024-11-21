package com.ubaldo.tasks.domain.ports.in;

import com.ubaldo.tasks.domain.models.Task;

import java.util.Optional;

public interface UpdateTaskUseCase {

    Optional<Task> updateTask (Long id, Task updateTask);
}
