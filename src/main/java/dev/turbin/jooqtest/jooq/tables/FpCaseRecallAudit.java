/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseRecallAuditRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function8;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row8;
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
 * Таблица версионирования fp_case_recall
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseRecallAudit extends TableImpl<FpCaseRecallAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_recall_audit</code>
     */
    public static final FpCaseRecallAudit FP_CASE_RECALL_AUDIT = new FpCaseRecallAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseRecallAuditRecord> getRecordType() {
        return FpCaseRecallAuditRecord.class;
    }

    /**
     * The column <code>passport_international.fp_case_recall_audit.id</code>.
     * Идентификатор "fp_case_recall_audit" с данными коррекции
     */
    public final TableField<FpCaseRecallAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_case_recall_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpCaseRecallAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpCaseRecallAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpCaseRecallAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public final TableField<FpCaseRecallAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public final TableField<FpCaseRecallAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.fp_case_issuance_id</code>.
     */
    public final TableField<FpCaseRecallAuditRecord, Long> FP_CASE_ISSUANCE_ID = createField(DSL.name("fp_case_issuance_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.fp_case_recall_audit.recall_reason_id</code>.
     */
    public final TableField<FpCaseRecallAuditRecord, Long> RECALL_REASON_ID = createField(DSL.name("recall_reason_id"), SQLDataType.BIGINT, this, "");

    private FpCaseRecallAudit(Name alias, Table<FpCaseRecallAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseRecallAudit(Name alias, Table<FpCaseRecallAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_case_recall"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_recall_audit</code> table reference
     */
    public FpCaseRecallAudit(String alias) {
        this(DSL.name(alias), FP_CASE_RECALL_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_recall_audit</code> table reference
     */
    public FpCaseRecallAudit(Name alias) {
        this(alias, FP_CASE_RECALL_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_case_recall_audit</code> table
     * reference
     */
    public FpCaseRecallAudit() {
        this(DSL.name("fp_case_recall_audit"), null);
    }

    public <O extends Record> FpCaseRecallAudit(Table<O> child, ForeignKey<O, FpCaseRecallAuditRecord> key) {
        super(child, key, FP_CASE_RECALL_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_CASE_RECALL_AUDIT_CORRECTION_LOG_IX, Indexes.FP_CASE_RECALL_AUDIT_EFF_DTTM_IX, Indexes.FP_CASE_RECALL_AUDIT_EXP_DTTM_IX, Indexes.FP_CASE_RECALL_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpCaseRecallAuditRecord, Long> getIdentity() {
        return (Identity<FpCaseRecallAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpCaseRecallAuditRecord> getPrimaryKey() {
        return Keys.FP_CASE_RECALL_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpCaseRecallAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_RECALL_AUDIT__FP_CASE_RECALL_REF_FK, Keys.FP_CASE_RECALL_AUDIT__FP_CASE_RECALL_CORRECTION_LOG_FK);
    }

    private transient FpCaseRecall _fpCaseRecall;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case_recall</code> table.
     */
    public FpCaseRecall fpCaseRecall() {
        if (_fpCaseRecall == null)
            _fpCaseRecall = new FpCaseRecall(this, Keys.FP_CASE_RECALL_AUDIT__FP_CASE_RECALL_REF_FK);

        return _fpCaseRecall;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_CASE_RECALL_AUDIT__FP_CASE_RECALL_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpCaseRecallAudit as(String alias) {
        return new FpCaseRecallAudit(DSL.name(alias), this);
    }

    @Override
    public FpCaseRecallAudit as(Name alias) {
        return new FpCaseRecallAudit(alias, this);
    }

    @Override
    public FpCaseRecallAudit as(Table<?> alias) {
        return new FpCaseRecallAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRecallAudit rename(String name) {
        return new FpCaseRecallAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRecallAudit rename(Name name) {
        return new FpCaseRecallAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRecallAudit rename(Table<?> name) {
        return new FpCaseRecallAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
