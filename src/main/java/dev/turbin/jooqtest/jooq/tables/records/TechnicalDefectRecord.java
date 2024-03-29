/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.TechnicalDefect;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Бланки загран паспортов, признанные браком печати
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TechnicalDefectRecord extends UpdatableRecordImpl<TechnicalDefectRecord> implements Record12<Long, Long, String, String, Long, Long, LocalDate, String, OffsetDateTime, OffsetDateTime, Boolean, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.technical_defect.defect_id</code>.
     * Идентификатор записи в таблице
     */
    public void setDefectId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.defect_id</code>.
     * Идентификатор записи в таблице
     */
    public Long getDefectId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.core_case_id</code>.
     * Идентификатор базового дела ГИСМУ
     */
    public void setCoreCaseId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.core_case_id</code>.
     * Идентификатор базового дела ГИСМУ
     */
    public Long getCoreCaseId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.blank_series_code</code>.
     * Серия документа
     */
    public void setBlankSeriesCode(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.blank_series_code</code>.
     * Серия документа
     */
    public String getBlankSeriesCode() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.blank_number_code</code>.
     * Номер документа
     */
    public void setBlankNumberCode(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.blank_number_code</code>.
     * Номер документа
     */
    public String getBlankNumberCode() {
        return (String) get(3);
    }

    /**
     * Setter for <code>passport_international.technical_defect.type_id</code>.
     * Тип документа
     */
    public void setTypeId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.technical_defect.type_id</code>.
     * Тип документа
     */
    public Long getTypeId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.status_id</code>. Статус
     * документа
     */
    public void setStatusId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.status_id</code>. Статус
     * документа
     */
    public Long getStatusId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.invalid_dt</code>. Дата
     * объявления бланка тех. браком
     */
    public void setInvalidDt(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.invalid_dt</code>. Дата
     * объявления бланка тех. браком
     */
    public LocalDate getInvalidDt() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.create_user</code>.
     * Пользователь, создавший запись
     */
    public void setCreateUser(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.create_user</code>.
     * Пользователь, создавший запись
     */
    public String getCreateUser() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.create_dttm</code>. Дата
     * создания записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.create_dttm</code>. Дата
     * создания записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.modify_dttm</code>. Дата
     * последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.modify_dttm</code>. Дата
     * последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.blank_destroyed</code>.
     * Признак "уничтожен"
     */
    public void setBlankDestroyed(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.blank_destroyed</code>.
     * Признак "уничтожен"
     */
    public Boolean getBlankDestroyed() {
        return (Boolean) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.technical_defect.core_document_id</code>.
     * Поле для линкования таблиц"
     */
    public void setCoreDocumentId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.technical_defect.core_document_id</code>.
     * Поле для линкования таблиц"
     */
    public Long getCoreDocumentId() {
        return (Long) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, String, String, Long, Long, LocalDate, String, OffsetDateTime, OffsetDateTime, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, String, String, Long, Long, LocalDate, String, OffsetDateTime, OffsetDateTime, Boolean, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return TechnicalDefect.TECHNICAL_DEFECT.DEFECT_ID;
    }

    @Override
    public Field<Long> field2() {
        return TechnicalDefect.TECHNICAL_DEFECT.CORE_CASE_ID;
    }

    @Override
    public Field<String> field3() {
        return TechnicalDefect.TECHNICAL_DEFECT.BLANK_SERIES_CODE;
    }

    @Override
    public Field<String> field4() {
        return TechnicalDefect.TECHNICAL_DEFECT.BLANK_NUMBER_CODE;
    }

    @Override
    public Field<Long> field5() {
        return TechnicalDefect.TECHNICAL_DEFECT.TYPE_ID;
    }

    @Override
    public Field<Long> field6() {
        return TechnicalDefect.TECHNICAL_DEFECT.STATUS_ID;
    }

    @Override
    public Field<LocalDate> field7() {
        return TechnicalDefect.TECHNICAL_DEFECT.INVALID_DT;
    }

    @Override
    public Field<String> field8() {
        return TechnicalDefect.TECHNICAL_DEFECT.CREATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return TechnicalDefect.TECHNICAL_DEFECT.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return TechnicalDefect.TECHNICAL_DEFECT.MODIFY_DTTM;
    }

    @Override
    public Field<Boolean> field11() {
        return TechnicalDefect.TECHNICAL_DEFECT.BLANK_DESTROYED;
    }

    @Override
    public Field<Long> field12() {
        return TechnicalDefect.TECHNICAL_DEFECT.CORE_DOCUMENT_ID;
    }

    @Override
    public Long component1() {
        return getDefectId();
    }

    @Override
    public Long component2() {
        return getCoreCaseId();
    }

    @Override
    public String component3() {
        return getBlankSeriesCode();
    }

    @Override
    public String component4() {
        return getBlankNumberCode();
    }

    @Override
    public Long component5() {
        return getTypeId();
    }

    @Override
    public Long component6() {
        return getStatusId();
    }

    @Override
    public LocalDate component7() {
        return getInvalidDt();
    }

    @Override
    public String component8() {
        return getCreateUser();
    }

    @Override
    public OffsetDateTime component9() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component10() {
        return getModifyDttm();
    }

    @Override
    public Boolean component11() {
        return getBlankDestroyed();
    }

    @Override
    public Long component12() {
        return getCoreDocumentId();
    }

    @Override
    public Long value1() {
        return getDefectId();
    }

    @Override
    public Long value2() {
        return getCoreCaseId();
    }

    @Override
    public String value3() {
        return getBlankSeriesCode();
    }

    @Override
    public String value4() {
        return getBlankNumberCode();
    }

    @Override
    public Long value5() {
        return getTypeId();
    }

    @Override
    public Long value6() {
        return getStatusId();
    }

    @Override
    public LocalDate value7() {
        return getInvalidDt();
    }

    @Override
    public String value8() {
        return getCreateUser();
    }

    @Override
    public OffsetDateTime value9() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value10() {
        return getModifyDttm();
    }

    @Override
    public Boolean value11() {
        return getBlankDestroyed();
    }

    @Override
    public Long value12() {
        return getCoreDocumentId();
    }

    @Override
    public TechnicalDefectRecord value1(Long value) {
        setDefectId(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value2(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value3(String value) {
        setBlankSeriesCode(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value4(String value) {
        setBlankNumberCode(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value5(Long value) {
        setTypeId(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value6(Long value) {
        setStatusId(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value7(LocalDate value) {
        setInvalidDt(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value8(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value9(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value10(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value11(Boolean value) {
        setBlankDestroyed(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord value12(Long value) {
        setCoreDocumentId(value);
        return this;
    }

    @Override
    public TechnicalDefectRecord values(Long value1, Long value2, String value3, String value4, Long value5, Long value6, LocalDate value7, String value8, OffsetDateTime value9, OffsetDateTime value10, Boolean value11, Long value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TechnicalDefectRecord
     */
    public TechnicalDefectRecord() {
        super(TechnicalDefect.TECHNICAL_DEFECT);
    }

    /**
     * Create a detached, initialised TechnicalDefectRecord
     */
    public TechnicalDefectRecord(Long defectId, Long coreCaseId, String blankSeriesCode, String blankNumberCode, Long typeId, Long statusId, LocalDate invalidDt, String createUser, OffsetDateTime createDttm, OffsetDateTime modifyDttm, Boolean blankDestroyed, Long coreDocumentId) {
        super(TechnicalDefect.TECHNICAL_DEFECT);

        setDefectId(defectId);
        setCoreCaseId(coreCaseId);
        setBlankSeriesCode(blankSeriesCode);
        setBlankNumberCode(blankNumberCode);
        setTypeId(typeId);
        setStatusId(statusId);
        setInvalidDt(invalidDt);
        setCreateUser(createUser);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setBlankDestroyed(blankDestroyed);
        setCoreDocumentId(coreDocumentId);
        resetChangedOnNotNull();
    }
}
