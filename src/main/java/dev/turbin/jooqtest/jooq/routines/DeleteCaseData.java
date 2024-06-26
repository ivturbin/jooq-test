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
public class DeleteCaseData extends AbstractRoutine<java.lang.Void> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>passport_international.delete_case_data.case_ids</code>.
     */
    public static final Parameter<Long[]> CASE_IDS = Internal.createParameter("case_ids", SQLDataType.BIGINT.array(), false, false);

    /**
     * Create a new routine call instance
     */
    public DeleteCaseData() {
        super("delete_case_data", PassportInternational.PASSPORT_INTERNATIONAL);

        addInParameter(CASE_IDS);
    }

    /**
     * Set the <code>case_ids</code> parameter IN value to the routine
     */
    public void setCaseIds(Long[] value) {
        setValue(CASE_IDS, value);
    }
}
