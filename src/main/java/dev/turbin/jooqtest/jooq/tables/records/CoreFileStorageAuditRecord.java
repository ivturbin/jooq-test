/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CoreFileStorageAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record17;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования core_file_storage
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreFileStorageAuditRecord extends UpdatableRecordImpl<CoreFileStorageAuditRecord> implements Record17<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, UUID, Long, String, String, LocalDate, Long, String, Long, Long, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.id</code>.
     * Идентификатор
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.id</code>.
     * Идентификатор
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.file_uid</code>.
     */
    public void setFileUid(UUID value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.file_uid</code>.
     */
    public UUID getFileUid() {
        return (UUID) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.file_type_id</code>.
     */
    public void setFileTypeId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.file_type_id</code>.
     */
    public Long getFileTypeId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.doc_no</code>.
     */
    public void setDocNo(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.doc_no</code>.
     */
    public String getDocNo() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.file_desc</code>.
     */
    public void setFileDesc(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.file_desc</code>.
     */
    public String getFileDesc() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.file_dt</code>.
     */
    public void setFileDt(LocalDate value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.file_dt</code>.
     */
    public LocalDate getFileDt() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.core_case_id</code>.
     */
    public void setCoreCaseId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.core_case_id</code>.
     */
    public Long getCoreCaseId() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.create_user</code>.
     */
    public void setCreateUser(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.create_user</code>.
     */
    public String getCreateUser() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.core_document_id</code>.
     */
    public void setCoreDocumentId(Long value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.core_document_id</code>.
     */
    public Long getCoreDocumentId() {
        return (Long) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.migr_source_system_id</code>.
     */
    public void setMigrSourceSystemId(Long value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.migr_source_system_id</code>.
     */
    public Long getMigrSourceSystemId() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.migr_source_id</code>.
     */
    public void setMigrSourceId(Long value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.migr_source_id</code>.
     */
    public Long getMigrSourceId() {
        return (Long) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.core_file_storage_audit.migr_file_link_cval</code>.
     */
    public void setMigrFileLinkCval(String value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_file_storage_audit.migr_file_link_cval</code>.
     */
    public String getMigrFileLinkCval() {
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
    public Row17<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, UUID, Long, String, String, LocalDate, Long, String, Long, Long, Long, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, UUID, Long, String, String, LocalDate, Long, String, Long, Long, Long, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<UUID> field7() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.FILE_UID;
    }

    @Override
    public Field<Long> field8() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.FILE_TYPE_ID;
    }

    @Override
    public Field<String> field9() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.DOC_NO;
    }

    @Override
    public Field<String> field10() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.FILE_DESC;
    }

    @Override
    public Field<LocalDate> field11() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.FILE_DT;
    }

    @Override
    public Field<Long> field12() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.CORE_CASE_ID;
    }

    @Override
    public Field<String> field13() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.CREATE_USER;
    }

    @Override
    public Field<Long> field14() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.CORE_DOCUMENT_ID;
    }

    @Override
    public Field<Long> field15() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.MIGR_SOURCE_SYSTEM_ID;
    }

    @Override
    public Field<Long> field16() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.MIGR_SOURCE_ID;
    }

    @Override
    public Field<String> field17() {
        return CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT.MIGR_FILE_LINK_CVAL;
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
    public UUID component7() {
        return getFileUid();
    }

    @Override
    public Long component8() {
        return getFileTypeId();
    }

    @Override
    public String component9() {
        return getDocNo();
    }

    @Override
    public String component10() {
        return getFileDesc();
    }

    @Override
    public LocalDate component11() {
        return getFileDt();
    }

    @Override
    public Long component12() {
        return getCoreCaseId();
    }

    @Override
    public String component13() {
        return getCreateUser();
    }

    @Override
    public Long component14() {
        return getCoreDocumentId();
    }

    @Override
    public Long component15() {
        return getMigrSourceSystemId();
    }

    @Override
    public Long component16() {
        return getMigrSourceId();
    }

    @Override
    public String component17() {
        return getMigrFileLinkCval();
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
    public UUID value7() {
        return getFileUid();
    }

    @Override
    public Long value8() {
        return getFileTypeId();
    }

    @Override
    public String value9() {
        return getDocNo();
    }

    @Override
    public String value10() {
        return getFileDesc();
    }

    @Override
    public LocalDate value11() {
        return getFileDt();
    }

    @Override
    public Long value12() {
        return getCoreCaseId();
    }

    @Override
    public String value13() {
        return getCreateUser();
    }

    @Override
    public Long value14() {
        return getCoreDocumentId();
    }

    @Override
    public Long value15() {
        return getMigrSourceSystemId();
    }

    @Override
    public Long value16() {
        return getMigrSourceId();
    }

    @Override
    public String value17() {
        return getMigrFileLinkCval();
    }

    @Override
    public CoreFileStorageAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value7(UUID value) {
        setFileUid(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value8(Long value) {
        setFileTypeId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value9(String value) {
        setDocNo(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value10(String value) {
        setFileDesc(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value11(LocalDate value) {
        setFileDt(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value12(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value13(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value14(Long value) {
        setCoreDocumentId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value15(Long value) {
        setMigrSourceSystemId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value16(Long value) {
        setMigrSourceId(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord value17(String value) {
        setMigrFileLinkCval(value);
        return this;
    }

    @Override
    public CoreFileStorageAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, UUID value7, Long value8, String value9, String value10, LocalDate value11, Long value12, String value13, Long value14, Long value15, Long value16, String value17) {
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
     * Create a detached CoreFileStorageAuditRecord
     */
    public CoreFileStorageAuditRecord() {
        super(CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT);
    }

    /**
     * Create a detached, initialised CoreFileStorageAuditRecord
     */
    public CoreFileStorageAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, UUID fileUid, Long fileTypeId, String docNo, String fileDesc, LocalDate fileDt, Long coreCaseId, String createUser, Long coreDocumentId, Long migrSourceSystemId, Long migrSourceId, String migrFileLinkCval) {
        super(CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setFileUid(fileUid);
        setFileTypeId(fileTypeId);
        setDocNo(docNo);
        setFileDesc(fileDesc);
        setFileDt(fileDt);
        setCoreCaseId(coreCaseId);
        setCreateUser(createUser);
        setCoreDocumentId(coreDocumentId);
        setMigrSourceSystemId(migrSourceSystemId);
        setMigrSourceId(migrSourceId);
        setMigrFileLinkCval(migrFileLinkCval);
        resetChangedOnNotNull();
    }
}
