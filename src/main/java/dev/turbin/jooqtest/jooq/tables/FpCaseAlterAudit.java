/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseAlterAuditRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function7;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row7;
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
 * Таблица версионирования fp_case_alter
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseAlterAudit extends TableImpl<FpCaseAlterAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_alter_audit</code>
     */
    public static final FpCaseAlterAudit FP_CASE_ALTER_AUDIT = new FpCaseAlterAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseAlterAuditRecord> getRecordType() {
        return FpCaseAlterAuditRecord.class;
    }

    /**
     * The column <code>passport_international.fp_case_alter_audit.id</code>.
     * Идентификатор "fp_case_alter_audit" с данными коррекции
     */
    public final TableField<FpCaseAlterAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_case_alter_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_case_alter_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpCaseAlterAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_case_alter_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpCaseAlterAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_case_alter_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpCaseAlterAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_case_alter_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public final TableField<FpCaseAlterAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_alter_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public final TableField<FpCaseAlterAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_alter_audit.fp_case_issuance_id</code>.
     */
    public final TableField<FpCaseAlterAuditRecord, Long> FP_CASE_ISSUANCE_ID = createField(DSL.name("fp_case_issuance_id"), SQLDataType.BIGINT, this, "");

    private FpCaseAlterAudit(Name alias, Table<FpCaseAlterAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseAlterAudit(Name alias, Table<FpCaseAlterAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_case_alter"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_case_alter_audit</code>
     * table reference
     */
    public FpCaseAlterAudit(String alias) {
        this(DSL.name(alias), FP_CASE_ALTER_AUDIT);
    }

    /**
     * Create an aliased <code>passport_international.fp_case_alter_audit</code>
     * table reference
     */
    public FpCaseAlterAudit(Name alias) {
        this(alias, FP_CASE_ALTER_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_case_alter_audit</code> table
     * reference
     */
    public FpCaseAlterAudit() {
        this(DSL.name("fp_case_alter_audit"), null);
    }

    public <O extends Record> FpCaseAlterAudit(Table<O> child, ForeignKey<O, FpCaseAlterAuditRecord> key) {
        super(child, key, FP_CASE_ALTER_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_CASE_ALTER_AUDIT_CORRECTION_LOG_IX, Indexes.FP_CASE_ALTER_AUDIT_EFF_DTTM_IX, Indexes.FP_CASE_ALTER_AUDIT_EXP_DTTM_IX, Indexes.FP_CASE_ALTER_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpCaseAlterAuditRecord, Long> getIdentity() {
        return (Identity<FpCaseAlterAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpCaseAlterAuditRecord> getPrimaryKey() {
        return Keys.FP_CASE_ALTER_AUDIT_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpCaseAlterAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_ALTER_AUDIT__FP_CASE_ALTER_REF_FK, Keys.FP_CASE_ALTER_AUDIT__FP_CASE_ALTER_CORRECTION_LOG_FK);
    }

    private transient FpCaseAlter _fpCaseAlter;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case_alter</code> table.
     */
    public FpCaseAlter fpCaseAlter() {
        if (_fpCaseAlter == null)
            _fpCaseAlter = new FpCaseAlter(this, Keys.FP_CASE_ALTER_AUDIT__FP_CASE_ALTER_REF_FK);

        return _fpCaseAlter;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_CASE_ALTER_AUDIT__FP_CASE_ALTER_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpCaseAlterAudit as(String alias) {
        return new FpCaseAlterAudit(DSL.name(alias), this);
    }

    @Override
    public FpCaseAlterAudit as(Name alias) {
        return new FpCaseAlterAudit(alias, this);
    }

    @Override
    public FpCaseAlterAudit as(Table<?> alias) {
        return new FpCaseAlterAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseAlterAudit rename(String name) {
        return new FpCaseAlterAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseAlterAudit rename(Name name) {
        return new FpCaseAlterAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseAlterAudit rename(Table<?> name) {
        return new FpCaseAlterAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function7<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function7<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}