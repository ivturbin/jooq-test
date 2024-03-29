/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewOrganizationInfoRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewOrganizationInfo extends TableImpl<ViewOrganizationInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_organization_info</code>
     */
    public static final ViewOrganizationInfo VIEW_ORGANIZATION_INFO = new ViewOrganizationInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewOrganizationInfoRecord> getRecordType() {
        return ViewOrganizationInfoRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_organization_info.organization_info_id</code>.
     * Идентификатор
     */
    public final TableField<ViewOrganizationInfoRecord, Long> ORGANIZATION_INFO_ID = createField(DSL.name("organization_info_id"), SQLDataType.BIGINT, this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.view_organization_info.organization_id</code>.
     * Организация
     */
    public final TableField<ViewOrganizationInfoRecord, Long> ORGANIZATION_ID = createField(DSL.name("organization_id"), SQLDataType.BIGINT, this, "Организация");

    /**
     * The column
     * <code>passport_international.view_organization_info.inn</code>. ИНН
     * организации
     */
    public final TableField<ViewOrganizationInfoRecord, String> INN = createField(DSL.name("inn"), SQLDataType.VARCHAR(12), this, "ИНН организации");

    /**
     * The column
     * <code>passport_international.view_organization_info.ogrn_cval</code>.
     */
    public final TableField<ViewOrganizationInfoRecord, String> OGRN_CVAL = createField(DSL.name("ogrn_cval"), SQLDataType.VARCHAR(30), this, "");

    /**
     * The column
     * <code>passport_international.view_organization_info.short_name</code>.
     * Краткое наименование организации
     */
    public final TableField<ViewOrganizationInfoRecord, String> SHORT_NAME = createField(DSL.name("short_name"), SQLDataType.VARCHAR(128), this, "Краткое наименование организации");

    /**
     * The column
     * <code>passport_international.view_organization_info.full_name</code>.
     * Полное наименование организации
     */
    public final TableField<ViewOrganizationInfoRecord, String> FULL_NAME = createField(DSL.name("full_name"), SQLDataType.VARCHAR(128), this, "Полное наименование организации");

    /**
     * The column
     * <code>passport_international.view_organization_info.registration_bool</code>.
     */
    public final TableField<ViewOrganizationInfoRecord, Boolean> REGISTRATION_BOOL = createField(DSL.name("registration_bool"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.view_organization_info.category_id</code>.
     * Категория поставщика
     */
    public final TableField<ViewOrganizationInfoRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT, this, "Категория поставщика");

    /**
     * The column
     * <code>passport_international.view_organization_info.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<ViewOrganizationInfoRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.view_organization_info.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<ViewOrganizationInfoRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_organization_info.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewOrganizationInfoRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_organization_info.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewOrganizationInfoRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_organization_info.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<ViewOrganizationInfoRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    private ViewOrganizationInfo(Name alias, Table<ViewOrganizationInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewOrganizationInfo(Name alias, Table<ViewOrganizationInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_organization_info" as  SELECT organization_info.organization_info_id,
         organization_info.organization_id,
         organization_info.inn,
         organization_info.ogrn AS ogrn_cval,
         organization_info.short_name,
         organization_info.full_name,
         organization_info.registered AS registration_bool,
         organization_info.category_id,
         organization_info.create_dttm,
         organization_info.modify_dttm,
         organization_info.exp_dttm,
         organization_info.eff_dttm,
         organization_info.action_ind
        FROM organization_info;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_organization_info</code> table
     * reference
     */
    public ViewOrganizationInfo(String alias) {
        this(DSL.name(alias), VIEW_ORGANIZATION_INFO);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_organization_info</code> table
     * reference
     */
    public ViewOrganizationInfo(Name alias) {
        this(alias, VIEW_ORGANIZATION_INFO);
    }

    /**
     * Create a <code>passport_international.view_organization_info</code> table
     * reference
     */
    public ViewOrganizationInfo() {
        this(DSL.name("view_organization_info"), null);
    }

    public <O extends Record> ViewOrganizationInfo(Table<O> child, ForeignKey<O, ViewOrganizationInfoRecord> key) {
        super(child, key, VIEW_ORGANIZATION_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewOrganizationInfo as(String alias) {
        return new ViewOrganizationInfo(DSL.name(alias), this);
    }

    @Override
    public ViewOrganizationInfo as(Name alias) {
        return new ViewOrganizationInfo(alias, this);
    }

    @Override
    public ViewOrganizationInfo as(Table<?> alias) {
        return new ViewOrganizationInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewOrganizationInfo rename(String name) {
        return new ViewOrganizationInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewOrganizationInfo rename(Name name) {
        return new ViewOrganizationInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewOrganizationInfo rename(Table<?> name) {
        return new ViewOrganizationInfo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, String, String, String, String, Boolean, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Long, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super Boolean, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}