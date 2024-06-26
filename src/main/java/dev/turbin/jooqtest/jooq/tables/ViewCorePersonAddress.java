/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewCorePersonAddressRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function22;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row22;
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
public class ViewCorePersonAddress extends TableImpl<ViewCorePersonAddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_core_person_address</code>
     */
    public static final ViewCorePersonAddress VIEW_CORE_PERSON_ADDRESS = new ViewCorePersonAddress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewCorePersonAddressRecord> getRecordType() {
        return ViewCorePersonAddressRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_core_person_address.core_person_address_id</code>.
     * Идентификатор
     */
    public final TableField<ViewCorePersonAddressRecord, Long> CORE_PERSON_ADDRESS_ID = createField(DSL.name("core_person_address_id"), SQLDataType.BIGINT, this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.view_core_person_address.invalid_bool</code>.
     */
    public final TableField<ViewCorePersonAddressRecord, Boolean> INVALID_BOOL = createField(DSL.name("invalid_bool"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_address.person_id</code>.
     * Идентификатор физического лица
     */
    public final TableField<ViewCorePersonAddressRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "Идентификатор физического лица");

    /**
     * The column
     * <code>passport_international.view_core_person_address.person_state_id</code>.
     * Состояние лица
     */
    public final TableField<ViewCorePersonAddressRecord, Long> PERSON_STATE_ID = createField(DSL.name("person_state_id"), SQLDataType.BIGINT, this, "Состояние лица");

    /**
     * The column
     * <code>passport_international.view_core_person_address.address_id</code>.
     * Адрес
     */
    public final TableField<ViewCorePersonAddressRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT, this, "Адрес");

    /**
     * The column
     * <code>passport_international.view_core_person_address.address_type_id</code>.
     * Тип адреса или регистрации по адресу
     */
    public final TableField<ViewCorePersonAddressRecord, Long> ADDRESS_TYPE_ID = createField(DSL.name("address_type_id"), SQLDataType.BIGINT, this, "Тип адреса или регистрации по адресу");

    /**
     * The column
     * <code>passport_international.view_core_person_address.create_user</code>.
     * Пользователь, создавший запись
     */
    public final TableField<ViewCorePersonAddressRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR(255), this, "Пользователь, создавший запись");

    /**
     * The column
     * <code>passport_international.view_core_person_address.from_dt</code>.
     * Дата начала регистрации
     */
    public final TableField<ViewCorePersonAddressRecord, LocalDate> FROM_DT = createField(DSL.name("from_dt"), SQLDataType.LOCALDATE, this, "Дата начала регистрации");

    /**
     * The column
     * <code>passport_international.view_core_person_address.to_dt</code>. Дата
     * окончания регистрации
     */
    public final TableField<ViewCorePersonAddressRecord, LocalDate> TO_DT = createField(DSL.name("to_dt"), SQLDataType.LOCALDATE, this, "Дата окончания регистрации");

    /**
     * The column
     * <code>passport_international.view_core_person_address.invalid_dt</code>.
     * Дата инвалидации записи
     */
    public final TableField<ViewCorePersonAddressRecord, LocalDate> INVALID_DT = createField(DSL.name("invalid_dt"), SQLDataType.LOCALDATE, this, "Дата инвалидации записи");

    /**
     * The column
     * <code>passport_international.view_core_person_address.invalid_user</code>.
     */
    public final TableField<ViewCorePersonAddressRecord, String> INVALID_USER = createField(DSL.name("invalid_user"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_address.new_core_person_address_id</code>.
     */
    public final TableField<ViewCorePersonAddressRecord, Long> NEW_CORE_PERSON_ADDRESS_ID = createField(DSL.name("new_core_person_address_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_address.unstructured_cval</code>.
     */
    public final TableField<ViewCorePersonAddressRecord, String> UNSTRUCTURED_CVAL = createField(DSL.name("unstructured_cval"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_address.sono_id</code>.
     * Налоговый орган (соно)
     */
    public final TableField<ViewCorePersonAddressRecord, Long> SONO_ID = createField(DSL.name("sono_id"), SQLDataType.BIGINT, this, "Налоговый орган (соно)");

    /**
     * The column
     * <code>passport_international.view_core_person_address.src_id</code>.
     */
    public final TableField<ViewCorePersonAddressRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_address.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<ViewCorePersonAddressRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.view_core_person_address.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<ViewCorePersonAddressRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_core_person_address.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<ViewCorePersonAddressRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_core_person_address.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<ViewCorePersonAddressRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_core_person_address.action_ind</code>.
     * Индикатор операции dml(i-insert,d-delete,u-update)
     */
    public final TableField<ViewCorePersonAddressRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции dml(i-insert,d-delete,u-update)");

    /**
     * The column
     * <code>passport_international.view_core_person_address.core_person_doc_id</code>.
     */
    public final TableField<ViewCorePersonAddressRecord, Long> CORE_PERSON_DOC_ID = createField(DSL.name("core_person_doc_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_address.nsi_address_id</code>.
     * Идентификатор адреса из НСИ
     */
    public final TableField<ViewCorePersonAddressRecord, Long> NSI_ADDRESS_ID = createField(DSL.name("nsi_address_id"), SQLDataType.BIGINT, this, "Идентификатор адреса из НСИ");

    private ViewCorePersonAddress(Name alias, Table<ViewCorePersonAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewCorePersonAddress(Name alias, Table<ViewCorePersonAddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_core_person_address" as  SELECT core_person_address.core_person_address_id,
         core_person_address.invalid AS invalid_bool,
         core_person_address.person_id,
         core_person_address.person_state_id,
         core_person_address.address_id,
         core_person_address.address_type_id,
         core_person_address.create_user,
         core_person_address.from_dt,
         core_person_address.to_dt,
         core_person_address.invalid_dt,
         core_person_address.user_invalid AS invalid_user,
         core_person_address.new_address_id AS new_core_person_address_id,
         core_person_address.unstructured AS unstructured_cval,
         core_person_address.sono_id,
         core_person_address.src_id,
         core_person_address.create_dttm,
         core_person_address.modify_dttm,
         core_person_address.exp_dttm,
         core_person_address.eff_dttm,
         core_person_address.action_ind,
         core_person_address.person_document_id AS core_person_doc_id,
         core_person_address.nsi_address_id
        FROM core_person_address;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_core_person_address</code> table
     * reference
     */
    public ViewCorePersonAddress(String alias) {
        this(DSL.name(alias), VIEW_CORE_PERSON_ADDRESS);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_core_person_address</code> table
     * reference
     */
    public ViewCorePersonAddress(Name alias) {
        this(alias, VIEW_CORE_PERSON_ADDRESS);
    }

    /**
     * Create a <code>passport_international.view_core_person_address</code>
     * table reference
     */
    public ViewCorePersonAddress() {
        this(DSL.name("view_core_person_address"), null);
    }

    public <O extends Record> ViewCorePersonAddress(Table<O> child, ForeignKey<O, ViewCorePersonAddressRecord> key) {
        super(child, key, VIEW_CORE_PERSON_ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewCorePersonAddress as(String alias) {
        return new ViewCorePersonAddress(DSL.name(alias), this);
    }

    @Override
    public ViewCorePersonAddress as(Name alias) {
        return new ViewCorePersonAddress(alias, this);
    }

    @Override
    public ViewCorePersonAddress as(Table<?> alias) {
        return new ViewCorePersonAddress(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCorePersonAddress rename(String name) {
        return new ViewCorePersonAddress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCorePersonAddress rename(Name name) {
        return new ViewCorePersonAddress(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCorePersonAddress rename(Table<?> name) {
        return new ViewCorePersonAddress(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row22 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row22<Long, Boolean, Long, Long, Long, Long, String, LocalDate, LocalDate, LocalDate, String, Long, String, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long, Long> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function22<? super Long, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super LocalDate, ? super LocalDate, ? super LocalDate, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function22<? super Long, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super LocalDate, ? super LocalDate, ? super LocalDate, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
