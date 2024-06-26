/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpDeclineGetApplicationCaseAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_decline_get_application_case
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpDeclineGetApplicationCaseAuditRecord extends UpdatableRecordImpl<FpDeclineGetApplicationCaseAuditRecord> implements Record9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.id</code>.
     * Идентификатор "fp_decline_get_application_case_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.id</code>.
     * Идентификатор "fp_decline_get_application_case_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.reason_id</code>.
     */
    public void setReasonId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.reason_id</code>.
     */
    public Long getReasonId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.signer_user</code>.
     */
    public void setSignerUser(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.signer_user</code>.
     */
    public String getSignerUser() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decline_get_application_case_audit.issued_dt</code>.
     */
    public void setIssuedDt(LocalDate value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decline_get_application_case_audit.issued_dt</code>.
     */
    public LocalDate getIssuedDt() {
        return (LocalDate) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, LocalDate> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, LocalDate> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.REASON_ID;
    }

    @Override
    public Field<String> field8() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.SIGNER_USER;
    }

    @Override
    public Field<LocalDate> field9() {
        return FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT.ISSUED_DT;
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
        return getReasonId();
    }

    @Override
    public String component8() {
        return getSignerUser();
    }

    @Override
    public LocalDate component9() {
        return getIssuedDt();
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
        return getReasonId();
    }

    @Override
    public String value8() {
        return getSignerUser();
    }

    @Override
    public LocalDate value9() {
        return getIssuedDt();
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value7(Long value) {
        setReasonId(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value8(String value) {
        setSignerUser(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord value9(LocalDate value) {
        setIssuedDt(value);
        return this;
    }

    @Override
    public FpDeclineGetApplicationCaseAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, String value8, LocalDate value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpDeclineGetApplicationCaseAuditRecord
     */
    public FpDeclineGetApplicationCaseAuditRecord() {
        super(FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT);
    }

    /**
     * Create a detached, initialised FpDeclineGetApplicationCaseAuditRecord
     */
    public FpDeclineGetApplicationCaseAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long reasonId, String signerUser, LocalDate issuedDt) {
        super(FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setReasonId(reasonId);
        setSignerUser(signerUser);
        setIssuedDt(issuedDt);
        resetChangedOnNotNull();
    }
}
