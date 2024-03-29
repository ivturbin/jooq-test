/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpTranslateName;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Запись об транслитерации имени
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpTranslateNameRecord extends UpdatableRecordImpl<FpTranslateNameRecord> implements Record12<Long, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.translate_name_id</code>.
     * Индефикатор записи
     */
    public void setTranslateNameId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.translate_name_id</code>.
     * Индефикатор записи
     */
    public Long getTranslateNameId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.first_name</code>.
     * Обновленное имя
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.first_name</code>.
     * Обновленное имя
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.middle_name</code>.
     * Обновленное отчество
     */
    public void setMiddleName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.middle_name</code>.
     * Обновленное отчество
     */
    public String getMiddleName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.last_name</code>.
     * Обновленая фамилия
     */
    public void setLastName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.last_name</code>.
     * Обновленая фамилия
     */
    public String getLastName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.reason_translate</code>.
     * Причина изменения транслитерации
     */
    public void setReasonTranslate(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.reason_translate</code>.
     * Причина изменения транслитерации
     */
    public String getReasonTranslate() {
        return (String) get(4);
    }

    /**
     * Setter for <code>passport_international.fp_translate_name.src_id</code>.
     */
    public void setSrcId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.fp_translate_name.src_id</code>.
     */
    public Long getSrcId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.eff_dttm</code>.
     */
    public void setEffDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.eff_dttm</code>.
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.exp_dttm</code>.
     */
    public void setExpDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.exp_dttm</code>.
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_translate_name.person_id</code>. Ссылка
     * на идентификатор в ЕСФЛ
     */
    public void setPersonId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_translate_name.person_id</code>. Ссылка
     * на идентификатор в ЕСФЛ
     */
    public Long getPersonId() {
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
    public Row12<Long, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpTranslateName.FP_TRANSLATE_NAME.TRANSLATE_NAME_ID;
    }

    @Override
    public Field<String> field2() {
        return FpTranslateName.FP_TRANSLATE_NAME.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return FpTranslateName.FP_TRANSLATE_NAME.MIDDLE_NAME;
    }

    @Override
    public Field<String> field4() {
        return FpTranslateName.FP_TRANSLATE_NAME.LAST_NAME;
    }

    @Override
    public Field<String> field5() {
        return FpTranslateName.FP_TRANSLATE_NAME.REASON_TRANSLATE;
    }

    @Override
    public Field<Long> field6() {
        return FpTranslateName.FP_TRANSLATE_NAME.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return FpTranslateName.FP_TRANSLATE_NAME.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return FpTranslateName.FP_TRANSLATE_NAME.MODIFY_DTTM;
    }

    @Override
    public Field<String> field9() {
        return FpTranslateName.FP_TRANSLATE_NAME.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return FpTranslateName.FP_TRANSLATE_NAME.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return FpTranslateName.FP_TRANSLATE_NAME.EXP_DTTM;
    }

    @Override
    public Field<Long> field12() {
        return FpTranslateName.FP_TRANSLATE_NAME.PERSON_ID;
    }

    @Override
    public Long component1() {
        return getTranslateNameId();
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
    public String component5() {
        return getReasonTranslate();
    }

    @Override
    public Long component6() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component7() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component8() {
        return getModifyDttm();
    }

    @Override
    public String component9() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component10() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component11() {
        return getExpDttm();
    }

    @Override
    public Long component12() {
        return getPersonId();
    }

    @Override
    public Long value1() {
        return getTranslateNameId();
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
    public String value5() {
        return getReasonTranslate();
    }

    @Override
    public Long value6() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value7() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value8() {
        return getModifyDttm();
    }

    @Override
    public String value9() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value10() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value11() {
        return getExpDttm();
    }

    @Override
    public Long value12() {
        return getPersonId();
    }

    @Override
    public FpTranslateNameRecord value1(Long value) {
        setTranslateNameId(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value3(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value4(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value5(String value) {
        setReasonTranslate(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value6(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value7(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value8(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value9(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value10(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value11(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord value12(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public FpTranslateNameRecord values(Long value1, String value2, String value3, String value4, String value5, Long value6, OffsetDateTime value7, OffsetDateTime value8, String value9, OffsetDateTime value10, OffsetDateTime value11, Long value12) {
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
     * Create a detached FpTranslateNameRecord
     */
    public FpTranslateNameRecord() {
        super(FpTranslateName.FP_TRANSLATE_NAME);
    }

    /**
     * Create a detached, initialised FpTranslateNameRecord
     */
    public FpTranslateNameRecord(Long translateNameId, String firstName, String middleName, String lastName, String reasonTranslate, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, Long personId) {
        super(FpTranslateName.FP_TRANSLATE_NAME);

        setTranslateNameId(translateNameId);
        setFirstName(firstName);
        setMiddleName(middleName);
        setLastName(lastName);
        setReasonTranslate(reasonTranslate);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setPersonId(personId);
        resetChangedOnNotNull();
    }
}
