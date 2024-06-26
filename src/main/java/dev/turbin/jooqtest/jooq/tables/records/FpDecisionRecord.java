/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpDecision;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Решение по делу модуля ЗП
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpDecisionRecord extends UpdatableRecordImpl<FpDecisionRecord> implements Record18<Long, LocalDate, LocalDate, String, Long, Long, Long, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_decision.decision_id</code>.
     * Дело, по которому принято решение
     */
    public void setDecisionId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.decision_id</code>.
     * Дело, по которому принято решение
     */
    public Long getDecisionId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.fp_decision.decision_dt</code>.
     * Дата принятия решения
     */
    public void setDecisionDt(LocalDate value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.decision_dt</code>.
     * Дата принятия решения
     */
    public LocalDate getDecisionDt() {
        return (LocalDate) get(1);
    }

    /**
     * Setter for <code>passport_international.fp_decision.create_dt</code>.
     * Дата создания записи
     */
    public void setCreateDt(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.create_dt</code>.
     * Дата создания записи
     */
    public LocalDate getCreateDt() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>passport_international.fp_decision.user_login</code>.
     * Пользователь, принявший решение по делу
     */
    public void setUserLogin(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.user_login</code>.
     * Пользователь, принявший решение по делу
     */
    public String getUserLogin() {
        return (String) get(3);
    }

    /**
     * Setter for <code>passport_international.fp_decision.type_id</code>. Тип
     * решения
     */
    public void setTypeId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.type_id</code>. Тип
     * решения
     */
    public Long getTypeId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>passport_international.fp_decision.basis_id</code>. Тип
     * основания для решения
     */
    public void setBasisId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.basis_id</code>. Тип
     * основания для решения
     */
    public Long getBasisId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>passport_international.fp_decision.check_fsb_id</code>.
     * Орган ФСБ, осуществивший проверку
     */
    public void setCheckFsbId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.check_fsb_id</code>.
     * Орган ФСБ, осуществивший проверку
     */
    public Long getCheckFsbId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision.decision_number</code>. Номер
     * решения
     */
    public void setDecisionNumber(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision.decision_number</code>. Номер
     * решения
     */
    public String getDecisionNumber() {
        return (String) get(7);
    }

    /**
     * Setter for <code>passport_international.fp_decision.comments</code>.
     * Комментарий
     */
    public void setComments(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.comments</code>.
     * Комментарий
     */
    public String getComments() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.fp_decision.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>passport_international.fp_decision.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for <code>passport_international.fp_decision.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(11, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(11);
    }

    /**
     * Setter for <code>passport_international.fp_decision.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(12);
    }

    /**
     * Setter for <code>passport_international.fp_decision.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(13);
    }

    /**
     * Setter for <code>passport_international.fp_decision.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>passport_international.fp_decision.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision.restrict_from_dt</code>.
     */
    public void setRestrictFromDt(LocalDate value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision.restrict_from_dt</code>.
     */
    public LocalDate getRestrictFromDt() {
        return (LocalDate) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision.restrict_to_dt</code>.
     */
    public void setRestrictToDt(LocalDate value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision.restrict_to_dt</code>.
     */
    public LocalDate getRestrictToDt() {
        return (LocalDate) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.fp_decision.organ_by_decision</code>.
     */
    public void setOrganByDecision(String value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_decision.organ_by_decision</code>.
     */
    public String getOrganByDecision() {
        return (String) get(17);
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
    public Row18<Long, LocalDate, LocalDate, String, Long, Long, Long, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Long, LocalDate, LocalDate, String, Long, Long, Long, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpDecision.FP_DECISION.DECISION_ID;
    }

    @Override
    public Field<LocalDate> field2() {
        return FpDecision.FP_DECISION.DECISION_DT;
    }

    @Override
    public Field<LocalDate> field3() {
        return FpDecision.FP_DECISION.CREATE_DT;
    }

    @Override
    public Field<String> field4() {
        return FpDecision.FP_DECISION.USER_LOGIN;
    }

    @Override
    public Field<Long> field5() {
        return FpDecision.FP_DECISION.TYPE_ID;
    }

    @Override
    public Field<Long> field6() {
        return FpDecision.FP_DECISION.BASIS_ID;
    }

    @Override
    public Field<Long> field7() {
        return FpDecision.FP_DECISION.CHECK_FSB_ID;
    }

    @Override
    public Field<String> field8() {
        return FpDecision.FP_DECISION.DECISION_NUMBER;
    }

    @Override
    public Field<String> field9() {
        return FpDecision.FP_DECISION.COMMENTS;
    }

    @Override
    public Field<Long> field10() {
        return FpDecision.FP_DECISION.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return FpDecision.FP_DECISION.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field12() {
        return FpDecision.FP_DECISION.MODIFY_DTTM;
    }

    @Override
    public Field<String> field13() {
        return FpDecision.FP_DECISION.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field14() {
        return FpDecision.FP_DECISION.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field15() {
        return FpDecision.FP_DECISION.EXP_DTTM;
    }

    @Override
    public Field<LocalDate> field16() {
        return FpDecision.FP_DECISION.RESTRICT_FROM_DT;
    }

    @Override
    public Field<LocalDate> field17() {
        return FpDecision.FP_DECISION.RESTRICT_TO_DT;
    }

    @Override
    public Field<String> field18() {
        return FpDecision.FP_DECISION.ORGAN_BY_DECISION;
    }

    @Override
    public Long component1() {
        return getDecisionId();
    }

    @Override
    public LocalDate component2() {
        return getDecisionDt();
    }

    @Override
    public LocalDate component3() {
        return getCreateDt();
    }

    @Override
    public String component4() {
        return getUserLogin();
    }

    @Override
    public Long component5() {
        return getTypeId();
    }

    @Override
    public Long component6() {
        return getBasisId();
    }

    @Override
    public Long component7() {
        return getCheckFsbId();
    }

    @Override
    public String component8() {
        return getDecisionNumber();
    }

    @Override
    public String component9() {
        return getComments();
    }

    @Override
    public Long component10() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component11() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component12() {
        return getModifyDttm();
    }

    @Override
    public String component13() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component14() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component15() {
        return getExpDttm();
    }

    @Override
    public LocalDate component16() {
        return getRestrictFromDt();
    }

    @Override
    public LocalDate component17() {
        return getRestrictToDt();
    }

    @Override
    public String component18() {
        return getOrganByDecision();
    }

    @Override
    public Long value1() {
        return getDecisionId();
    }

    @Override
    public LocalDate value2() {
        return getDecisionDt();
    }

    @Override
    public LocalDate value3() {
        return getCreateDt();
    }

    @Override
    public String value4() {
        return getUserLogin();
    }

    @Override
    public Long value5() {
        return getTypeId();
    }

    @Override
    public Long value6() {
        return getBasisId();
    }

    @Override
    public Long value7() {
        return getCheckFsbId();
    }

    @Override
    public String value8() {
        return getDecisionNumber();
    }

    @Override
    public String value9() {
        return getComments();
    }

    @Override
    public Long value10() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value11() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value12() {
        return getModifyDttm();
    }

    @Override
    public String value13() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value14() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value15() {
        return getExpDttm();
    }

    @Override
    public LocalDate value16() {
        return getRestrictFromDt();
    }

    @Override
    public LocalDate value17() {
        return getRestrictToDt();
    }

    @Override
    public String value18() {
        return getOrganByDecision();
    }

    @Override
    public FpDecisionRecord value1(Long value) {
        setDecisionId(value);
        return this;
    }

    @Override
    public FpDecisionRecord value2(LocalDate value) {
        setDecisionDt(value);
        return this;
    }

    @Override
    public FpDecisionRecord value3(LocalDate value) {
        setCreateDt(value);
        return this;
    }

    @Override
    public FpDecisionRecord value4(String value) {
        setUserLogin(value);
        return this;
    }

    @Override
    public FpDecisionRecord value5(Long value) {
        setTypeId(value);
        return this;
    }

    @Override
    public FpDecisionRecord value6(Long value) {
        setBasisId(value);
        return this;
    }

    @Override
    public FpDecisionRecord value7(Long value) {
        setCheckFsbId(value);
        return this;
    }

    @Override
    public FpDecisionRecord value8(String value) {
        setDecisionNumber(value);
        return this;
    }

    @Override
    public FpDecisionRecord value9(String value) {
        setComments(value);
        return this;
    }

    @Override
    public FpDecisionRecord value10(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpDecisionRecord value11(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpDecisionRecord value12(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpDecisionRecord value13(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpDecisionRecord value14(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpDecisionRecord value15(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpDecisionRecord value16(LocalDate value) {
        setRestrictFromDt(value);
        return this;
    }

    @Override
    public FpDecisionRecord value17(LocalDate value) {
        setRestrictToDt(value);
        return this;
    }

    @Override
    public FpDecisionRecord value18(String value) {
        setOrganByDecision(value);
        return this;
    }

    @Override
    public FpDecisionRecord values(Long value1, LocalDate value2, LocalDate value3, String value4, Long value5, Long value6, Long value7, String value8, String value9, Long value10, OffsetDateTime value11, OffsetDateTime value12, String value13, OffsetDateTime value14, OffsetDateTime value15, LocalDate value16, LocalDate value17, String value18) {
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
     * Create a detached FpDecisionRecord
     */
    public FpDecisionRecord() {
        super(FpDecision.FP_DECISION);
    }

    /**
     * Create a detached, initialised FpDecisionRecord
     */
    public FpDecisionRecord(Long decisionId, LocalDate decisionDt, LocalDate createDt, String userLogin, Long typeId, Long basisId, Long checkFsbId, String decisionNumber, String comments, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, LocalDate restrictFromDt, LocalDate restrictToDt, String organByDecision) {
        super(FpDecision.FP_DECISION);

        setDecisionId(decisionId);
        setDecisionDt(decisionDt);
        setCreateDt(createDt);
        setUserLogin(userLogin);
        setTypeId(typeId);
        setBasisId(basisId);
        setCheckFsbId(checkFsbId);
        setDecisionNumber(decisionNumber);
        setComments(comments);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setRestrictFromDt(restrictFromDt);
        setRestrictToDt(restrictToDt);
        setOrganByDecision(organByDecision);
        resetChangedOnNotNull();
    }
}
