/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCaseRecallAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_case_recall
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseRecallAuditRecord extends UpdatableRecordImpl<FpCaseRecallAuditRecord> implements Record8<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_case_recall_audit.id</code>.
     * Идентификатор "fp_case_recall_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_recall_audit.id</code>.
     * Идентификатор "fp_case_recall_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.fp_case_issuance_id</code>.
     */
    public void setFpCaseIssuanceId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.fp_case_issuance_id</code>.
     */
    public Long getFpCaseIssuanceId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_recall_audit.recall_reason_id</code>.
     */
    public void setRecallReasonId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_recall_audit.recall_reason_id</code>.
     */
    public Long getRecallReasonId() {
        return (Long) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.FP_CASE_ISSUANCE_ID;
    }

    @Override
    public Field<Long> field8() {
        return FpCaseRecallAudit.FP_CASE_RECALL_AUDIT.RECALL_REASON_ID;
    }

    @Override
    public Long component1() {
        return getId();
    }

    @Override
    public Long component2() {
        return getRecordId();
    }

    @Override
    public Long component3() {
        return getCorrectionLogId();
    }

    @Override
    public String component4() {
        return getUpdateUser();
    }

    @Override
    public OffsetDateTime component5() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component6() {
        return getExpDttm();
    }

    @Override
    public Long component7() {
        return getFpCaseIssuanceId();
    }

    @Override
    public Long component8() {
        return getRecallReasonId();
    }

    @Override
    public Long value1() {
        return getId();
    }

    @Override
    public Long value2() {
        return getRecordId();
    }

    @Override
    public Long value3() {
        return getCorrectionLogId();
    }

    @Override
    public String value4() {
        return getUpdateUser();
    }

    @Override
    public OffsetDateTime value5() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value6() {
        return getExpDttm();
    }

    @Override
    public Long value7() {
        return getFpCaseIssuanceId();
    }

    @Override
    public Long value8() {
        return getRecallReasonId();
    }

    @Override
    public FpCaseRecallAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value7(Long value) {
        setFpCaseIssuanceId(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord value8(Long value) {
        setRecallReasonId(value);
        return this;
    }

    @Override
    public FpCaseRecallAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, Long value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpCaseRecallAuditRecord
     */
    public FpCaseRecallAuditRecord() {
        super(FpCaseRecallAudit.FP_CASE_RECALL_AUDIT);
    }

    /**
     * Create a detached, initialised FpCaseRecallAuditRecord
     */
    public FpCaseRecallAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long fpCaseIssuanceId, Long recallReasonId) {
        super(FpCaseRecallAudit.FP_CASE_RECALL_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setFpCaseIssuanceId(fpCaseIssuanceId);
        setRecallReasonId(recallReasonId);
        resetChangedOnNotNull();
    }
}
