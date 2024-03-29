/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CorePersonDocumentExBirthRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица для хранения записей актов о рождении
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CorePersonDocumentExBirthRecordRecord extends UpdatableRecordImpl<CorePersonDocumentExBirthRecordRecord> implements Record7<Long, String, String, String, LocalDate, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.core_person_document_id</code>.
     * Личные данные ФЛ
     */
    public void setCorePersonDocumentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.core_person_document_id</code>.
     * Личные данные ФЛ
     */
    public Long getCorePersonDocumentId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.record_number</code>.
     * Номер Записи АГС
     */
    public void setRecordNumber(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.record_number</code>.
     * Номер Записи АГС
     */
    public String getRecordNumber() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.record_doc_number</code>.
     * Старый номер записи (до 2018 года)
     */
    public void setRecordDocNumber(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.record_doc_number</code>.
     * Старый номер записи (до 2018 года)
     */
    public String getRecordDocNumber() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.registry_name</code>.
     * Наименование органа Записи АГС
     */
    public void setRegistryName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.registry_name</code>.
     * Наименование органа Записи АГС
     */
    public String getRegistryName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.record_date</code>.
     * Дата постановки ЗАГС
     */
    public void setRecordDate(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.record_date</code>.
     * Дата постановки ЗАГС
     */
    public LocalDate getRecordDate() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.create_dttm</code>.
     * Дата время вставки записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.create_dttm</code>.
     * Дата время вставки записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_document_ex_birth_record.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_document_ex_birth_record.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(6);
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
    public Row7<Long, String, String, String, LocalDate, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, String, String, String, LocalDate, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.CORE_PERSON_DOCUMENT_ID;
    }

    @Override
    public Field<String> field2() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.RECORD_NUMBER;
    }

    @Override
    public Field<String> field3() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.RECORD_DOC_NUMBER;
    }

    @Override
    public Field<String> field4() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.REGISTRY_NAME;
    }

    @Override
    public Field<LocalDate> field5() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.RECORD_DATE;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD.MODIFY_DTTM;
    }

    @Override
    public Long component1() {
        return getCorePersonDocumentId();
    }

    @Override
    public String component2() {
        return getRecordNumber();
    }

    @Override
    public String component3() {
        return getRecordDocNumber();
    }

    @Override
    public String component4() {
        return getRegistryName();
    }

    @Override
    public LocalDate component5() {
        return getRecordDate();
    }

    @Override
    public OffsetDateTime component6() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component7() {
        return getModifyDttm();
    }

    @Override
    public Long value1() {
        return getCorePersonDocumentId();
    }

    @Override
    public String value2() {
        return getRecordNumber();
    }

    @Override
    public String value3() {
        return getRecordDocNumber();
    }

    @Override
    public String value4() {
        return getRegistryName();
    }

    @Override
    public LocalDate value5() {
        return getRecordDate();
    }

    @Override
    public OffsetDateTime value6() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value7() {
        return getModifyDttm();
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value1(Long value) {
        setCorePersonDocumentId(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value2(String value) {
        setRecordNumber(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value3(String value) {
        setRecordDocNumber(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value4(String value) {
        setRegistryName(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value5(LocalDate value) {
        setRecordDate(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value6(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord value7(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public CorePersonDocumentExBirthRecordRecord values(Long value1, String value2, String value3, String value4, LocalDate value5, OffsetDateTime value6, OffsetDateTime value7) {
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
     * Create a detached CorePersonDocumentExBirthRecordRecord
     */
    public CorePersonDocumentExBirthRecordRecord() {
        super(CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD);
    }

    /**
     * Create a detached, initialised CorePersonDocumentExBirthRecordRecord
     */
    public CorePersonDocumentExBirthRecordRecord(Long corePersonDocumentId, String recordNumber, String recordDocNumber, String registryName, LocalDate recordDate, OffsetDateTime createDttm, OffsetDateTime modifyDttm) {
        super(CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD);

        setCorePersonDocumentId(corePersonDocumentId);
        setRecordNumber(recordNumber);
        setRecordDocNumber(recordDocNumber);
        setRegistryName(registryName);
        setRecordDate(recordDate);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        resetChangedOnNotNull();
    }
}