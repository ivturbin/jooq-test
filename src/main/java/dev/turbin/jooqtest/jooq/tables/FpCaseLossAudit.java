/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseLossAuditRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
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
 * Таблица версионирования fp_case_loss
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseLossAudit extends TableImpl<FpCaseLossAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_loss_audit</code>
     */
    public static final FpCaseLossAudit FP_CASE_LOSS_AUDIT = new FpCaseLossAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseLossAuditRecord> getRecordType() {
        return FpCaseLossAuditRecord.class;
    }

    /**
     * The column <code>passport_international.fp_case_loss_audit.id</code>.
     * Идентификатор "fp_case_loss_audit" с данными коррекции
     */
    public final TableField<FpCaseLossAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_case_loss_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.record_id</code>. Внешний
     * ключ на запись в таблице-мастере
     */
    public final TableField<FpCaseLossAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpCaseLossAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpCaseLossAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public final TableField<FpCaseLossAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public final TableField<FpCaseLossAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.lost_dt</code>.
     */
    public final TableField<FpCaseLossAuditRecord, LocalDate> LOST_DT = createField(DSL.name("lost_dt"), SQLDataType.LOCALDATE.nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.lost_cert_dt</code>.
     */
    public final TableField<FpCaseLossAuditRecord, LocalDate> LOST_CERT_DT = createField(DSL.name("lost_cert_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.fp_case_issuance_id</code>.
     */
    public final TableField<FpCaseLossAuditRecord, Long> FP_CASE_ISSUANCE_ID = createField(DSL.name("fp_case_issuance_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.lost_cert_number</code>.
     */
    public final TableField<FpCaseLossAuditRecord, String> LOST_CERT_NUMBER = createField(DSL.name("lost_cert_number"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.lost_reason</code>.
     */
    public final TableField<FpCaseLossAuditRecord, String> LOST_REASON = createField(DSL.name("lost_reason"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.lost_cert_authority</code>.
     */
    public final TableField<FpCaseLossAuditRecord, String> LOST_CERT_AUTHORITY = createField(DSL.name("lost_cert_authority"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column
     * <code>passport_international.fp_case_loss_audit.signer_user_id</code>.
     */
    public final TableField<FpCaseLossAuditRecord, Long> SIGNER_USER_ID = createField(DSL.name("signer_user_id"), SQLDataType.BIGINT, this, "");

    private FpCaseLossAudit(Name alias, Table<FpCaseLossAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseLossAudit(Name alias, Table<FpCaseLossAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_case_loss"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_case_loss_audit</code>
     * table reference
     */
    public FpCaseLossAudit(String alias) {
        this(DSL.name(alias), FP_CASE_LOSS_AUDIT);
    }

    /**
     * Create an aliased <code>passport_international.fp_case_loss_audit</code>
     * table reference
     */
    public FpCaseLossAudit(Name alias) {
        this(alias, FP_CASE_LOSS_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_case_loss_audit</code> table
     * reference
     */
    public FpCaseLossAudit() {
        this(DSL.name("fp_case_loss_audit"), null);
    }

    public <O extends Record> FpCaseLossAudit(Table<O> child, ForeignKey<O, FpCaseLossAuditRecord> key) {
        super(child, key, FP_CASE_LOSS_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_CASE_LOSS_AUDIT_CORRECTION_LOG_IX, Indexes.FP_CASE_LOSS_AUDIT_EFF_DTTM_IX, Indexes.FP_CASE_LOSS_AUDIT_EXP_DTTM_IX, Indexes.FP_CASE_LOSS_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpCaseLossAuditRecord, Long> getIdentity() {
        return (Identity<FpCaseLossAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpCaseLossAuditRecord> getPrimaryKey() {
        return Keys.FP_CASE_LOSS_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpCaseLossAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_LOSS_AUDIT__FP_CASE_LOSS_REF_FK, Keys.FP_CASE_LOSS_AUDIT__FP_CASE_LOSS_CORRECTION_LOG_FK);
    }

    private transient FpCaseLoss _fpCaseLoss;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case_loss</code> table.
     */
    public FpCaseLoss fpCaseLoss() {
        if (_fpCaseLoss == null)
            _fpCaseLoss = new FpCaseLoss(this, Keys.FP_CASE_LOSS_AUDIT__FP_CASE_LOSS_REF_FK);

        return _fpCaseLoss;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_CASE_LOSS_AUDIT__FP_CASE_LOSS_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpCaseLossAudit as(String alias) {
        return new FpCaseLossAudit(DSL.name(alias), this);
    }

    @Override
    public FpCaseLossAudit as(Name alias) {
        return new FpCaseLossAudit(alias, this);
    }

    @Override
    public FpCaseLossAudit as(Table<?> alias) {
        return new FpCaseLossAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseLossAudit rename(String name) {
        return new FpCaseLossAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseLossAudit rename(Name name) {
        return new FpCaseLossAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseLossAudit rename(Table<?> name) {
        return new FpCaseLossAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, Long, String, String, String, Long> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}