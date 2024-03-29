/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpSignalInformation;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица по учету сигналов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpSignalInformationRecord extends UpdatableRecordImpl<FpSignalInformationRecord> implements Record6<UUID, Long, Long, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_signal_information.correlation_id</code>.
     * Идентификатор сообщения
     */
    public void setCorrelationId(UUID value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_signal_information.correlation_id</code>.
     * Идентификатор сообщения
     */
    public UUID getCorrelationId() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_signal_information.fp_case_id</code>.
     * Идентификатор дела
     */
    public void setFpCaseId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_signal_information.fp_case_id</code>.
     * Идентификатор дела
     */
    public Long getFpCaseId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_signal_information.signal_id</code>.
     * Идентификатор сигнала
     */
    public void setSignalId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_signal_information.signal_id</code>.
     * Идентификатор сигнала
     */
    public Long getSignalId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_signal_information.create_dttm</code>.
     * Время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_signal_information.create_dttm</code>.
     * Время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_signal_information.modify_dttm</code>.
     * Время модификации записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_signal_information.modify_dttm</code>.
     * Время модификации записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_signal_information.operation_code</code>.
     * Код операции API (CREATE/CANCEL)
     */
    public void setOperationCode(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_signal_information.operation_code</code>.
     * Код операции API (CREATE/CANCEL)
     */
    public String getOperationCode() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, Long, Long, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<UUID, Long, Long, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return FpSignalInformation.FP_SIGNAL_INFORMATION.CORRELATION_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpSignalInformation.FP_SIGNAL_INFORMATION.FP_CASE_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpSignalInformation.FP_SIGNAL_INFORMATION.SIGNAL_ID;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return FpSignalInformation.FP_SIGNAL_INFORMATION.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpSignalInformation.FP_SIGNAL_INFORMATION.MODIFY_DTTM;
    }

    @Override
    public Field<String> field6() {
        return FpSignalInformation.FP_SIGNAL_INFORMATION.OPERATION_CODE;
    }

    @Override
    public UUID component1() {
        return getCorrelationId();
    }

    @Override
    public Long component2() {
        return getFpCaseId();
    }

    @Override
    public Long component3() {
        return getSignalId();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component5() {
        return getModifyDttm();
    }

    @Override
    public String component6() {
        return getOperationCode();
    }

    @Override
    public UUID value1() {
        return getCorrelationId();
    }

    @Override
    public Long value2() {
        return getFpCaseId();
    }

    @Override
    public Long value3() {
        return getSignalId();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value5() {
        return getModifyDttm();
    }

    @Override
    public String value6() {
        return getOperationCode();
    }

    @Override
    public FpSignalInformationRecord value1(UUID value) {
        setCorrelationId(value);
        return this;
    }

    @Override
    public FpSignalInformationRecord value2(Long value) {
        setFpCaseId(value);
        return this;
    }

    @Override
    public FpSignalInformationRecord value3(Long value) {
        setSignalId(value);
        return this;
    }

    @Override
    public FpSignalInformationRecord value4(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpSignalInformationRecord value5(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpSignalInformationRecord value6(String value) {
        setOperationCode(value);
        return this;
    }

    @Override
    public FpSignalInformationRecord values(UUID value1, Long value2, Long value3, OffsetDateTime value4, OffsetDateTime value5, String value6) {
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
     * Create a detached FpSignalInformationRecord
     */
    public FpSignalInformationRecord() {
        super(FpSignalInformation.FP_SIGNAL_INFORMATION);
    }

    /**
     * Create a detached, initialised FpSignalInformationRecord
     */
    public FpSignalInformationRecord(UUID correlationId, Long fpCaseId, Long signalId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String operationCode) {
        super(FpSignalInformation.FP_SIGNAL_INFORMATION);

        setCorrelationId(correlationId);
        setFpCaseId(fpCaseId);
        setSignalId(signalId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setOperationCode(operationCode);
        resetChangedOnNotNull();
    }
}