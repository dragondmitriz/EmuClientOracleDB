package com.dmitriz.ipr.emuClientOracleDB.entity;

import org.springframework.data.annotation.Id;

public class RowTable {

    @Id
    long id;
    long dtCreate;
    String body;
}
