/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.NewBirthPlace;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Сведения о новом месте рождения
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class NewBirthPlaceRecord extends UpdatableRecordImpl<NewBirthPlaceRecord> implements Record6<Long, Long, OffsetDateTime, Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.new_birth_place.new_birth_place_id</code>.
     * Идентификатор записи
     */
    public void setNewBirthPlaceId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.new_birth_place.new_birth_place_id</code>.
     * Идентификатор записи
     */
    public Long getNewBirthPlaceId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.new_birth_place.core_case_id</code>.
     * Идентификатор дела
     */
    public void setCoreCaseId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.new_birth_place.core_case_id</code>.
     * Идентификатор дела
     */
    public Long getCoreCaseId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.new_birth_place.create_dttm</code>. Дата
     * создания записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.new_birth_place.create_dttm</code>. Дата
     * создания записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.new_birth_place.new_birth_country_id</code>.
     * Новая страна рождения
     */
    public void setNewBirthCountryId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.new_birth_place.new_birth_country_id</code>.
     * Новая страна рождения
     */
    public Long getNewBirthCountryId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.new_birth_place.new_birth_place_region_desc</code>.
     * Новый регион рождения 
     */
    public void setNewBirthPlaceRegionDesc(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.new_birth_place.new_birth_place_region_desc</code>.
     * Новый регион рождения 
     */
    public String getNewBirthPlaceRegionDesc() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.new_birth_place.create_user</code>.
     * Пользователь создавший запись
     */
    public void setCreateUser(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.new_birth_place.create_user</code>.
     * Пользователь создавший запись
     */
    public String getCreateUser() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Long, OffsetDateTime, Long, String, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Long, OffsetDateTime, Long, String, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return NewBirthPlace.NEW_BIRTH_PLACE.NEW_BIRTH_PLACE_ID;
    }

    @Override
    public Field<Long> field2() {
        return NewBirthPlace.NEW_BIRTH_PLACE.CORE_CASE_ID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return NewBirthPlace.NEW_BIRTH_PLACE.CREATE_DTTM;
    }

    @Override
    public Field<Long> field4() {
        return NewBirthPlace.NEW_BIRTH_PLACE.NEW_BIRTH_COUNTRY_ID;
    }

    @Override
    public Field<String> field5() {
        return NewBirthPlace.NEW_BIRTH_PLACE.NEW_BIRTH_PLACE_REGION_DESC;
    }

    @Override
    public Field<String> field6() {
        return NewBirthPlace.NEW_BIRTH_PLACE.CREATE_USER;
    }

    @Override
    public Long component1() {
        return getNewBirthPlaceId();
    }

    @Override
    public Long component2() {
        return getCoreCaseId();
    }

    @Override
    public OffsetDateTime component3() {
        return getCreateDttm();
    }

    @Override
    public Long component4() {
        return getNewBirthCountryId();
    }

    @Override
    public String component5() {
        return getNewBirthPlaceRegionDesc();
    }

    @Override
    public String component6() {
        return getCreateUser();
    }

    @Override
    public Long value1() {
        return getNewBirthPlaceId();
    }

    @Override
    public Long value2() {
        return getCoreCaseId();
    }

    @Override
    public OffsetDateTime value3() {
        return getCreateDttm();
    }

    @Override
    public Long value4() {
        return getNewBirthCountryId();
    }

    @Override
    public String value5() {
        return getNewBirthPlaceRegionDesc();
    }

    @Override
    public String value6() {
        return getCreateUser();
    }

    @Override
    public NewBirthPlaceRecord value1(Long value) {
        setNewBirthPlaceId(value);
        return this;
    }

    @Override
    public NewBirthPlaceRecord value2(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public NewBirthPlaceRecord value3(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public NewBirthPlaceRecord value4(Long value) {
        setNewBirthCountryId(value);
        return this;
    }

    @Override
    public NewBirthPlaceRecord value5(String value) {
        setNewBirthPlaceRegionDesc(value);
        return this;
    }

    @Override
    public NewBirthPlaceRecord value6(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public NewBirthPlaceRecord values(Long value1, Long value2, OffsetDateTime value3, Long value4, String value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached NewBirthPlaceRecord
     */
    public NewBirthPlaceRecord() {
        super(NewBirthPlace.NEW_BIRTH_PLACE);
    }

    /**
     * Create a detached, initialised NewBirthPlaceRecord
     */
    public NewBirthPlaceRecord(Long newBirthPlaceId, Long coreCaseId, OffsetDateTime createDttm, Long newBirthCountryId, String newBirthPlaceRegionDesc, String createUser) {
        super(NewBirthPlace.NEW_BIRTH_PLACE);

        setNewBirthPlaceId(newBirthPlaceId);
        setCoreCaseId(coreCaseId);
        setCreateDttm(createDttm);
        setNewBirthCountryId(newBirthCountryId);
        setNewBirthPlaceRegionDesc(newBirthPlaceRegionDesc);
        setCreateUser(createUser);
        resetChangedOnNotNull();
    }
}
