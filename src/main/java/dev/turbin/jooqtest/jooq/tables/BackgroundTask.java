/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.BackgroundTaskRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function16;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row16;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Фоновая задача
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BackgroundTask extends TableImpl<BackgroundTaskRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.background_task</code>
     */
    public static final BackgroundTask BACKGROUND_TASK = new BackgroundTask();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BackgroundTaskRecord> getRecordType() {
        return BackgroundTaskRecord.class;
    }

    /**
     * The column
     * <code>passport_international.background_task.background_task_id</code>.
     * Внутренний идентификатор
     */
    public final TableField<BackgroundTaskRecord, Long> BACKGROUND_TASK_ID = createField(DSL.name("background_task_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Внутренний идентификатор");

    /**
     * The column <code>passport_international.background_task.job_code</code>.
     * Код выполняемой задачи
     */
    public final TableField<BackgroundTaskRecord, String> JOB_CODE = createField(DSL.name("job_code"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Код выполняемой задачи");

    /**
     * The column
     * <code>passport_international.background_task.job_parameters_json</code>.
     * Параметры задачи
     */
    public final TableField<BackgroundTaskRecord, JSONB> JOB_PARAMETERS_JSON = createField(DSL.name("job_parameters_json"), SQLDataType.JSONB, this, "Параметры задачи");

    /**
     * The column <code>passport_international.background_task.job_id</code>.
     * Идентификатор задачи от администрирования
     */
    public final TableField<BackgroundTaskRecord, Long> JOB_ID = createField(DSL.name("job_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор задачи от администрирования");

    /**
     * The column
     * <code>passport_international.background_task.job_error_bool</code>.
     * Признак ошибки
     */
    public final TableField<BackgroundTaskRecord, Boolean> JOB_ERROR_BOOL = createField(DSL.name("job_error_bool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Признак ошибки");

    /**
     * The column
     * <code>passport_international.background_task.job_done_bool</code>.
     * Признак готовности
     */
    public final TableField<BackgroundTaskRecord, Boolean> JOB_DONE_BOOL = createField(DSL.name("job_done_bool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Признак готовности");

    /**
     * The column
     * <code>passport_international.background_task.job_result_uid</code>. UID
     * файла с результатами выполнения
     */
    public final TableField<BackgroundTaskRecord, UUID> JOB_RESULT_UID = createField(DSL.name("job_result_uid"), SQLDataType.UUID, this, "UID файла с результатами выполнения");

    /**
     * The column
     * <code>passport_international.background_task.job_error_log_uid</code>.
     * UID файла с логом ошибки
     */
    public final TableField<BackgroundTaskRecord, UUID> JOB_ERROR_LOG_UID = createField(DSL.name("job_error_log_uid"), SQLDataType.UUID, this, "UID файла с логом ошибки");

    /**
     * The column
     * <code>passport_international.background_task.job_error_log_cval</code>.
     * Лог ошибки на обработке задачи
     */
    public final TableField<BackgroundTaskRecord, String> JOB_ERROR_LOG_CVAL = createField(DSL.name("job_error_log_cval"), SQLDataType.CLOB, this, "Лог ошибки на обработке задачи");

    /**
     * The column
     * <code>passport_international.background_task.job_send_bool</code>.
     * Признак отправки задачи
     */
    public final TableField<BackgroundTaskRecord, Boolean> JOB_SEND_BOOL = createField(DSL.name("job_send_bool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Признак отправки задачи");

    /**
     * The column
     * <code>passport_international.background_task.create_dttm</code>.
     */
    public final TableField<BackgroundTaskRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.background_task.modify_dttm</code>.
     */
    public final TableField<BackgroundTaskRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.background_task.action_ind</code>.
     */
    public final TableField<BackgroundTaskRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>passport_international.background_task.job_result_file</code>.
     * Ссылка на файл результатов в файловом хранилище (fileLink)
     */
    public final TableField<BackgroundTaskRecord, String> JOB_RESULT_FILE = createField(DSL.name("job_result_file"), SQLDataType.VARCHAR(256), this, "Ссылка на файл результатов в файловом хранилище (fileLink)");

    /**
     * The column
     * <code>passport_international.background_task.job_error_log_file</code>.
     * Ссылка на файл ошибок в файловом хранилище (fileLink)
     */
    public final TableField<BackgroundTaskRecord, String> JOB_ERROR_LOG_FILE = createField(DSL.name("job_error_log_file"), SQLDataType.VARCHAR(256), this, "Ссылка на файл ошибок в файловом хранилище (fileLink)");

    /**
     * The column
     * <code>passport_international.background_task.job_text_result</code>.
     * Описание результата обработки фоновой задачи
     */
    public final TableField<BackgroundTaskRecord, String> JOB_TEXT_RESULT = createField(DSL.name("job_text_result"), SQLDataType.CLOB, this, "Описание результата обработки фоновой задачи");

    private BackgroundTask(Name alias, Table<BackgroundTaskRecord> aliased) {
        this(alias, aliased, null);
    }

    private BackgroundTask(Name alias, Table<BackgroundTaskRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Фоновая задача"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.background_task</code>
     * table reference
     */
    public BackgroundTask(String alias) {
        this(DSL.name(alias), BACKGROUND_TASK);
    }

    /**
     * Create an aliased <code>passport_international.background_task</code>
     * table reference
     */
    public BackgroundTask(Name alias) {
        this(alias, BACKGROUND_TASK);
    }

    /**
     * Create a <code>passport_international.background_task</code> table
     * reference
     */
    public BackgroundTask() {
        this(DSL.name("background_task"), null);
    }

    public <O extends Record> BackgroundTask(Table<O> child, ForeignKey<O, BackgroundTaskRecord> key) {
        super(child, key, BACKGROUND_TASK);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.BACKGROUND_TASK_JOB_ID_UK);
    }

    @Override
    public Identity<BackgroundTaskRecord, Long> getIdentity() {
        return (Identity<BackgroundTaskRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<BackgroundTaskRecord> getPrimaryKey() {
        return Keys.BACKGROUND_TASK_PK;
    }

    @Override
    public BackgroundTask as(String alias) {
        return new BackgroundTask(DSL.name(alias), this);
    }

    @Override
    public BackgroundTask as(Name alias) {
        return new BackgroundTask(alias, this);
    }

    @Override
    public BackgroundTask as(Table<?> alias) {
        return new BackgroundTask(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public BackgroundTask rename(String name) {
        return new BackgroundTask(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BackgroundTask rename(Name name) {
        return new BackgroundTask(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public BackgroundTask rename(Table<?> name) {
        return new BackgroundTask(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row16 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row16<Long, String, JSONB, Long, Boolean, Boolean, UUID, UUID, String, Boolean, OffsetDateTime, OffsetDateTime, String, String, String, String> fieldsRow() {
        return (Row16) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function16<? super Long, ? super String, ? super JSONB, ? super Long, ? super Boolean, ? super Boolean, ? super UUID, ? super UUID, ? super String, ? super Boolean, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function16<? super Long, ? super String, ? super JSONB, ? super Long, ? super Boolean, ? super Boolean, ? super UUID, ? super UUID, ? super String, ? super Boolean, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
