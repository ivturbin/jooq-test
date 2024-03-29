/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCaseAlter;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record8;
import org.jooq.Row8;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Дело о внесении изменений в действующий заграничный паспорт
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseAlterRecord extends UpdatableRecordImpl<FpCaseAlterRecord> implements Record8<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_case_alter.alter_id</code>.
     * Идентификатор
     */
    public void setAlterId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.alter_id</code>.
     * Идентификатор
     */
    public Long getAlterId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_alter.fp_case_issuance_id</code>.
     * Дело по выдаче заграничного паспорта
     */
    public void setFpCaseIssuanceId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_alter.fp_case_issuance_id</code>.
     * Дело по выдаче заграничного паспорта
     */
    public Long getFpCaseIssuanceId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>passport_international.fp_case_alter.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>passport_international.fp_case_alter.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>passport_international.fp_case_alter.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>passport_international.fp_case_alter.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(5);
    }

    /**
     * Setter for <code>passport_international.fp_case_alter.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setEffDttm(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public LocalDateTime getEffDttm() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>passport_international.fp_case_alter.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setExpDttm(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_alter.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public LocalDateTime getExpDttm() {
        return (LocalDateTime) get(7);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record8 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    @Override
    public Row8<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row8) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCaseAlter.FP_CASE_ALTER.ALTER_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpCaseAlter.FP_CASE_ALTER.FP_CASE_ISSUANCE_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpCaseAlter.FP_CASE_ALTER.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return FpCaseAlter.FP_CASE_ALTER.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpCaseAlter.FP_CASE_ALTER.MODIFY_DTTM;
    }

    @Override
    public Field<String> field6() {
        return FpCaseAlter.FP_CASE_ALTER.ACTION_IND;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return FpCaseAlter.FP_CASE_ALTER.EFF_DTTM;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return FpCaseAlter.FP_CASE_ALTER.EXP_DTTM;
    }

    @Override
    public Long component1() {
        return getAlterId();
    }

    @Override
    public Long component2() {
        return getFpCaseIssuanceId();
    }

    @Override
    public Long component3() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component5() {
        return getModifyDttm();
    }

    @Override
    public String component6() {
        return getActionInd();
    }

    @Override
    public LocalDateTime component7() {
        return getEffDttm();
    }

    @Override
    public LocalDateTime component8() {
        return getExpDttm();
    }

    @Override
    public Long value1() {
        return getAlterId();
    }

    @Override
    public Long value2() {
        return getFpCaseIssuanceId();
    }

    @Override
    public Long value3() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value5() {
        return getModifyDttm();
    }

    @Override
    public String value6() {
        return getActionInd();
    }

    @Override
    public LocalDateTime value7() {
        return getEffDttm();
    }

    @Override
    public LocalDateTime value8() {
        return getExpDttm();
    }

    @Override
    public FpCaseAlterRecord value1(Long value) {
        setAlterId(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value2(Long value) {
        setFpCaseIssuanceId(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value3(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value4(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value5(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value6(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value7(LocalDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord value8(LocalDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpCaseAlterRecord values(Long value1, Long value2, Long value3, OffsetDateTime value4, OffsetDateTime value5, String value6, LocalDateTime value7, LocalDateTime value8) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpCaseAlterRecord
     */
    public FpCaseAlterRecord() {
        super(FpCaseAlter.FP_CASE_ALTER);
    }

    /**
     * Create a detached, initialised FpCaseAlterRecord
     */
    public FpCaseAlterRecord(Long alterId, Long fpCaseIssuanceId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, LocalDateTime effDttm, LocalDateTime expDttm) {
        super(FpCaseAlter.FP_CASE_ALTER);

        setAlterId(alterId);
        setFpCaseIssuanceId(fpCaseIssuanceId);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        resetChangedOnNotNull();
    }
}
