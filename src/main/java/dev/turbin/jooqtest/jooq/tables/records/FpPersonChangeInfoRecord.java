/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpPersonChangeInfo;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Сведения об изменении персональных данных
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpPersonChangeInfoRecord extends UpdatableRecordImpl<FpPersonChangeInfoRecord> implements Record12<Long, String, String, String, Long, LocalDate, String, Long, Long, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.person_info_change_id</code>.
     * Идентификатор записи
     */
    public void setPersonInfoChangeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.person_info_change_id</code>.
     * Идентификатор записи
     */
    public Long getPersonInfoChangeId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.first_name</code>. Имя
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.first_name</code>. Имя
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.middle_name</code>.
     * Отчество
     */
    public void setMiddleName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.middle_name</code>.
     * Отчество
     */
    public String getMiddleName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.last_name</code>.
     * Фамилия
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.last_name</code>.
     * Фамилия
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.gender_id</code>. Пол
     */
    public void setGenderId(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.gender_id</code>. Пол
     */
    public Long getGenderId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.change_dt</code>. Дата
     * изменения
     */
    public void setChangeDt(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.change_dt</code>. Дата
     * изменения
     */
    public LocalDate getChangeDt() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.place_change_desc</code>.
     * Место изменения
     */
    public void setPlaceChangeDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.place_change_desc</code>.
     * Место изменения
     */
    public String getPlaceChangeDesc() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.person_id</code>.
     * Идентификатор физического лица
     */
    public void setPersonId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.person_id</code>.
     * Идентификатор физического лица
     */
    public Long getPersonId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.src_id</code>.
     */
    public void setSrcId(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.src_id</code>.
     */
    public Long getSrcId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_person_change_info.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_person_change_info.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(11);
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
    public Row12<Long, String, String, String, Long, LocalDate, String, Long, Long, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, String, String, Long, LocalDate, String, Long, Long, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.PERSON_INFO_CHANGE_ID;
    }

    @Override
    public Field<String> field2() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.MIDDLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.LAST_NAME;
    }

    @Override
    public Field<Long> field5() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.GENDER_ID;
    }

    @Override
    public Field<LocalDate> field6() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.CHANGE_DT;
    }

    @Override
    public Field<String> field7() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.PLACE_CHANGE_DESC;
    }

    @Override
    public Field<Long> field8() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.PERSON_ID;
    }

    @Override
    public Field<Long> field9() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.MODIFY_DTTM;
    }

    @Override
    public Field<String> field12() {
        return FpPersonChangeInfo.FP_PERSON_CHANGE_INFO.ACTION_IND;
    }

    @Override
    public Long component1() {
        return getPersonInfoChangeId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getMiddleName();
    }

    @Override
    public String component4() {
        return getLastName();
    }

    @Override
    public Long component5() {
        return getGenderId();
    }

    @Override
    public LocalDate component6() {
        return getChangeDt();
    }

    @Override
    public String component7() {
        return getPlaceChangeDesc();
    }

    @Override
    public Long component8() {
        return getPersonId();
    }

    @Override
    public Long component9() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component10() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component11() {
        return getModifyDttm();
    }

    @Override
    public String component12() {
        return getActionInd();
    }

    @Override
    public Long value1() {
        return getPersonInfoChangeId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getMiddleName();
    }

    @Override
    public String value4() {
        return getLastName();
    }

    @Override
    public Long value5() {
        return getGenderId();
    }

    @Override
    public LocalDate value6() {
        return getChangeDt();
    }

    @Override
    public String value7() {
        return getPlaceChangeDesc();
    }

    @Override
    public Long value8() {
        return getPersonId();
    }

    @Override
    public Long value9() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value10() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value11() {
        return getModifyDttm();
    }

    @Override
    public String value12() {
        return getActionInd();
    }

    @Override
    public FpPersonChangeInfoRecord value1(Long value) {
        setPersonInfoChangeId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value3(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value5(Long value) {
        setGenderId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value6(LocalDate value) {
        setChangeDt(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value7(String value) {
        setPlaceChangeDesc(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value8(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value9(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value10(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value11(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord value12(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpPersonChangeInfoRecord values(Long value1, String value2, String value3, String value4, Long value5, LocalDate value6, String value7, Long value8, Long value9, OffsetDateTime value10, OffsetDateTime value11, String value12) {
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
     * Create a detached FpPersonChangeInfoRecord
     */
    public FpPersonChangeInfoRecord() {
        super(FpPersonChangeInfo.FP_PERSON_CHANGE_INFO);
    }

    /**
     * Create a detached, initialised FpPersonChangeInfoRecord
     */
    public FpPersonChangeInfoRecord(Long personInfoChangeId, String firstName, String middleName, String lastName, Long genderId, LocalDate changeDt, String placeChangeDesc, Long personId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd) {
        super(FpPersonChangeInfo.FP_PERSON_CHANGE_INFO);

        setPersonInfoChangeId(personInfoChangeId);
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setGenderId(genderId);
        setChangeDt(changeDt);
        setPlaceChangeDesc(placeChangeDesc);
        setPersonId(personId);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        resetChangedOnNotNull();
    }
}
