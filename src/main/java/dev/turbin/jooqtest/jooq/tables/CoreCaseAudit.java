/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreCaseAuditRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Таблица версионирования core_case
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreCaseAudit extends TableImpl<CoreCaseAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_case_audit</code>
     */
    public static final CoreCaseAudit CORE_CASE_AUDIT = new CoreCaseAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreCaseAuditRecord> getRecordType() {
        return CoreCaseAuditRecord.class;
    }

    /**
     * The column <code>passport_international.core_case_audit.id</code>.
     * Идентификатор
     */
    public final TableField<CoreCaseAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column <code>passport_international.core_case_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public final TableField<CoreCaseAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Иденитификатор версионируемой записи");

    /**
     * The column
     * <code>passport_international.core_case_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<CoreCaseAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.core_case_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public final TableField<CoreCaseAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR.nullable(false), this, "Пользователь создавший версию");

    /**
     * The column <code>passport_international.core_case_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public final TableField<CoreCaseAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время начала действия версии effective from");

    /**
     * The column <code>passport_international.core_case_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public final TableField<CoreCaseAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время окончания действия версии expired");

    /**
     * The column <code>passport_international.core_case_audit.version</code>.
     */
    public final TableField<CoreCaseAuditRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.invalid_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> INVALID_ID = createField(DSL.name("invalid_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.in_checklist_bool</code>.
     */
    public final TableField<CoreCaseAuditRecord, Boolean> IN_CHECKLIST_BOOL = createField(DSL.name("in_checklist_bool"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.data_corrected_code_nval</code>.
     */
    public final TableField<CoreCaseAuditRecord, BigDecimal> DATA_CORRECTED_CODE_NVAL = createField(DSL.name("data_corrected_code_nval"), SQLDataType.NUMERIC, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.from_draft_bool</code>.
     */
    public final TableField<CoreCaseAuditRecord, Boolean> FROM_DRAFT_BOOL = createField(DSL.name("from_draft_bool"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.case_type_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> CASE_TYPE_ID = createField(DSL.name("case_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.department_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.case_status_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> CASE_STATUS_ID = createField(DSL.name("case_status_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.create_supplier_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> CREATE_SUPPLIER_ID = createField(DSL.name("create_supplier_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.reception_supplier_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> RECEPTION_SUPPLIER_ID = createField(DSL.name("reception_supplier_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.reception_dt</code>.
     */
    public final TableField<CoreCaseAuditRecord, LocalDate> RECEPTION_DT = createField(DSL.name("reception_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.invalid_dt</code>.
     */
    public final TableField<CoreCaseAuditRecord, LocalDate> INVALID_DT = createField(DSL.name("invalid_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.cessation_dt</code>.
     */
    public final TableField<CoreCaseAuditRecord, LocalDate> CESSATION_DT = createField(DSL.name("cessation_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.parent_case_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> PARENT_CASE_ID = createField(DSL.name("parent_case_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.cessation_reason_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> CESSATION_REASON_ID = createField(DSL.name("cessation_reason_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.cessation_user</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> CESSATION_USER = createField(DSL.name("cessation_user"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.invalid_user</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> INVALID_USER = createField(DSL.name("invalid_user"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>passport_international.core_case_audit.case_no</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> CASE_NO = createField(DSL.name("case_no"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.case_arc_no</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> CASE_ARC_NO = createField(DSL.name("case_arc_no"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.cessation_basis_desc</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> CESSATION_BASIS_DESC = createField(DSL.name("cessation_basis_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.comments_desc</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> COMMENTS_DESC = createField(DSL.name("comments_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.case_reason_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> CASE_REASON_ID = createField(DSL.name("case_reason_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>passport_international.core_case_audit.person_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.cancelled_bool</code>.
     */
    public final TableField<CoreCaseAuditRecord, Boolean> CANCELLED_BOOL = createField(DSL.name("cancelled_bool"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.person_status_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> PERSON_STATUS_ID = createField(DSL.name("person_status_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.department_code</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> DEPARTMENT_CODE = createField(DSL.name("department_code"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.person_document_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> PERSON_DOCUMENT_ID = createField(DSL.name("person_document_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>passport_international.core_case_audit.region_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> REGION_ID = createField(DSL.name("region_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.application_no</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> APPLICATION_NO = createField(DSL.name("application_no"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.federal_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> FEDERAL_ID = createField(DSL.name("federal_id"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>passport_international.core_case_audit.source_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, Long> SOURCE_ID = createField(DSL.name("source_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.source_case_id</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> SOURCE_CASE_ID = createField(DSL.name("source_case_id"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_case_audit.create_user</code>.
     */
    public final TableField<CoreCaseAuditRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR, this, "");

    private CoreCaseAudit(Name alias, Table<CoreCaseAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreCaseAudit(Name alias, Table<CoreCaseAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования core_case"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_case_audit</code>
     * table reference
     */
    public CoreCaseAudit(String alias) {
        this(DSL.name(alias), CORE_CASE_AUDIT);
    }

    /**
     * Create an aliased <code>passport_international.core_case_audit</code>
     * table reference
     */
    public CoreCaseAudit(Name alias) {
        this(alias, CORE_CASE_AUDIT);
    }

    /**
     * Create a <code>passport_international.core_case_audit</code> table
     * reference
     */
    public CoreCaseAudit() {
        this(DSL.name("core_case_audit"), null);
    }

    public <O extends Record> CoreCaseAudit(Table<O> child, ForeignKey<O, CoreCaseAuditRecord> key) {
        super(child, key, CORE_CASE_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_CASE_AUDIT_CORRECTION_LOG_IX, Indexes.CORE_CASE_AUDIT_EFF_DTTM_IX, Indexes.CORE_CASE_AUDIT_EXP_DTTM_IX, Indexes.CORE_CASE_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<CoreCaseAuditRecord, Long> getIdentity() {
        return (Identity<CoreCaseAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreCaseAuditRecord> getPrimaryKey() {
        return Keys.CORE_CASE_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<CoreCaseAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_CASE_AUDIT__CORE_CASE_REF_FK, Keys.CORE_CASE_AUDIT__CORE_CASE_CORRECTION_LOG_FK);
    }

    private transient CoreCase _coreCase;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.CORE_CASE_AUDIT__CORE_CASE_REF_FK);

        return _coreCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.CORE_CASE_AUDIT__CORE_CASE_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public CoreCaseAudit as(String alias) {
        return new CoreCaseAudit(DSL.name(alias), this);
    }

    @Override
    public CoreCaseAudit as(Name alias) {
        return new CoreCaseAudit(alias, this);
    }

    @Override
    public CoreCaseAudit as(Table<?> alias) {
        return new CoreCaseAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreCaseAudit rename(String name) {
        return new CoreCaseAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreCaseAudit rename(Name name) {
        return new CoreCaseAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreCaseAudit rename(Table<?> name) {
        return new CoreCaseAudit(name.getQualifiedName(), null);
    }
}
