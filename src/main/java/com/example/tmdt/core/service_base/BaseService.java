package com.example.tmdt.core.service_base;
import com.example.tmdt.core.dto_base.BaseDTO;
import com.example.tmdt.core.model_base.BaseEntity;
import com.example.tmdt.core.repository_base.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
public abstract class BaseService<Repository extends BaseRepository<Entity> & JpaRepository<Entity, ?>, DTO extends BaseDTO, Entity extends BaseEntity> {

    public abstract DTO create(DTO dto);

    public abstract DTO update(DTO dto);

    public abstract Optional<DTO> getDetails(Long id);

    public abstract DTO delete(DTO dto);

    public abstract List<DTO> findAll();

    public BaseService() {
    }

}
