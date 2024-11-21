package com.ubaldo.tasks.domain.ports.in;

import com.ubaldo.tasks.domain.models.Task;

public interface CreateTaskUseCase {
    Task createTask(Task task);

}
