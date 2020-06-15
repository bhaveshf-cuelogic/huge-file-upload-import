package com.hhstechgroup.vyp.utility;

import java.io.File;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.spi.IdempotentRepository;
import org.apache.camel.support.processor.idempotent.FileIdempotentRepository;

public interface Idempotentable {
    default IdempotentRepository getIdempotentRepository(String name) {
        // TODO Auto-generated method stub
        Map repoMap = new HashMap<String, Object>();
        File fileStore = new File("camel/" + name + ".log");
        return new FileIdempotentRepository(fileStore, repoMap);
    }
}
