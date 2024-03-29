/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ForeignServiceErrorsRecord;

import java.time.LocalDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Ошибки сторонних учетов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ForeignServiceErrors extends TableImpl<ForeignServiceErrorsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.foreign_service_errors</code>
     */
    public static final ForeignServiceErrors FOREIGN_SERVICE_ERRORS = new ForeignServiceErrors();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ForeignServiceErrorsRecord> getRecordType() {
        return ForeignServiceErrorsRecord.class;
    }

    /**
     * The column <code>passport_international.foreign_service_errors.id</code>.
     * Порядковый номер
     */
    public final TableField<ForeignServiceErrorsRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Порядковый номер");

    /**
     * The column
     * <code>passport_international.foreign_service_errors.migration_source</code>.
     * Источник миграции
     */
    public final TableField<ForeignServiceErrorsRecord, String> MIGRATION_SOURCE = createField(DSL.name("migration_source"), SQLDataType.VARCHAR(255), this, "Источник миграции");

    /**
     * The column
     * <code>passport_international.foreign_service_errors.service_name</code>.
     * Название стороннего сервиса
     */
    public final TableField<ForeignServiceErrorsRecord, String> SERVICE_NAME = createField(DSL.name("service_name"), SQLDataType.VARCHAR(255).nullable(false), this, "Название стороннего сервиса");

    /**
     * The column
     * <code>passport_international.foreign_service_errors.value</code>.
     * Значение, из-за которого получена ошибка
     */
    public final TableField<ForeignServiceErrorsRecord, String> VALUE = createField(DSL.name("value"), SQLDataType.VARCHAR(255), this, "Значение, из-за которого получена ошибка");

    /**
     * The column
     * <code>passport_international.foreign_service_errors.error_extra_info</code>.
     * Дополнительная информация об ошибке, к примеру название справочника НСИ
     */
    public final TableField<ForeignServiceErrorsRecord, String> ERROR_EXTRA_INFO = createField(DSL.name("error_extra_info"), SQLDataType.CLOB, this, "Дополнительная информация об ошибке, к примеру название справочника НСИ");

    /**
     * The column
     * <code>passport_international.foreign_service_errors.create_dttm</code>.
     * Дата сохранения записи
     */
    public final TableField<ForeignServiceErrorsRecord, LocalDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.LOCALDATETIME(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.LOCALDATETIME)), this, "Дата сохранения записи");

    /**
     * The column
     * <code>passport_international.foreign_service_errors.error_title</code>.
     * Название ошибки
     */
    public final TableField<ForeignServiceErrorsRecord, String> ERROR_TITLE = createField(DSL.name("error_title"), SQLDataType.VARCHAR(255), this, "Название ошибки");

    private ForeignServiceErrors(Name alias, Table<ForeignServiceErrorsRecord> aliased) {
        this(alias, aliased, null);
    }

    private ForeignServiceErrors(Name alias, Table<ForeignServiceErrorsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Ошибки сторонних учетов"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.foreign_service_errors</code> table
     * reference
     */
    public ForeignServiceErrors(String alias) {
        this(DSL.name(alias), FOREIGN_SERVICE_ERRORS);
    }

    /**
     * Create an aliased
     * <code>passport_international.foreign_service_errors</code> table
     * reference
     */
    public ForeignServiceErrors(Name alias) {
        this(alias, FOREIGN_SERVICE_ERRORS);
    }

    /**
     * Create a <code>passport_international.foreign_service_errors</code> table
     * reference
     */
    public ForeignServiceErrors() {
        this(DSL.name("foreign_service_errors"), null);
    }

    public <O extends Record> ForeignServiceErrors(Table<O> child, ForeignKey<O, ForeignServiceErrorsRecord> key) {
        super(child, key, FOREIGN_SERVICE_ERRORS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<ForeignServiceErrorsRecord, Long> getIdentity() {
        return (Identity<ForeignServiceErrorsRecord, Long>) super.getIdentity();
    }

    @Override
    public ForeignServiceErrors as(String alias) {
        return new ForeignServiceErrors(DSL.name(alias), this);
    }

    @Override
    public ForeignServiceErrors as(Name alias) {
        return new ForeignServiceErrors(alias, this);
    }

    @Override
    public ForeignServiceErrors as(Table<?> alias) {
        return new ForeignServiceErrors(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServiceErrors rename(String name) {
        return new ForeignServiceErrors(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServiceErrors rename(Name name) {
        return new ForeignServiceErrors(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ForeignServiceErrors rename(Table<?> name) {
        return new ForeignServiceErrors(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, String, String, String, String, LocalDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super String, ? super String, ? super String, ? super String, ? super LocalDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}