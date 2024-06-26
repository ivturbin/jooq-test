/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpDecisionAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_decision
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpDecisionAuditRecord extends UpdatableRecordImpl<FpDecisionAuditRecord> implements Record17<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String, Long, Long, Long, String, String, LocalDate, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_decision_audit.id</code>.
     * Идентификатор "fp_decision_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision_audit.id</code>.
     * Идентификатор "fp_decision_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.record_id</code>. Внешний
     * ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.record_id</code>. Внешний
     * ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.decision_dt</code>.
     */
    public void setDecisionDt(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.decision_dt</code>.
     */
    public LocalDate getDecisionDt() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.create_dt</code>.
     */
    public void setCreateDt(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.create_dt</code>.
     */
    public LocalDate getCreateDt() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.user_login</code>.
     */
    public void setUserLogin(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.user_login</code>.
     */
    public String getUserLogin() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.fp_decision_audit.type_id</code>.
     */
    public void setTypeId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision_audit.type_id</code>.
     */
    public Long getTypeId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.basis_id</code>.
     */
    public void setBasisId(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.basis_id</code>.
     */
    public Long getBasisId() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.check_fsb_id</code>.
     */
    public void setCheckFsbId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.check_fsb_id</code>.
     */
    public Long getCheckFsbId() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.decision_number</code>.
     */
    public void setDecisionNumber(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.decision_number</code>.
     */
    public String getDecisionNumber() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.comments</code>.
     */
    public void setComments(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.comments</code>.
     */
    public String getComments() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.restrict_from_dt</code>.
     */
    public void setRestrictFromDt(LocalDate value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.restrict_from_dt</code>.
     */
    public LocalDate getRestrictFromDt() {
        return (LocalDate) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.restrict_to_dt</code>.
     */
    public void setRestrictToDt(LocalDate value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.restrict_to_dt</code>.
     */
    public LocalDate getRestrictToDt() {
        return (LocalDate) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision_audit.organ_by_decision</code>.
     */
    public void setOrganByDecision(String value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision_audit.organ_by_decision</code>.
     */
    public String getOrganByDecision() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String, Long, Long, Long, String, String, LocalDate, LocalDate, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String, Long, Long, Long, String, String, LocalDate, LocalDate, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpDecisionAudit.FP_DECISION_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpDecisionAudit.FP_DECISION_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpDecisionAudit.FP_DECISION_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpDecisionAudit.FP_DECISION_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpDecisionAudit.FP_DECISION_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpDecisionAudit.FP_DECISION_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<LocalDate> field7() {
        return FpDecisionAudit.FP_DECISION_AUDIT.DECISION_DT;
    }

    @Override
    public Field<LocalDate> field8() {
        return FpDecisionAudit.FP_DECISION_AUDIT.CREATE_DT;
    }

    @Override
    public Field<String> field9() {
        return FpDecisionAudit.FP_DECISION_AUDIT.USER_LOGIN;
    }

    @Override
    public Field<Long> field10() {
        return FpDecisionAudit.FP_DECISION_AUDIT.TYPE_ID;
    }

    @Override
    public Field<Long> field11() {
        return FpDecisionAudit.FP_DECISION_AUDIT.BASIS_ID;
    }

    @Override
    public Field<Long> field12() {
        return FpDecisionAudit.FP_DECISION_AUDIT.CHECK_FSB_ID;
    }

    @Override
    public Field<String> field13() {
        return FpDecisionAudit.FP_DECISION_AUDIT.DECISION_NUMBER;
    }

    @Override
    public Field<String> field14() {
        return FpDecisionAudit.FP_DECISION_AUDIT.COMMENTS;
    }

    @Override
    public Field<LocalDate> field15() {
        return FpDecisionAudit.FP_DECISION_AUDIT.RESTRICT_FROM_DT;
    }

    @Override
    public Field<LocalDate> field16() {
        return FpDecisionAudit.FP_DECISION_AUDIT.RESTRICT_TO_DT;
    }

    @Override
    public Field<String> field17() {
        return FpDecisionAudit.FP_DECISION_AUDIT.ORGAN_BY_DECISION;
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
    public LocalDate component7() {
        return getDecisionDt();
    }

    @Override
    public LocalDate component8() {
        return getCreateDt();
    }

    @Override
    public String component9() {
        return getUserLogin();
    }

    @Override
    public Long component10() {
        return getTypeId();
    }

    @Override
    public Long component11() {
        return getBasisId();
    }

    @Override
    public Long component12() {
        return getCheckFsbId();
    }

    @Override
    public String component13() {
        return getDecisionNumber();
    }

    @Override
    public String component14() {
        return getComments();
    }

    @Override
    public LocalDate component15() {
        return getRestrictFromDt();
    }

    @Override
    public LocalDate component16() {
        return getRestrictToDt();
    }

    @Override
    public String component17() {
        return getOrganByDecision();
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
    public LocalDate value7() {
        return getDecisionDt();
    }

    @Override
    public LocalDate value8() {
        return getCreateDt();
    }

    @Override
    public String value9() {
        return getUserLogin();
    }

    @Override
    public Long value10() {
        return getTypeId();
    }

    @Override
    public Long value11() {
        return getBasisId();
    }

    @Override
    public Long value12() {
        return getCheckFsbId();
    }

    @Override
    public String value13() {
        return getDecisionNumber();
    }

    @Override
    public String value14() {
        return getComments();
    }

    @Override
    public LocalDate value15() {
        return getRestrictFromDt();
    }

    @Override
    public LocalDate value16() {
        return getRestrictToDt();
    }

    @Override
    public String value17() {
        return getOrganByDecision();
    }

    @Override
    public FpDecisionAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value7(LocalDate value) {
        setDecisionDt(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value8(LocalDate value) {
        setCreateDt(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value9(String value) {
        setUserLogin(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value10(Long value) {
        setTypeId(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value11(Long value) {
        setBasisId(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value12(Long value) {
        setCheckFsbId(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value13(String value) {
        setDecisionNumber(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value14(String value) {
        setComments(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value15(LocalDate value) {
        setRestrictFromDt(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value16(LocalDate value) {
        setRestrictToDt(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord value17(String value) {
        setOrganByDecision(value);
        return this;
    }

    @Override
    public FpDecisionAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, LocalDate value7, LocalDate value8, String value9, Long value10, Long value11, Long value12, String value13, String value14, LocalDate value15, LocalDate value16, String value17) {
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
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpDecisionAuditRecord
     */
    public FpDecisionAuditRecord() {
        super(FpDecisionAudit.FP_DECISION_AUDIT);
    }

    /**
     * Create a detached, initialised FpDecisionAuditRecord
     */
    public FpDecisionAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, LocalDate decisionDt, LocalDate createDt, String userLogin, Long typeId, Long basisId, Long checkFsbId, String decisionNumber, String comments, LocalDate restrictFromDt, LocalDate restrictToDt, String organByDecision) {
        super(FpDecisionAudit.FP_DECISION_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setDecisionDt(decisionDt);
        setCreateDt(createDt);
        setUserLogin(userLogin);
        setTypeId(typeId);
        setBasisId(basisId);
        setCheckFsbId(checkFsbId);
        setDecisionNumber(decisionNumber);
        setComments(comments);
        setRestrictFromDt(restrictFromDt);
        setRestrictToDt(restrictToDt);
        setOrganByDecision(organByDecision);
        resetChangedOnNotNull();
    }
}
