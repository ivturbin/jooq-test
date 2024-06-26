/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpPrint;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpPrintRecord extends UpdatableRecordImpl<FpPrintRecord> implements Record6<Long, String, String, Long, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_print.core_case_id</code>.
     */
    public void setCoreCaseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_print.core_case_id</code>.
     */
    public Long getCoreCaseId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.fp_print.print_city</code>.
     */
    public void setPrintCity(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.fp_print.print_city</code>.
     */
    public String getPrintCity() {
        return (String) get(1);
    }

    /**
     * Setter for <code>passport_international.fp_print.print_region</code>.
     */
    public void setPrintRegion(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.fp_print.print_region</code>.
     */
    public String getPrintRegion() {
        return (String) get(2);
    }

    /**
     * Setter for <code>passport_international.fp_print.print_country</code>.
     */
    public void setPrintCountry(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.fp_print.print_country</code>.
     */
    public Long getPrintCountry() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>passport_international.fp_print.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.fp_print.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>passport_international.fp_print.create_user</code>.
     */
    public void setCreateUser(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.fp_print.create_user</code>.
     */
    public String getCreateUser() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Long, OffsetDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, String, String, Long, OffsetDateTime, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpPrint.FP_PRINT.CORE_CASE_ID;
    }

    @Override
    public Field<String> field2() {
        return FpPrint.FP_PRINT.PRINT_CITY;
    }

    @Override
    public Field<String> field3() {
        return FpPrint.FP_PRINT.PRINT_REGION;
    }

    @Override
    public Field<Long> field4() {
        return FpPrint.FP_PRINT.PRINT_COUNTRY;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpPrint.FP_PRINT.CREATE_DTTM;
    }

    @Override
    public Field<String> field6() {
        return FpPrint.FP_PRINT.CREATE_USER;
    }

    @Override
    public Long component1() {
        return getCoreCaseId();
    }

    @Override
    public String component2() {
        return getPrintCity();
    }

    @Override
    public String component3() {
        return getPrintRegion();
    }

    @Override
    public Long component4() {
        return getPrintCountry();
    }

    @Override
    public OffsetDateTime component5() {
        return getCreateDttm();
    }

    @Override
    public String component6() {
        return getCreateUser();
    }

    @Override
    public Long value1() {
        return getCoreCaseId();
    }

    @Override
    public String value2() {
        return getPrintCity();
    }

    @Override
    public String value3() {
        return getPrintRegion();
    }

    @Override
    public Long value4() {
        return getPrintCountry();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreateDttm();
    }

    @Override
    public String value6() {
        return getCreateUser();
    }

    @Override
    public FpPrintRecord value1(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public FpPrintRecord value2(String value) {
        setPrintCity(value);
        return this;
    }

    @Override
    public FpPrintRecord value3(String value) {
        setPrintRegion(value);
        return this;
    }

    @Override
    public FpPrintRecord value4(Long value) {
        setPrintCountry(value);
        return this;
    }

    @Override
    public FpPrintRecord value5(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpPrintRecord value6(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public FpPrintRecord values(Long value1, String value2, String value3, Long value4, OffsetDateTime value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpPrintRecord
     */
    public FpPrintRecord() {
        super(FpPrint.FP_PRINT);
    }

    /**
     * Create a detached, initialised FpPrintRecord
     */
    public FpPrintRecord(Long coreCaseId, String printCity, String printRegion, Long printCountry, OffsetDateTime createDttm, String createUser) {
        super(FpPrint.FP_PRINT);

        setCoreCaseId(coreCaseId);
        setPrintCity(printCity);
        setPrintRegion(printRegion);
        setPrintCountry(printCountry);
        setCreateDttm(createDttm);
        setCreateUser(createUser);
        resetChangedOnNotNull();
    }
}
