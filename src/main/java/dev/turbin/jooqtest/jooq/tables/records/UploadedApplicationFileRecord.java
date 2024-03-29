/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.UploadedApplicationFile;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Файлы (документы) для загруженных заявлений
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UploadedApplicationFileRecord extends UpdatableRecordImpl<UploadedApplicationFileRecord> implements Record7<Long, Long, Long, UUID, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.uploaded_application_file_id</code>.
     * Идентификатор файла
     */
    public void setUploadedApplicationFileId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.uploaded_application_file_id</code>.
     * Идентификатор файла
     */
    public Long getUploadedApplicationFileId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.application_id</code>.
     * Идентификатор связанного заявления
     */
    public void setApplicationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.application_id</code>.
     * Идентификатор связанного заявления
     */
    public Long getApplicationId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.file_type_id</code>.
     * Тип электронного типа документа (НСИ)
     */
    public void setFileTypeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.file_type_id</code>.
     * Тип электронного типа документа (НСИ)
     */
    public Long getFileTypeId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.file_uid</code>.
     */
    public void setFileUid(UUID value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.file_uid</code>.
     */
    public UUID getFileUid() {
        return (UUID) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.uploaded_application_file.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.uploaded_application_file.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, UUID, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, Long, UUID, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.UPLOADED_APPLICATION_FILE_ID;
    }

    @Override
    public Field<Long> field2() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.APPLICATION_ID;
    }

    @Override
    public Field<Long> field3() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.FILE_TYPE_ID;
    }

    @Override
    public Field<UUID> field4() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.FILE_UID;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.MODIFY_DTTM;
    }

    @Override
    public Field<String> field7() {
        return UploadedApplicationFile.UPLOADED_APPLICATION_FILE.ACTION_IND;
    }

    @Override
    public Long component1() {
        return getUploadedApplicationFileId();
    }

    @Override
    public Long component2() {
        return getApplicationId();
    }

    @Override
    public Long component3() {
        return getFileTypeId();
    }

    @Override
    public UUID component4() {
        return getFileUid();
    }

    @Override
    public OffsetDateTime component5() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component6() {
        return getModifyDttm();
    }

    @Override
    public String component7() {
        return getActionInd();
    }

    @Override
    public Long value1() {
        return getUploadedApplicationFileId();
    }

    @Override
    public Long value2() {
        return getApplicationId();
    }

    @Override
    public Long value3() {
        return getFileTypeId();
    }

    @Override
    public UUID value4() {
        return getFileUid();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value6() {
        return getModifyDttm();
    }

    @Override
    public String value7() {
        return getActionInd();
    }

    @Override
    public UploadedApplicationFileRecord value1(Long value) {
        setUploadedApplicationFileId(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord value2(Long value) {
        setApplicationId(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord value3(Long value) {
        setFileTypeId(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord value4(UUID value) {
        setFileUid(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord value5(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord value6(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord value7(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public UploadedApplicationFileRecord values(Long value1, Long value2, Long value3, UUID value4, OffsetDateTime value5, OffsetDateTime value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UploadedApplicationFileRecord
     */
    public UploadedApplicationFileRecord() {
        super(UploadedApplicationFile.UPLOADED_APPLICATION_FILE);
    }

    /**
     * Create a detached, initialised UploadedApplicationFileRecord
     */
    public UploadedApplicationFileRecord(Long uploadedApplicationFileId, Long applicationId, Long fileTypeId, UUID fileUid, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd) {
        super(UploadedApplicationFile.UPLOADED_APPLICATION_FILE);

        setUploadedApplicationFileId(uploadedApplicationFileId);
        setApplicationId(applicationId);
        setFileTypeId(fileTypeId);
        setFileUid(fileUid);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        resetChangedOnNotNull();
    }
}