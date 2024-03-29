package dev.turbin.jooqtest.model;

import lombok.Builder;
import lombok.Data;

import java.time.OffsetDateTime;

@Data
@Builder
public class CaseShortDto {

    private Long caseId;
    private String caseNo;
    private OffsetDateTime createDttm;
}
