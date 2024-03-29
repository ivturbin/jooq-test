/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpRestrictIntervalRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Identity;
import org.jooq.Index;
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
 * Даты и страны ограниченные на выезд
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpRestrictInterval extends TableImpl<FpRestrictIntervalRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_restrict_interval</code>
     */
    public static final FpRestrictInterval FP_RESTRICT_INTERVAL = new FpRestrictInterval();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpRestrictIntervalRecord> getRecordType() {
        return FpRestrictIntervalRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.fp_restrict_interval_id</code>.
     * Идентификатор
     */
    public final TableField<FpRestrictIntervalRecord, Long> FP_RESTRICT_INTERVAL_ID = createField(DSL.name("fp_restrict_interval_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.fp_base_restrict_id</code>.
     * Идентификатор ограничения
     */
    public final TableField<FpRestrictIntervalRecord, Long> FP_BASE_RESTRICT_ID = createField(DSL.name("fp_base_restrict_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор ограничения");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.start_dt</code>. Дата
     * начала действия ограничений на выезд
     */
    public final TableField<FpRestrictIntervalRecord, LocalDate> START_DT = createField(DSL.name("start_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата начала действия ограничений на выезд");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.end_dt</code>. Дата
     * окончания действия ограничений на выезд
     */
    public final TableField<FpRestrictIntervalRecord, LocalDate> END_DT = createField(DSL.name("end_dt"), SQLDataType.LOCALDATE, this, "Дата окончания действия ограничений на выезд");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.before_adulthood</code>.
     * Действие ограничения до совершеннолетия
     */
    public final TableField<FpRestrictIntervalRecord, Boolean> BEFORE_ADULTHOOD = createField(DSL.name("before_adulthood"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Действие ограничения до совершеннолетия");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.countries</code>.
     * Страны на которые распространяется ограничение
     */
    public final TableField<FpRestrictIntervalRecord, String> COUNTRIES = createField(DSL.name("countries"), SQLDataType.CLOB, this, "Страны на которые распространяется ограничение");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.status_id</code>.
     * Статус ограничения
     */
    public final TableField<FpRestrictIntervalRecord, Long> STATUS_ID = createField(DSL.name("status_id"), SQLDataType.BIGINT.nullable(false), this, "Статус ограничения");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.action_ind</code>.
     */
    public final TableField<FpRestrictIntervalRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.create_dttm</code>.
     */
    public final TableField<FpRestrictIntervalRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.modify_dttm</code>.
     */
    public final TableField<FpRestrictIntervalRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.eff_dttm</code>.
     */
    public final TableField<FpRestrictIntervalRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("'1899-12-31 23:30:17+02:30:17'::timestamp with time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.exp_dttm</code>.
     */
    public final TableField<FpRestrictIntervalRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("'9999-12-31 00:00:00+03'::timestamp with time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval.correlation_id</code>.
     * Идентификатор сообщения о созданном сигнале
     */
    public final TableField<FpRestrictIntervalRecord, UUID> CORRELATION_ID = createField(DSL.name("correlation_id"), SQLDataType.UUID, this, "Идентификатор сообщения о созданном сигнале");

    private FpRestrictInterval(Name alias, Table<FpRestrictIntervalRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpRestrictInterval(Name alias, Table<FpRestrictIntervalRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Даты и страны ограниченные на выезд"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_restrict_interval</code> table reference
     */
    public FpRestrictInterval(String alias) {
        this(DSL.name(alias), FP_RESTRICT_INTERVAL);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_restrict_interval</code> table reference
     */
    public FpRestrictInterval(Name alias) {
        this(alias, FP_RESTRICT_INTERVAL);
    }

    /**
     * Create a <code>passport_international.fp_restrict_interval</code> table
     * reference
     */
    public FpRestrictInterval() {
        this(DSL.name("fp_restrict_interval"), null);
    }

    public <O extends Record> FpRestrictInterval(Table<O> child, ForeignKey<O, FpRestrictIntervalRecord> key) {
        super(child, key, FP_RESTRICT_INTERVAL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_RESTRICT_INTERVAL_FP_RESTRICT_ID_IX, Indexes.FP_RESTRICT_INTERVAL_STATUS_ID_IX);
    }

    @Override
    public Identity<FpRestrictIntervalRecord, Long> getIdentity() {
        return (Identity<FpRestrictIntervalRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpRestrictIntervalRecord> getPrimaryKey() {
        return Keys.FP_RESTRICT_INTERVAL_PK;
    }

    @Override
    public List<ForeignKey<FpRestrictIntervalRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_RESTRICT_INTERVAL__FP_RESTRICT_INTERVAL_FP_RESTRICT_FK, Keys.FP_RESTRICT_INTERVAL__FP_RESTRICT_INTERVAL_CORRELATION_ID_FKEY);
    }

    private transient FpBaseRestrict _fpBaseRestrict;
    private transient FpSignalInformation _fpSignalInformation;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_base_restrict</code> table.
     */
    public FpBaseRestrict fpBaseRestrict() {
        if (_fpBaseRestrict == null)
            _fpBaseRestrict = new FpBaseRestrict(this, Keys.FP_RESTRICT_INTERVAL__FP_RESTRICT_INTERVAL_FP_RESTRICT_FK);

        return _fpBaseRestrict;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_signal_information</code> table.
     */
    public FpSignalInformation fpSignalInformation() {
        if (_fpSignalInformation == null)
            _fpSignalInformation = new FpSignalInformation(this, Keys.FP_RESTRICT_INTERVAL__FP_RESTRICT_INTERVAL_CORRELATION_ID_FKEY);

        return _fpSignalInformation;
    }

    @Override
    public FpRestrictInterval as(String alias) {
        return new FpRestrictInterval(DSL.name(alias), this);
    }

    @Override
    public FpRestrictInterval as(Name alias) {
        return new FpRestrictInterval(alias, this);
    }

    @Override
    public FpRestrictInterval as(Table<?> alias) {
        return new FpRestrictInterval(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpRestrictInterval rename(String name) {
        return new FpRestrictInterval(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpRestrictInterval rename(Name name) {
        return new FpRestrictInterval(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpRestrictInterval rename(Table<?> name) {
        return new FpRestrictInterval(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, LocalDate, LocalDate, Boolean, String, Long, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, UUID> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Long, ? super Long, ? super LocalDate, ? super LocalDate, ? super Boolean, ? super String, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super UUID, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Long, ? super Long, ? super LocalDate, ? super LocalDate, ? super Boolean, ? super String, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super UUID, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}