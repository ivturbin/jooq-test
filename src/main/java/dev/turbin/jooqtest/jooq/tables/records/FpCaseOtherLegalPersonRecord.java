/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCaseOtherLegalPerson;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * Сведения о другом законном представителе, имеющем право на получение паспорта
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseOtherLegalPersonRecord extends TableRecordImpl<FpCaseOtherLegalPersonRecord> implements Record9<Long, String, String, String, LocalDate, Long, String, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.fp_case_id</code>.
     * Id базового дела
     */
    public void setFpCaseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.fp_case_id</code>.
     * Id базового дела
     */
    public Long getFpCaseId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.first_name</code>.
     * Имя
     */
    public void setFirstName(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.first_name</code>.
     * Имя
     */
    public String getFirstName() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.last_name</code>.
     * Фамилия
     */
    public void setLastName(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.last_name</code>.
     * Фамилия
     */
    public String getLastName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.middle_name</code>.
     * Отчество
     */
    public void setMiddleName(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.middle_name</code>.
     * Отчество
     */
    public String getMiddleName() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.birthday_dt</code>.
     * Дата рождения
     */
    public void setBirthdayDt(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.birthday_dt</code>.
     * Дата рождения
     */
    public LocalDate getBirthdayDt() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.gender_id</code>.
     * Пол
     */
    public void setGenderId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.gender_id</code>.
     * Пол
     */
    public Long getGenderId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.birth_place_desc</code>.
     * Место рождения
     */
    public void setBirthPlaceDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.birth_place_desc</code>.
     * Место рождения
     */
    public String getBirthPlaceDesc() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.create_dttm</code>.
     * Дата создания записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.create_dttm</code>.
     * Дата создания записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_other_legal_person.create_user</code>.
     * Пользователь создавший запись
     */
    public void setCreateUser(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_other_legal_person.create_user</code>.
     * Пользователь создавший запись
     */
    public String getCreateUser() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, String, LocalDate, Long, String, OffsetDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, String, LocalDate, Long, String, OffsetDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.FP_CASE_ID;
    }

    @Override
    public Field<String> field2() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.FIRST_NAME;
    }

    @Override
    public Field<String> field3() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.LAST_NAME;
    }

    @Override
    public Field<String> field4() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.MIDDLE_NAME;
    }

    @Override
    public Field<LocalDate> field5() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.BIRTHDAY_DT;
    }

    @Override
    public Field<Long> field6() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.GENDER_ID;
    }

    @Override
    public Field<String> field7() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.BIRTH_PLACE_DESC;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.CREATE_DTTM;
    }

    @Override
    public Field<String> field9() {
        return FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON.CREATE_USER;
    }

    @Override
    public Long component1() {
        return getFpCaseId();
    }

    @Override
    public String component2() {
        return getFirstName();
    }

    @Override
    public String component3() {
        return getLastName();
    }

    @Override
    public String component4() {
        return getMiddleName();
    }

    @Override
    public LocalDate component5() {
        return getBirthdayDt();
    }

    @Override
    public Long component6() {
        return getGenderId();
    }

    @Override
    public String component7() {
        return getBirthPlaceDesc();
    }

    @Override
    public OffsetDateTime component8() {
        return getCreateDttm();
    }

    @Override
    public String component9() {
        return getCreateUser();
    }

    @Override
    public Long value1() {
        return getFpCaseId();
    }

    @Override
    public String value2() {
        return getFirstName();
    }

    @Override
    public String value3() {
        return getLastName();
    }

    @Override
    public String value4() {
        return getMiddleName();
    }

    @Override
    public LocalDate value5() {
        return getBirthdayDt();
    }

    @Override
    public Long value6() {
        return getGenderId();
    }

    @Override
    public String value7() {
        return getBirthPlaceDesc();
    }

    @Override
    public OffsetDateTime value8() {
        return getCreateDttm();
    }

    @Override
    public String value9() {
        return getCreateUser();
    }

    @Override
    public FpCaseOtherLegalPersonRecord value1(Long value) {
        setFpCaseId(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value2(String value) {
        setFirstName(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value3(String value) {
        setLastName(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value4(String value) {
        setMiddleName(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value5(LocalDate value) {
        setBirthdayDt(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value6(Long value) {
        setGenderId(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value7(String value) {
        setBirthPlaceDesc(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value8(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord value9(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public FpCaseOtherLegalPersonRecord values(Long value1, String value2, String value3, String value4, LocalDate value5, Long value6, String value7, OffsetDateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpCaseOtherLegalPersonRecord
     */
    public FpCaseOtherLegalPersonRecord() {
        super(FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON);
    }

    /**
     * Create a detached, initialised FpCaseOtherLegalPersonRecord
     */
    public FpCaseOtherLegalPersonRecord(Long fpCaseId, String firstName, String lastName, String middleName, LocalDate birthdayDt, Long genderId, String birthPlaceDesc, OffsetDateTime createDttm, String createUser) {
        super(FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON);

        setFpCaseId(fpCaseId);
        setFirstName(firstName);
        setLastName(lastName);
        setMiddleName(middleName);
        setBirthdayDt(birthdayDt);
        setGenderId(genderId);
        setBirthPlaceDesc(birthPlaceDesc);
        setCreateDttm(createDttm);
        setCreateUser(createUser);
        resetChangedOnNotNull();
    }
}
