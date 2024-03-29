/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpChildDataAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_child_data
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpChildDataAuditRecord extends UpdatableRecordImpl<FpChildDataAuditRecord> implements Record18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Integer, Long, LocalDate, Long, String, String, String, String, String, String, String, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_child_data_audit.id</code>.
     * Идентификатор "fp_child_data_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_child_data_audit.id</code>.
     * Идентификатор "fp_child_data_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.version</code>.
     */
    public void setVersion(Integer value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.fp_case_id</code>.
     */
    public void setFpCaseId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.fp_case_id</code>.
     */
    public Long getFpCaseId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.birth_dt</code>.
     */
    public void setBirthDt(LocalDate value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.birth_dt</code>.
     */
    public LocalDate getBirthDt() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.birth_country_id</code>.
     */
    public void setBirthCountryId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.birth_country_id</code>.
     */
    public Long getBirthCountryId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.first_name</code>.
     */
    public void setFirstName(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.first_name</code>.
     */
    public String getFirstName() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.first_name_lat</code>.
     */
    public void setFirstNameLat(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.first_name_lat</code>.
     */
    public String getFirstNameLat() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.last_name</code>.
     */
    public void setLastName(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.last_name</code>.
     */
    public String getLastName() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.last_name_lat</code>.
     */
    public void setLastNameLat(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.last_name_lat</code>.
     */
    public String getLastNameLat() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.middle_name</code>.
     */
    public void setMiddleName(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.middle_name</code>.
     */
    public String getMiddleName() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.middle_name_lat</code>.
     */
    public void setMiddleNameLat(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.middle_name_lat</code>.
     */
    public String getMiddleNameLat() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.birth_place</code>.
     */
    public void setBirthPlace(String value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.birth_place</code>.
     */
    public String getBirthPlace() {
        return (String) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.fp_child_data_audit.gender</code>.
     */
    public void setGender(Long value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_child_data_audit.gender</code>.
     */
    public Long getGender() {
        return (Long) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Integer, Long, LocalDate, Long, String, String, String, String, String, String, String, Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Integer, Long, LocalDate, Long, String, String, String, String, String, String, String, Long> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Integer> field7() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.VERSION;
    }

    @Override
    public Field<Long> field8() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.FP_CASE_ID;
    }

    @Override
    public Field<LocalDate> field9() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.BIRTH_DT;
    }

    @Override
    public Field<Long> field10() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.BIRTH_COUNTRY_ID;
    }

    @Override
    public Field<String> field11() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.FIRST_NAME;
    }

    @Override
    public Field<String> field12() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.FIRST_NAME_LAT;
    }

    @Override
    public Field<String> field13() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.LAST_NAME;
    }

    @Override
    public Field<String> field14() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.LAST_NAME_LAT;
    }

    @Override
    public Field<String> field15() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.MIDDLE_NAME;
    }

    @Override
    public Field<String> field16() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.MIDDLE_NAME_LAT;
    }

    @Override
    public Field<String> field17() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.BIRTH_PLACE;
    }

    @Override
    public Field<Long> field18() {
        return FpChildDataAudit.FP_CHILD_DATA_AUDIT.GENDER;
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
    public Integer component7() {
        return getVersion();
    }

    @Override
    public Long component8() {
        return getFpCaseId();
    }

    @Override
    public LocalDate component9() {
        return getBirthDt();
    }

    @Override
    public Long component10() {
        return getBirthCountryId();
    }

    @Override
    public String component11() {
        return getFirstName();
    }

    @Override
    public String component12() {
        return getFirstNameLat();
    }

    @Override
    public String component13() {
        return getLastName();
    }

    @Override
    public String component14() {
        return getLastNameLat();
    }

    @Override
    public String component15() {
        return getMiddleName();
    }

    @Override
    public String component16() {
        return getMiddleNameLat();
    }

    @Override
    public String component17() {
        return getBirthPlace();
    }

    @Override
    public Long component18() {
        return getGender();
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
    public Integer value7() {
        return getVersion();
    }

    @Override
    public Long value8() {
        return getFpCaseId();
    }

    @Override
    public LocalDate value9() {
        return getBirthDt();
    }

    @Override
    public Long value10() {
        return getBirthCountryId();
    }

    @Override
    public String value11() {
        return getFirstName();
    }

    @Override
    public String value12() {
        return getFirstNameLat();
    }

    @Override
    public String value13() {
        return getLastName();
    }

    @Override
    public String value14() {
        return getLastNameLat();
    }

    @Override
    public String value15() {
        return getMiddleName();
    }

    @Override
    public String value16() {
        return getMiddleNameLat();
    }

    @Override
    public String value17() {
        return getBirthPlace();
    }

    @Override
    public Long value18() {
        return getGender();
    }

    @Override
    public FpChildDataAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value7(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value8(Long value) {
        setFpCaseId(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value9(LocalDate value) {
        setBirthDt(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value10(Long value) {
        setBirthCountryId(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value11(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value12(String value) {
        setFirstNameLat(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value13(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value14(String value) {
        setLastNameLat(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value15(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value16(String value) {
        setMiddleNameLat(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value17(String value) {
        setBirthPlace(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord value18(Long value) {
        setGender(value);
        return this;
    }

    @Override
    public FpChildDataAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Integer value7, Long value8, LocalDate value9, Long value10, String value11, String value12, String value13, String value14, String value15, String value16, String value17, Long value18) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpChildDataAuditRecord
     */
    public FpChildDataAuditRecord() {
        super(FpChildDataAudit.FP_CHILD_DATA_AUDIT);
    }

    /**
     * Create a detached, initialised FpChildDataAuditRecord
     */
    public FpChildDataAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Integer version, Long fpCaseId, LocalDate birthDt, Long birthCountryId, String firstName, String firstNameLat, String lastName, String lastNameLat, String middleName, String middleNameLat, String birthPlace, Long gender) {
        super(FpChildDataAudit.FP_CHILD_DATA_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setVersion(version);
        setFpCaseId(fpCaseId);
        setBirthDt(birthDt);
        setBirthCountryId(birthCountryId);
        setFirstName(firstName);
        setFirstNameLat(firstNameLat);
        setLastName(lastName);
        setLastNameLat(lastNameLat);
        setMiddleName(middleName);
        setMiddleNameLat(middleNameLat);
        setBirthPlace(birthPlace);
        setGender(gender);
        resetChangedOnNotNull();
    }
}