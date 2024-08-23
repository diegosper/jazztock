package com.emarsu.jazztock.infrastructure.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emarsu.jazztock.infrastructure.entities.TaskEntity;

//JPARepository <Valor a la que hace referencia, Long>
public interface JpaTaskRepository extends JpaRepository<TaskEntity, Long> {
    

}
