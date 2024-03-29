package dev.turbin.jooqtest.dao;

import dev.turbin.jooqtest.jooq.tables.CoreCase;
import dev.turbin.jooqtest.jooq.tables.CorePersonDocument;
import dev.turbin.jooqtest.jooq.tables.FpCase;
import dev.turbin.jooqtest.jooq.tables.FpPersonDocument;
import dev.turbin.jooqtest.mapper.CaseResultToDto;
import dev.turbin.jooqtest.model.CaseShortDto;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.springframework.stereotype.Component;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class CaseDao {

    private final DSLContext context;
    private final CaseResultToDto caseResultToDto;

    public List<CaseShortDto> getLastFiveCases() {
        return context.select(CoreCase.CORE_CASE.CORE_CASE_ID, CoreCase.CORE_CASE.CASE_NO, CoreCase.CORE_CASE.CREATE_DTTM)
                .from(CoreCase.CORE_CASE)
                .where(CoreCase.CORE_CASE.CREATE_DTTM
                        .greaterThan(OffsetDateTime.now().minusDays(10)))
                .orderBy(CoreCase.CORE_CASE.CREATE_DTTM.desc())
                .limit(5)
                .fetch()
                .collect(Collectors.toList())
                .stream()
                .map(caseResultToDto::convert)
                .toList();
    }

    public Result<Record> getFullCase(Long caseId) {
        return context.select()
                .from(FpCase.FP_CASE)
                .join(CoreCase.CORE_CASE)
                .on(FpCase.FP_CASE.FP_CASE_ID.eq(CoreCase.CORE_CASE.CORE_CASE_ID))
                .join(CorePersonDocument.CORE_PERSON_DOCUMENT)
                .on(CorePersonDocument.CORE_PERSON_DOCUMENT.CORE_PERSON_DOCUMENT_ID.eq(CoreCase.CORE_CASE.PERSON_DOCUMENT_ID))
                .leftJoin(FpPersonDocument.FP_PERSON_DOCUMENT)
                .on(FpPersonDocument.FP_PERSON_DOCUMENT.FPA_PERSON_DOCUMENT_ID.eq(CorePersonDocument.CORE_PERSON_DOCUMENT.CORE_PERSON_DOCUMENT_ID))
                .where(FpCase.FP_CASE.FP_CASE_ID.eq(caseId))
                .fetch();

    }
}
