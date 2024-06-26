/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCancelRestrictCase;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record16;
import org.jooq.Row16;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Дело об отмене ограничений
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCancelRestrictCaseRecord extends UpdatableRecordImpl<FpCancelRestrictCaseRecord> implements Record16<Long, Long, String, String, LocalDate, LocalDate, LocalDate, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.cancel_restrict_id</code>.
     * Индефикатор дела
     */
    public void setCancelRestrictId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.cancel_restrict_id</code>.
     * Индефикатор дела
     */
    public Long getCancelRestrictId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.restrict_id</code>.
     * Индефикатор дела об ограничении
     */
    public void setRestrictId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.restrict_id</code>.
     * Индефикатор дела об ограничении
     */
    public Long getRestrictId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.type_doc</code>. Тип
     * документа подтверждающий права в отношении несовершеннолетнего лица
     */
    public void setTypeDoc(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.type_doc</code>. Тип
     * документа подтверждающий права в отношении несовершеннолетнего лица
     */
    public String getTypeDoc() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.doc_no</code>. Номер
     * документа подтверждающий права в отношении несовершеннолетнего лица
     */
    public void setDocNo(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.doc_no</code>. Номер
     * документа подтверждающий права в отношении несовершеннолетнего лица
     */
    public String getDocNo() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.issue_dt</code>.
     * Дата выдачи документа подтверждающего права в отношении
     * несовершеннолетнего лица
     */
    public void setIssueDt(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.issue_dt</code>.
     * Дата выдачи документа подтверждающего права в отношении
     * несовершеннолетнего лица
     */
    public LocalDate getIssueDt() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.end_restrict_from_dt</code>.
     * Дата окончания ограничения с
     */
    public void setEndRestrictFromDt(LocalDate value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.end_restrict_from_dt</code>.
     * Дата окончания ограничения с
     */
    public LocalDate getEndRestrictFromDt() {
        return (LocalDate) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.end_restrict_to_dt</code>.
     * Дата окончания ограничения по
     */
    public void setEndRestrictToDt(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.end_restrict_to_dt</code>.
     * Дата окончания ограничения по
     */
    public LocalDate getEndRestrictToDt() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.type_doc_base</code>.
     * Тип документа основания
     */
    public void setTypeDocBase(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.type_doc_base</code>.
     * Тип документа основания
     */
    public String getTypeDocBase() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.comment_base</code>.
     * Комментарий к основанию (решение суда и т.п.)
     */
    public void setCommentBase(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.comment_base</code>.
     * Комментарий к основанию (решение суда и т.п.)
     */
    public String getCommentBase() {
        return (String) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.comment</code>.
     * Комментарий
     */
    public void setComment(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.comment</code>.
     * Комментарий
     */
    public String getComment() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.fp_cancel_restrict_case.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_cancel_restrict_case.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(15);
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
    public Row16<Long, Long, String, String, LocalDate, LocalDate, LocalDate, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    @Override
    public Row16<Long, Long, String, String, LocalDate, LocalDate, LocalDate, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row16) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.CANCEL_RESTRICT_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.RESTRICT_ID;
    }

    @Override
    public Field<String> field3() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.TYPE_DOC;
    }

    @Override
    public Field<String> field4() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.DOC_NO;
    }

    @Override
    public Field<LocalDate> field5() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.ISSUE_DT;
    }

    @Override
    public Field<LocalDate> field6() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.END_RESTRICT_FROM_DT;
    }

    @Override
    public Field<LocalDate> field7() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.END_RESTRICT_TO_DT;
    }

    @Override
    public Field<String> field8() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.TYPE_DOC_BASE;
    }

    @Override
    public Field<String> field9() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.COMMENT_BASE;
    }

    @Override
    public Field<String> field10() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.COMMENT;
    }

    @Override
    public Field<Long> field11() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field12() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field13() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.MODIFY_DTTM;
    }

    @Override
    public Field<String> field14() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field15() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field16() {
        return FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE.EXP_DTTM;
    }

    @Override
    public Long component1() {
        return getCancelRestrictId();
    }

    @Override
    public Long component2() {
        return getRestrictId();
    }

    @Override
    public String component3() {
        return getTypeDoc();
    }

    @Override
    public String component4() {
        return getDocNo();
    }

    @Override
    public LocalDate component5() {
        return getIssueDt();
    }

    @Override
    public LocalDate component6() {
        return getEndRestrictFromDt();
    }

    @Override
    public LocalDate component7() {
        return getEndRestrictToDt();
    }

    @Override
    public String component8() {
        return getTypeDocBase();
    }

    @Override
    public String component9() {
        return getCommentBase();
    }

    @Override
    public String component10() {
        return getComment();
    }

    @Override
    public Long component11() {
        return getSrcId();
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
    public OffsetDateTime component15() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component16() {
        return getExpDttm();
    }

    @Override
    public Long value1() {
        return getCancelRestrictId();
    }

    @Override
    public Long value2() {
        return getRestrictId();
    }

    @Override
    public String value3() {
        return getTypeDoc();
    }

    @Override
    public String value4() {
        return getDocNo();
    }

    @Override
    public LocalDate value5() {
        return getIssueDt();
    }

    @Override
    public LocalDate value6() {
        return getEndRestrictFromDt();
    }

    @Override
    public LocalDate value7() {
        return getEndRestrictToDt();
    }

    @Override
    public String value8() {
        return getTypeDocBase();
    }

    @Override
    public String value9() {
        return getCommentBase();
    }

    @Override
    public String value10() {
        return getComment();
    }

    @Override
    public Long value11() {
        return getSrcId();
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
    public OffsetDateTime value15() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value16() {
        return getExpDttm();
    }

    @Override
    public FpCancelRestrictCaseRecord value1(Long value) {
        setCancelRestrictId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value2(Long value) {
        setRestrictId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value3(String value) {
        setTypeDoc(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value4(String value) {
        setDocNo(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value5(LocalDate value) {
        setIssueDt(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value6(LocalDate value) {
        setEndRestrictFromDt(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value7(LocalDate value) {
        setEndRestrictToDt(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value8(String value) {
        setTypeDocBase(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value9(String value) {
        setCommentBase(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value10(String value) {
        setComment(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value11(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value12(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value13(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value14(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value15(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord value16(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpCancelRestrictCaseRecord values(Long value1, Long value2, String value3, String value4, LocalDate value5, LocalDate value6, LocalDate value7, String value8, String value9, String value10, Long value11, OffsetDateTime value12, OffsetDateTime value13, String value14, OffsetDateTime value15, OffsetDateTime value16) {
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
     * Create a detached FpCancelRestrictCaseRecord
     */
    public FpCancelRestrictCaseRecord() {
        super(FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE);
    }

    /**
     * Create a detached, initialised FpCancelRestrictCaseRecord
     */
    public FpCancelRestrictCaseRecord(Long cancelRestrictId, Long restrictId, String typeDoc, String docNo, LocalDate issueDt, LocalDate endRestrictFromDt, LocalDate endRestrictToDt, String typeDocBase, String commentBase, String comment, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm) {
        super(FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE);

        setCancelRestrictId(cancelRestrictId);
        setRestrictId(restrictId);
        setTypeDoc(typeDoc);
        setDocNo(docNo);
        setIssueDt(issueDt);
        setEndRestrictFromDt(endRestrictFromDt);
        setEndRestrictToDt(endRestrictToDt);
        setTypeDocBase(typeDocBase);
        setCommentBase(commentBase);
        setComment(comment);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        resetChangedOnNotNull();
    }
}
