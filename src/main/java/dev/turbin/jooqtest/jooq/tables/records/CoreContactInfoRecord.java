/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CoreContactInfo;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Контактная информация заявителя
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreContactInfoRecord extends UpdatableRecordImpl<CoreContactInfoRecord> implements Record15<Long, Integer, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, Boolean, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_contact_info.contact_info_id</code>.
     * Идентификатор
     */
    public void setContactInfoId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.contact_info_id</code>.
     * Идентификатор
     */
    public Long getContactInfoId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.core_contact_info.version</code>.
     * реализация оптимистической блокировки
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.core_contact_info.version</code>.
     * реализация оптимистической блокировки
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>passport_international.core_contact_info.email</code>.
     * Электронная почта
     */
    public void setEmail(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.core_contact_info.email</code>.
     * Электронная почта
     */
    public String getEmail() {
        return (String) get(2);
    }

    /**
     * Setter for <code>passport_international.core_contact_info.phone</code>.
     * Телефон
     */
    public void setPhone(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.core_contact_info.phone</code>.
     * Телефон
     */
    public String getPhone() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.fax_cval</code>. Факс
     */
    public void setFaxCval(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.fax_cval</code>. Факс
     */
    public String getFaxCval() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.contact_info_desc</code>.
     * Дополнительная контактная информация
     */
    public void setContactInfoDesc(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.contact_info_desc</code>.
     * Дополнительная контактная информация
     */
    public String getContactInfoDesc() {
        return (String) get(5);
    }

    /**
     * Setter for <code>passport_international.core_contact_info.src_id</code>.
     * Источник
     */
    public void setSrcId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.core_contact_info.src_id</code>.
     * Источник
     */
    public Long getSrcId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.create_dttm</code>. Дата
     * вставки записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.create_dttm</code>. Дата
     * вставки записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.modify_dttm</code>. Дата
     * последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.modify_dttm</code>. Дата
     * последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.action_ind</code>.
     * Индикатор операции
     */
    public void setActionInd(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.action_ind</code>.
     * Индикатор операции
     */
    public String getActionInd() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.eff_dttm</code>. Дата
     * начала действия периода
     */
    public void setEffDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.eff_dttm</code>. Дата
     * начала действия периода
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.exp_dttm</code>. Дата
     * окончания действия периода
     */
    public void setExpDttm(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.exp_dttm</code>. Дата
     * окончания действия периода
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.core_person_document_id</code>.
     */
    public void setCorePersonDocumentId(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.core_person_document_id</code>.
     */
    public Long getCorePersonDocumentId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>passport_international.core_contact_info.agree</code>.
     * Согласен на участие в опросе
     */
    public void setAgree(Boolean value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.core_contact_info.agree</code>.
     * Согласен на участие в опросе
     */
    public Boolean getAgree() {
        return (Boolean) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.core_contact_info.survey_agreement_bool</code>.
     * Признак согласия гражданина на участие в опросе
     */
    public void setSurveyAgreementBool(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_contact_info.survey_agreement_bool</code>.
     * Признак согласия гражданина на участие в опросе
     */
    public Boolean getSurveyAgreementBool() {
        return (Boolean) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Integer, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, Boolean, Boolean> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    @Override
    public Row15<Long, Integer, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, Boolean, Boolean> valuesRow() {
        return (Row15) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CoreContactInfo.CORE_CONTACT_INFO.CONTACT_INFO_ID;
    }

    @Override
    public Field<Integer> field2() {
        return CoreContactInfo.CORE_CONTACT_INFO.VERSION;
    }

    @Override
    public Field<String> field3() {
        return CoreContactInfo.CORE_CONTACT_INFO.EMAIL;
    }

    @Override
    public Field<String> field4() {
        return CoreContactInfo.CORE_CONTACT_INFO.PHONE;
    }

    @Override
    public Field<String> field5() {
        return CoreContactInfo.CORE_CONTACT_INFO.FAX_CVAL;
    }

    @Override
    public Field<String> field6() {
        return CoreContactInfo.CORE_CONTACT_INFO.CONTACT_INFO_DESC;
    }

    @Override
    public Field<Long> field7() {
        return CoreContactInfo.CORE_CONTACT_INFO.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return CoreContactInfo.CORE_CONTACT_INFO.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return CoreContactInfo.CORE_CONTACT_INFO.MODIFY_DTTM;
    }

    @Override
    public Field<String> field10() {
        return CoreContactInfo.CORE_CONTACT_INFO.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return CoreContactInfo.CORE_CONTACT_INFO.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field12() {
        return CoreContactInfo.CORE_CONTACT_INFO.EXP_DTTM;
    }

    @Override
    public Field<Long> field13() {
        return CoreContactInfo.CORE_CONTACT_INFO.CORE_PERSON_DOCUMENT_ID;
    }

    @Override
    public Field<Boolean> field14() {
        return CoreContactInfo.CORE_CONTACT_INFO.AGREE;
    }

    @Override
    public Field<Boolean> field15() {
        return CoreContactInfo.CORE_CONTACT_INFO.SURVEY_AGREEMENT_BOOL;
    }

    @Override
    public Long component1() {
        return getContactInfoId();
    }

    @Override
    public Integer component2() {
        return getVersion();
    }

    @Override
    public String component3() {
        return getEmail();
    }

    @Override
    public String component4() {
        return getPhone();
    }

    @Override
    public String component5() {
        return getFaxCval();
    }

    @Override
    public String component6() {
        return getContactInfoDesc();
    }

    @Override
    public Long component7() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component8() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component9() {
        return getModifyDttm();
    }

    @Override
    public String component10() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component11() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component12() {
        return getExpDttm();
    }

    @Override
    public Long component13() {
        return getCorePersonDocumentId();
    }

    @Override
    public Boolean component14() {
        return getAgree();
    }

    @Override
    public Boolean component15() {
        return getSurveyAgreementBool();
    }

    @Override
    public Long value1() {
        return getContactInfoId();
    }

    @Override
    public Integer value2() {
        return getVersion();
    }

    @Override
    public String value3() {
        return getEmail();
    }

    @Override
    public String value4() {
        return getPhone();
    }

    @Override
    public String value5() {
        return getFaxCval();
    }

    @Override
    public String value6() {
        return getContactInfoDesc();
    }

    @Override
    public Long value7() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value8() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value9() {
        return getModifyDttm();
    }

    @Override
    public String value10() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value11() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value12() {
        return getExpDttm();
    }

    @Override
    public Long value13() {
        return getCorePersonDocumentId();
    }

    @Override
    public Boolean value14() {
        return getAgree();
    }

    @Override
    public Boolean value15() {
        return getSurveyAgreementBool();
    }

    @Override
    public CoreContactInfoRecord value1(Long value) {
        setContactInfoId(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value2(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value3(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value4(String value) {
        setPhone(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value5(String value) {
        setFaxCval(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value6(String value) {
        setContactInfoDesc(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value7(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value8(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value9(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value10(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value11(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value12(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value13(Long value) {
        setCorePersonDocumentId(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value14(Boolean value) {
        setAgree(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord value15(Boolean value) {
        setSurveyAgreementBool(value);
        return this;
    }

    @Override
    public CoreContactInfoRecord values(Long value1, Integer value2, String value3, String value4, String value5, String value6, Long value7, OffsetDateTime value8, OffsetDateTime value9, String value10, OffsetDateTime value11, OffsetDateTime value12, Long value13, Boolean value14, Boolean value15) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreContactInfoRecord
     */
    public CoreContactInfoRecord() {
        super(CoreContactInfo.CORE_CONTACT_INFO);
    }

    /**
     * Create a detached, initialised CoreContactInfoRecord
     */
    public CoreContactInfoRecord(Long contactInfoId, Integer version, String email, String phone, String faxCval, String contactInfoDesc, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, Long corePersonDocumentId, Boolean agree, Boolean surveyAgreementBool) {
        super(CoreContactInfo.CORE_CONTACT_INFO);

        setContactInfoId(contactInfoId);
        setVersion(version);
        setEmail(email);
        setPhone(phone);
        setFaxCval(faxCval);
        setContactInfoDesc(contactInfoDesc);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setCorePersonDocumentId(corePersonDocumentId);
        setAgree(agree);
        setSurveyAgreementBool(surveyAgreementBool);
        resetChangedOnNotNull();
    }
}