/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CorePersonAddressAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record21;
import org.jooq.Row21;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования core_person_address
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CorePersonAddressAuditRecord extends UpdatableRecordImpl<CorePersonAddressAuditRecord> implements Record21<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Boolean, Long, Long, Long, Long, String, LocalDate, LocalDate, LocalDate, String, Long, String, Long, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.id</code>.
     * Идентификатор
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.id</code>.
     * Идентификатор
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.invalid</code>.
     */
    public void setInvalid(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.invalid</code>.
     */
    public Boolean getInvalid() {
        return (Boolean) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.person_id</code>.
     */
    public void setPersonId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.person_id</code>.
     */
    public Long getPersonId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.person_state_id</code>.
     */
    public void setPersonStateId(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.person_state_id</code>.
     */
    public Long getPersonStateId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.address_id</code>.
     */
    public void setAddressId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.address_id</code>.
     */
    public Long getAddressId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.address_type_id</code>.
     */
    public void setAddressTypeId(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.address_type_id</code>.
     */
    public Long getAddressTypeId() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.create_user</code>.
     */
    public void setCreateUser(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.create_user</code>.
     */
    public String getCreateUser() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.from_dt</code>.
     */
    public void setFromDt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.from_dt</code>.
     */
    public LocalDate getFromDt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.to_dt</code>.
     */
    public void setToDt(LocalDate value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.to_dt</code>.
     */
    public LocalDate getToDt() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.invalid_dt</code>.
     */
    public void setInvalidDt(LocalDate value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.invalid_dt</code>.
     */
    public LocalDate getInvalidDt() {
        return (LocalDate) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.user_invalid</code>.
     */
    public void setUserInvalid(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.user_invalid</code>.
     */
    public String getUserInvalid() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.new_address_id</code>.
     */
    public void setNewAddressId(Long value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.new_address_id</code>.
     */
    public Long getNewAddressId() {
        return (Long) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.unstructured</code>.
     */
    public void setUnstructured(String value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.unstructured</code>.
     */
    public String getUnstructured() {
        return (String) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.sono_id</code>.
     */
    public void setSonoId(Long value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.sono_id</code>.
     */
    public Long getSonoId() {
        return (Long) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.person_document_id</code>.
     */
    public void setPersonDocumentId(Long value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.person_document_id</code>.
     */
    public Long getPersonDocumentId() {
        return (Long) get(19);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address_audit.nsi_address_id</code>.
     */
    public void setNsiAddressId(Long value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address_audit.nsi_address_id</code>.
     */
    public Long getNsiAddressId() {
        return (Long) get(20);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record21 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Boolean, Long, Long, Long, Long, String, LocalDate, LocalDate, LocalDate, String, Long, String, Long, Long, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    @Override
    public Row21<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Boolean, Long, Long, Long, Long, String, LocalDate, LocalDate, LocalDate, String, Long, String, Long, Long, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Boolean> field7() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.INVALID;
    }

    @Override
    public Field<Long> field8() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.PERSON_ID;
    }

    @Override
    public Field<Long> field9() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.PERSON_STATE_ID;
    }

    @Override
    public Field<Long> field10() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.ADDRESS_ID;
    }

    @Override
    public Field<Long> field11() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.ADDRESS_TYPE_ID;
    }

    @Override
    public Field<String> field12() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.CREATE_USER;
    }

    @Override
    public Field<LocalDate> field13() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.FROM_DT;
    }

    @Override
    public Field<LocalDate> field14() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.TO_DT;
    }

    @Override
    public Field<LocalDate> field15() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.INVALID_DT;
    }

    @Override
    public Field<String> field16() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.USER_INVALID;
    }

    @Override
    public Field<Long> field17() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.NEW_ADDRESS_ID;
    }

    @Override
    public Field<String> field18() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.UNSTRUCTURED;
    }

    @Override
    public Field<Long> field19() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.SONO_ID;
    }

    @Override
    public Field<Long> field20() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.PERSON_DOCUMENT_ID;
    }

    @Override
    public Field<Long> field21() {
        return CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT.NSI_ADDRESS_ID;
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
    public Boolean component7() {
        return getInvalid();
    }

    @Override
    public Long component8() {
        return getPersonId();
    }

    @Override
    public Long component9() {
        return getPersonStateId();
    }

    @Override
    public Long component10() {
        return getAddressId();
    }

    @Override
    public Long component11() {
        return getAddressTypeId();
    }

    @Override
    public String component12() {
        return getCreateUser();
    }

    @Override
    public LocalDate component13() {
        return getFromDt();
    }

    @Override
    public LocalDate component14() {
        return getToDt();
    }

    @Override
    public LocalDate component15() {
        return getInvalidDt();
    }

    @Override
    public String component16() {
        return getUserInvalid();
    }

    @Override
    public Long component17() {
        return getNewAddressId();
    }

    @Override
    public String component18() {
        return getUnstructured();
    }

    @Override
    public Long component19() {
        return getSonoId();
    }

    @Override
    public Long component20() {
        return getPersonDocumentId();
    }

    @Override
    public Long component21() {
        return getNsiAddressId();
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
    public Boolean value7() {
        return getInvalid();
    }

    @Override
    public Long value8() {
        return getPersonId();
    }

    @Override
    public Long value9() {
        return getPersonStateId();
    }

    @Override
    public Long value10() {
        return getAddressId();
    }

    @Override
    public Long value11() {
        return getAddressTypeId();
    }

    @Override
    public String value12() {
        return getCreateUser();
    }

    @Override
    public LocalDate value13() {
        return getFromDt();
    }

    @Override
    public LocalDate value14() {
        return getToDt();
    }

    @Override
    public LocalDate value15() {
        return getInvalidDt();
    }

    @Override
    public String value16() {
        return getUserInvalid();
    }

    @Override
    public Long value17() {
        return getNewAddressId();
    }

    @Override
    public String value18() {
        return getUnstructured();
    }

    @Override
    public Long value19() {
        return getSonoId();
    }

    @Override
    public Long value20() {
        return getPersonDocumentId();
    }

    @Override
    public Long value21() {
        return getNsiAddressId();
    }

    @Override
    public CorePersonAddressAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value7(Boolean value) {
        setInvalid(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value8(Long value) {
        setPersonId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value9(Long value) {
        setPersonStateId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value10(Long value) {
        setAddressId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value11(Long value) {
        setAddressTypeId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value12(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value13(LocalDate value) {
        setFromDt(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value14(LocalDate value) {
        setToDt(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value15(LocalDate value) {
        setInvalidDt(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value16(String value) {
        setUserInvalid(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value17(Long value) {
        setNewAddressId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value18(String value) {
        setUnstructured(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value19(Long value) {
        setSonoId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value20(Long value) {
        setPersonDocumentId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord value21(Long value) {
        setNsiAddressId(value);
        return this;
    }

    @Override
    public CorePersonAddressAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Boolean value7, Long value8, Long value9, Long value10, Long value11, String value12, LocalDate value13, LocalDate value14, LocalDate value15, String value16, Long value17, String value18, Long value19, Long value20, Long value21) {
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
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CorePersonAddressAuditRecord
     */
    public CorePersonAddressAuditRecord() {
        super(CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT);
    }

    /**
     * Create a detached, initialised CorePersonAddressAuditRecord
     */
    public CorePersonAddressAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Boolean invalid, Long personId, Long personStateId, Long addressId, Long addressTypeId, String createUser, LocalDate fromDt, LocalDate toDt, LocalDate invalidDt, String userInvalid, Long newAddressId, String unstructured, Long sonoId, Long personDocumentId, Long nsiAddressId) {
        super(CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setInvalid(invalid);
        setPersonId(personId);
        setPersonStateId(personStateId);
        setAddressId(addressId);
        setAddressTypeId(addressTypeId);
        setCreateUser(createUser);
        setFromDt(fromDt);
        setToDt(toDt);
        setInvalidDt(invalidDt);
        setUserInvalid(userInvalid);
        setNewAddressId(newAddressId);
        setUnstructured(unstructured);
        setSonoId(sonoId);
        setPersonDocumentId(personDocumentId);
        setNsiAddressId(nsiAddressId);
        resetChangedOnNotNull();
    }
}
