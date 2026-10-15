package com.jpa.jpa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DBRepository extends JpaRepository<NewEntity, Integer>
{

}
