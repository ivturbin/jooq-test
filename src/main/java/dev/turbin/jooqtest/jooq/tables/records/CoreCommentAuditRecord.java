/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CoreCommentAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования core_comment
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreCommentAuditRecord extends UpdatableRecordImpl<CoreCommentAuditRecord> implements Record11<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.core_comment_audit.id</code>.
     * Идентификатор
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.core_comment_audit.id</code>.
     * Идентификатор
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.eff_dttm</code>. Время
     * начала действия версии effective from
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.eff_dttm</code>. Время
     * начала действия версии effective from
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.exp_dttm</code>. Время
     * окончания действия версии expired
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.exp_dttm</code>. Время
     * окончания действия версии expired
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.core_case_id</code>.
     */
    public void setCoreCaseId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.core_case_id</code>.
     */
    public Long getCoreCaseId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.create_user</code>.
     */
    public void setCreateUser(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.create_user</code>.
     */
    public String getCreateUser() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.comment_desc</code>.
     */
    public void setCommentDesc(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.comment_desc</code>.
     */
    public String getCommentDesc() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.supplier_category_id</code>.
     */
    public void setSupplierCategoryId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.supplier_category_id</code>.
     */
    public Long getSupplierCategoryId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_comment_audit.comment_type_id</code>.
     */
    public void setCommentTypeId(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_comment_audit.comment_type_id</code>.
     */
    public Long getCommentTypeId() {
        return (Long) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, Long, Long> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, Long, Long> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.CORE_CASE_ID;
    }

    @Override
    public Field<String> field8() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.CREATE_USER;
    }

    @Override
    public Field<String> field9() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.COMMENT_DESC;
    }

    @Override
    public Field<Long> field10() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.SUPPLIER_CATEGORY_ID;
    }

    @Override
    public Field<Long> field11() {
        return CoreCommentAudit.CORE_COMMENT_AUDIT.COMMENT_TYPE_ID;
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
        return getCoreCaseId();
    }

    @Override
    public String component8() {
        return getCreateUser();
    }

    @Override
    public String component9() {
        return getCommentDesc();
    }

    @Override
    public Long component10() {
        return getSupplierCategoryId();
    }

    @Override
    public Long component11() {
        return getCommentTypeId();
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
        return getCoreCaseId();
    }

    @Override
    public String value8() {
        return getCreateUser();
    }

    @Override
    public String value9() {
        return getCommentDesc();
    }

    @Override
    public Long value10() {
        return getSupplierCategoryId();
    }

    @Override
    public Long value11() {
        return getCommentTypeId();
    }

    @Override
    public CoreCommentAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value7(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value8(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value9(String value) {
        setCommentDesc(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value10(Long value) {
        setSupplierCategoryId(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord value11(Long value) {
        setCommentTypeId(value);
        return this;
    }

    @Override
    public CoreCommentAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, String value8, String value9, Long value10, Long value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreCommentAuditRecord
     */
    public CoreCommentAuditRecord() {
        super(CoreCommentAudit.CORE_COMMENT_AUDIT);
    }

    /**
     * Create a detached, initialised CoreCommentAuditRecord
     */
    public CoreCommentAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long coreCaseId, String createUser, String commentDesc, Long supplierCategoryId, Long commentTypeId) {
        super(CoreCommentAudit.CORE_COMMENT_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setCoreCaseId(coreCaseId);
        setCreateUser(createUser);
        setCommentDesc(commentDesc);
        setSupplierCategoryId(supplierCategoryId);
        setCommentTypeId(commentTypeId);
        resetChangedOnNotNull();
    }
}