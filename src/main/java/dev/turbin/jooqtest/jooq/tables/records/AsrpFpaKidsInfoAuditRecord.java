/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.AsrpFpaKidsInfoAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования asrp_fpa_kids_info
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AsrpFpaKidsInfoAuditRecord extends UpdatableRecordImpl<AsrpFpaKidsInfoAuditRecord> implements Record13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, Long, String, LocalDate> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.id</code>.
     * Идентификатор "asrp_fpa_kids_info_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.id</code>.
     * Идентификатор "asrp_fpa_kids_info_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.mainperf_id</code>.
     */
    public void setMainperfId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.mainperf_id</code>.
     */
    public Long getMainperfId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.family</code>.
     */
    public void setFamily(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.family</code>.
     */
    public String getFamily() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.name</code>.
     */
    public void setName(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.name</code>.
     */
    public String getName() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.father_name</code>.
     */
    public void setFatherName(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.father_name</code>.
     */
    public String getFatherName() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.gender</code>.
     */
    public void setGender(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.gender</code>.
     */
    public Long getGender() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.bi_place</code>.
     */
    public void setBiPlace(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.bi_place</code>.
     */
    public String getBiPlace() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_kids_info_audit.birthday</code>.
     */
    public void setBirthday(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_kids_info_audit.birthday</code>.
     */
    public LocalDate getBirthday() {
        return (LocalDate) get(12);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record13 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, Long, String, LocalDate> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, Long, String, LocalDate> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.MAINPERF_ID;
    }

    @Override
    public Field<String> field8() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.FAMILY;
    }

    @Override
    public Field<String> field9() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.NAME;
    }

    @Override
    public Field<String> field10() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.FATHER_NAME;
    }

    @Override
    public Field<Long> field11() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.GENDER;
    }

    @Override
    public Field<String> field12() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.BI_PLACE;
    }

    @Override
    public Field<LocalDate> field13() {
        return AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT.BIRTHDAY;
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
    public Long component7() {
        return getMainperfId();
    }

    @Override
    public String component8() {
        return getFamily();
    }

    @Override
    public String component9() {
        return getName();
    }

    @Override
    public String component10() {
        return getFatherName();
    }

    @Override
    public Long component11() {
        return getGender();
    }

    @Override
    public String component12() {
        return getBiPlace();
    }

    @Override
    public LocalDate component13() {
        return getBirthday();
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
    public Long value7() {
        return getMainperfId();
    }

    @Override
    public String value8() {
        return getFamily();
    }

    @Override
    public String value9() {
        return getName();
    }

    @Override
    public String value10() {
        return getFatherName();
    }

    @Override
    public Long value11() {
        return getGender();
    }

    @Override
    public String value12() {
        return getBiPlace();
    }

    @Override
    public LocalDate value13() {
        return getBirthday();
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value7(Long value) {
        setMainperfId(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value8(String value) {
        setFamily(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value9(String value) {
        setName(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value10(String value) {
        setFatherName(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value11(Long value) {
        setGender(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value12(String value) {
        setBiPlace(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord value13(LocalDate value) {
        setBirthday(value);
        return this;
    }

    @Override
    public AsrpFpaKidsInfoAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, String value8, String value9, String value10, Long value11, String value12, LocalDate value13) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AsrpFpaKidsInfoAuditRecord
     */
    public AsrpFpaKidsInfoAuditRecord() {
        super(AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT);
    }

    /**
     * Create a detached, initialised AsrpFpaKidsInfoAuditRecord
     */
    public AsrpFpaKidsInfoAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long mainperfId, String family, String name, String fatherName, Long gender, String biPlace, LocalDate birthday) {
        super(AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setMainperfId(mainperfId);
        setFamily(family);
        setName(name);
        setFatherName(fatherName);
        setGender(gender);
        setBiPlace(biPlace);
        setBirthday(birthday);
        resetChangedOnNotNull();
    }
}