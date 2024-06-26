/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreProcedureRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
 * Процедуры дела
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreProcedure extends TableImpl<CoreProcedureRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_procedure</code>
     */
    public static final CoreProcedure CORE_PROCEDURE = new CoreProcedure();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreProcedureRecord> getRecordType() {
        return CoreProcedureRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_procedure.core_procedure_id</code>.
     * Идентификатор
     */
    public final TableField<CoreProcedureRecord, Long> CORE_PROCEDURE_ID = createField(DSL.name("core_procedure_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.core_procedure.operation_id</code>.
     * Идентификатор операции
     */
    public final TableField<CoreProcedureRecord, Long> OPERATION_ID = createField(DSL.name("operation_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор операции");

    /**
     * The column
     * <code>passport_international.core_procedure.operation_dttm</code>. Дата и
     * время операции
     */
    public final TableField<CoreProcedureRecord, OffsetDateTime> OPERATION_DTTM = createField(DSL.name("operation_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false), this, "Дата и время операции");

    /**
     * The column <code>passport_international.core_procedure.status_id</code>.
     * Идентификатор статуса
     */
    public final TableField<CoreProcedureRecord, Long> STATUS_ID = createField(DSL.name("status_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор статуса");

    /**
     * The column <code>passport_international.core_procedure.status_dt</code>.
     * Дата статуса
     */
    public final TableField<CoreProcedureRecord, LocalDate> STATUS_DT = createField(DSL.name("status_dt"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("('now'::text)::date"), SQLDataType.LOCALDATE)), this, "Дата статуса");

    /**
     * The column
     * <code>passport_international.core_procedure.core_case_id</code>.
     * Идентификатор дела
     */
    public final TableField<CoreProcedureRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.core_procedure.create_user</code>. Логин
     * пользователя
     */
    public final TableField<CoreProcedureRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR(255), this, "Логин пользователя");

    /**
     * The column
     * <code>passport_international.core_procedure.create_dttm</code>. Дата
     * время вставки записи
     */
    public final TableField<CoreProcedureRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи");

    /**
     * The column
     * <code>passport_international.core_procedure.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<CoreProcedureRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.core_procedure.action_ind</code>.
     * Индикатор действия
     */
    public final TableField<CoreProcedureRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор действия");

    /**
     * The column
     * <code>passport_international.core_procedure.adm_send_bool</code>.
     */
    public final TableField<CoreProcedureRecord, Boolean> ADM_SEND_BOOL = createField(DSL.name("adm_send_bool"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    private CoreProcedure(Name alias, Table<CoreProcedureRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreProcedure(Name alias, Table<CoreProcedureRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Процедуры дела"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_procedure</code>
     * table reference
     */
    public CoreProcedure(String alias) {
        this(DSL.name(alias), CORE_PROCEDURE);
    }

    /**
     * Create an aliased <code>passport_international.core_procedure</code>
     * table reference
     */
    public CoreProcedure(Name alias) {
        this(alias, CORE_PROCEDURE);
    }

    /**
     * Create a <code>passport_international.core_procedure</code> table
     * reference
     */
    public CoreProcedure() {
        this(DSL.name("core_procedure"), null);
    }

    public <O extends Record> CoreProcedure(Table<O> child, ForeignKey<O, CoreProcedureRecord> key) {
        super(child, key, CORE_PROCEDURE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<CoreProcedureRecord, Long> getIdentity() {
        return (Identity<CoreProcedureRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreProcedureRecord> getPrimaryKey() {
        return Keys.CORE_PROCEDURE_PK;
    }

    @Override
    public List<ForeignKey<CoreProcedureRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_PROCEDURE__CORE_PROCEDURE_CORE_CASE_FK);
    }

    private transient CoreCase _coreCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.CORE_PROCEDURE__CORE_PROCEDURE_CORE_CASE_FK);

        return _coreCase;
    }

    @Override
    public CoreProcedure as(String alias) {
        return new CoreProcedure(DSL.name(alias), this);
    }

    @Override
    public CoreProcedure as(Name alias) {
        return new CoreProcedure(alias, this);
    }

    @Override
    public CoreProcedure as(Table<?> alias) {
        return new CoreProcedure(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreProcedure rename(String name) {
        return new CoreProcedure(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreProcedure rename(Name name) {
        return new CoreProcedure(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreProcedure rename(Table<?> name) {
        return new CoreProcedure(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, Long, OffsetDateTime, Long, LocalDate, Long, String, OffsetDateTime, OffsetDateTime, String, Boolean> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Long, ? super Long, ? super OffsetDateTime, ? super Long, ? super LocalDate, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Long, ? super Long, ? super OffsetDateTime, ? super Long, ? super LocalDate, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
