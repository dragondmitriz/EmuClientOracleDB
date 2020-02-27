package com.dmitriz.ipr.emuClientOracleDB.repository;

import com.dmitriz.ipr.emuClientOracleDB.entity.RowTable;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RowTableRepository extends CrudRepository<RowTable, Long> {

    @Query("select id,timestamp,body from inTable")
    List<RowTable> getRows();
}
