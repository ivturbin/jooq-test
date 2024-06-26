/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq;


import dev.turbin.jooqtest.jooq.routines.CoreCounterIncrementOrCreateFunction;
import dev.turbin.jooqtest.jooq.routines.DeleteCaseData;
import dev.turbin.jooqtest.jooq.routines.GetIncrementedOrCreatedCoreCounterFunction;
import dev.turbin.jooqtest.jooq.routines.NextCoreCaseId;
import dev.turbin.jooqtest.jooq.routines.SelectCoreCounterDependingOnYear;
import dev.turbin.jooqtest.jooq.udt.records.CounterResultRecord;

import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in
 * passport_international.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Routines {

    /**
     * Call
     * <code>passport_international.core_counter_increment_or_create_function</code>
     */
    public static String coreCounterIncrementOrCreateFunction(
          Configuration configuration
        , String pRegionCode
        , String pDepartmentCode
        , String pOperationCode
    ) {
        CoreCounterIncrementOrCreateFunction f = new CoreCounterIncrementOrCreateFunction();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get
     * <code>passport_international.core_counter_increment_or_create_function</code>
     * as a field.
     */
    public static Field<String> coreCounterIncrementOrCreateFunction(
          String pRegionCode
        , String pDepartmentCode
        , String pOperationCode
    ) {
        CoreCounterIncrementOrCreateFunction f = new CoreCounterIncrementOrCreateFunction();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        return f.asField();
    }

    /**
     * Get
     * <code>passport_international.core_counter_increment_or_create_function</code>
     * as a field.
     */
    public static Field<String> coreCounterIncrementOrCreateFunction(
          Field<String> pRegionCode
        , Field<String> pDepartmentCode
        , Field<String> pOperationCode
    ) {
        CoreCounterIncrementOrCreateFunction f = new CoreCounterIncrementOrCreateFunction();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        return f.asField();
    }

    /**
     * Call <code>passport_international.delete_case_data</code>
     */
    public static void deleteCaseData(
          Configuration configuration
        , Long[] caseIds
    ) {
        DeleteCaseData p = new DeleteCaseData();
        p.setCaseIds(caseIds);

        p.execute(configuration);
    }

    /**
     * Call
     * <code>passport_international.get_incremented_or_created_core_counter_function</code>
     */
    public static CounterResultRecord getIncrementedOrCreatedCoreCounterFunction(
          Configuration configuration
        , String pRegionCode
        , String pDepartmentCode
        , String pOperationCode
    ) {
        GetIncrementedOrCreatedCoreCounterFunction f = new GetIncrementedOrCreatedCoreCounterFunction();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get
     * <code>passport_international.get_incremented_or_created_core_counter_function</code>
     * as a field.
     */
    public static Field<CounterResultRecord> getIncrementedOrCreatedCoreCounterFunction(
          String pRegionCode
        , String pDepartmentCode
        , String pOperationCode
    ) {
        GetIncrementedOrCreatedCoreCounterFunction f = new GetIncrementedOrCreatedCoreCounterFunction();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        return f.asField();
    }

    /**
     * Get
     * <code>passport_international.get_incremented_or_created_core_counter_function</code>
     * as a field.
     */
    public static Field<CounterResultRecord> getIncrementedOrCreatedCoreCounterFunction(
          Field<String> pRegionCode
        , Field<String> pDepartmentCode
        , Field<String> pOperationCode
    ) {
        GetIncrementedOrCreatedCoreCounterFunction f = new GetIncrementedOrCreatedCoreCounterFunction();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        return f.asField();
    }

    /**
     * Call <code>passport_international.next_core_case_id</code>
     */
    public static Long nextCoreCaseId(
          Configuration configuration
    ) {
        NextCoreCaseId p = new NextCoreCaseId();

        p.execute(configuration);
        return p.getResult();
    }

    /**
     * Call
     * <code>passport_international.select_core_counter_depending_on_year</code>
     */
    public static CounterResultRecord selectCoreCounterDependingOnYear(
          Configuration configuration
        , String pRegionCode
        , String pDepartmentCode
        , String pOperationCode
    ) {
        SelectCoreCounterDependingOnYear f = new SelectCoreCounterDependingOnYear();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get
     * <code>passport_international.select_core_counter_depending_on_year</code>
     * as a field.
     */
    public static Field<CounterResultRecord> selectCoreCounterDependingOnYear(
          String pRegionCode
        , String pDepartmentCode
        , String pOperationCode
    ) {
        SelectCoreCounterDependingOnYear f = new SelectCoreCounterDependingOnYear();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        return f.asField();
    }

    /**
     * Get
     * <code>passport_international.select_core_counter_depending_on_year</code>
     * as a field.
     */
    public static Field<CounterResultRecord> selectCoreCounterDependingOnYear(
          Field<String> pRegionCode
        , Field<String> pDepartmentCode
        , Field<String> pOperationCode
    ) {
        SelectCoreCounterDependingOnYear f = new SelectCoreCounterDependingOnYear();
        f.setPRegionCode(pRegionCode);
        f.setPDepartmentCode(pDepartmentCode);
        f.setPOperationCode(pOperationCode);

        return f.asField();
    }
}
