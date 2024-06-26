/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewFpaChildData;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record19;
import org.jooq.Row19;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewFpaChildDataRecord extends TableRecordImpl<ViewFpaChildDataRecord> implements Record19<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.fpa_child_data_id</code>.
     */
    public void setFpaChildDataId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.fpa_child_data_id</code>.
     */
    public Long getFpaChildDataId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.version</code>.
     * Реализация оптимистической блокировки
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.version</code>.
     * Реализация оптимистической блокировки
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.fpa_case_id</code>.
     */
    public void setFpaCaseId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.fpa_case_id</code>.
     */
    public Long getFpaCaseId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.birth_dt</code>. Дата
     * рождения ребенка
     */
    public void setBirthDt(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.birth_dt</code>. Дата
     * рождения ребенка
     */
    public LocalDate getBirthDt() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.birth_country_id</code>.
     * Страна рождения
     */
    public void setBirthCountryId(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.birth_country_id</code>.
     * Страна рождения
     */
    public Long getBirthCountryId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.first_name</code>. Имя
     * ребенка
     */
    public void setFirstName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.first_name</code>. Имя
     * ребенка
     */
    public String getFirstName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.first_name_en</code>.
     */
    public void setFirstNameEn(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.first_name_en</code>.
     */
    public String getFirstNameEn() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.last_name</code>.
     * Фамилия ребенка
     */
    public void setLastName(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.last_name</code>.
     * Фамилия ребенка
     */
    public String getLastName() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.last_name_en</code>.
     */
    public void setLastNameEn(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.last_name_en</code>.
     */
    public String getLastNameEn() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.middle_name</code>.
     * Отчество ребенка
     */
    public void setMiddleName(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.middle_name</code>.
     * Отчество ребенка
     */
    public String getMiddleName() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.birth_place_cval</code>.
     */
    public void setBirthPlaceCval(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.birth_place_cval</code>.
     */
    public String getBirthPlaceCval() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.sex_id</code>.
     */
    public void setSexId(Long value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.sex_id</code>.
     */
    public Long getSexId() {
        return (Long) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_child_data.middle_name_en</code>.
     */
    public void setMiddleNameEn(String value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_child_data.middle_name_en</code>.
     */
    public String getMiddleNameEn() {
        return (String) get(18);
    }

    // -------------------------------------------------------------------------
    // Record19 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    @Override
    public Row19<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.FPA_CHILD_DATA_ID;
    }

    @Override
    public Field<Integer> field2() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.VERSION;
    }

    @Override
    public Field<Long> field3() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.FPA_CASE_ID;
    }

    @Override
    public Field<LocalDate> field4() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.BIRTH_DT;
    }

    @Override
    public Field<Long> field5() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.BIRTH_COUNTRY_ID;
    }

    @Override
    public Field<String> field6() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.FIRST_NAME;
    }

    @Override
    public Field<String> field7() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.FIRST_NAME_EN;
    }

    @Override
    public Field<String> field8() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.LAST_NAME;
    }

    @Override
    public Field<String> field9() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.LAST_NAME_EN;
    }

    @Override
    public Field<String> field10() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.MIDDLE_NAME;
    }

    @Override
    public Field<String> field11() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.BIRTH_PLACE_CVAL;
    }

    @Override
    public Field<Long> field12() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field13() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field14() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.MODIFY_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field15() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.EXP_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field16() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.EFF_DTTM;
    }

    @Override
    public Field<String> field17() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.ACTION_IND;
    }

    @Override
    public Field<Long> field18() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.SEX_ID;
    }

    @Override
    public Field<String> field19() {
        return ViewFpaChildData.VIEW_FPA_CHILD_DATA.MIDDLE_NAME_EN;
    }

    @Override
    public Long component1() {
        return getFpaChildDataId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public Long component3() {
        return getFpaCaseId();
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
        return getFirstNameEn();
    }

    @Override
    public String component8() {
        return getLastName();
    }

    @Override
    public String component9() {
        return getLastNameEn();
    }

    @Override
    public String component10() {
        return getMiddleName();
    }

    @Override
    public String component11() {
        return getBirthPlaceCval();
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
    public OffsetDateTime component15() {
        return getExpDttm();
    }

    @Override
    public OffsetDateTime component16() {
        return getEffDttm();
    }

    @Override
    public String component17() {
        return getActionInd();
    }

    @Override
    public Long component18() {
        return getSexId();
    }

    @Override
    public String component19() {
        return getMiddleNameEn();
    }

    @Override
    public Long value1() {
        return getFpaChildDataId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public Long value3() {
        return getFpaCaseId();
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
        return getFirstNameEn();
    }

    @Override
    public String value8() {
        return getLastName();
    }

    @Override
    public String value9() {
        return getLastNameEn();
    }

    @Override
    public String value10() {
        return getMiddleName();
    }

    @Override
    public String value11() {
        return getBirthPlaceCval();
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
    public OffsetDateTime value15() {
        return getExpDttm();
    }

    @Override
    public OffsetDateTime value16() {
        return getEffDttm();
    }

    @Override
    public String value17() {
        return getActionInd();
    }

    @Override
    public Long value18() {
        return getSexId();
    }

    @Override
    public String value19() {
        return getMiddleNameEn();
    }

    @Override
    public ViewFpaChildDataRecord value1(Long value) {
        setFpaChildDataId(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value3(Long value) {
        setFpaCaseId(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value4(LocalDate value) {
        setBirthDt(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value5(Long value) {
        setBirthCountryId(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value6(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value7(String value) {
        setFirstNameEn(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value8(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value9(String value) {
        setLastNameEn(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value10(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value11(String value) {
        setBirthPlaceCval(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value12(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value13(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value14(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value15(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value16(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value17(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value18(Long value) {
        setSexId(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord value19(String value) {
        setMiddleNameEn(value);
        return this;
    }

    @Override
    public ViewFpaChildDataRecord values(Long value1, Integer value2, Long value3, LocalDate value4, Long value5, String value6, String value7, String value8, String value9, String value10, String value11, Long value12, OffsetDateTime value13, OffsetDateTime value14, OffsetDateTime value15, OffsetDateTime value16, String value17, Long value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewFpaChildDataRecord
     */
    public ViewFpaChildDataRecord() {
        super(ViewFpaChildData.VIEW_FPA_CHILD_DATA);
    }

    /**
     * Create a detached, initialised ViewFpaChildDataRecord
     */
    public ViewFpaChildDataRecord(Long fpaChildDataId, Integer version, Long fpaCaseId, LocalDate birthDt, Long birthCountryId, String firstName, String firstNameEn, String lastName, String lastNameEn, String middleName, String birthPlaceCval, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, OffsetDateTime expDttm, OffsetDateTime effDttm, String actionInd, Long sexId, String middleNameEn) {
        super(ViewFpaChildData.VIEW_FPA_CHILD_DATA);

        setFpaChildDataId(fpaChildDataId);
        setVersion(version);
        setFpaCaseId(fpaCaseId);
        setBirthDt(birthDt);
        setBirthCountryId(birthCountryId);
        setFirstName(firstName);
        setFirstNameEn(firstNameEn);
        setLastName(lastName);
        setLastNameEn(lastNameEn);
        setMiddleName(middleName);
        setBirthPlaceCval(birthPlaceCval);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setExpDttm(expDttm);
        setEffDttm(effDttm);
        setActionInd(actionInd);
        setSexId(sexId);
        setMiddleNameEn(middleNameEn);
        resetChangedOnNotNull();
    }
}
