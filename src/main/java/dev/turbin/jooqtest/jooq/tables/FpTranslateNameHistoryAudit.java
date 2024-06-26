/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpTranslateNameHistoryAuditRecord;

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
 * Таблица версионирования fp_translate_name_history
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpTranslateNameHistoryAudit extends TableImpl<FpTranslateNameHistoryAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_translate_name_history_audit</code>
     */
    public static final FpTranslateNameHistoryAudit FP_TRANSLATE_NAME_HISTORY_AUDIT = new FpTranslateNameHistoryAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpTranslateNameHistoryAuditRecord> getRecordType() {
        return FpTranslateNameHistoryAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.id</code>.
     * Идентификатор "fp_translate_name_history_audit" с данными коррекции
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_translate_name_history_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.record_fp_case_id</code>.
     * Часть внешнего ключа на запись в таблице-мастере (fp_case_id)
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, Long> RECORD_FP_CASE_ID = createField(DSL.name("record_fp_case_id"), SQLDataType.BIGINT.nullable(false), this, "Часть внешнего ключа на запись в таблице-мастере (fp_case_id)");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.record_translate_name_id</code>.
     * Часть внешнего ключа на запись в таблице-мастере (translate_name_id)
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, Long> RECORD_TRANSLATE_NAME_ID = createField(DSL.name("record_translate_name_id"), SQLDataType.BIGINT.nullable(false), this, "Часть внешнего ключа на запись в таблице-мастере (translate_name_id)");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history_audit.translate_order</code>.
     */
    public final TableField<FpTranslateNameHistoryAuditRecord, Long> TRANSLATE_ORDER = createField(DSL.name("translate_order"), SQLDataType.BIGINT.nullable(false), this, "");

    private FpTranslateNameHistoryAudit(Name alias, Table<FpTranslateNameHistoryAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpTranslateNameHistoryAudit(Name alias, Table<FpTranslateNameHistoryAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_translate_name_history"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_translate_name_history_audit</code> table
     * reference
     */
    public FpTranslateNameHistoryAudit(String alias) {
        this(DSL.name(alias), FP_TRANSLATE_NAME_HISTORY_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_translate_name_history_audit</code> table
     * reference
     */
    public FpTranslateNameHistoryAudit(Name alias) {
        this(alias, FP_TRANSLATE_NAME_HISTORY_AUDIT);
    }

    /**
     * Create a
     * <code>passport_international.fp_translate_name_history_audit</code> table
     * reference
     */
    public FpTranslateNameHistoryAudit() {
        this(DSL.name("fp_translate_name_history_audit"), null);
    }

    public <O extends Record> FpTranslateNameHistoryAudit(Table<O> child, ForeignKey<O, FpTranslateNameHistoryAuditRecord> key) {
        super(child, key, FP_TRANSLATE_NAME_HISTORY_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_TRANSLATE_NAME_HISTORY_AUDIT_CORRECTION_LOG_IX, Indexes.FP_TRANSLATE_NAME_HISTORY_AUDIT_EFF_DTTM_IX, Indexes.FP_TRANSLATE_NAME_HISTORY_AUDIT_EXP_DTTM_IX, Indexes.FP_TRANSLATE_NAME_HISTORY_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpTranslateNameHistoryAuditRecord, Long> getIdentity() {
        return (Identity<FpTranslateNameHistoryAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpTranslateNameHistoryAuditRecord> getPrimaryKey() {
        return Keys.FP_TRANSLATE_NAME_HISTORY_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpTranslateNameHistoryAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_TRANSLATE_NAME_HISTORY_AUDIT__FP_TRANSLATE_NAME_HISTORY_AUDIT_FK, Keys.FP_TRANSLATE_NAME_HISTORY_AUDIT__FP_TRANSLATE_NAME_HISTORY_CORRECTION_LOG_FK);
    }

    private transient FpTranslateNameHistory _fpTranslateNameHistory;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_translate_name_history</code> table.
     */
    public FpTranslateNameHistory fpTranslateNameHistory() {
        if (_fpTranslateNameHistory == null)
            _fpTranslateNameHistory = new FpTranslateNameHistory(this, Keys.FP_TRANSLATE_NAME_HISTORY_AUDIT__FP_TRANSLATE_NAME_HISTORY_AUDIT_FK);

        return _fpTranslateNameHistory;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_TRANSLATE_NAME_HISTORY_AUDIT__FP_TRANSLATE_NAME_HISTORY_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpTranslateNameHistoryAudit as(String alias) {
        return new FpTranslateNameHistoryAudit(DSL.name(alias), this);
    }

    @Override
    public FpTranslateNameHistoryAudit as(Name alias) {
        return new FpTranslateNameHistoryAudit(alias, this);
    }

    @Override
    public FpTranslateNameHistoryAudit as(Table<?> alias) {
        return new FpTranslateNameHistoryAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameHistoryAudit rename(String name) {
        return new FpTranslateNameHistoryAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameHistoryAudit rename(Name name) {
        return new FpTranslateNameHistoryAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameHistoryAudit rename(Table<?> name) {
        return new FpTranslateNameHistoryAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row8 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row8<Long, Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long> fieldsRow() {
        return (Row8) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function8<? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function8<? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
