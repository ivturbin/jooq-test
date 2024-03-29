/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ExportHistorySrcRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
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
 * История выгрузок информации по делам во внешние системы (Смигрировано с ППОТ)
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ExportHistorySrc extends TableImpl<ExportHistorySrcRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.export_history_src</code>
     */
    public static final ExportHistorySrc EXPORT_HISTORY_SRC = new ExportHistorySrc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ExportHistorySrcRecord> getRecordType() {
        return ExportHistorySrcRecord.class;
    }

    /**
     * The column
     * <code>passport_international.export_history_src.export_history_src_id</code>.
     * Идентификатор
     */
    public final TableField<ExportHistorySrcRecord, Long> EXPORT_HISTORY_SRC_ID = createField(DSL.name("export_history_src_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.export_history_src.case_id</code>.
     * Идентификатор дела
     */
    public final TableField<ExportHistorySrcRecord, Long> CASE_ID = createField(DSL.name("case_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.export_history_src.invalid_ind</code>.
     * Данные корректны, если 0
     */
    public final TableField<ExportHistorySrcRecord, String> INVALID_IND = createField(DSL.name("invalid_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'0'::character varying"), SQLDataType.VARCHAR)), this, "Данные корректны, если 0");

    /**
     * The column
     * <code>passport_international.export_history_src.type_cval</code>. Тип
     * экспортируемых данных
     */
    public final TableField<ExportHistorySrcRecord, String> TYPE_CVAL = createField(DSL.name("type_cval"), SQLDataType.CLOB.nullable(false), this, "Тип экспортируемых данных");

    /**
     * The column
     * <code>passport_international.export_history_src.department_id</code>.
     * Подразделение, в котором создан объект
     */
    public final TableField<ExportHistorySrcRecord, Long> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.BIGINT.nullable(false), this, "Подразделение, в котором создан объект");

    /**
     * The column
     * <code>passport_international.export_history_src.status_cval</code>.
     * Статус обработки данных
     */
    public final TableField<ExportHistorySrcRecord, String> STATUS_CVAL = createField(DSL.name("status_cval"), SQLDataType.CLOB.nullable(false), this, "Статус обработки данных");

    /**
     * The column
     * <code>passport_international.export_history_src.create_user</code>.
     * Пользователь, создавший исходный объект
     */
    public final TableField<ExportHistorySrcRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR(255).nullable(false), this, "Пользователь, создавший исходный объект");

    /**
     * The column
     * <code>passport_international.export_history_src.event_dt</code>. Дата
     * события
     */
    public final TableField<ExportHistorySrcRecord, OffsetDateTime> EVENT_DT = createField(DSL.name("event_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "Дата события");

    /**
     * The column
     * <code>passport_international.export_history_src.finish_dt</code>. Дата
     * завершения экспорта
     */
    public final TableField<ExportHistorySrcRecord, OffsetDateTime> FINISH_DT = createField(DSL.name("finish_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата завершения экспорта");

    /**
     * The column
     * <code>passport_international.export_history_src.invalid_dt</code>. Дата
     * инвалидации записи
     */
    public final TableField<ExportHistorySrcRecord, OffsetDateTime> INVALID_DT = createField(DSL.name("invalid_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата инвалидации записи");

    /**
     * The column
     * <code>passport_international.export_history_src.invalid_user</code>.
     * Пользователь, инвалидировавший запись
     */
    public final TableField<ExportHistorySrcRecord, String> INVALID_USER = createField(DSL.name("invalid_user"), SQLDataType.VARCHAR(255), this, "Пользователь, инвалидировавший запись");

    /**
     * The column
     * <code>passport_international.export_history_src.comment_cval</code>.
     * Комментарий к экспортированным данным
     */
    public final TableField<ExportHistorySrcRecord, String> COMMENT_CVAL = createField(DSL.name("comment_cval"), SQLDataType.CLOB, this, "Комментарий к экспортированным данным");

    /**
     * The column
     * <code>passport_international.export_history_src.create_dttm</code>. Дата
     * создания записи
     */
    public final TableField<ExportHistorySrcRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата создания записи");

    /**
     * The column
     * <code>passport_international.export_history_src.modify_dttm</code>. Дата
     * последней инициализации события на выгрузку данных
     */
    public final TableField<ExportHistorySrcRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "Дата последней инициализации события на выгрузку данных");

    /**
     * The column
     * <code>passport_international.export_history_src.action_ind</code>.
     * Индикатор действия
     */
    public final TableField<ExportHistorySrcRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор действия");

    private ExportHistorySrc(Name alias, Table<ExportHistorySrcRecord> aliased) {
        this(alias, aliased, null);
    }

    private ExportHistorySrc(Name alias, Table<ExportHistorySrcRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("История выгрузок информации по делам во внешние системы (Смигрировано с ППОТ)"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.export_history_src</code>
     * table reference
     */
    public ExportHistorySrc(String alias) {
        this(DSL.name(alias), EXPORT_HISTORY_SRC);
    }

    /**
     * Create an aliased <code>passport_international.export_history_src</code>
     * table reference
     */
    public ExportHistorySrc(Name alias) {
        this(alias, EXPORT_HISTORY_SRC);
    }

    /**
     * Create a <code>passport_international.export_history_src</code> table
     * reference
     */
    public ExportHistorySrc() {
        this(DSL.name("export_history_src"), null);
    }

    public <O extends Record> ExportHistorySrc(Table<O> child, ForeignKey<O, ExportHistorySrcRecord> key) {
        super(child, key, EXPORT_HISTORY_SRC);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.EXPORT_HISTORY_SRC_CASE_ID_IX);
    }

    @Override
    public Identity<ExportHistorySrcRecord, Long> getIdentity() {
        return (Identity<ExportHistorySrcRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<ExportHistorySrcRecord> getPrimaryKey() {
        return Keys.EXPORT_HISTORY_SRC_PK;
    }

    @Override
    public List<ForeignKey<ExportHistorySrcRecord, ?>> getReferences() {
        return Arrays.asList(Keys.EXPORT_HISTORY_SRC__EXPORT_HISTORY_SRC_CORE_CASE_ID_FK);
    }

    private transient CoreCase _coreCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.EXPORT_HISTORY_SRC__EXPORT_HISTORY_SRC_CORE_CASE_ID_FK);

        return _coreCase;
    }

    @Override
    public ExportHistorySrc as(String alias) {
        return new ExportHistorySrc(DSL.name(alias), this);
    }

    @Override
    public ExportHistorySrc as(Name alias) {
        return new ExportHistorySrc(alias, this);
    }

    @Override
    public ExportHistorySrc as(Table<?> alias) {
        return new ExportHistorySrc(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ExportHistorySrc rename(String name) {
        return new ExportHistorySrc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExportHistorySrc rename(Name name) {
        return new ExportHistorySrc(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ExportHistorySrc rename(Table<?> name) {
        return new ExportHistorySrc(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, String, String, Long, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, String, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super Long, ? super Long, ? super String, ? super String, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super Long, ? super Long, ? super String, ? super String, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}