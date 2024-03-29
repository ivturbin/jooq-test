/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpTranslateNameAuditRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
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
 * Таблица версионирования fp_translate_name
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpTranslateNameAudit extends TableImpl<FpTranslateNameAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_translate_name_audit</code>
     */
    public static final FpTranslateNameAudit FP_TRANSLATE_NAME_AUDIT = new FpTranslateNameAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpTranslateNameAuditRecord> getRecordType() {
        return FpTranslateNameAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.id</code>.
     * Идентификатор "fp_translate_name_audit" с данными коррекции
     */
    public final TableField<FpTranslateNameAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_translate_name_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpTranslateNameAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpTranslateNameAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpTranslateNameAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public final TableField<FpTranslateNameAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public final TableField<FpTranslateNameAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.first_name</code>.
     */
    public final TableField<FpTranslateNameAuditRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.middle_name</code>.
     */
    public final TableField<FpTranslateNameAuditRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.last_name</code>.
     */
    public final TableField<FpTranslateNameAuditRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name_audit.reason_translate</code>.
     */
    public final TableField<FpTranslateNameAuditRecord, String> REASON_TRANSLATE = createField(DSL.name("reason_translate"), SQLDataType.VARCHAR(512), this, "");

    private FpTranslateNameAudit(Name alias, Table<FpTranslateNameAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpTranslateNameAudit(Name alias, Table<FpTranslateNameAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_translate_name"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_translate_name_audit</code> table
     * reference
     */
    public FpTranslateNameAudit(String alias) {
        this(DSL.name(alias), FP_TRANSLATE_NAME_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_translate_name_audit</code> table
     * reference
     */
    public FpTranslateNameAudit(Name alias) {
        this(alias, FP_TRANSLATE_NAME_AUDIT);
    }

    /**
     * Create a <code>passport_international.fp_translate_name_audit</code>
     * table reference
     */
    public FpTranslateNameAudit() {
        this(DSL.name("fp_translate_name_audit"), null);
    }

    public <O extends Record> FpTranslateNameAudit(Table<O> child, ForeignKey<O, FpTranslateNameAuditRecord> key) {
        super(child, key, FP_TRANSLATE_NAME_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_TRANSLATE_NAME_AUDIT_CORRECTION_LOG_IX, Indexes.FP_TRANSLATE_NAME_AUDIT_EFF_DTTM_IX, Indexes.FP_TRANSLATE_NAME_AUDIT_EXP_DTTM_IX, Indexes.FP_TRANSLATE_NAME_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpTranslateNameAuditRecord, Long> getIdentity() {
        return (Identity<FpTranslateNameAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpTranslateNameAuditRecord> getPrimaryKey() {
        return Keys.FP_TRANSLATE_NAME_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpTranslateNameAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_TRANSLATE_NAME_AUDIT__FP_TRANSLATE_NAME_REF_FK, Keys.FP_TRANSLATE_NAME_AUDIT__FP_TRANSLATE_NAME_CORRECTION_LOG_FK);
    }

    private transient FpTranslateName _fpTranslateName;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_translate_name</code> table.
     */
    public FpTranslateName fpTranslateName() {
        if (_fpTranslateName == null)
            _fpTranslateName = new FpTranslateName(this, Keys.FP_TRANSLATE_NAME_AUDIT__FP_TRANSLATE_NAME_REF_FK);

        return _fpTranslateName;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_TRANSLATE_NAME_AUDIT__FP_TRANSLATE_NAME_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpTranslateNameAudit as(String alias) {
        return new FpTranslateNameAudit(DSL.name(alias), this);
    }

    @Override
    public FpTranslateNameAudit as(Name alias) {
        return new FpTranslateNameAudit(alias, this);
    }

    @Override
    public FpTranslateNameAudit as(Table<?> alias) {
        return new FpTranslateNameAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameAudit rename(String name) {
        return new FpTranslateNameAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameAudit rename(Name name) {
        return new FpTranslateNameAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameAudit rename(Table<?> name) {
        return new FpTranslateNameAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
