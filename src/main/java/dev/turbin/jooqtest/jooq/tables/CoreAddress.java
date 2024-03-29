/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreAddressRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
 * адрес
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreAddress extends TableImpl<CoreAddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_address</code>
     */
    public static final CoreAddress CORE_ADDRESS = new CoreAddress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreAddressRecord> getRecordType() {
        return CoreAddressRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_address.core_address_id</code>.
     * идентификатор
     */
    public final TableField<CoreAddressRecord, Long> CORE_ADDRESS_ID = createField(DSL.name("core_address_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "идентификатор");

    /**
     * The column <code>passport_international.core_address.country_id</code>.
     * страна
     */
    public final TableField<CoreAddressRecord, Long> COUNTRY_ID = createField(DSL.name("country_id"), SQLDataType.BIGINT.nullable(false), this, "страна");

    /**
     * The column
     * <code>passport_international.core_address.addr_object_id</code>. адресный
     * объект
     */
    public final TableField<CoreAddressRecord, Long> ADDR_OBJECT_ID = createField(DSL.name("addr_object_id"), SQLDataType.BIGINT, this, "адресный объект");

    /**
     * The column <code>passport_international.core_address.housing_id</code>.
     * жилое помещение
     */
    public final TableField<CoreAddressRecord, Long> HOUSING_ID = createField(DSL.name("housing_id"), SQLDataType.BIGINT, this, "жилое помещение");

    /**
     * The column <code>passport_international.core_address.district_id</code>.
     * район города
     */
    public final TableField<CoreAddressRecord, Long> DISTRICT_ID = createField(DSL.name("district_id"), SQLDataType.BIGINT, this, "район города");

    /**
     * The column <code>passport_international.core_address.src_id</code>.
     */
    public final TableField<CoreAddressRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>passport_international.core_address.create_dttm</code>.
     */
    public final TableField<CoreAddressRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>passport_international.core_address.modify_dttm</code>.
     */
    public final TableField<CoreAddressRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>passport_international.core_address.action_ind</code>.
     */
    public final TableField<CoreAddressRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>passport_international.core_address.eff_dttm</code>.
     */
    public final TableField<CoreAddressRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>passport_international.core_address.exp_dttm</code>.
     */
    public final TableField<CoreAddressRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'9999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.core_address.old_system_value_cval</code>.
     */
    public final TableField<CoreAddressRecord, String> OLD_SYSTEM_VALUE_CVAL = createField(DSL.name("old_system_value_cval"), SQLDataType.VARCHAR(1000), this, "");

    private CoreAddress(Name alias, Table<CoreAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreAddress(Name alias, Table<CoreAddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("адрес"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_address</code> table
     * reference
     */
    public CoreAddress(String alias) {
        this(DSL.name(alias), CORE_ADDRESS);
    }

    /**
     * Create an aliased <code>passport_international.core_address</code> table
     * reference
     */
    public CoreAddress(Name alias) {
        this(alias, CORE_ADDRESS);
    }

    /**
     * Create a <code>passport_international.core_address</code> table reference
     */
    public CoreAddress() {
        this(DSL.name("core_address"), null);
    }

    public <O extends Record> CoreAddress(Table<O> child, ForeignKey<O, CoreAddressRecord> key) {
        super(child, key, CORE_ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_ADDRESS_1_IX, Indexes.CORE_ADDRESS_ADDROBJECT_IX);
    }

    @Override
    public Identity<CoreAddressRecord, Long> getIdentity() {
        return (Identity<CoreAddressRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreAddressRecord> getPrimaryKey() {
        return Keys.CORE_ADDRESS_PK;
    }

    @Override
    public CoreAddress as(String alias) {
        return new CoreAddress(DSL.name(alias), this);
    }

    @Override
    public CoreAddress as(Name alias) {
        return new CoreAddress(alias, this);
    }

    @Override
    public CoreAddress as(Table<?> alias) {
        return new CoreAddress(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAddress rename(String name) {
        return new CoreAddress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAddress rename(Name name) {
        return new CoreAddress(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreAddress rename(Table<?> name) {
        return new CoreAddress(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
