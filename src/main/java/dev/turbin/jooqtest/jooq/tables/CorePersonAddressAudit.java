/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CorePersonAddressAuditRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row21;
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
 * Таблица версионирования core_person_address
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CorePersonAddressAudit extends TableImpl<CorePersonAddressAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_person_address_audit</code>
     */
    public static final CorePersonAddressAudit CORE_PERSON_ADDRESS_AUDIT = new CorePersonAddressAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CorePersonAddressAuditRecord> getRecordType() {
        return CorePersonAddressAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_person_address_audit.id</code>.
     * Идентификатор
     */
    public final TableField<CorePersonAddressAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.record_id</code>.
     * Иденитификатор версионируемой записи
     */
    public final TableField<CorePersonAddressAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT, this, "Иденитификатор версионируемой записи");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<CorePersonAddressAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.update_user</code>.
     * Пользователь создавший версию
     */
    public final TableField<CorePersonAddressAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR, this, "Пользователь создавший версию");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.eff_dttm</code>.
     * Время начала действия версии effective from
     */
    public final TableField<CorePersonAddressAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время начала действия версии effective from");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.exp_dttm</code>.
     * Время окончания действия версии expired
     */
    public final TableField<CorePersonAddressAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время окончания действия версии expired");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.invalid</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Boolean> INVALID = createField(DSL.name("invalid"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.person_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.person_state_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> PERSON_STATE_ID = createField(DSL.name("person_state_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.address_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> ADDRESS_ID = createField(DSL.name("address_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.address_type_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> ADDRESS_TYPE_ID = createField(DSL.name("address_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.create_user</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.from_dt</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, LocalDate> FROM_DT = createField(DSL.name("from_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.to_dt</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, LocalDate> TO_DT = createField(DSL.name("to_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.invalid_dt</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, LocalDate> INVALID_DT = createField(DSL.name("invalid_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.user_invalid</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, String> USER_INVALID = createField(DSL.name("user_invalid"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.new_address_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> NEW_ADDRESS_ID = createField(DSL.name("new_address_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.unstructured</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, String> UNSTRUCTURED = createField(DSL.name("unstructured"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.sono_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> SONO_ID = createField(DSL.name("sono_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.person_document_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> PERSON_DOCUMENT_ID = createField(DSL.name("person_document_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.core_person_address_audit.nsi_address_id</code>.
     */
    public final TableField<CorePersonAddressAuditRecord, Long> NSI_ADDRESS_ID = createField(DSL.name("nsi_address_id"), SQLDataType.BIGINT, this, "");

    private CorePersonAddressAudit(Name alias, Table<CorePersonAddressAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private CorePersonAddressAudit(Name alias, Table<CorePersonAddressAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования core_person_address"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.core_person_address_audit</code> table
     * reference
     */
    public CorePersonAddressAudit(String alias) {
        this(DSL.name(alias), CORE_PERSON_ADDRESS_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.core_person_address_audit</code> table
     * reference
     */
    public CorePersonAddressAudit(Name alias) {
        this(alias, CORE_PERSON_ADDRESS_AUDIT);
    }

    /**
     * Create a <code>passport_international.core_person_address_audit</code>
     * table reference
     */
    public CorePersonAddressAudit() {
        this(DSL.name("core_person_address_audit"), null);
    }

    public <O extends Record> CorePersonAddressAudit(Table<O> child, ForeignKey<O, CorePersonAddressAuditRecord> key) {
        super(child, key, CORE_PERSON_ADDRESS_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_PERSON_ADDRESS_AUDIT_CORRECTION_LOG_IX, Indexes.CORE_PERSON_ADDRESS_AUDIT_EFF_DTTM_IX, Indexes.CORE_PERSON_ADDRESS_AUDIT_EXP_DTTM_IX, Indexes.CORE_PERSON_ADDRESS_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<CorePersonAddressAuditRecord, Long> getIdentity() {
        return (Identity<CorePersonAddressAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CorePersonAddressAuditRecord> getPrimaryKey() {
        return Keys.CORE_PERSON_ADDRESS_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<CorePersonAddressAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_PERSON_ADDRESS_AUDIT__CORE_PERSON_ADDRESS_AUDIT_FK, Keys.CORE_PERSON_ADDRESS_AUDIT__CORE_PERSON_ADDRESS_AUDIT_CORRECTION_LOG_FK);
    }

    private transient CorePersonAddress _corePersonAddress;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_person_address</code> table.
     */
    public CorePersonAddress corePersonAddress() {
        if (_corePersonAddress == null)
            _corePersonAddress = new CorePersonAddress(this, Keys.CORE_PERSON_ADDRESS_AUDIT__CORE_PERSON_ADDRESS_AUDIT_FK);

        return _corePersonAddress;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.CORE_PERSON_ADDRESS_AUDIT__CORE_PERSON_ADDRESS_AUDIT_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public CorePersonAddressAudit as(String alias) {
        return new CorePersonAddressAudit(DSL.name(alias), this);
    }

    @Override
    public CorePersonAddressAudit as(Name alias) {
        return new CorePersonAddressAudit(alias, this);
    }

    @Override
    public CorePersonAddressAudit as(Table<?> alias) {
        return new CorePersonAddressAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonAddressAudit rename(String name) {
        return new CorePersonAddressAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonAddressAudit rename(Name name) {
        return new CorePersonAddressAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonAddressAudit rename(Table<?> name) {
        return new CorePersonAddressAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, Boolean, Long, Long, Long, Long, String, LocalDate, LocalDate, LocalDate, String, Long, String, Long, Long, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super LocalDate, ? super LocalDate, ? super LocalDate, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Boolean, ? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super LocalDate, ? super LocalDate, ? super LocalDate, ? super String, ? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
