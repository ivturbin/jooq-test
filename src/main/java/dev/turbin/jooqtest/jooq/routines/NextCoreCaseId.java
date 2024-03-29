/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.routines;


import dev.turbin.jooqtest.jooq.PassportInternational;

import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NextCoreCaseId extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>passport_international.next_core_case_id.result</code>.
     */
    public static final Parameter<Long> RESULT = Internal.createParameter("result", SQLDataType.BIGINT, false, false);

    /**
     * Create a new routine call instance
     */
    public NextCoreCaseId() {
        super("next_core_case_id", PassportInternational.PASSPORT_INTERNATIONAL);

        addOutParameter(RESULT);
    }

    /**
     * Get the <code>result</code> parameter OUT value from the routine
     */
    public Long getResult() {
        return get(RESULT);
    }
}