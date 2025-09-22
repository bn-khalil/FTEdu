package com.bn.courses.serviceImpl.ResourceServicesImpl;

import com.bn.courses.dto.resourcesDTO.TextResourceDTO;
import com.bn.courses.exception.NotFoundException;
import com.bn.courses.mapper.Resources.TextResourceMapper;
import com.bn.courses.model.resources.TextResource;
import com.bn.courses.repositories.ResourceRepositories.TextRepository;
import com.bn.courses.service.ResourceServices.TextService;
import org.springframework.stereotype.Service;

@Service
public class TextServiceImpl implements TextService {

    private final TextRepository textRepository;
    private final TextResourceMapper textResourceMapper;

    public TextServiceImpl(
            TextRepository textRepository,
            TextResourceMapper textResourceMapper
    ) {
        this.textRepository = textRepository;
        this.textResourceMapper = textResourceMapper;
    }

    @Override
    public TextResourceDTO addNewTextResource(TextResourceDTO textResourceDTO) {
        TextResource textResource = this.textRepository.save(this.textResourceMapper.toTextResource(textResourceDTO));
        textResourceDTO.setId(textResourceDTO.getId());
        textResourceDTO.setCreateAt(textResource.getCreateAt());
        return textResourceDTO;
    }

    @Override
    public TextResourceDTO findTextById(Long resource_id) {

        TextResource textResource = this.textRepository.findById(resource_id).orElseThrow(
                () -> new NotFoundException("Resource not found!")
        );
        return this.textResourceMapper.toTextResourceDTO(textResource);
    }


}
