/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CorePersonAddress;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Регистрация физического лица по адресу
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CorePersonAddressRecord extends UpdatableRecordImpl<CorePersonAddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_person_address.core_person_address_id</code>.
     * Идентификатор
     */
    public void setCorePersonAddressId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.core_person_address_id</code>.
     * Идентификатор
     */
    public Long getCorePersonAddressId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.invalid</code>. Данные
     * корректны, если 0
     */
    public void setInvalid(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.invalid</code>. Данные
     * корректны, если 0
     */
    public Boolean getInvalid() {
        return (Boolean) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.person_id</code>.
     * Идентификатор физического лица
     */
    public void setPersonId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.person_id</code>.
     * Идентификатор физического лица
     */
    public Long getPersonId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.person_state_id</code>.
     * Состояние лица
     */
    public void setPersonStateId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.person_state_id</code>.
     * Состояние лица
     */
    public Long getPersonStateId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.address_id</code>. Адрес
     */
    public void setAddressId(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.address_id</code>. Адрес
     */
    public Long getAddressId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.address_type_id</code>.
     * Тип адреса или регистрации по адресу
     */
    public void setAddressTypeId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.address_type_id</code>.
     * Тип адреса или регистрации по адресу
     */
    public Long getAddressTypeId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.create_user</code>.
     * Пользователь, создавший запись
     */
    public void setCreateUser(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.create_user</code>.
     * Пользователь, создавший запись
     */
    public String getCreateUser() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.from_dt</code>. Дата
     * начала регистрации
     */
    public void setFromDt(LocalDate value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.from_dt</code>. Дата
     * начала регистрации
     */
    public LocalDate getFromDt() {
        return (LocalDate) get(7);
    }

    /**
     * Setter for <code>passport_international.core_person_address.to_dt</code>.
     * Дата окончания регистрации
     */
    public void setToDt(LocalDate value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.core_person_address.to_dt</code>.
     * Дата окончания регистрации
     */
    public LocalDate getToDt() {
        return (LocalDate) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.invalid_dt</code>. Дата
     * инвалидации записи
     */
    public void setInvalidDt(LocalDate value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.invalid_dt</code>. Дата
     * инвалидации записи
     */
    public LocalDate getInvalidDt() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.user_invalid</code>.
     * Пользователь, инвалидировавший запись
     */
    public void setUserInvalid(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.user_invalid</code>.
     * Пользователь, инвалидировавший запись
     */
    public String getUserInvalid() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.new_address_id</code>.
     * Указатель на новую корректную регистрацию
     */
    public void setNewAddressId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.new_address_id</code>.
     * Указатель на новую корректную регистрацию
     */
    public Long getNewAddressId() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.unstructured</code>.
     * Неструктурированная часть адреса
     */
    public void setUnstructured(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.unstructured</code>.
     * Неструктурированная часть адреса
     */
    public String getUnstructured() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.sono_id</code>.
     * Налоговый орган (соно)
     */
    public void setSonoId(Long value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.sono_id</code>.
     * Налоговый орган (соно)
     */
    public Long getSonoId() {
        return (Long) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.src_id</code>.
     */
    public void setSrcId(Long value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.src_id</code>.
     */
    public Long getSrcId() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.action_ind</code>.
     * Индикатор операции dml(i-insert,d-delete,u-update)
     */
    public void setActionInd(String value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.action_ind</code>.
     * Индикатор операции dml(i-insert,d-delete,u-update)
     */
    public String getActionInd() {
        return (String) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(19);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.person_document_id</code>.
     * Личные данные ФЛ
     */
    public void setPersonDocumentId(Long value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.person_document_id</code>.
     * Личные данные ФЛ
     */
    public Long getPersonDocumentId() {
        return (Long) get(20);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.nsi_address_id</code>.
     * Идентификатор адреса из НСИ
     */
    public void setNsiAddressId(Long value) {
        set(21, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.nsi_address_id</code>.
     * Идентификатор адреса из НСИ
     */
    public Long getNsiAddressId() {
        return (Long) get(21);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.address_status_id</code>.
     * Статус адреса
     */
    public void setAddressStatusId(Long value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.address_status_id</code>.
     * Статус адреса
     */
    public Long getAddressStatusId() {
        return (Long) get(22);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.system_id</code>.
     * Идентификатор подсистемы, который завел адрес
     */
    public void setSystemId(Long value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.system_id</code>.
     * Идентификатор подсистемы, который завел адрес
     */
    public Long getSystemId() {
        return (Long) get(23);
    }

    /**
     * Setter for
     * <code>passport_international.core_person_address.department_id</code>.
     * Орган, поставивший на учет
     */
    public void setDepartmentId(Long value) {
        set(24, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_person_address.department_id</code>.
     * Орган, поставивший на учет
     */
    public Long getDepartmentId() {
        return (Long) get(24);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CorePersonAddressRecord
     */
    public CorePersonAddressRecord() {
        super(CorePersonAddress.CORE_PERSON_ADDRESS);
    }

    /**
     * Create a detached, initialised CorePersonAddressRecord
     */
    public CorePersonAddressRecord(Long corePersonAddressId, Boolean invalid, Long personId, Long personStateId, Long addressId, Long addressTypeId, String createUser, LocalDate fromDt, LocalDate toDt, LocalDate invalidDt, String userInvalid, Long newAddressId, String unstructured, Long sonoId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, Long personDocumentId, Long nsiAddressId, Long addressStatusId, Long systemId, Long departmentId) {
        super(CorePersonAddress.CORE_PERSON_ADDRESS);

        setCorePersonAddressId(corePersonAddressId);
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
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setPersonDocumentId(personDocumentId);
        setNsiAddressId(nsiAddressId);
        setAddressStatusId(addressStatusId);
        setSystemId(systemId);
        setDepartmentId(departmentId);
        resetChangedOnNotNull();
    }
}