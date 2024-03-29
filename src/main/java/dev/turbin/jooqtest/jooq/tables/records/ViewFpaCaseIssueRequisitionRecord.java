/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseIssueRequisition;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewFpaCaseIssueRequisitionRecord extends TableRecordImpl<ViewFpaCaseIssueRequisitionRecord> implements Record9<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.fpa_case_issue_requisition_id</code>.
     */
    public void setFpaCaseIssueRequisitionId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.fpa_case_issue_requisition_id</code>.
     */
    public Long getFpaCaseIssueRequisitionId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.issue_requisition_reason_id</code>.
     */
    public void setIssueRequisitionReasonId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.issue_requisition_reason_id</code>.
     */
    public Long getIssueRequisitionReasonId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.fpa_case_requisition_id</code>.
     */
    public void setFpaCaseRequisitionId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.fpa_case_requisition_id</code>.
     */
    public Long getFpaCaseRequisitionId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue_requisition.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue_requisition.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.FPA_CASE_ISSUE_REQUISITION_ID;
    }

    @Override
    public Field<Long> field2() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.ISSUE_REQUISITION_REASON_ID;
    }

    @Override
    public Field<Long> field3() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.FPA_CASE_REQUISITION_ID;
    }

    @Override
    public Field<Long> field4() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.MODIFY_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.EXP_DTTM;
    }

    @Override
    public Field<String> field9() {
        return ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION.ACTION_IND;
    }

    @Override
    public Long component1() {
        return getFpaCaseIssueRequisitionId();
    }

    @Override
    public Long component2() {
        return getIssueRequisitionReasonId();
    }

    @Override
    public Long component3() {
        return getFpaCaseRequisitionId();
    }

    @Override
    public Long component4() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component5() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component6() {
        return getModifyDttm();
    }

    @Override
    public OffsetDateTime component7() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component8() {
        return getExpDttm();
    }

    @Override
    public String component9() {
        return getActionInd();
    }

    @Override
    public Long value1() {
        return getFpaCaseIssueRequisitionId();
    }

    @Override
    public Long value2() {
        return getIssueRequisitionReasonId();
    }

    @Override
    public Long value3() {
        return getFpaCaseRequisitionId();
    }

    @Override
    public Long value4() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value6() {
        return getModifyDttm();
    }

    @Override
    public OffsetDateTime value7() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value8() {
        return getExpDttm();
    }

    @Override
    public String value9() {
        return getActionInd();
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value1(Long value) {
        setFpaCaseIssueRequisitionId(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value2(Long value) {
        setIssueRequisitionReasonId(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value3(Long value) {
        setFpaCaseRequisitionId(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value4(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value5(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value6(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value7(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value8(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord value9(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public ViewFpaCaseIssueRequisitionRecord values(Long value1, Long value2, Long value3, Long value4, OffsetDateTime value5, OffsetDateTime value6, OffsetDateTime value7, OffsetDateTime value8, String value9) {
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
     * Create a detached ViewFpaCaseIssueRequisitionRecord
     */
    public ViewFpaCaseIssueRequisitionRecord() {
        super(ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION);
    }

    /**
     * Create a detached, initialised ViewFpaCaseIssueRequisitionRecord
     */
    public ViewFpaCaseIssueRequisitionRecord(Long fpaCaseIssueRequisitionId, Long issueRequisitionReasonId, Long fpaCaseRequisitionId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, OffsetDateTime effDttm, OffsetDateTime expDttm, String actionInd) {
        super(ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION);

        setFpaCaseIssueRequisitionId(fpaCaseIssueRequisitionId);
        setIssueRequisitionReasonId(issueRequisitionReasonId);
        setFpaCaseRequisitionId(fpaCaseRequisitionId);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setActionInd(actionInd);
        resetChangedOnNotNull();
    }
}