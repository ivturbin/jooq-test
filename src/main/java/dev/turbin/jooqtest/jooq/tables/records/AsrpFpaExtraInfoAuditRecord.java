/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.AsrpFpaExtraInfoAudit;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования asrp_fpa_extra_info
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AsrpFpaExtraInfoAuditRecord extends UpdatableRecordImpl<AsrpFpaExtraInfoAuditRecord> implements Record18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, Long, Long> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.id</code>.
     * Идентификатор "asrp_fpa_extra_info_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.id</code>.
     * Идентификатор "asrp_fpa_extra_info_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.id_declaration</code>.
     */
    public void setIdDeclaration(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.id_declaration</code>.
     */
    public Long getIdDeclaration() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.num_declaration</code>.
     */
    public void setNumDeclaration(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.num_declaration</code>.
     */
    public String getNumDeclaration() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.date_declaration</code>.
     */
    public void setDateDeclaration(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.date_declaration</code>.
     */
    public OffsetDateTime getDateDeclaration() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.date_docs_on</code>.
     */
    public void setDateDocsOn(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.date_docs_on</code>.
     */
    public OffsetDateTime getDateDocsOn() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.region_code</code>.
     */
    public void setRegionCode(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.region_code</code>.
     */
    public String getRegionCode() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.type_id</code>.
     */
    public void setTypeId(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.type_id</code>.
     */
    public String getTypeId() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.purpose_id</code>.
     */
    public void setPurposeId(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.purpose_id</code>.
     */
    public Long getPurposeId() {
        return (Long) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.reason_obrasch_id</code>.
     */
    public void setReasonObraschId(Long value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.reason_obrasch_id</code>.
     */
    public Long getReasonObraschId() {
        return (Long) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.going_country_id</code>.
     */
    public void setGoingCountryId(Long value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.going_country_id</code>.
     */
    public Long getGoingCountryId() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.bi_place_str_lat</code>.
     */
    public void setBiPlaceStrLat(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.bi_place_str_lat</code>.
     */
    public String getBiPlaceStrLat() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.reason_id</code>.
     */
    public void setReasonId(Long value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.reason_id</code>.
     */
    public Long getReasonId() {
        return (Long) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.asrp_fpa_extra_info_audit.core_document_id</code>.
     */
    public void setCoreDocumentId(Long value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.asrp_fpa_extra_info_audit.core_document_id</code>.
     */
    public Long getCoreDocumentId() {
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
    public Row18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, Long, Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, Long, Long> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.ID;
    }

    @Override
    public Field<Long> field2() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.RECORD_ID;
    }

    @Override
    public Field<Long> field3() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.CORRECTION_LOG_ID;
    }

    @Override
    public Field<String> field4() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.UPDATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.EXP_DTTM;
    }

    @Override
    public Field<Long> field7() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.ID_DECLARATION;
    }

    @Override
    public Field<String> field8() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.NUM_DECLARATION;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.DATE_DECLARATION;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.DATE_DOCS_ON;
    }

    @Override
    public Field<String> field11() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.REGION_CODE;
    }

    @Override
    public Field<String> field12() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.TYPE_ID;
    }

    @Override
    public Field<Long> field13() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.PURPOSE_ID;
    }

    @Override
    public Field<Long> field14() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.REASON_OBRASCH_ID;
    }

    @Override
    public Field<Long> field15() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.GOING_COUNTRY_ID;
    }

    @Override
    public Field<String> field16() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.BI_PLACE_STR_LAT;
    }

    @Override
    public Field<Long> field17() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.REASON_ID;
    }

    @Override
    public Field<Long> field18() {
        return AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT.CORE_DOCUMENT_ID;
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
        return getIdDeclaration();
    }

    @Override
    public String component8() {
        return getNumDeclaration();
    }

    @Override
    public OffsetDateTime component9() {
        return getDateDeclaration();
    }

    @Override
    public OffsetDateTime component10() {
        return getDateDocsOn();
    }

    @Override
    public String component11() {
        return getRegionCode();
    }

    @Override
    public String component12() {
        return getTypeId();
    }

    @Override
    public Long component13() {
        return getPurposeId();
    }

    @Override
    public Long component14() {
        return getReasonObraschId();
    }

    @Override
    public Long component15() {
        return getGoingCountryId();
    }

    @Override
    public String component16() {
        return getBiPlaceStrLat();
    }

    @Override
    public Long component17() {
        return getReasonId();
    }

    @Override
    public Long component18() {
        return getCoreDocumentId();
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
        return getIdDeclaration();
    }

    @Override
    public String value8() {
        return getNumDeclaration();
    }

    @Override
    public OffsetDateTime value9() {
        return getDateDeclaration();
    }

    @Override
    public OffsetDateTime value10() {
        return getDateDocsOn();
    }

    @Override
    public String value11() {
        return getRegionCode();
    }

    @Override
    public String value12() {
        return getTypeId();
    }

    @Override
    public Long value13() {
        return getPurposeId();
    }

    @Override
    public Long value14() {
        return getReasonObraschId();
    }

    @Override
    public Long value15() {
        return getGoingCountryId();
    }

    @Override
    public String value16() {
        return getBiPlaceStrLat();
    }

    @Override
    public Long value17() {
        return getReasonId();
    }

    @Override
    public Long value18() {
        return getCoreDocumentId();
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value1(Long value) {
        setId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value2(Long value) {
        setRecordId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value3(Long value) {
        setCorrectionLogId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value4(String value) {
        setUpdateUser(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value5(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value6(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value7(Long value) {
        setIdDeclaration(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value8(String value) {
        setNumDeclaration(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value9(OffsetDateTime value) {
        setDateDeclaration(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value10(OffsetDateTime value) {
        setDateDocsOn(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value11(String value) {
        setRegionCode(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value12(String value) {
        setTypeId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value13(Long value) {
        setPurposeId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value14(Long value) {
        setReasonObraschId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value15(Long value) {
        setGoingCountryId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value16(String value) {
        setBiPlaceStrLat(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value17(Long value) {
        setReasonId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord value18(Long value) {
        setCoreDocumentId(value);
        return this;
    }

    @Override
    public AsrpFpaExtraInfoAuditRecord values(Long value1, Long value2, Long value3, String value4, OffsetDateTime value5, OffsetDateTime value6, Long value7, String value8, OffsetDateTime value9, OffsetDateTime value10, String value11, String value12, Long value13, Long value14, Long value15, String value16, Long value17, Long value18) {
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
     * Create a detached AsrpFpaExtraInfoAuditRecord
     */
    public AsrpFpaExtraInfoAuditRecord() {
        super(AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT);
    }

    /**
     * Create a detached, initialised AsrpFpaExtraInfoAuditRecord
     */
    public AsrpFpaExtraInfoAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Long idDeclaration, String numDeclaration, OffsetDateTime dateDeclaration, OffsetDateTime dateDocsOn, String regionCode, String typeId, Long purposeId, Long reasonObraschId, Long goingCountryId, String biPlaceStrLat, Long reasonId, Long coreDocumentId) {
        super(AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
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
        setReasonId(reasonId);
        setCoreDocumentId(coreDocumentId);
        resetChangedOnNotNull();
    }
}
