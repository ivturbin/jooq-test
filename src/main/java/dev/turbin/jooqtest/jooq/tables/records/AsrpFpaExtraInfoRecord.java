/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.AsrpFpaExtraInfo;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AsrpFpaExtraInfoRecord extends UpdatableRecordImpl<AsrpFpaExtraInfoRecord> implements Record16<Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.migr_id</code>.
     * Уникальный идентификатор записи
     */
    public void setMigrId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.migr_id</code>.
     * Уникальный идентификатор записи
     */
    public Long getMigrId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.id_declaration</code>.
     * Идентификатор заявления
     */
    public void setIdDeclaration(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.id_declaration</code>.
     * Идентификатор заявления
     */
    public Long getIdDeclaration() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.num_declaration</code>.
     * Номер заявления
     */
    public void setNumDeclaration(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.num_declaration</code>.
     * Номер заявления
     */
    public String getNumDeclaration() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.date_declaration</code>.
     * Дата заявления
     */
    public void setDateDeclaration(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.date_declaration</code>.
     * Дата заявления
     */
    public OffsetDateTime getDateDeclaration() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.date_docs_on</code>.
     * Дата приема заявления
     */
    public void setDateDocsOn(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.date_docs_on</code>.
     * Дата приема заявления
     */
    public OffsetDateTime getDateDocsOn() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.region_code</code>. Код
     * региона
     */
    public void setRegionCode(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.region_code</code>. Код
     * региона
     */
    public String getRegionCode() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.type_id</code>. Тип
     * загран паспорта
     */
    public void setTypeId(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.type_id</code>. Тип
     * загран паспорта
     */
    public String getTypeId() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.purpose_id</code>. Цель
     * выдачи
     */
    public void setPurposeId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.purpose_id</code>. Цель
     * выдачи
     */
    public Long getPurposeId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.reason_obrasch_id</code>.
     * Цель получения
     */
    public void setReasonObraschId(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.reason_obrasch_id</code>.
     * Цель получения
     */
    public Long getReasonObraschId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.going_country_id</code>.
     * Страна выезда
     */
    public void setGoingCountryId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.going_country_id</code>.
     * Страна выезда
     */
    public Long getGoingCountryId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.bi_place_str_lat</code>.
     * Место рождения латиницей
     */
    public void setBiPlaceStrLat(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.bi_place_str_lat</code>.
     * Место рождения латиницей
     */
    public String getBiPlaceStrLat() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.reason_id</code>.
     * Причина объявления паспорта недействительным
     */
    public void setReasonId(Long value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.reason_id</code>.
     * Причина объявления паспорта недействительным
     */
    public Long getReasonId() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info.core_document_id</code>.
     * Идентификатор выходящего документа
     */
    public void setCoreDocumentId(Long value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info.core_document_id</code>.
     * Идентификатор выходящего документа
     */
    public Long getCoreDocumentId() {
        return (Long) get(15);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record16 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, Long, Long> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, Long, Long> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.MIGR_ID;
    }

    @Override
    public Field<Long> field2() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.ID_DECLARATION;
    }

    @Override
    public Field<String> field3() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.NUM_DECLARATION;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.DATE_DECLARATION;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.DATE_DOCS_ON;
    }

    @Override
    public Field<String> field6() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.REGION_CODE;
    }

    @Override
    public Field<String> field7() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.TYPE_ID;
    }

    @Override
    public Field<Long> field8() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.PURPOSE_ID;
    }

    @Override
    public Field<Long> field9() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.REASON_OBRASCH_ID;
    }

    @Override
    public Field<Long> field10() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.GOING_COUNTRY_ID;
    }

    @Override
    public Field<String> field11() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.BI_PLACE_STR_LAT;
    }

    @Override
    public Field<OffsetDateTime> field12() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field13() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.MODIFY_DTTM;
    }

    @Override
    public Field<String> field14() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.ACTION_IND;
    }

    @Override
    public Field<Long> field15() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.REASON_ID;
    }

    @Override
    public Field<Long> field16() {
        return AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO.CORE_DOCUMENT_ID;
    }

    @Override
    public Long component1() {
        return getMigrId();
    }

    @Override
    public Long component2() {
        return getIdDeclaration();
    }

    @Override
    public String component3() {
        return getNumDeclaration();
    }

    @Override
    public OffsetDateTime component4() {
        return getDateDeclaration();
    }

    @Override
    public OffsetDateTime component5() {
        return getDateDocsOn();
    }

    @Override
    public String component6() {
        return getRegionCode();
    }

    @Override
    public String component7() {
        return getTypeId();
    }

    @Override
    public Long component8() {
        return getPurposeId();
    }

    @Override
    public Long component9() {
        return getReasonObraschId();
    }

    @Override
    public Long component10() {
        return getGoingCountryId();
    }

    @Override
    public String component11() {
        return getBiPlaceStrLat();
    }

    @Override
    public OffsetDateTime component12() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component13() {
        return getModifyDttm();
    }

    @Override
    public String component14() {
        return getActionInd();
    }

    @Override
    public Long component15() {
        return getReasonId();
    }

    @Override
    public Long component16() {
        return getCoreDocumentId();
    }

    @Override
    public Long value1() {
        return getMigrId();
    }

    @Override
    public Long value2() {
        return getIdDeclaration();
    }

    @Override
    public String value3() {
        return getNumDeclaration();
    }

    @Override
    public OffsetDateTime value4() {
        return getDateDeclaration();
    }

    @Override
    public OffsetDateTime value5() {
        return getDateDocsOn();
    }

    @Override
    public String value6() {
        return getRegionCode();
    }

    @Override
    public String value7() {
        return getTypeId();
    }

    @Override
    public Long value8() {
        return getPurposeId();
    }

    @Override
    public Long value9() {
        return getReasonObraschId();
    }

    @Override
    public Long value10() {
        return getGoingCountryId();
    }

    @Override
    public String value11() {
        return getBiPlaceStrLat();
    }

    @Override
    public OffsetDateTime value12() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value13() {
        return getModifyDttm();
    }

    @Override
    public String value14() {
        return getActionInd();
    }

    @Override
    public Long value15() {
        return getReasonId();
    }

    @Override
    public Long value16() {
        return getCoreDocumentId();
    }

    @Override
    public AsrpFpaExtraInfoRecord value1(Long value) {
        setMigrId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value2(Long value) {
        setIdDeclaration(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value3(String value) {
        setNumDeclaration(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value4(OffsetDateTime value) {
        setDateDeclaration(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value5(OffsetDateTime value) {
        setDateDocsOn(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value6(String value) {
        setRegionCode(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value7(String value) {
        setTypeId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value8(Long value) {
        setPurposeId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value9(Long value) {
        setReasonObraschId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value10(Long value) {
        setGoingCountryId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value11(String value) {
        setBiPlaceStrLat(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value12(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value13(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value14(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value15(Long value) {
        setReasonId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord value16(Long value) {
        setCoreDocumentId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoRecord values(Long value1, Long value2, String value3, OffsetDateTime value4, OffsetDateTime value5, String value6, String value7, Long value8, Long value9, Long value10, String value11, OffsetDateTime value12, OffsetDateTime value13, String value14, Long value15, Long value16) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AsrpFpaExtraInfoRecord
     */
    public AsrpFpaExtraInfoRecord() {
        super(AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO);
    }

    /**
     * Create a detached, initialised AsrpFpaExtraInfoRecord
     */
    public AsrpFpaExtraInfoRecord(Long migrId, Long idDeclaration, String numDeclaration, OffsetDateTime dateDeclaration, OffsetDateTime dateDocsOn, String regionCode, String typeId, Long purposeId, Long reasonObraschId, Long goingCountryId, String biPlaceStrLat, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, Long reasonId, Long coreDocumentId) {
        super(AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO);

        setMigrId(migrId);
        setIdDeclaration(idDeclaration);
        setNumDeclaration(numDeclaration);
        setDateDeclaration(dateDeclaration);
        setDateDocsOn(dateDocsOn);
        setRegionCode(regionCode);
        setTypeId(typeId);
        setPurposeId(purposeId);
        setReasonObraschId(reasonObraschId);
        setGoingCountryId(goingCountryId);
        setBiPlaceStrLat(biPlaceStrLat);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setReasonId(reasonId);
        setCoreDocumentId(coreDocumentId);
        resetChangedOnNotNull();
    }
}
