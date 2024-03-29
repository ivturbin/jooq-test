/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpEmploymentAuditRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
 * Таблица версионирования fp_employment
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpEmploymentAudit extends TableImpl<FpEmploymentAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_employment_audit</code>
     */
    public static final FpEmploymentAudit FP_EMPLOYMENT_AUDIT = new FpEmploymentAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpEmploymentAuditRecord> getRecordType() {
        return FpEmploymentAuditRecord.class;
    }

    /**
     * The column <code>passport_international.fp_employment_audit.id</code>.
     * Идентификатор "fp_employment_audit" с данными коррекции
     */
    public final TableField<FpEmploymentAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_employment_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpEmploymentAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpEmploymentAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpEmploymentAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public final TableField<FpEmploymentAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public final TableField<FpEmploymentAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.fp_case_issuance_id</code>.
     */
    public final TableField<FpEmploymentAuditRecord, Long> FP_CASE_ISSUANCE_ID = createField(DSL.name("fp_case_issuance_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.employments_order</code>.
     */
    public final TableField<FpEmploymentAuditRecord, Long> EMPLOYMENTS_ORDER = createField(DSL.name("employments_order"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_employment_audit.employments_id</code>.
     */
    public final TableField<FpEmploymentAuditRecord, Long> EMPLOYMENTS_ID = createField(DSL.name("employments_id"), SQLDataType.BIGINT, this, "");

    private FpEmploymentAudit(Name alias, Table<FpEmploymentAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpEmploymentAudit(Name alias, Table<FpEmploymentAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_employment"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_employment_audit</code>
     * table reference
     */
    public FpEmploymentAudit(String alias) {
        this(DSL.name(alias), FP_EMPLOYMENT_AUDIT);
    }

    /**
     * Create an aliased <code>passport_international.fp_employment_audit</code>
     * table reference
     */
    public FpEmploymentAudit(Name alias) {
        this(alias, FP_EMPLOYMENT_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_employment_audit</code> table
     * reference
     */
    public FpEmploymentAudit() {
        this(DSL.name("fp_employment_audit"), null);
    }

    public <O extends Record> FpEmploymentAudit(Table<O> child, ForeignKey<O, FpEmploymentAuditRecord> key) {
        super(child, key, FP_EMPLOYMENT_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_EMPLOYMENT_AUDIT_CORRECTION_LOG_IX, Indexes.FP_EMPLOYMENT_AUDIT_EFF_DTTM_IX, Indexes.FP_EMPLOYMENT_AUDIT_EXP_DTTM_IX, Indexes.FP_EMPLOYMENT_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpEmploymentAuditRecord, Long> getIdentity() {
        return (Identity<FpEmploymentAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpEmploymentAuditRecord> getPrimaryKey() {
        return Keys.FP_EMPLOYMENT_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpEmploymentAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_EMPLOYMENT_AUDIT__FP_EMPLOYMENT_REF_FK, Keys.FP_EMPLOYMENT_AUDIT__FP_EMPLOYMENT_CORRECTION_LOG_FK);
    }

    private transient FpEmployment _fpEmployment;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_employment</code> table.
     */
    public FpEmployment fpEmployment() {
        if (_fpEmployment == null)
            _fpEmployment = new FpEmployment(this, Keys.FP_EMPLOYMENT_AUDIT__FP_EMPLOYMENT_REF_FK);

        return _fpEmployment;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_EMPLOYMENT_AUDIT__FP_EMPLOYMENT_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpEmploymentAudit as(String alias) {
        return new FpEmploymentAudit(DSL.name(alias), this);
    }

    @Override
    public FpEmploymentAudit as(Name alias) {
        return new FpEmploymentAudit(alias, this);
    }

    @Override
    public FpEmploymentAudit as(Table<?> alias) {
        return new FpEmploymentAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpEmploymentAudit rename(String name) {
        return new FpEmploymentAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpEmploymentAudit rename(Name name) {
        return new FpEmploymentAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpEmploymentAudit rename(Table<?> name) {
        return new FpEmploymentAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long, Long> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}