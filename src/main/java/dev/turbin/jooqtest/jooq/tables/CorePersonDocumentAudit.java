/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CorePersonDocumentAuditRecord;

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
 * Таблица версионирования core_person_document
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CorePersonDocumentAudit extends TableImpl<CorePersonDocumentAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_person_document_audit</code>
     */
    public static final CorePersonDocumentAudit CORE_PERSON_DOCUMENT_AUDIT = new CorePersonDocumentAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CorePersonDocumentAuditRecord> getRecordType() {
        return CorePersonDocumentAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_person_document_audit.id</code>.
     * Идентификатор
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT, this, "Иденитификатор версионируемой записи");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public final TableField<CorePersonDocumentAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR, this, "Пользователь создавший версию");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public final TableField<CorePersonDocumentAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время начала действия версии effective from");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public final TableField<CorePersonDocumentAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время окончания действия версии expired");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.type_id</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.doc_no</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.series_code</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> SERIES_CODE = createField(DSL.name("series_code"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.first_name</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.last_name</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.middle_name</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.first_name_lat</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> FIRST_NAME_LAT = createField(DSL.name("first_name_lat"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.last_name_lat</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> LAST_NAME_LAT = createField(DSL.name("last_name_lat"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.middle_name_lat</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> MIDDLE_NAME_LAT = createField(DSL.name("middle_name_lat"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birthday_dt</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, LocalDate> BIRTHDAY_DT = createField(DSL.name("birthday_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.citizenship_id</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> CITIZENSHIP_ID = createField(DSL.name("citizenship_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.gender_id</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.person_id</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.issue_dt</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, LocalDate> ISSUE_DT = createField(DSL.name("issue_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.issue_place_desc</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> ISSUE_PLACE_DESC = createField(DSL.name("issue_place_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_place_desc</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> BIRTH_PLACE_DESC = createField(DSL.name("birth_place_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_country_id</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, Long> BIRTH_COUNTRY_ID = createField(DSL.name("birth_country_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.snils_code</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> SNILS_CODE = createField(DSL.name("snils_code"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_place_region_desc</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> BIRTH_PLACE_REGION_DESC = createField(DSL.name("birth_place_region_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_place_area_desc</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> BIRTH_PLACE_AREA_DESC = createField(DSL.name("birth_place_area_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_place_city_desc</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> BIRTH_PLACE_CITY_DESC = createField(DSL.name("birth_place_city_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_place_locality_desc</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> BIRTH_PLACE_LOCALITY_DESC = createField(DSL.name("birth_place_locality_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.authority_code</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, String> AUTHORITY_CODE = createField(DSL.name("authority_code"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.valid_to_dt</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, LocalDate> VALID_TO_DT = createField(DSL.name("valid_to_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.extended_to_dt</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, LocalDate> EXTENDED_TO_DT = createField(DSL.name("extended_to_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.birth_date_integrity</code>.
     */
    public final TableField<CorePersonDocumentAuditRecord, Integer> BIRTH_DATE_INTEGRITY = createField(DSL.name("birth_date_integrity"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>passport_international.core_person_document_audit.version</code>.
     * Реализация оптимистической блокировки
     */
    public final TableField<CorePersonDocumentAuditRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER, this, "Реализация оптимистической блокировки");

    private CorePersonDocumentAudit(Name alias, Table<CorePersonDocumentAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private CorePersonDocumentAudit(Name alias, Table<CorePersonDocumentAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования core_person_document"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.core_person_document_audit</code> table
     * reference
     */
    public CorePersonDocumentAudit(String alias) {
        this(DSL.name(alias), CORE_PERSON_DOCUMENT_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.core_person_document_audit</code> table
     * reference
     */
    public CorePersonDocumentAudit(Name alias) {
        this(alias, CORE_PERSON_DOCUMENT_AUDIT);
    }

    /**
     * Create a <code>passport_international.core_person_document_audit</code>
     * table reference
     */
    public CorePersonDocumentAudit() {
        this(DSL.name("core_person_document_audit"), null);
    }

    public <O extends Record> CorePersonDocumentAudit(Table<O> child, ForeignKey<O, CorePersonDocumentAuditRecord> key) {
        super(child, key, CORE_PERSON_DOCUMENT_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_PERSON_DOCUMENT_AUDIT_CORRECTION_LOG_IX, Indexes.CORE_PERSON_DOCUMENT_AUDIT_EFF_DTTM_IX, Indexes.CORE_PERSON_DOCUMENT_AUDIT_EXP_DTTM_IX, Indexes.CORE_PERSON_DOCUMENT_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<CorePersonDocumentAuditRecord, Long> getIdentity() {
        return (Identity<CorePersonDocumentAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CorePersonDocumentAuditRecord> getPrimaryKey() {
        return Keys.CORE_PERSON_DOCUMENT_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<CorePersonDocumentAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_PERSON_DOCUMENT_AUDIT__CORE_PERSON_DOCUMENT_AUDIT_FK, Keys.CORE_PERSON_DOCUMENT_AUDIT__CORE_PERSON_DOCUMENT_AUDIT_CORRECTION_LOG_FK);
    }

    private transient CorePersonDocument _corePersonDocument;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_person_document</code> table.
     */
    public CorePersonDocument corePersonDocument() {
        if (_corePersonDocument == null)
            _corePersonDocument = new CorePersonDocument(this, Keys.CORE_PERSON_DOCUMENT_AUDIT__CORE_PERSON_DOCUMENT_AUDIT_FK);

        return _corePersonDocument;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.CORE_PERSON_DOCUMENT_AUDIT__CORE_PERSON_DOCUMENT_AUDIT_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public CorePersonDocumentAudit as(String alias) {
        return new CorePersonDocumentAudit(DSL.name(alias), this);
    }

    @Override
    public CorePersonDocumentAudit as(Name alias) {
        return new CorePersonDocumentAudit(alias, this);
    }

    @Override
    public CorePersonDocumentAudit as(Table<?> alias) {
        return new CorePersonDocumentAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonDocumentAudit rename(String name) {
        return new CorePersonDocumentAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonDocumentAudit rename(Name name) {
        return new CorePersonDocumentAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonDocumentAudit rename(Table<?> name) {
        return new CorePersonDocumentAudit(name.getQualifiedName(), null);
    }
}
