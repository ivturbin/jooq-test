/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.routines;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.udt.records.CounterResultRecord;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class GetIncrementedOrCreatedCoreCounterFunction extends AbstractRoutine<CounterResultRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>passport_international.get_incremented_or_created_core_counter_function.RETURN_VALUE</code>.
     */
    public static final Parameter<CounterResultRecord> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", dev.turbin.jooqtest.jooq.udt.CounterResult.COUNTER_RESULT.getDataType(), false, false);

    /**
     * The parameter
     * <code>passport_international.get_incremented_or_created_core_counter_function.p_region_code</code>.
     */
    public static final Parameter<String> P_REGION_CODE = Internal.createParameter("p_region_code", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>passport_international.get_incremented_or_created_core_counter_function.p_department_code</code>.
     */
    public static final Parameter<String> P_DEPARTMENT_CODE = Internal.createParameter("p_department_code", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>passport_international.get_incremented_or_created_core_counter_function.p_operation_code</code>.
     */
    public static final Parameter<String> P_OPERATION_CODE = Internal.createParameter("p_operation_code", SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public GetIncrementedOrCreatedCoreCounterFunction() {
        super("get_incremented_or_created_core_counter_function", PassportInternational.PASSPORT_INTERNATIONAL, dev.turbin.jooqtest.jooq.udt.CounterResult.COUNTER_RESULT.getDataType());

        setReturnParameter(RETURN_VALUE);
        addInParameter(P_REGION_CODE);
        addInParameter(P_DEPARTMENT_CODE);
        addInParameter(P_OPERATION_CODE);
    }

    /**
     * Set the <code>p_region_code</code> parameter IN value to the routine
     */
    public void setPRegionCode(String value) {
        setValue(P_REGION_CODE, value);
    }

    /**
     * Set the <code>p_region_code</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public void setPRegionCode(Field<String> field) {
        setField(P_REGION_CODE, field);
    }

    /**
     * Set the <code>p_department_code</code> parameter IN value to the routine
     */
    public void setPDepartmentCode(String value) {
        setValue(P_DEPARTMENT_CODE, value);
    }

    /**
     * Set the <code>p_department_code</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setPDepartmentCode(Field<String> field) {
        setField(P_DEPARTMENT_CODE, field);
    }

    /**
     * Set the <code>p_operation_code</code> parameter IN value to the routine
     */
    public void setPOperationCode(String value) {
        setValue(P_OPERATION_CODE, value);
    }

    /**
     * Set the <code>p_operation_code</code> parameter to the function to be
     * used with a {@link org.jooq.Select} statement
     */
    public void setPOperationCode(Field<String> field) {
        setField(P_OPERATION_CODE, field);
    }
}
