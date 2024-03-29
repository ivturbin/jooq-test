package dev.turbin.jooqtest.mapper;

import dev.turbin.jooqtest.model.CaseShortDto;
import org.jooq.Record3;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;

@Component
public class CaseResultToDto {

    public CaseShortDto convert(Record3<Long, String, OffsetDateTime> record) {
         return CaseShortDto.builder().caseId(record.component1()).caseNo(record.component2()).createDttm(record.component3()).build();
    }
}
