/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpPersonAddress;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Адресс ФЛ в модуле заграна
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpPersonAddressRecord extends UpdatableRecordImpl<FpPersonAddressRecord> implements Record10<Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_person_address.fp_person_address_id</code>.
     */
    public void setFpPersonAddressId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.fp_person_address_id</code>.
     */
    public Long getFpPersonAddressId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.core_person_address_id</code>.
     * Индефиктаор адресса в модуле Рег.учета
     */
    public void setCorePersonAddressId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.core_person_address_id</code>.
     * Индефиктаор адресса в модуле Рег.учета
     */
    public Long getCorePersonAddressId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.address_type_id</code>.
     * Тип адреса
     */
    public void setAddressTypeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.address_type_id</code>.
     * Тип адреса
     */
    public Long getAddressTypeId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.person_document_id</code>.
     * Индефикатор ДУЛ ФЛ
     */
    public void setPersonDocumentId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.person_document_id</code>.
     * Индефикатор ДУЛ ФЛ
     */
    public Long getPersonDocumentId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>passport_international.fp_person_address.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.fp_person_address.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_address.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_address.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(9);
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
    public Row10<Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    @Override
    public Row10<Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row10) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpPersonAddress.FP_PERSON_ADDRESS.FP_PERSON_ADDRESS_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpPersonAddress.FP_PERSON_ADDRESS.CORE_PERSON_ADDRESS_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpPersonAddress.FP_PERSON_ADDRESS.ADDRESS_TYPE_ID;
    }

    @Override
    public Field<Long> field4() {
        return FpPersonAddress.FP_PERSON_ADDRESS.PERSON_DOCUMENT_ID;
    }

    @Override
    public Field<Long> field5() {
        return FpPersonAddress.FP_PERSON_ADDRESS.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpPersonAddress.FP_PERSON_ADDRESS.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return FpPersonAddress.FP_PERSON_ADDRESS.MODIFY_DTTM;
    }

    @Override
    public Field<String> field8() {
        return FpPersonAddress.FP_PERSON_ADDRESS.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return FpPersonAddress.FP_PERSON_ADDRESS.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return FpPersonAddress.FP_PERSON_ADDRESS.EXP_DTTM;
    }

    @Override
    public Long component1() {
        return getFpPersonAddressId();
    }

    @Override
    public Long component2() {
        return getCorePersonAddressId();
    }

    @Override
    public Long component3() {
        return getAddressTypeId();
    }

    @Override
    public Long component4() {
        return getPersonDocumentId();
    }

    @Override
    public Long component5() {
        return getSrcId();
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
    public String component8() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component9() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component10() {
        return getExpDttm();
    }

    @Override
    public Long value1() {
        return getFpPersonAddressId();
    }

    @Override
    public Long value2() {
        return getCorePersonAddressId();
    }

    @Override
    public Long value3() {
        return getAddressTypeId();
    }

    @Override
    public Long value4() {
        return getPersonDocumentId();
    }

    @Override
    public Long value5() {
        return getSrcId();
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
    public String value8() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value9() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value10() {
        return getExpDttm();
    }

    @Override
    public FpPersonAddressRecord value1(Long value) {
        setFpPersonAddressId(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value2(Long value) {
        setCorePersonAddressId(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value3(Long value) {
        setAddressTypeId(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value4(Long value) {
        setPersonDocumentId(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value5(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value6(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value7(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value8(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value9(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord value10(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpPersonAddressRecord values(Long value1, Long value2, Long value3, Long value4, Long value5, OffsetDateTime value6, OffsetDateTime value7, String value8, OffsetDateTime value9, OffsetDateTime value10) {
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
     * Create a detached FpPersonAddressRecord
     */
    public FpPersonAddressRecord() {
        super(FpPersonAddress.FP_PERSON_ADDRESS);
    }

    /**
     * Create a detached, initialised FpPersonAddressRecord
     */
    public FpPersonAddressRecord(Long fpPersonAddressId, Long corePersonAddressId, Long addressTypeId, Long personDocumentId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm) {
        super(FpPersonAddress.FP_PERSON_ADDRESS);

        setFpPersonAddressId(fpPersonAddressId);
        setCorePersonAddressId(corePersonAddressId);
        setAddressTypeId(addressTypeId);
        setPersonDocumentId(personDocumentId);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        resetChangedOnNotNull();
    }
}
