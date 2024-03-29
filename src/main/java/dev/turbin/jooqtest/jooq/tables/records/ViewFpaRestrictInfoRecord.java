/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewFpaRestrictInfo;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewFpaRestrictInfoRecord extends TableRecordImpl<ViewFpaRestrictInfoRecord> implements Record12<Long, Long, LocalDate, LocalDate, Boolean, String, Long, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.fpa_restrict_info_id</code>.
     */
    public void setFpaRestrictInfoId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.fpa_restrict_info_id</code>.
     */
    public Long getFpaRestrictInfoId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.fpa_base_restrict_id</code>.
     */
    public void setFpaBaseRestrictId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.fpa_base_restrict_id</code>.
     */
    public Long getFpaBaseRestrictId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.start_dt</code>. Дата
     * начала действия ограничений на выезд
     */
    public void setStartDt(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.start_dt</code>. Дата
     * начала действия ограничений на выезд
     */
    public LocalDate getStartDt() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.end_dt</code>. Дата
     * окончания действия ограничений на выезд
     */
    public void setEndDt(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.end_dt</code>. Дата
     * окончания действия ограничений на выезд
     */
    public LocalDate getEndDt() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.before_bool</code>.
     */
    public void setBeforeBool(Boolean value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.before_bool</code>.
     */
    public Boolean getBeforeBool() {
        return (Boolean) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.country_desc</code>.
     */
    public void setCountryDesc(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.country_desc</code>.
     */
    public String getCountryDesc() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.status_id</code>.
     * Статус ограничения
     */
    public void setStatusId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.status_id</code>.
     * Статус ограничения
     */
    public Long getStatusId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.eff_dttm</code>.
     */
    public void setEffDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.eff_dttm</code>.
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_restrict_info.exp_dttm</code>.
     */
    public void setExpDttm(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_restrict_info.exp_dttm</code>.
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(11);
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, LocalDate, LocalDate, Boolean, String, Long, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, LocalDate, LocalDate, Boolean, String, Long, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.FPA_RESTRICT_INFO_ID;
    }

    @Override
    public Field<Long> field2() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.FPA_BASE_RESTRICT_ID;
    }

    @Override
    public Field<LocalDate> field3() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.START_DT;
    }

    @Override
    public Field<LocalDate> field4() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.END_DT;
    }

    @Override
    public Field<Boolean> field5() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.BEFORE_BOOL;
    }

    @Override
    public Field<String> field6() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.COUNTRY_DESC;
    }

    @Override
    public Field<Long> field7() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.STATUS_ID;
    }

    @Override
    public Field<String> field8() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.MODIFY_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field12() {
        return ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO.EXP_DTTM;
    }

    @Override
    public Long component1() {
        return getFpaRestrictInfoId();
    }

    @Override
    public Long component2() {
        return getFpaBaseRestrictId();
    }

    @Override
    public LocalDate component3() {
        return getStartDt();
    }

    @Override
    public LocalDate component4() {
        return getEndDt();
    }

    @Override
    public Boolean component5() {
        return getBeforeBool();
    }

    @Override
    public String component6() {
        return getCountryDesc();
    }

    @Override
    public Long component7() {
        return getStatusId();
    }

    @Override
    public String component8() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component9() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component10() {
        return getModifyDttm();
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
    public Long value1() {
        return getFpaRestrictInfoId();
    }

    @Override
    public Long value2() {
        return getFpaBaseRestrictId();
    }

    @Override
    public LocalDate value3() {
        return getStartDt();
    }

    @Override
    public LocalDate value4() {
        return getEndDt();
    }

    @Override
    public Boolean value5() {
        return getBeforeBool();
    }

    @Override
    public String value6() {
        return getCountryDesc();
    }

    @Override
    public Long value7() {
        return getStatusId();
    }

    @Override
    public String value8() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value9() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value10() {
        return getModifyDttm();
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
    public ViewFpaRestrictInfoRecord value1(Long value) {
        setFpaRestrictInfoId(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value2(Long value) {
        setFpaBaseRestrictId(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value3(LocalDate value) {
        setStartDt(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value4(LocalDate value) {
        setEndDt(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value5(Boolean value) {
        setBeforeBool(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value6(String value) {
        setCountryDesc(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value7(Long value) {
        setStatusId(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value8(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value9(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value10(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value11(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord value12(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public ViewFpaRestrictInfoRecord values(Long value1, Long value2, LocalDate value3, LocalDate value4, Boolean value5, String value6, Long value7, String value8, OffsetDateTime value9, OffsetDateTime value10, OffsetDateTime value11, OffsetDateTime value12) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewFpaRestrictInfoRecord
     */
    public ViewFpaRestrictInfoRecord() {
        super(ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO);
    }

    /**
     * Create a detached, initialised ViewFpaRestrictInfoRecord
     */
    public ViewFpaRestrictInfoRecord(Long fpaRestrictInfoId, Long fpaBaseRestrictId, LocalDate startDt, LocalDate endDt, Boolean beforeBool, String countryDesc, Long statusId, String actionInd, OffsetDateTime createDttm, OffsetDateTime modifyDttm, OffsetDateTime effDttm, OffsetDateTime expDttm) {
        super(ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO);

        setFpaRestrictInfoId(fpaRestrictInfoId);
        setFpaBaseRestrictId(fpaBaseRestrictId);
        setStartDt(startDt);
        setEndDt(endDt);
        setBeforeBool(beforeBool);
        setCountryDesc(countryDesc);
        setStatusId(statusId);
        setActionInd(actionInd);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        resetChangedOnNotNull();
    }
}
