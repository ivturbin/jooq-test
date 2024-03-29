/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.AsrpFpaExtraInfoAuditRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row18;
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
 * Таблица версионирования asrp_fpa_extra_info
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AsrpFpaExtraInfoAudit extends TableImpl<AsrpFpaExtraInfoAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.asrp_fpa_extra_info_audit</code>
     */
    public static final AsrpFpaExtraInfoAudit ASRP_FPA_EXTRA_INFO_AUDIT = new AsrpFpaExtraInfoAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<AsrpFpaExtraInfoAuditRecord> getRecordType() {
        return AsrpFpaExtraInfoAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.id</code>.
     * Идентификатор "asrp_fpa_extra_info_audit" с данными коррекции
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"asrp_fpa_extra_info_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.id_declaration</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> ID_DECLARATION = createField(DSL.name("id_declaration"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.num_declaration</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, String> NUM_DECLARATION = createField(DSL.name("num_declaration"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.date_declaration</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, OffsetDateTime> DATE_DECLARATION = createField(DSL.name("date_declaration"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.date_docs_on</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, OffsetDateTime> DATE_DOCS_ON = createField(DSL.name("date_docs_on"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.region_code</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, String> REGION_CODE = createField(DSL.name("region_code"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.type_id</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, String> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.purpose_id</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> PURPOSE_ID = createField(DSL.name("purpose_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.reason_obrasch_id</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> REASON_OBRASCH_ID = createField(DSL.name("reason_obrasch_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.going_country_id</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> GOING_COUNTRY_ID = createField(DSL.name("going_country_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.bi_place_str_lat</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, String> BI_PLACE_STR_LAT = createField(DSL.name("bi_place_str_lat"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.reason_id</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> REASON_ID = createField(DSL.name("reason_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.asrp_fpa_extra_info_audit.core_document_id</code>.
     */
    public final TableField<AsrpFpaExtraInfoAuditRecord, Long> CORE_DOCUMENT_ID = createField(DSL.name("core_document_id"), SQLDataType.BIGINT, this, "");

    private AsrpFpaExtraInfoAudit(Name alias, Table<AsrpFpaExtraInfoAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private AsrpFpaExtraInfoAudit(Name alias, Table<AsrpFpaExtraInfoAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования asrp_fpa_extra_info"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.asrp_fpa_extra_info_audit</code> table
     * reference
     */
    public AsrpFpaExtraInfoAudit(String alias) {
        this(DSL.name(alias), ASRP_FPA_EXTRA_INFO_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.asrp_fpa_extra_info_audit</code> table
     * reference
     */
    public AsrpFpaExtraInfoAudit(Name alias) {
        this(alias, ASRP_FPA_EXTRA_INFO_AUDIT);
    }

    /**
     * Create a <code>passport_international.asrp_fpa_extra_info_audit</code>
     * table reference
     */
    public AsrpFpaExtraInfoAudit() {
        this(DSL.name("asrp_fpa_extra_info_audit"), null);
    }

    public <O extends Record> AsrpFpaExtraInfoAudit(Table<O> child, ForeignKey<O, AsrpFpaExtraInfoAuditRecord> key) {
        super(child, key, ASRP_FPA_EXTRA_INFO_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.ASRP_FPA_EXTRA_INFO_AUDIT_CORRECTION_LOG_IX, Indexes.ASRP_FPA_EXTRA_INFO_AUDIT_EFF_DTTM_IX, Indexes.ASRP_FPA_EXTRA_INFO_AUDIT_EXP_DTTM_IX, Indexes.ASRP_FPA_EXTRA_INFO_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<AsrpFpaExtraInfoAuditRecord, Long> getIdentity() {
        return (Identity<AsrpFpaExtraInfoAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<AsrpFpaExtraInfoAuditRecord> getPrimaryKey() {
        return Keys.ASRP_FPA_EXTRA_INFO_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<AsrpFpaExtraInfoAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.ASRP_FPA_EXTRA_INFO_AUDIT__ASRP_FPA_EXTRA_INFO_REF_FK, Keys.ASRP_FPA_EXTRA_INFO_AUDIT__ASRP_FPA_EXTRA_INFO_CORRECTION_LOG_FK);
    }

    private transient AsrpFpaExtraInfo _asrpFpaExtraInfo;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.asrp_fpa_extra_info</code> table.
     */
    public AsrpFpaExtraInfo asrpFpaExtraInfo() {
        if (_asrpFpaExtraInfo == null)
            _asrpFpaExtraInfo = new AsrpFpaExtraInfo(this, Keys.ASRP_FPA_EXTRA_INFO_AUDIT__ASRP_FPA_EXTRA_INFO_REF_FK);

        return _asrpFpaExtraInfo;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.ASRP_FPA_EXTRA_INFO_AUDIT__ASRP_FPA_EXTRA_INFO_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public AsrpFpaExtraInfoAudit as(String alias) {
        return new AsrpFpaExtraInfoAudit(DSL.name(alias), this);
    }

    @Override
    public AsrpFpaExtraInfoAudit as(Name alias) {
        return new AsrpFpaExtraInfoAudit(alias, this);
    }

    @Override
    public AsrpFpaExtraInfoAudit as(Table<?> alias) {
        return new AsrpFpaExtraInfoAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public AsrpFpaExtraInfoAudit rename(String name) {
        return new AsrpFpaExtraInfoAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public AsrpFpaExtraInfoAudit rename(Name name) {
        return new AsrpFpaExtraInfoAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public AsrpFpaExtraInfoAudit rename(Table<?> name) {
        return new AsrpFpaExtraInfoAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Long, String, OffsetDateTime, OffsetDateTime, String, String, Long, Long, Long, String, Long, Long> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function18<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function18<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
