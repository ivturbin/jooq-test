/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.UserTask;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record14;
import org.jooq.Row14;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserTaskRecord extends UpdatableRecordImpl<UserTaskRecord> implements Record14<UUID, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, Long, String, String, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.user_task.task_uid</code>.
     */
    public void setTaskUid(UUID value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.user_task.task_uid</code>.
     */
    public UUID getTaskUid() {
        return (UUID) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.user_task.responsible_user_id</code>.
     */
    public void setResponsibleUserId(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.user_task.responsible_user_id</code>.
     */
    public String getResponsibleUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>passport_international.user_task.form_key</code>.
     */
    public void setFormKey(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.user_task.form_key</code>.
     */
    public String getFormKey() {
        return (String) get(2);
    }

    /**
     * Setter for <code>passport_international.user_task.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.user_task.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for <code>passport_international.user_task.complete_dttm</code>.
     */
    public void setCompleteDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.user_task.complete_dttm</code>.
     */
    public OffsetDateTime getCompleteDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for <code>passport_international.user_task.due_dttm</code>.
     */
    public void setDueDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.user_task.due_dttm</code>.
     */
    public OffsetDateTime getDueDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>passport_international.user_task.reply_to</code>.
     */
    public void setReplyTo(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.user_task.reply_to</code>.
     */
    public String getReplyTo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>passport_international.user_task.system_code</code>.
     */
    public void setSystemCode(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.user_task.system_code</code>.
     */
    public String getSystemCode() {
        return (String) get(7);
    }

    /**
     * Setter for <code>passport_international.user_task.department_code</code>.
     */
    public void setDepartmentCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.user_task.department_code</code>.
     */
    public String getDepartmentCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.user_task.system_case_id</code>.
     */
    public void setSystemCaseId(Long value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.user_task.system_case_id</code>.
     */
    public Long getSystemCaseId() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>passport_international.user_task.task_type</code>. Тип
     * задачи
     */
    public void setTaskType(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>passport_international.user_task.task_type</code>. Тип
     * задачи
     */
    public String getTaskType() {
        return (String) get(10);
    }

    /**
     * Setter for <code>passport_international.user_task.activity_id</code>. ИД
     * шага в описании процесса
     */
    public void setActivityId(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>passport_international.user_task.activity_id</code>. ИД
     * шага в описании процесса
     */
    public String getActivityId() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.user_task.process_definition_key</code>. Код
     * бизнес-процесса, к которому принадлежит текущая задача
     */
    public void setProcessDefinitionKey(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.user_task.process_definition_key</code>. Код
     * бизнес-процесса, к которому принадлежит текущая задача
     */
    public String getProcessDefinitionKey() {
        return (String) get(12);
    }

    /**
     * Setter for <code>passport_international.user_task.variables</code>.
     * Переменные на шаге процесса
     */
    public void setVariables(String value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.user_task.variables</code>.
     * Переменные на шаге процесса
     */
    public String getVariables() {
        return (String) get(13);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<UUID> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record14 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row14<UUID, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, Long, String, String, String, String> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    @Override
    public Row14<UUID, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, String, Long, String, String, String, String> valuesRow() {
        return (Row14) super.valuesRow();
    }

    @Override
    public Field<UUID> field1() {
        return UserTask.USER_TASK.TASK_UID;
    }

    @Override
    public Field<String> field2() {
        return UserTask.USER_TASK.RESPONSIBLE_USER_ID;
    }

    @Override
    public Field<String> field3() {
        return UserTask.USER_TASK.FORM_KEY;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return UserTask.USER_TASK.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return UserTask.USER_TASK.COMPLETE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return UserTask.USER_TASK.DUE_DTTM;
    }

    @Override
    public Field<String> field7() {
        return UserTask.USER_TASK.REPLY_TO;
    }

    @Override
    public Field<String> field8() {
        return UserTask.USER_TASK.SYSTEM_CODE;
    }

    @Override
    public Field<String> field9() {
        return UserTask.USER_TASK.DEPARTMENT_CODE;
    }

    @Override
    public Field<Long> field10() {
        return UserTask.USER_TASK.SYSTEM_CASE_ID;
    }

    @Override
    public Field<String> field11() {
        return UserTask.USER_TASK.TASK_TYPE;
    }

    @Override
    public Field<String> field12() {
        return UserTask.USER_TASK.ACTIVITY_ID;
    }

    @Override
    public Field<String> field13() {
        return UserTask.USER_TASK.PROCESS_DEFINITION_KEY;
    }

    @Override
    public Field<String> field14() {
        return UserTask.USER_TASK.VARIABLES;
    }

    @Override
    public UUID component1() {
        return getTaskUid();
    }

    @Override
    public String component2() {
        return getResponsibleUserId();
    }

    @Override
    public String component3() {
        return getFormKey();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component5() {
        return getCompleteDttm();
    }

    @Override
    public OffsetDateTime component6() {
        return getDueDttm();
    }

    @Override
    public String component7() {
        return getReplyTo();
    }

    @Override
    public String component8() {
        return getSystemCode();
    }

    @Override
    public String component9() {
        return getDepartmentCode();
    }

    @Override
    public Long component10() {
        return getSystemCaseId();
    }

    @Override
    public String component11() {
        return getTaskType();
    }

    @Override
    public String component12() {
        return getActivityId();
    }

    @Override
    public String component13() {
        return getProcessDefinitionKey();
    }

    @Override
    public String component14() {
        return getVariables();
    }

    @Override
    public UUID value1() {
        return getTaskUid();
    }

    @Override
    public String value2() {
        return getResponsibleUserId();
    }

    @Override
    public String value3() {
        return getFormKey();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value5() {
        return getCompleteDttm();
    }

    @Override
    public OffsetDateTime value6() {
        return getDueDttm();
    }

    @Override
    public String value7() {
        return getReplyTo();
    }

    @Override
    public String value8() {
        return getSystemCode();
    }

    @Override
    public String value9() {
        return getDepartmentCode();
    }

    @Override
    public Long value10() {
        return getSystemCaseId();
    }

    @Override
    public String value11() {
        return getTaskType();
    }

    @Override
    public String value12() {
        return getActivityId();
    }

    @Override
    public String value13() {
        return getProcessDefinitionKey();
    }

    @Override
    public String value14() {
        return getVariables();
    }

    @Override
    public UserTaskRecord value1(UUID value) {
        setTaskUid(value);
        return this;
    }

    @Override
    public UserTaskRecord value2(String value) {
        setResponsibleUserId(value);
        return this;
    }

    @Override
    public UserTaskRecord value3(String value) {
        setFormKey(value);
        return this;
    }

    @Override
    public UserTaskRecord value4(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public UserTaskRecord value5(OffsetDateTime value) {
        setCompleteDttm(value);
        return this;
    }

    @Override
    public UserTaskRecord value6(OffsetDateTime value) {
        setDueDttm(value);
        return this;
    }

    @Override
    public UserTaskRecord value7(String value) {
        setReplyTo(value);
        return this;
    }

    @Override
    public UserTaskRecord value8(String value) {
        setSystemCode(value);
        return this;
    }

    @Override
    public UserTaskRecord value9(String value) {
        setDepartmentCode(value);
        return this;
    }

    @Override
    public UserTaskRecord value10(Long value) {
        setSystemCaseId(value);
        return this;
    }

    @Override
    public UserTaskRecord value11(String value) {
        setTaskType(value);
        return this;
    }

    @Override
    public UserTaskRecord value12(String value) {
        setActivityId(value);
        return this;
    }

    @Override
    public UserTaskRecord value13(String value) {
        setProcessDefinitionKey(value);
        return this;
    }

    @Override
    public UserTaskRecord value14(String value) {
        setVariables(value);
        return this;
    }

    @Override
    public UserTaskRecord values(UUID value1, String value2, String value3, OffsetDateTime value4, OffsetDateTime value5, OffsetDateTime value6, String value7, String value8, String value9, Long value10, String value11, String value12, String value13, String value14) {
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
     * Create a detached UserTaskRecord
     */
    public UserTaskRecord() {
        super(UserTask.USER_TASK);
    }

    /**
     * Create a detached, initialised UserTaskRecord
     */
    public UserTaskRecord(UUID taskUid, String responsibleUserId, String formKey, OffsetDateTime createDttm, OffsetDateTime completeDttm, OffsetDateTime dueDttm, String replyTo, String systemCode, String departmentCode, Long systemCaseId, String taskType, String activityId, String processDefinitionKey, String variables) {
        super(UserTask.USER_TASK);

        setTaskUid(taskUid);
        setResponsibleUserId(responsibleUserId);
        setFormKey(formKey);
        setCreateDttm(createDttm);
        setCompleteDttm(completeDttm);
        setDueDttm(dueDttm);
        setReplyTo(replyTo);
        setSystemCode(systemCode);
        setDepartmentCode(departmentCode);
        setSystemCaseId(systemCaseId);
        setTaskType(taskType);
        setActivityId(activityId);
        setProcessDefinitionKey(processDefinitionKey);
        setVariables(variables);
        resetChangedOnNotNull();
    }
}
