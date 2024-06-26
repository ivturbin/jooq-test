/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpRestrictIntervalAuditRecord;

import java.time.LocalDate;
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
 * Таблица версионирования fp_restrict_interval
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpRestrictIntervalAudit extends TableImpl<FpRestrictIntervalAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_restrict_interval_audit</code>
     */
    public static final FpRestrictIntervalAudit FP_RESTRICT_INTERVAL_AUDIT = new FpRestrictIntervalAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpRestrictIntervalAuditRecord> getRecordType() {
        return FpRestrictIntervalAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.id</code>.
     * Идентификатор "fp_restrict_interval_audit" с данными коррекции
     */
    public final TableField<FpRestrictIntervalAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_restrict_interval_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpRestrictIntervalAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpRestrictIntervalAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpRestrictIntervalAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public final TableField<FpRestrictIntervalAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public final TableField<FpRestrictIntervalAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.fp_base_restrict_id</code>.
     */
    public final TableField<FpRestrictIntervalAuditRecord, Long> FP_BASE_RESTRICT_ID = createField(DSL.name("fp_base_restrict_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.start_dt</code>.
     */
    public final TableField<FpRestrictIntervalAuditRecord, LocalDate> START_DT = createField(DSL.name("start_dt"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.end_dt</code>.
     */
    public final TableField<FpRestrictIntervalAuditRecord, LocalDate> END_DT = createField(DSL.name("end_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.before_adulthood</code>.
     */
    public final TableField<FpRestrictIntervalAuditRecord, Boolean> BEFORE_ADULTHOOD = createField(DSL.name("before_adulthood"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.countries</code>.
     */
    public final TableField<FpRestrictIntervalAuditRecord, String> COUNTRIES = createField(DSL.name("countries"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.fp_restrict_interval_audit.status_id</code>.
     */
    public final TableField<FpRestrictIntervalAuditRecord, Long> STATUS_ID = createField(DSL.name("status_id"), SQLDataType.BIGINT.nullable(false), this, "");

    private FpRestrictIntervalAudit(Name alias, Table<FpRestrictIntervalAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpRestrictIntervalAudit(Name alias, Table<FpRestrictIntervalAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_restrict_interval"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_restrict_interval_audit</code> table
     * reference
     */
    public FpRestrictIntervalAudit(String alias) {
        this(DSL.name(alias), FP_RESTRICT_INTERVAL_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_restrict_interval_audit</code> table
     * reference
     */
    public FpRestrictIntervalAudit(Name alias) {
        this(alias, FP_RESTRICT_INTERVAL_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_restrict_interval_audit</code>
     * table reference
     */
    public FpRestrictIntervalAudit() {
        this(DSL.name("fp_restrict_interval_audit"), null);
    }

    public <O extends Record> FpRestrictIntervalAudit(Table<O> child, ForeignKey<O, FpRestrictIntervalAuditRecord> key) {
        super(child, key, FP_RESTRICT_INTERVAL_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_RESTRICT_INTERVAL_AUDIT_CORRECTION_LOG_IX, Indexes.FP_RESTRICT_INTERVAL_AUDIT_EFF_DTTM_IX, Indexes.FP_RESTRICT_INTERVAL_AUDIT_EXP_DTTM_IX, Indexes.FP_RESTRICT_INTERVAL_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpRestrictIntervalAuditRecord, Long> getIdentity() {
        return (Identity<FpRestrictIntervalAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpRestrictIntervalAuditRecord> getPrimaryKey() {
        return Keys.FP_RESTRICT_INTERVAL_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpRestrictIntervalAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_RESTRICT_INTERVAL_AUDIT__FP_RESTRICT_INTERVAL_REF_FK, Keys.FP_RESTRICT_INTERVAL_AUDIT__FP_RESTRICT_INTERVAL_CORRECTION_LOG_FK);
    }

    private transient FpRestrictInterval _fpRestrictInterval;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_restrict_interval</code> table.
     */
    public FpRestrictInterval fpRestrictInterval() {
        if (_fpRestrictInterval == null)
            _fpRestrictInterval = new FpRestrictInterval(this, Keys.FP_RESTRICT_INTERVAL_AUDIT__FP_RESTRICT_INTERVAL_REF_FK);

        return _fpRestrictInterval;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_RESTRICT_INTERVAL_AUDIT__FP_RESTRICT_INTERVAL_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpRestrictIntervalAudit as(String alias) {
        return new FpRestrictIntervalAudit(DSL.name(alias), this);
    }

    @Override
    public FpRestrictIntervalAudit as(Name alias) {
        return new FpRestrictIntervalAudit(alias, this);
    }

    @Override
    public FpRestrictIntervalAudit as(Table<?> alias) {
        return new FpRestrictIntervalAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpRestrictIntervalAudit rename(String name) {
        return new FpRestrictIntervalAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpRestrictIntervalAudit rename(Name name) {
        return new FpRestrictIntervalAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpRestrictIntervalAudit rename(Table<?> name) {
        return new FpRestrictIntervalAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, LocalDate, LocalDate, Boolean, String, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super LocalDate, ? super LocalDate, ? super Boolean, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super LocalDate, ? super LocalDate, ? super Boolean, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
