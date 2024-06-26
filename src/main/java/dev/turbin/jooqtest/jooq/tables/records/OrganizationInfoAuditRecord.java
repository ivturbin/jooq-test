/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.OrganizationInfoAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record13;
import org.jooq.Row13;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования organization_info
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationInfoAuditRecord extends UpdatableRecordImpl<OrganizationInfoAuditRecord> implements Record13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, String, Boolean, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.id</code>.
     * Идентификатор "organization_info_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.id</code>.
     * Идентификатор "organization_info_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.organization_id</code>.
     */
    public void setOrganizationId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.organization_id</code>.
     */
    public Long getOrganizationId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.inn</code>.
     */
    public void setInn(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.inn</code>.
     */
    public String getInn() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.ogrn</code>.
     */
    public void setOgrn(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.ogrn</code>.
     */
    public String getOgrn() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.short_name</code>.
     */
    public void setShortName(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.short_name</code>.
     */
    public String getShortName() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.full_name</code>.
     */
    public void setFullName(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.full_name</code>.
     */
    public String getFullName() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.registered</code>.
     */
    public void setRegistered(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.registered</code>.
     */
    public Boolean getRegistered() {
        return (Boolean) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.organization_info_audit.category_id</code>.
     */
    public void setCategoryId(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.organization_info_audit.category_id</code>.
     */
    public Long getCategoryId() {
        return (Long) get(12);
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
    public Row13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, String, Boolean, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    @Override
    public Row13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, String, Boolean, Long> valuesRow() {
        return (Row13) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.ORGANIZATION_ID;
    }

    @Override
    public Field<String> field8() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.INN;
    }

    @Override
    public Field<String> field9() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.OGRN;
    }

    @Override
    public Field<String> field10() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.SHORT_NAME;
    }

    @Override
    public Field<String> field11() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.FULL_NAME;
    }

    @Override
    public Field<Boolean> field12() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.REGISTERED;
    }

    @Override
    public Field<Long> field13() {
        return OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT.CATEGORY_ID;
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
        return getOrganizationId();
    }

    @Override
    public String component8() {
        return getInn();
    }

    @Override
    public String component9() {
        return getOgrn();
    }

    @Override
    public String component10() {
        return getShortName();
    }

    @Override
    public String component11() {
        return getFullName();
    }

    @Override
    public Boolean component12() {
        return getRegistered();
    }

    @Override
    public Long component13() {
        return getCategoryId();
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
        return getOrganizationId();
    }

    @Override
    public String value8() {
        return getInn();
    }

    @Override
    public String value9() {
        return getOgrn();
    }

    @Override
    public String value10() {
        return getShortName();
    }

    @Override
    public String value11() {
        return getFullName();
    }

    @Override
    public Boolean value12() {
        return getRegistered();
    }

    @Override
    public Long value13() {
        return getCategoryId();
    }

    @Override
    public OrganizationInfoAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value7(Long value) {
        setOrganizationId(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value8(String value) {
        setInn(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value9(String value) {
        setOgrn(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value10(String value) {
        setShortName(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value11(String value) {
        setFullName(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value12(Boolean value) {
        setRegistered(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord value13(Long value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public OrganizationInfoAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, String value8, String value9, String value10, String value11, Boolean value12, Long value13) {
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
     * Create a detached OrganizationInfoAuditRecord
     */
    public OrganizationInfoAuditRecord() {
        super(OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT);
    }

    /**
     * Create a detached, initialised OrganizationInfoAuditRecord
     */
    public OrganizationInfoAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long organizationId, String inn, String ogrn, String shortName, String fullName, Boolean registered, Long categoryId) {
        super(OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setOrganizationId(organizationId);
        setInn(inn);
        setOgrn(ogrn);
        setShortName(shortName);
        setFullName(fullName);
        setRegistered(registered);
        setCategoryId(categoryId);
        resetChangedOnNotNull();
    }
}
