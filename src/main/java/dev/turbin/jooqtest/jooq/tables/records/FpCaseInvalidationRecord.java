/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCaseInvalidation;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Дело об объявлении загранпаспорта недействительным
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseInvalidationRecord extends UpdatableRecordImpl<FpCaseInvalidationRecord> implements Record14<Long, Long, Long, String, LocalDate, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.inv_id</code>.
     * Идентификатор
     */
    public void setInvId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.inv_id</code>.
     * Идентификатор
     */
    public Long getInvId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.inv_reason_id</code>.
     * Причина объявления загранпаспорта недействительным
     */
    public void setInvReasonId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.inv_reason_id</code>.
     * Причина объявления загранпаспорта недействительным
     */
    public Long getInvReasonId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.inv_evidence_type_id</code>.
     * Тип документа-основания
     */
    public void setInvEvidenceTypeId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.inv_evidence_type_id</code>.
     * Тип документа-основания
     */
    public Long getInvEvidenceTypeId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.inv_evidence_number</code>.
     * Номер документа-основания
     */
    public void setInvEvidenceNumber(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.inv_evidence_number</code>.
     * Номер документа-основания
     */
    public String getInvEvidenceNumber() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.inv_evidence_dt</code>.
     * Дата документа-основания
     */
    public void setInvEvidenceDt(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.inv_evidence_dt</code>.
     * Дата документа-основания
     */
    public LocalDate getInvEvidenceDt() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.date_invalidation</code>.
     * Дата объявления заграна недействительным
     */
    public void setDateInvalidation(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.date_invalidation</code>.
     * Дата объявления заграна недействительным
     */
    public LocalDate getDateInvalidation() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.signer_id</code>.
     * Подписывающий сотрудник
     */
    public void setSignerId(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.signer_id</code>.
     * Подписывающий сотрудник
     */
    public Long getSignerId() {
        return (Long) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_invalidation.comment</code>.
     * Комментарий
     */
    public void setComment(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_invalidation.comment</code>.
     * Комментарий
     */
    public String getComment() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, Long, Long, String, LocalDate, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, Long, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, Long, Long, String, LocalDate, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, Long, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.INV_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.INV_REASON_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.INV_EVIDENCE_TYPE_ID;
    }

    @Override
    public Field<String> field4() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.INV_EVIDENCE_NUMBER;
    }

    @Override
    public Field<LocalDate> field5() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.INV_EVIDENCE_DT;
    }

    @Override
    public Field<Long> field6() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.MODIFY_DTTM;
    }

    @Override
    public Field<String> field9() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.EXP_DTTM;
    }

    @Override
    public Field<LocalDate> field12() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.DATE_INVALIDATION;
    }

    @Override
    public Field<Long> field13() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.SIGNER_ID;
    }

    @Override
    public Field<String> field14() {
        return FpCaseInvalidation.FP_CASE_INVALIDATION.COMMENT;
    }

    @Override
    public Long component1() {
        return getInvId();
    }

    @Override
    public Long component2() {
        return getInvReasonId();
    }

    @Override
    public Long component3() {
        return getInvEvidenceTypeId();
    }

    @Override
    public String component4() {
        return getInvEvidenceNumber();
    }

    @Override
    public LocalDate component5() {
        return getInvEvidenceDt();
    }

    @Override
    public Long component6() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component7() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component8() {
        return getModifyDttm();
    }

    @Override
    public String component9() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component10() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component11() {
        return getExpDttm();
    }

    @Override
    public LocalDate component12() {
        return getDateInvalidation();
    }

    @Override
    public Long component13() {
        return getSignerId();
    }

    @Override
    public String component14() {
        return getComment();
    }

    @Override
    public Long value1() {
        return getInvId();
    }

    @Override
    public Long value2() {
        return getInvReasonId();
    }

    @Override
    public Long value3() {
        return getInvEvidenceTypeId();
    }

    @Override
    public String value4() {
        return getInvEvidenceNumber();
    }

    @Override
    public LocalDate value5() {
        return getInvEvidenceDt();
    }

    @Override
    public Long value6() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value7() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value8() {
        return getModifyDttm();
    }

    @Override
    public String value9() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value10() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value11() {
        return getExpDttm();
    }

    @Override
    public LocalDate value12() {
        return getDateInvalidation();
    }

    @Override
    public Long value13() {
        return getSignerId();
    }

    @Override
    public String value14() {
        return getComment();
    }

    @Override
    public FpCaseInvalidationRecord value1(Long value) {
        setInvId(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value2(Long value) {
        setInvReasonId(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value3(Long value) {
        setInvEvidenceTypeId(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value4(String value) {
        setInvEvidenceNumber(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value5(LocalDate value) {
        setInvEvidenceDt(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value6(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value7(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value8(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value9(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value10(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value11(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value12(LocalDate value) {
        setDateInvalidation(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value13(Long value) {
        setSignerId(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord value14(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FpCaseInvalidationRecord values(Long value1, Long value2, Long value3, String value4, LocalDate value5, Long value6, OffsetDateTime value7, OffsetDateTime value8, String value9, OffsetDateTime value10, OffsetDateTime value11, LocalDate value12, Long value13, String value14) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpCaseInvalidationRecord
     */
    public FpCaseInvalidationRecord() {
        super(FpCaseInvalidation.FP_CASE_INVALIDATION);
    }

    /**
     * Create a detached, initialised FpCaseInvalidationRecord
     */
    public FpCaseInvalidationRecord(Long invId, Long invReasonId, Long invEvidenceTypeId, String invEvidenceNumber, LocalDate invEvidenceDt, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, LocalDate dateInvalidation, Long signerId, String comment) {
        super(FpCaseInvalidation.FP_CASE_INVALIDATION);

        setInvId(invId);
        setInvReasonId(invReasonId);
        setInvEvidenceTypeId(invEvidenceTypeId);
        setInvEvidenceNumber(invEvidenceNumber);
        setInvEvidenceDt(invEvidenceDt);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setDateInvalidation(dateInvalidation);
        setSignerId(signerId);
        setComment(comment);
        resetChangedOnNotNull();
    }
}