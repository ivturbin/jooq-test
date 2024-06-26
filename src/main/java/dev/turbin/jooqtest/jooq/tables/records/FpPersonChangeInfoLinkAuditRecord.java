/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpPersonChangeInfoLinkAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_person_change_info_link
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpPersonChangeInfoLinkAuditRecord extends UpdatableRecordImpl<FpPersonChangeInfoLinkAuditRecord> implements Record9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.id</code>.
     * Идентификатор "fp_person_change_info_link_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.id</code>.
     * Идентификатор "fp_person_change_info_link_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.person_info_change_id</code>.
     */
    public void setPersonInfoChangeId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.person_info_change_id</code>.
     */
    public Long getPersonInfoChangeId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.fp_case_issuance_id</code>.
     */
    public void setFpCaseIssuanceId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.fp_case_issuance_id</code>.
     */
    public Long getFpCaseIssuanceId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info_link_audit.deleted</code>.
     */
    public void setDeleted(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info_link_audit.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(8);
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
    public Row9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long, Boolean> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long, Boolean> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.PERSON_INFO_CHANGE_ID;
    }

    @Override
    public Field<Long> field8() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.FP_CASE_ISSUANCE_ID;
    }

    @Override
    public Field<Boolean> field9() {
        return FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT.DELETED;
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
        return getPersonInfoChangeId();
    }

    @Override
    public Long component8() {
        return getFpCaseIssuanceId();
    }

    @Override
    public Boolean component9() {
        return getDeleted();
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
        return getPersonInfoChangeId();
    }

    @Override
    public Long value8() {
        return getFpCaseIssuanceId();
    }

    @Override
    public Boolean value9() {
        return getDeleted();
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value7(Long value) {
        setPersonInfoChangeId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value8(Long value) {
        setFpCaseIssuanceId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord value9(Boolean value) {
        setDeleted(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoLinkAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, Long value8, Boolean value9) {
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
     * Create a detached FpPersonChangeInfoLinkAuditRecord
     */
    public FpPersonChangeInfoLinkAuditRecord() {
        super(FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT);
    }

    /**
     * Create a detached, initialised FpPersonChangeInfoLinkAuditRecord
     */
    public FpPersonChangeInfoLinkAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long personInfoChangeId, Long fpCaseIssuanceId, Boolean deleted) {
        super(FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setPersonInfoChangeId(personInfoChangeId);
        setFpCaseIssuanceId(fpCaseIssuanceId);
        setDeleted(deleted);
        resetChangedOnNotNull();
    }
}
