package ru.mtuci.simpleapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.mtuci.simpleapi.model.employees;
import org.springframework.transaction.annotation.Transactional;

@Transactional(readOnly=true)
public interface ProductRepository extends JpaRepository <employees, Long> {
    @Transactional
    @Modifying
    @Query("DELETE FROM employees p WHERE p.id=:id")
    int delete(@Param("id") Long id);
}
