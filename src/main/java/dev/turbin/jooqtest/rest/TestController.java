package dev.turbin.jooqtest.rest;

import dev.turbin.jooqtest.model.CaseShortDto;
import dev.turbin.jooqtest.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService service;

    @GetMapping("/get-5")
    public List<CaseShortDto> test1() {
        return service.getLastFiveCases();
    }

    @GetMapping("/get-last-case")
    public String test2() {
        return service.getFullCase(service.getLastFiveCases().get(4).getCaseId());
    }
}
