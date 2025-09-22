package com.bn.courses.service.ResourceServices;

import com.bn.courses.dto.resourcesDTO.TextResourceDTO;

public interface TextService {
    public TextResourceDTO findTextById(Long resource_id);
    public TextResourceDTO addNewTextResource(TextResourceDTO textResourceDTO);
}
