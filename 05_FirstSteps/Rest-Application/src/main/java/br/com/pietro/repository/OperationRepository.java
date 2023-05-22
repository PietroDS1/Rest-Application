package br.com.pietro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.pietro.service.OperationEntity;

@Repository
public interface OperationRepository extends JpaRepository<OperationEntity, Long> {

}

