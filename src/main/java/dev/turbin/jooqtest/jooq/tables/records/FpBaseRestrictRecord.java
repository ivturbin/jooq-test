/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpBaseRestrict;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Ограничение выезда
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpBaseRestrictRecord extends UpdatableRecordImpl<FpBaseRestrictRecord> implements Record12<Long, Long, Long, Long, String, LocalDate, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.fp_base_restrict_id</code>.
     * Идентификатор
     */
    public void setFpBaseRestrictId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.fp_base_restrict_id</code>.
     * Идентификатор
     */
    public Long getFpBaseRestrictId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.category_id</code>.
     * Категория ограничения
     */
    public void setCategoryId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.category_id</code>.
     * Категория ограничения
     */
    public Long getCategoryId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.status_basis_id</code>.
     * Основание статуса ограничения
     */
    public void setStatusBasisId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.status_basis_id</code>.
     * Основание статуса ограничения
     */
    public Long getStatusBasisId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.court_name_id</code>.
     * Название суда принявшего решение
     */
    public void setCourtNameId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.court_name_id</code>.
     * Название суда принявшего решение
     */
    public Long getCourtNameId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.court_decision_no</code>.
     * Номер решения суда
     */
    public void setCourtDecisionNo(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.court_decision_no</code>.
     * Номер решения суда
     */
    public String getCourtDecisionNo() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.court_decision_dt</code>.
     * Дата принятия решения судом
     */
    public void setCourtDecisionDt(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.court_decision_dt</code>.
     * Дата принятия решения судом
     */
    public LocalDate getCourtDecisionDt() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.comment_desc</code>.
     * Комментарий
     */
    public void setCommentDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.comment_desc</code>.
     * Комментарий
     */
    public String getCommentDesc() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_base_restrict.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_base_restrict.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for <code>passport_international.fp_base_restrict.eff_dttm</code>.
     */
    public void setEffDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>passport_international.fp_base_restrict.eff_dttm</code>.
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>passport_international.fp_base_restrict.exp_dttm</code>.
     */
    public void setExpDttm(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>passport_international.fp_base_restrict.exp_dttm</code>.
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, Long, String, LocalDate, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<Long, Long, Long, Long, String, LocalDate, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpBaseRestrict.FP_BASE_RESTRICT.FP_BASE_RESTRICT_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpBaseRestrict.FP_BASE_RESTRICT.CATEGORY_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpBaseRestrict.FP_BASE_RESTRICT.STATUS_BASIS_ID;
    }

    @Override
    public Field<Long> field4() {
        return FpBaseRestrict.FP_BASE_RESTRICT.COURT_NAME_ID;
    }

    @Override
    public Field<String> field5() {
        return FpBaseRestrict.FP_BASE_RESTRICT.COURT_DECISION_NO;
    }

    @Override
    public Field<LocalDate> field6() {
        return FpBaseRestrict.FP_BASE_RESTRICT.COURT_DECISION_DT;
    }

    @Override
    public Field<String> field7() {
        return FpBaseRestrict.FP_BASE_RESTRICT.COMMENT_DESC;
    }

    @Override
    public Field<String> field8() {
        return FpBaseRestrict.FP_BASE_RESTRICT.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return FpBaseRestrict.FP_BASE_RESTRICT.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return FpBaseRestrict.FP_BASE_RESTRICT.MODIFY_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return FpBaseRestrict.FP_BASE_RESTRICT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field12() {
        return FpBaseRestrict.FP_BASE_RESTRICT.EXP_DTTM;
    }

    @Override
    public Long component1() {
        return getFpBaseRestrictId();
    }

    @Override
    public Long component2() {
        return getCategoryId();
    }

    @Override
    public Long component3() {
        return getStatusBasisId();
    }

    @Override
    public Long component4() {
        return getCourtNameId();
    }

    @Override
    public String component5() {
        return getCourtDecisionNo();
    }

    @Override
    public LocalDate component6() {
        return getCourtDecisionDt();
    }

    @Override
    public String component7() {
        return getCommentDesc();
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
        return getFpBaseRestrictId();
    }

    @Override
    public Long value2() {
        return getCategoryId();
    }

    @Override
    public Long value3() {
        return getStatusBasisId();
    }

    @Override
    public Long value4() {
        return getCourtNameId();
    }

    @Override
    public String value5() {
        return getCourtDecisionNo();
    }

    @Override
    public LocalDate value6() {
        return getCourtDecisionDt();
    }

    @Override
    public String value7() {
        return getCommentDesc();
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
    public FpBaseRestrictRecord value1(Long value) {
        setFpBaseRestrictId(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value2(Long value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value3(Long value) {
        setStatusBasisId(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value4(Long value) {
        setCourtNameId(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value5(String value) {
        setCourtDecisionNo(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value6(LocalDate value) {
        setCourtDecisionDt(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value7(String value) {
        setCommentDesc(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value8(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value9(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value10(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value11(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord value12(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpBaseRestrictRecord values(Long value1, Long value2, Long value3, Long value4, String value5, LocalDate value6, String value7, String value8, OffsetDateTime value9, OffsetDateTime value10, OffsetDateTime value11, OffsetDateTime value12) {
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
     * Create a detached FpBaseRestrictRecord
     */
    public FpBaseRestrictRecord() {
        super(FpBaseRestrict.FP_BASE_RESTRICT);
    }

    /**
     * Create a detached, initialised FpBaseRestrictRecord
     */
    public FpBaseRestrictRecord(Long fpBaseRestrictId, Long categoryId, Long statusBasisId, Long courtNameId, String courtDecisionNo, LocalDate courtDecisionDt, String commentDesc, String actionInd, OffsetDateTime createDttm, OffsetDateTime modifyDttm, OffsetDateTime effDttm, OffsetDateTime expDttm) {
        super(FpBaseRestrict.FP_BASE_RESTRICT);

        setFpBaseRestrictId(fpBaseRestrictId);
        setCategoryId(categoryId);
        setStatusBasisId(statusBasisId);
        setCourtNameId(courtNameId);
        setCourtDecisionNo(courtDecisionNo);
        setCourtDecisionDt(courtDecisionDt);
        setCommentDesc(commentDesc);
        setActionInd(actionInd);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        resetChangedOnNotNull();
    }
}