/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseRestrictAuditRecord;

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
 * Таблица версионирования fp_case_restrict
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseRestrictAudit extends TableImpl<FpCaseRestrictAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_restrict_audit</code>
     */
    public static final FpCaseRestrictAudit FP_CASE_RESTRICT_AUDIT = new FpCaseRestrictAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseRestrictAuditRecord> getRecordType() {
        return FpCaseRestrictAuditRecord.class;
    }

    /**
     * The column <code>passport_international.fp_case_restrict_audit.id</code>.
     * Идентификатор "fp_case_restrict_audit" с данными коррекции
     */
    public final TableField<FpCaseRestrictAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_case_restrict_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpCaseRestrictAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpCaseRestrictAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpCaseRestrictAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public final TableField<FpCaseRestrictAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public final TableField<FpCaseRestrictAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.fpr_doc_issue_dt</code>.
     */
    public final TableField<FpCaseRestrictAuditRecord, LocalDate> FPR_DOC_ISSUE_DT = createField(DSL.name("fpr_doc_issue_dt"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.fpr_start_dt</code>.
     */
    public final TableField<FpCaseRestrictAuditRecord, LocalDate> FPR_START_DT = createField(DSL.name("fpr_start_dt"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.fpr_end_dt</code>.
     */
    public final TableField<FpCaseRestrictAuditRecord, LocalDate> FPR_END_DT = createField(DSL.name("fpr_end_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.fpr_doc_no</code>.
     */
    public final TableField<FpCaseRestrictAuditRecord, String> FPR_DOC_NO = createField(DSL.name("fpr_doc_no"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.fpr_doc_type</code>.
     */
    public final TableField<FpCaseRestrictAuditRecord, String> FPR_DOC_TYPE = createField(DSL.name("fpr_doc_type"), SQLDataType.VARCHAR(200), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_restrict_audit.comment</code>.
     */
    public final TableField<FpCaseRestrictAuditRecord, String> COMMENT = createField(DSL.name("comment"), SQLDataType.VARCHAR(512), this, "");

    private FpCaseRestrictAudit(Name alias, Table<FpCaseRestrictAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseRestrictAudit(Name alias, Table<FpCaseRestrictAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_case_restrict"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_restrict_audit</code> table
     * reference
     */
    public FpCaseRestrictAudit(String alias) {
        this(DSL.name(alias), FP_CASE_RESTRICT_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_restrict_audit</code> table
     * reference
     */
    public FpCaseRestrictAudit(Name alias) {
        this(alias, FP_CASE_RESTRICT_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_case_restrict_audit</code> table
     * reference
     */
    public FpCaseRestrictAudit() {
        this(DSL.name("fp_case_restrict_audit"), null);
    }

    public <O extends Record> FpCaseRestrictAudit(Table<O> child, ForeignKey<O, FpCaseRestrictAuditRecord> key) {
        super(child, key, FP_CASE_RESTRICT_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_CASE_RESTRICT_AUDIT_CORRECTION_LOG_IX, Indexes.FP_CASE_RESTRICT_AUDIT_EFF_DTTM_IX, Indexes.FP_CASE_RESTRICT_AUDIT_EXP_DTTM_IX, Indexes.FP_CASE_RESTRICT_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpCaseRestrictAuditRecord, Long> getIdentity() {
        return (Identity<FpCaseRestrictAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpCaseRestrictAuditRecord> getPrimaryKey() {
        return Keys.FP_CASE_RESTRICT_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpCaseRestrictAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_RESTRICT_AUDIT__FP_CASE_RESTRICT_REF_FK, Keys.FP_CASE_RESTRICT_AUDIT__FP_CASE_RESTRICT_CORRECTION_LOG_FK);
    }

    private transient FpCaseRestrict _fpCaseRestrict;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case_restrict</code> table.
     */
    public FpCaseRestrict fpCaseRestrict() {
        if (_fpCaseRestrict == null)
            _fpCaseRestrict = new FpCaseRestrict(this, Keys.FP_CASE_RESTRICT_AUDIT__FP_CASE_RESTRICT_REF_FK);

        return _fpCaseRestrict;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_CASE_RESTRICT_AUDIT__FP_CASE_RESTRICT_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpCaseRestrictAudit as(String alias) {
        return new FpCaseRestrictAudit(DSL.name(alias), this);
    }

    @Override
    public FpCaseRestrictAudit as(Name alias) {
        return new FpCaseRestrictAudit(alias, this);
    }

    @Override
    public FpCaseRestrictAudit as(Table<?> alias) {
        return new FpCaseRestrictAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRestrictAudit rename(String name) {
        return new FpCaseRestrictAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRestrictAudit rename(Name name) {
        return new FpCaseRestrictAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRestrictAudit rename(Table<?> name) {
        return new FpCaseRestrictAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, LocalDate, String, String, String> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? super LocalDate, ? super LocalDate, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? super LocalDate, ? super LocalDate, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}