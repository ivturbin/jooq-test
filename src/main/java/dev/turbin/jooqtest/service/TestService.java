package dev.turbin.jooqtest.service;

import dev.turbin.jooqtest.dao.CaseDao;
import dev.turbin.jooqtest.model.CaseShortDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TestService {

    private final CaseDao caseDao;

    public List<CaseShortDto> getLastFiveCases() {
        return caseDao.getLastFiveCases();
    }

    public String getFullCase(Long caseId) {
        return caseDao.getFullCase(caseId).get(0).formatJSON();
    }
}

