/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CoreProcedure;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Процедуры дела
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreProcedureRecord extends UpdatableRecordImpl<CoreProcedureRecord> implements Record11<Long, Long, OffsetDateTime, Long, LocalDate, Long, String, OffsetDateTime, OffsetDateTime, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_procedure.core_procedure_id</code>.
     * Идентификатор
     */
    public void setCoreProcedureId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.core_procedure_id</code>.
     * Идентификатор
     */
    public Long getCoreProcedureId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.operation_id</code>.
     * Идентификатор операции
     */
    public void setOperationId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.operation_id</code>.
     * Идентификатор операции
     */
    public Long getOperationId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.operation_dttm</code>. Дата и
     * время операции
     */
    public void setOperationDttm(OffsetDateTime value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.operation_dttm</code>. Дата и
     * время операции
     */
    public OffsetDateTime getOperationDttm() {
        return (OffsetDateTime) get(2);
    }

    /**
     * Setter for <code>passport_international.core_procedure.status_id</code>.
     * Идентификатор статуса
     */
    public void setStatusId(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.core_procedure.status_id</code>.
     * Идентификатор статуса
     */
    public Long getStatusId() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>passport_international.core_procedure.status_dt</code>.
     * Дата статуса
     */
    public void setStatusDt(LocalDate value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.core_procedure.status_dt</code>.
     * Дата статуса
     */
    public LocalDate getStatusDt() {
        return (LocalDate) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.core_case_id</code>.
     * Идентификатор дела
     */
    public void setCoreCaseId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.core_case_id</code>.
     * Идентификатор дела
     */
    public Long getCoreCaseId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.create_user</code>. Логин
     * пользователя
     */
    public void setCreateUser(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.create_user</code>. Логин
     * пользователя
     */
    public String getCreateUser() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.create_dttm</code>. Дата
     * время вставки записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.create_dttm</code>. Дата
     * время вставки записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for <code>passport_international.core_procedure.action_ind</code>.
     * Индикатор действия
     */
    public void setActionInd(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.core_procedure.action_ind</code>.
     * Индикатор действия
     */
    public String getActionInd() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_procedure.adm_send_bool</code>.
     */
    public void setAdmSendBool(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_procedure.adm_send_bool</code>.
     */
    public Boolean getAdmSendBool() {
        return (Boolean) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, OffsetDateTime, Long, LocalDate, Long, String, OffsetDateTime, OffsetDateTime, String, Boolean> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, Long, OffsetDateTime, Long, LocalDate, Long, String, OffsetDateTime, OffsetDateTime, String, Boolean> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CoreProcedure.CORE_PROCEDURE.CORE_PROCEDURE_ID;
    }

    @Override
    public Field<Long> field2() {
        return CoreProcedure.CORE_PROCEDURE.OPERATION_ID;
    }

    @Override
    public Field<OffsetDateTime> field3() {
        return CoreProcedure.CORE_PROCEDURE.OPERATION_DTTM;
    }

    @Override
    public Field<Long> field4() {
        return CoreProcedure.CORE_PROCEDURE.STATUS_ID;
    }

    @Override
    public Field<LocalDate> field5() {
        return CoreProcedure.CORE_PROCEDURE.STATUS_DT;
    }

    @Override
    public Field<Long> field6() {
        return CoreProcedure.CORE_PROCEDURE.CORE_CASE_ID;
    }

    @Override
    public Field<String> field7() {
        return CoreProcedure.CORE_PROCEDURE.CREATE_USER;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return CoreProcedure.CORE_PROCEDURE.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return CoreProcedure.CORE_PROCEDURE.MODIFY_DTTM;
    }

    @Override
    public Field<String> field10() {
        return CoreProcedure.CORE_PROCEDURE.ACTION_IND;
    }

    @Override
    public Field<Boolean> field11() {
        return CoreProcedure.CORE_PROCEDURE.ADM_SEND_BOOL;
    }

    @Override
    public Long component1() {
        return getCoreProcedureId();
    }

    @Override
    public Long component2() {
        return getOperationId();
    }

    @Override
    public OffsetDateTime component3() {
        return getOperationDttm();
    }

    @Override
    public Long component4() {
        return getStatusId();
    }

    @Override
    public LocalDate component5() {
        return getStatusDt();
    }

    @Override
    public Long component6() {
        return getCoreCaseId();
    }

    @Override
    public String component7() {
        return getCreateUser();
    }

    @Override
    public OffsetDateTime component8() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component9() {
        return getModifyDttm();
    }

    @Override
    public String component10() {
        return getActionInd();
    }

    @Override
    public Boolean component11() {
        return getAdmSendBool();
    }

    @Override
    public Long value1() {
        return getCoreProcedureId();
    }

    @Override
    public Long value2() {
        return getOperationId();
    }

    @Override
    public OffsetDateTime value3() {
        return getOperationDttm();
    }

    @Override
    public Long value4() {
        return getStatusId();
    }

    @Override
    public LocalDate value5() {
        return getStatusDt();
    }

    @Override
    public Long value6() {
        return getCoreCaseId();
    }

    @Override
    public String value7() {
        return getCreateUser();
    }

    @Override
    public OffsetDateTime value8() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value9() {
        return getModifyDttm();
    }

    @Override
    public String value10() {
        return getActionInd();
    }

    @Override
    public Boolean value11() {
        return getAdmSendBool();
    }

    @Override
    public CoreProcedureRecord value1(Long value) {
        setCoreProcedureId(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value2(Long value) {
        setOperationId(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value3(OffsetDateTime value) {
        setOperationDttm(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value4(Long value) {
        setStatusId(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value5(LocalDate value) {
        setStatusDt(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value6(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value7(String value) {
        setCreateUser(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value8(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value9(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value10(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public CoreProcedureRecord value11(Boolean value) {
        setAdmSendBool(value);
        return this;
    }

    @Override
    public CoreProcedureRecord values(Long value1, Long value2, OffsetDateTime value3, Long value4, LocalDate value5, Long value6, String value7, OffsetDateTime value8, OffsetDateTime value9, String value10, Boolean value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreProcedureRecord
     */
    public CoreProcedureRecord() {
        super(CoreProcedure.CORE_PROCEDURE);
    }

    /**
     * Create a detached, initialised CoreProcedureRecord
     */
    public CoreProcedureRecord(Long coreProcedureId, Long operationId, OffsetDateTime operationDttm, Long statusId, LocalDate statusDt, Long coreCaseId, String createUser, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, Boolean admSendBool) {
        super(CoreProcedure.CORE_PROCEDURE);

        setCoreProcedureId(coreProcedureId);
        setOperationId(operationId);
        setOperationDttm(operationDttm);
        setStatusId(statusId);
        setStatusDt(statusDt);
        setCoreCaseId(coreCaseId);
        setCreateUser(createUser);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setAdmSendBool(admSendBool);
        resetChangedOnNotNull();
    }
}
