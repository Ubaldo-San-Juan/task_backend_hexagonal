package com.ubaldo.tasks.domain.ports.in;

import com.ubaldo.tasks.domain.models.AdditionalTaskInfo;

public interface GetAdditionalTaskInfoUseCase {
    AdditionalTaskInfo getAdditionalTaskInfo (Long id);
}