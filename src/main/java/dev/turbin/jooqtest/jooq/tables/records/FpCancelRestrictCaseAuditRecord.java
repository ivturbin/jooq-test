/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCancelRestrictCaseAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_cancel_restrict_case
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCancelRestrictCaseAuditRecord extends UpdatableRecordImpl<FpCancelRestrictCaseAuditRecord> implements Record15<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, LocalDate, LocalDate, LocalDate, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.id</code>.
     * Идентификатор "fp_cancel_restrict_case_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.id</code>.
     * Идентификатор "fp_cancel_restrict_case_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.restrict_id</code>.
     */
    public void setRestrictId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.restrict_id</code>.
     */
    public Long getRestrictId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.type_doc</code>.
     */
    public void setTypeDoc(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.type_doc</code>.
     */
    public String getTypeDoc() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.doc_no</code>.
     */
    public void setDocNo(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.doc_no</code>.
     */
    public String getDocNo() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.issue_dt</code>.
     */
    public void setIssueDt(LocalDate value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.issue_dt</code>.
     */
    public LocalDate getIssueDt() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.end_restrict_from_dt</code>.
     */
    public void setEndRestrictFromDt(LocalDate value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.end_restrict_from_dt</code>.
     */
    public LocalDate getEndRestrictFromDt() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.end_restrict_to_dt</code>.
     */
    public void setEndRestrictToDt(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.end_restrict_to_dt</code>.
     */
    public LocalDate getEndRestrictToDt() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.type_doc_base</code>.
     */
    public void setTypeDocBase(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.type_doc_base</code>.
     */
    public String getTypeDocBase() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.comment_base</code>.
     */
    public void setCommentBase(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.comment_base</code>.
     */
    public String getCommentBase() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case_audit.comment</code>.
     */
    public void setComment(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case_audit.comment</code>.
     */
    public String getComment() {
        return (String) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, LocalDate, LocalDate, LocalDate, String, String, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, LocalDate, LocalDate, LocalDate, String, String, String> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.RESTRICT_ID;
    }

    @Override
    public Field<String> field8() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.TYPE_DOC;
    }

    @Override
    public Field<String> field9() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.DOC_NO;
    }

    @Override
    public Field<LocalDate> field10() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.ISSUE_DT;
    }

    @Override
    public Field<LocalDate> field11() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.END_RESTRICT_FROM_DT;
    }

    @Override
    public Field<LocalDate> field12() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.END_RESTRICT_TO_DT;
    }

    @Override
    public Field<String> field13() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.TYPE_DOC_BASE;
    }

    @Override
    public Field<String> field14() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.COMMENT_BASE;
    }

    @Override
    public Field<String> field15() {
        return FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT.COMMENT;
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
        return getRestrictId();
    }

    @Override
    public String component8() {
        return getTypeDoc();
    }

    @Override
    public String component9() {
        return getDocNo();
    }

    @Override
    public LocalDate component10() {
        return getIssueDt();
    }

    @Override
    public LocalDate component11() {
        return getEndRestrictFromDt();
    }

    @Override
    public LocalDate component12() {
        return getEndRestrictToDt();
    }

    @Override
    public String component13() {
        return getTypeDocBase();
    }

    @Override
    public String component14() {
        return getCommentBase();
    }

    @Override
    public String component15() {
        return getComment();
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
        return getRestrictId();
    }

    @Override
    public String value8() {
        return getTypeDoc();
    }

    @Override
    public String value9() {
        return getDocNo();
    }

    @Override
    public LocalDate value10() {
        return getIssueDt();
    }

    @Override
    public LocalDate value11() {
        return getEndRestrictFromDt();
    }

    @Override
    public LocalDate value12() {
        return getEndRestrictToDt();
    }

    @Override
    public String value13() {
        return getTypeDocBase();
    }

    @Override
    public String value14() {
        return getCommentBase();
    }

    @Override
    public String value15() {
        return getComment();
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value7(Long value) {
        setRestrictId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value8(String value) {
        setTypeDoc(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value9(String value) {
        setDocNo(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value10(LocalDate value) {
        setIssueDt(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value11(LocalDate value) {
        setEndRestrictFromDt(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value12(LocalDate value) {
        setEndRestrictToDt(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value13(String value) {
        setTypeDocBase(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value14(String value) {
        setCommentBase(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord value15(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, String value8, String value9, LocalDate value10, LocalDate value11, LocalDate value12, String value13, String value14, String value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpCancelRestrictCaseAuditRecord
     */
    public FpCancelRestrictCaseAuditRecord() {
        super(FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT);
    }

    /**
     * Create a detached, initialised FpCancelRestrictCaseAuditRecord
     */
    public FpCancelRestrictCaseAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long restrictId, String typeDoc, String docNo, LocalDate issueDt, LocalDate endRestrictFromDt, LocalDate endRestrictToDt, String typeDocBase, String commentBase, String comment) {
        super(FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setRestrictId(restrictId);
        setTypeDoc(typeDoc);
        setDocNo(docNo);
        setIssueDt(issueDt);
        setEndRestrictFromDt(endRestrictFromDt);
        setEndRestrictToDt(endRestrictToDt);
        setTypeDocBase(typeDocBase);
        setCommentBase(commentBase);
        setComment(comment);
        resetChangedOnNotNull();
    }
}
