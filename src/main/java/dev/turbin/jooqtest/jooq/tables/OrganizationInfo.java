/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.OrganizationInfoRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
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
 * Таблица информации об организации.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class OrganizationInfo extends TableImpl<OrganizationInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.organization_info</code>
     */
    public static final OrganizationInfo ORGANIZATION_INFO = new OrganizationInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OrganizationInfoRecord> getRecordType() {
        return OrganizationInfoRecord.class;
    }

    /**
     * The column
     * <code>passport_international.organization_info.organization_info_id</code>.
     * Идентификатор
     */
    public final TableField<OrganizationInfoRecord, Long> ORGANIZATION_INFO_ID = createField(DSL.name("organization_info_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.organization_info.organization_id</code>.
     * Организация
     */
    public final TableField<OrganizationInfoRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), SQLDataType.BIGINT.nullable(false), this, "Организация");

    /**
     * The column <code>passport_international.organization_info.inn</code>. ИНН
     * организации
     */
    public final TableField<OrganizationInfoRecord, String> INN = createField(DSL.name("inn"), SQLDataType.VARCHAR(12).nullable(false), this, "ИНН организации");

    /**
     * The column <code>passport_international.organization_info.ogrn</code>.
     * ОГРН или идентификатор иностранного юридического лица
     */
    public final TableField<OrganizationInfoRecord, String> OGRN = createField(DSL.name("ogrn"), SQLDataType.VARCHAR(30), this, "ОГРН или идентификатор иностранного юридического лица");

    /**
     * The column
     * <code>passport_international.organization_info.short_name</code>. Краткое
     * наименование организации
     */
    public final TableField<OrganizationInfoRecord, String> SHORT_NAME = createField(DSL.name("short_name"), SQLDataType.VARCHAR(128), this, "Краткое наименование организации");

    /**
     * The column
     * <code>passport_international.organization_info.full_name</code>. Полное
     * наименование организации
     */
    public final TableField<OrganizationInfoRecord, String> FULL_NAME = createField(DSL.name("full_name"), SQLDataType.VARCHAR(128), this, "Полное наименование организации");

    /**
     * The column
     * <code>passport_international.organization_info.registered</code>. Флаг
     * постановки на учет юридического лица
     */
    public final TableField<OrganizationInfoRecord, Boolean> REGISTERED = createField(DSL.name("registered"), SQLDataType.BOOLEAN, this, "Флаг постановки на учет юридического лица");

    /**
     * The column
     * <code>passport_international.organization_info.category_id</code>.
     * Категория поставщика
     */
    public final TableField<OrganizationInfoRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT, this, "Категория поставщика");

    /**
     * The column
     * <code>passport_international.organization_info.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public final TableField<OrganizationInfoRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.organization_info.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<OrganizationInfoRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.organization_info.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<OrganizationInfoRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.organization_info.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<OrganizationInfoRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.organization_info.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<OrganizationInfoRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'9999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    private OrganizationInfo(Name alias, Table<OrganizationInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private OrganizationInfo(Name alias, Table<OrganizationInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица информации об организации."), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.organization_info</code>
     * table reference
     */
    public OrganizationInfo(String alias) {
        this(DSL.name(alias), ORGANIZATION_INFO);
    }

    /**
     * Create an aliased <code>passport_international.organization_info</code>
     * table reference
     */
    public OrganizationInfo(Name alias) {
        this(alias, ORGANIZATION_INFO);
    }

    /**
     * Create a <code>passport_international.organization_info</code> table
     * reference
     */
    public OrganizationInfo() {
        this(DSL.name("organization_info"), null);
    }

    public <O extends Record> OrganizationInfo(Table<O> child, ForeignKey<O, OrganizationInfoRecord> key) {
        super(child, key, ORGANIZATION_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<OrganizationInfoRecord, Long> getIdentity() {
        return (Identity<OrganizationInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<OrganizationInfoRecord> getPrimaryKey() {
        return Keys.ORGANIZATION_INFO_PK;
    }

    @Override
    public OrganizationInfo as(String alias) {
        return new OrganizationInfo(DSL.name(alias), this);
    }

    @Override
    public OrganizationInfo as(Name alias) {
        return new OrganizationInfo(alias, this);
    }

    @Override
    public OrganizationInfo as(Table<?> alias) {
        return new OrganizationInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationInfo rename(String name) {
        return new OrganizationInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationInfo rename(Name name) {
        return new OrganizationInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public OrganizationInfo rename(Table<?> name) {
        return new OrganizationInfo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, String, String, String, String, Boolean, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
