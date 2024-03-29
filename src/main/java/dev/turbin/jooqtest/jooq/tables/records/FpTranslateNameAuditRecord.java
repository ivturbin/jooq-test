/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpTranslateNameAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_translate_name
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpTranslateNameAuditRecord extends UpdatableRecordImpl<FpTranslateNameAuditRecord> implements Record10<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.id</code>.
     * Идентификатор "fp_translate_name_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.id</code>.
     * Идентификатор "fp_translate_name_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.first_name</code>.
     */
    public void setFirstName(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.middle_name</code>.
     */
    public void setMiddleName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.middle_name</code>.
     */
    public String getMiddleName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.last_name</code>.
     */
    public void setLastName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.last_name</code>.
     */
    public String getLastName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name_audit.reason_translate</code>.
     */
    public void setReasonTranslate(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name_audit.reason_translate</code>.
     */
    public String getReasonTranslate() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<String> field7() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.FIRST_NAME;
    }

    @Override
    public Field<String> field8() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.MIDDLE_NAME;
    }

    @Override
    public Field<String> field9() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.LAST_NAME;
    }

    @Override
    public Field<String> field10() {
        return FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT.REASON_TRANSLATE;
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
    public String component7() {
        return getFirstName();
    }

    @Override
    public String component8() {
        return getMiddleName();
    }

    @Override
    public String component9() {
        return getLastName();
    }

    @Override
    public String component10() {
        return getReasonTranslate();
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
    public String value7() {
        return getFirstName();
    }

    @Override
    public String value8() {
        return getMiddleName();
    }

    @Override
    public String value9() {
        return getLastName();
    }

    @Override
    public String value10() {
        return getReasonTranslate();
    }

    @Override
    public FpTranslateNameAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value7(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value8(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value9(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord value10(String value) {
        setReasonTranslate(value);
        return this;
    }

    @Override
    public FpTranslateNameAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, String value7, String value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpTranslateNameAuditRecord
     */
    public FpTranslateNameAuditRecord() {
        super(FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT);
    }

    /**
     * Create a detached, initialised FpTranslateNameAuditRecord
     */
    public FpTranslateNameAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, String firstName, String middleName, String lastName, String reasonTranslate) {
        super(FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setReasonTranslate(reasonTranslate);
        resetChangedOnNotNull();
    }
}
