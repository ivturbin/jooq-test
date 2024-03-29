/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.DestructionAct;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Акт уничтожения бланков заграна
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DestructionActRecord extends UpdatableRecordImpl<DestructionActRecord> implements Record14<Long, String, LocalDate, LocalDate, Long, String, Long, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.destruction_act.destruction_act_id</code>.
     * Индификатор акта
     */
    public void setDestructionActId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.destruction_act_id</code>.
     * Индификатор акта
     */
    public Long getDestructionActId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.destruction_act.number_act</code>. Номер
     * акта
     */
    public void setNumberAct(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.number_act</code>. Номер
     * акта
     */
    public String getNumberAct() {
        return (String) get(1);
    }

    /**
     * Setter for <code>passport_international.destruction_act.create_dt</code>.
     * Дата создания акта
     */
    public void setCreateDt(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.create_dt</code>.
     * Дата создания акта
     */
    public LocalDate getCreateDt() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for <code>passport_international.destruction_act.make_dt</code>.
     * Дата составления акта
     */
    public void setMakeDt(LocalDate value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.make_dt</code>.
     * Дата составления акта
     */
    public LocalDate getMakeDt() {
        return (LocalDate) get(3);
    }

    /**
     * Setter for <code>passport_international.destruction_act.status_id</code>.
     * В каком статусе находится акт
     */
    public void setStatusId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.status_id</code>.
     * В каком статусе находится акт
     */
    public Long getStatusId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.destruction_act.department_code</code>. Код
     * подразделения
     */
    public void setDepartmentCode(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.department_code</code>. Код
     * подразделения
     */
    public String getDepartmentCode() {
        return (String) get(5);
    }

    /**
     * Setter for <code>passport_international.destruction_act.region_id</code>.
     */
    public void setRegionId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.region_id</code>.
     */
    public Long getRegionId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.destruction_act.head_organization</code>.
     * Руководитель
     */
    public void setHeadOrganization(String value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.head_organization</code>.
     * Руководитель
     */
    public String getHeadOrganization() {
        return (String) get(7);
    }

    /**
     * Setter for <code>passport_international.destruction_act.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.destruction_act.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.destruction_act.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.destruction_act.action_ind</code>. Индикатор
     * операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.destruction_act.action_ind</code>. Индикатор
     * операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(11);
    }

    /**
     * Setter for <code>passport_international.destruction_act.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(12, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(12);
    }

    /**
     * Setter for <code>passport_international.destruction_act.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.destruction_act.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(13);
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
    public Row14<Long, String, LocalDate, LocalDate, Long, String, Long, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<Long, String, LocalDate, LocalDate, Long, String, Long, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return DestructionAct.DESTRUCTION_ACT.DESTRUCTION_ACT_ID;
    }

    @Override
    public Field<String> field2() {
        return DestructionAct.DESTRUCTION_ACT.NUMBER_ACT;
    }

    @Override
    public Field<LocalDate> field3() {
        return DestructionAct.DESTRUCTION_ACT.CREATE_DT;
    }

    @Override
    public Field<LocalDate> field4() {
        return DestructionAct.DESTRUCTION_ACT.MAKE_DT;
    }

    @Override
    public Field<Long> field5() {
        return DestructionAct.DESTRUCTION_ACT.STATUS_ID;
    }

    @Override
    public Field<String> field6() {
        return DestructionAct.DESTRUCTION_ACT.DEPARTMENT_CODE;
    }

    @Override
    public Field<Long> field7() {
        return DestructionAct.DESTRUCTION_ACT.REGION_ID;
    }

    @Override
    public Field<String> field8() {
        return DestructionAct.DESTRUCTION_ACT.HEAD_ORGANIZATION;
    }

    @Override
    public Field<Long> field9() {
        return DestructionAct.DESTRUCTION_ACT.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field10() {
        return DestructionAct.DESTRUCTION_ACT.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field11() {
        return DestructionAct.DESTRUCTION_ACT.MODIFY_DTTM;
    }

    @Override
    public Field<String> field12() {
        return DestructionAct.DESTRUCTION_ACT.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field13() {
        return DestructionAct.DESTRUCTION_ACT.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field14() {
        return DestructionAct.DESTRUCTION_ACT.EXP_DTTM;
    }

    @Override
    public Long component1() {
        return getDestructionActId();
    }

    @Override
    public String component2() {
        return getNumberAct();
    }

    @Override
    public LocalDate component3() {
        return getCreateDt();
    }

    @Override
    public LocalDate component4() {
        return getMakeDt();
    }

    @Override
    public Long component5() {
        return getStatusId();
    }

    @Override
    public String component6() {
        return getDepartmentCode();
    }

    @Override
    public Long component7() {
        return getRegionId();
    }

    @Override
    public String component8() {
        return getHeadOrganization();
    }

    @Override
    public Long component9() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime component10() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component11() {
        return getModifyDttm();
    }

    @Override
    public String component12() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime component13() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component14() {
        return getExpDttm();
    }

    @Override
    public Long value1() {
        return getDestructionActId();
    }

    @Override
    public String value2() {
        return getNumberAct();
    }

    @Override
    public LocalDate value3() {
        return getCreateDt();
    }

    @Override
    public LocalDate value4() {
        return getMakeDt();
    }

    @Override
    public Long value5() {
        return getStatusId();
    }

    @Override
    public String value6() {
        return getDepartmentCode();
    }

    @Override
    public Long value7() {
        return getRegionId();
    }

    @Override
    public String value8() {
        return getHeadOrganization();
    }

    @Override
    public Long value9() {
        return getSrcId();
    }

    @Override
    public OffsetDateTime value10() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value11() {
        return getModifyDttm();
    }

    @Override
    public String value12() {
        return getActionInd();
    }

    @Override
    public OffsetDateTime value13() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value14() {
        return getExpDttm();
    }

    @Override
    public DestructionActRecord value1(Long value) {
        setDestructionActId(value);
        return this;
    }

    @Override
    public DestructionActRecord value2(String value) {
        setNumberAct(value);
        return this;
    }

    @Override
    public DestructionActRecord value3(LocalDate value) {
        setCreateDt(value);
        return this;
    }

    @Override
    public DestructionActRecord value4(LocalDate value) {
        setMakeDt(value);
        return this;
    }

    @Override
    public DestructionActRecord value5(Long value) {
        setStatusId(value);
        return this;
    }

    @Override
    public DestructionActRecord value6(String value) {
        setDepartmentCode(value);
        return this;
    }

    @Override
    public DestructionActRecord value7(Long value) {
        setRegionId(value);
        return this;
    }

    @Override
    public DestructionActRecord value8(String value) {
        setHeadOrganization(value);
        return this;
    }

    @Override
    public DestructionActRecord value9(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public DestructionActRecord value10(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public DestructionActRecord value11(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public DestructionActRecord value12(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public DestructionActRecord value13(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public DestructionActRecord value14(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public DestructionActRecord values(Long value1, String value2, LocalDate value3, LocalDate value4, Long value5, String value6, Long value7, String value8, Long value9, OffsetDateTime value10, OffsetDateTime value11, String value12, OffsetDateTime value13, OffsetDateTime value14) {
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
     * Create a detached DestructionActRecord
     */
    public DestructionActRecord() {
        super(DestructionAct.DESTRUCTION_ACT);
    }

    /**
     * Create a detached, initialised DestructionActRecord
     */
    public DestructionActRecord(Long destructionActId, String numberAct, LocalDate createDt, LocalDate makeDt, Long statusId, String departmentCode, Long regionId, String headOrganization, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm) {
        super(DestructionAct.DESTRUCTION_ACT);

        setDestructionActId(destructionActId);
        setNumberAct(numberAct);
        setCreateDt(createDt);
        setMakeDt(makeDt);
        setStatusId(statusId);
        setDepartmentCode(departmentCode);
        setRegionId(regionId);
        setHeadOrganization(headOrganization);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        resetChangedOnNotNull();
    }
}