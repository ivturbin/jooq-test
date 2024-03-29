/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpChildData;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record20;
import org.jooq.Row20;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Список детей
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpChildDataRecord extends UpdatableRecordImpl<FpChildDataRecord> implements Record20<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_child_data.fp_child_data_id</code>.
     * Идентификатор
     */
    public void setFpChildDataId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data.fp_child_data_id</code>.
     * Идентификатор
     */
    public Long getFpChildDataId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.version</code>.
     * Реализация оптимистической блокировки
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.version</code>.
     * Реализация оптимистической блокировки
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.fp_case_id</code>.
     * Дело о выдаче заграничного паспорта
     */
    public void setFpCaseId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.fp_case_id</code>.
     * Дело о выдаче заграничного паспорта
     */
    public Long getFpCaseId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.birth_dt</code>.
     * Дата рождения ребенка
     */
    public void setBirthDt(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.birth_dt</code>.
     * Дата рождения ребенка
     */
    public LocalDate getBirthDt() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data.birth_country_id</code>.
     * Страна рождения
     */
    public void setBirthCountryId(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data.birth_country_id</code>.
     * Страна рождения
     */
    public Long getBirthCountryId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.first_name</code>.
     * Имя ребенка
     */
    public void setFirstName(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.first_name</code>.
     * Имя ребенка
     */
    public String getFirstName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data.first_name_lat</code>. Имя
     * ребенка на латинице
     */
    public void setFirstNameLat(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data.first_name_lat</code>. Имя
     * ребенка на латинице
     */
    public String getFirstNameLat() {
        return (String) get(6);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.last_name</code>.
     * Фамилия ребенка
     */
    public void setLastName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.last_name</code>.
     * Фамилия ребенка
     */
    public String getLastName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data.last_name_lat</code>. Фамилия
     * ребенка на латинице
     */
    public void setLastNameLat(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data.last_name_lat</code>. Фамилия
     * ребенка на латинице
     */
    public String getLastNameLat() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.middle_name</code>.
     * Отчество ребенка
     */
    public void setMiddleName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.middle_name</code>.
     * Отчество ребенка
     */
    public String getMiddleName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.birth_place</code>.
     * Место рождения
     */
    public void setBirthPlace(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.birth_place</code>.
     * Место рождения
     */
    public String getBirthPlace() {
        return (String) get(10);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(13);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(14);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(16, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(16);
    }

    /**
     * Setter for <code>passport_international.fp_child_data.gender</code>. Пол
     */
    public void setGender(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data.gender</code>. Пол
     */
    public Long getGender() {
        return (Long) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data.middle_name_lat</code>.
     */
    public void setMiddleNameLat(String value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data.middle_name_lat</code>.
     */
    public String getMiddleNameLat() {
        return (String) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data.child_printed</code>. Признак
     * печати информации о ребенке
     */
    public void setChildPrinted(Boolean value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data.child_printed</code>. Признак
     * печати информации о ребенке
     */
    public Boolean getChildPrinted() {
        return (Boolean) get(19);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record20 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, Boolean> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    @Override
    public Row20<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, Boolean> valuesRow() {
        return (Row20) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpChildData.FP_CHILD_DATA.FP_CHILD_DATA_ID;
    }

    @Override
    public Field<Integer> field2() {
        return FpChildData.FP_CHILD_DATA.VERSION;
    }

    @Override
    public Field<Long> field3() {
        return FpChildData.FP_CHILD_DATA.FP_CASE_ID;
    }

    @Override
    public Field<LocalDate> field4() {
        return FpChildData.FP_CHILD_DATA.BIRTH_DT;
    }

    @Override
    public Field<Long> field5() {
        return FpChildData.FP_CHILD_DATA.BIRTH_COUNTRY_ID;
    }

    @Override
    public Field<String> field6() {
        return FpChildData.FP_CHILD_DATA.FIRST_NAME;
    }

    @Override
    public Field<String> field7() {
        return FpChildData.FP_CHILD_DATA.FIRST_NAME_LAT;
    }

    @Override
    public Field<String> field8() {
        return FpChildData.FP_CHILD_DATA.LAST_NAME;
    }

    @Override
    public Field<String> field9() {
        return FpChildData.FP_CHILD_DATA.LAST_NAME_LAT;
    }

    @Override
    public Field<String> field10() {
        return FpChildData.FP_CHILD_DATA.MIDDLE_NAME;
    }

    @Override
    public Field<String> field11() {
        return FpChildData.FP_CHILD_DATA.BIRTH_PLACE;
    }

    @Override
    public Field<Long> field12() {
        return FpChildData.FP_CHILD_DATA.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field13() {
        return FpChildData.FP_CHILD_DATA.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field14() {
        return FpChildData.FP_CHILD_DATA.MODIFY_DTTM;
    }

    @Override
    public Field<String> field15() {
        return FpChildData.FP_CHILD_DATA.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field16() {
        return FpChildData.FP_CHILD_DATA.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field17() {
        return FpChildData.FP_CHILD_DATA.EXP_DTTM;
    }

    @Override
    public Field<Long> field18() {
        return FpChildData.FP_CHILD_DATA.GENDER;
    }

    @Override
    public Field<String> field19() {
        return FpChildData.FP_CHILD_DATA.MIDDLE_NAME_LAT;
    }

    @Override
    public Field<Boolean> field20() {
        return FpChildData.FP_CHILD_DATA.CHILD_PRINTED;
    }

    @Override
    public Long component1() {
        return getFpChildDataId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public Long component3() {
        return getFpCaseId();
    }

    @Override
    public LocalDate component4() {
        return getBirthDt();
    }

    @Override
    public Long component5() {
        return getBirthCountryId();
    }

    @Override
    public String component6() {
        return getFirstName();
    }

    @Override
    public String component7() {
        return getFirstNameLat();
    }

    @Override
    public String component8() {
        return getLastName();
    }

    @Override
    public String component9() {
        return getLastNameLat();
    }

    @Override
    public String component10() {
        return getMiddleName();
    }

    @Override
    public String component11() {
        return getBirthPlace();
    }

    @Override
    public Long component12() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component13() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component14() {
        return getModifyDttm();
    }

    @Override
    public String component15() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component16() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component17() {
        return getExpDttm();
    }

    @Override
    public Long component18() {
        return getGender();
    }

    @Override
    public String component19() {
        return getMiddleNameLat();
    }

    @Override
    public Boolean component20() {
        return getChildPrinted();
    }

    @Override
    public Long value1() {
        return getFpChildDataId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public Long value3() {
        return getFpCaseId();
    }

    @Override
    public LocalDate value4() {
        return getBirthDt();
    }

    @Override
    public Long value5() {
        return getBirthCountryId();
    }

    @Override
    public String value6() {
        return getFirstName();
    }

    @Override
    public String value7() {
        return getFirstNameLat();
    }

    @Override
    public String value8() {
        return getLastName();
    }

    @Override
    public String value9() {
        return getLastNameLat();
    }

    @Override
    public String value10() {
        return getMiddleName();
    }

    @Override
    public String value11() {
        return getBirthPlace();
    }

    @Override
    public Long value12() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value13() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value14() {
        return getModifyDttm();
    }

    @Override
    public String value15() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value16() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value17() {
        return getExpDttm();
    }

    @Override
    public Long value18() {
        return getGender();
    }

    @Override
    public String value19() {
        return getMiddleNameLat();
    }

    @Override
    public Boolean value20() {
        return getChildPrinted();
    }

    @Override
    public FpChildDataRecord value1(Long value) {
        setFpChildDataId(value);
        return this;
    }

    @Override
    public FpChildDataRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public FpChildDataRecord value3(Long value) {
        setFpCaseId(value);
        return this;
    }

    @Override
    public FpChildDataRecord value4(LocalDate value) {
        setBirthDt(value);
        return this;
    }

    @Override
    public FpChildDataRecord value5(Long value) {
        setBirthCountryId(value);
        return this;
    }

    @Override
    public FpChildDataRecord value6(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public FpChildDataRecord value7(String value) {
        setFirstNameLat(value);
        return this;
    }

    @Override
    public FpChildDataRecord value8(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public FpChildDataRecord value9(String value) {
        setLastNameLat(value);
        return this;
    }

    @Override
    public FpChildDataRecord value10(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public FpChildDataRecord value11(String value) {
        setBirthPlace(value);
        return this;
    }

    @Override
    public FpChildDataRecord value12(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpChildDataRecord value13(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpChildDataRecord value14(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpChildDataRecord value15(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpChildDataRecord value16(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpChildDataRecord value17(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpChildDataRecord value18(Long value) {
        setGender(value);
        return this;
    }

    @Override
    public FpChildDataRecord value19(String value) {
        setMiddleNameLat(value);
        return this;
    }

    @Override
    public FpChildDataRecord value20(Boolean value) {
        setChildPrinted(value);
        return this;
    }

    @Override
    public FpChildDataRecord values(Long value1, Integer value2, Long value3, LocalDate value4, Long value5, String value6, String value7, String value8, String value9, String value10, String value11, Long value12, OffsetDateTime value13, OffsetDateTime value14, String value15, OffsetDateTime value16, OffsetDateTime value17, Long value18, String value19, Boolean value20) {
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
        value18(value18);
        value19(value19);
        value20(value20);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpChildDataRecord
     */
    public FpChildDataRecord() {
        super(FpChildData.FP_CHILD_DATA);
    }

    /**
     * Create a detached, initialised FpChildDataRecord
     */
    public FpChildDataRecord(Long fpChildDataId, Integer version, Long fpCaseId, LocalDate birthDt, Long birthCountryId, String firstName, String firstNameLat, String lastName, String lastNameLat, String middleName, String birthPlace, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, Long gender, String middleNameLat, Boolean childPrinted) {
        super(FpChildData.FP_CHILD_DATA);

        setFpChildDataId(fpChildDataId);
        setVersion(version);
        setFpCaseId(fpCaseId);
        setBirthDt(birthDt);
        setBirthCountryId(birthCountryId);
        setFirstName(firstName);
        setFirstNameLat(firstNameLat);
        setLastName(lastName);
        setLastNameLat(lastNameLat);
        setMiddleName(middleName);
        setBirthPlace(birthPlace);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setGender(gender);
        setMiddleNameLat(middleNameLat);
        setChildPrinted(childPrinted);
        resetChangedOnNotNull();
    }
}