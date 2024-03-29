/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpInformalLegalPersonAuditRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
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
 * Таблица версионирования fp_informal_legal_person
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpInformalLegalPersonAudit extends TableImpl<FpInformalLegalPersonAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_informal_legal_person_audit</code>
     */
    public static final FpInformalLegalPersonAudit FP_INFORMAL_LEGAL_PERSON_AUDIT = new FpInformalLegalPersonAudit();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpInformalLegalPersonAuditRecord> getRecordType() {
        return FpInformalLegalPersonAuditRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.id</code>.
     * Идентификатор "fp_informal_legal_person_audit" с данными коррекции
     */
    public final TableField<FpInformalLegalPersonAuditRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор \"fp_informal_legal_person_audit\" с данными коррекции");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public final TableField<FpInformalLegalPersonAuditRecord, Long> RECORD_ID = createField(DSL.name("record_id"), SQLDataType.BIGINT.nullable(false), this, "Внешний ключ на запись в таблице-мастере");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public final TableField<FpInformalLegalPersonAuditRecord, Long> CORRECTION_LOG_ID = createField(DSL.name("correction_log_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор лога коррекции дела");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public final TableField<FpInformalLegalPersonAuditRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь, скорректировавший дело");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.eff_dttm</code>.
     * Дата начала действия версии
     */
    public final TableField<FpInformalLegalPersonAuditRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-12-31 00:00:00'::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия версии");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.exp_dttm</code>.
     * Дата окончания действия версии
     */
    public final TableField<FpInformalLegalPersonAuditRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("(now())::timestamp without time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия версии");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.last_name</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.first_name</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.middle_name</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.birthday_dt</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, LocalDate> BIRTHDAY_DT = createField(DSL.name("birthday_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.birth_place</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, String> BIRTH_PLACE = createField(DSL.name("birth_place"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.reg_living_address</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, String> REG_LIVING_ADDRESS = createField(DSL.name("reg_living_address"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.citizenship</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, Long> CITIZENSHIP = createField(DSL.name("citizenship"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.fp_informal_legal_person_audit.relation_type_id</code>.
     */
    public final TableField<FpInformalLegalPersonAuditRecord, Long> RELATION_TYPE_ID = createField(DSL.name("relation_type_id"), SQLDataType.BIGINT, this, "");

    private FpInformalLegalPersonAudit(Name alias, Table<FpInformalLegalPersonAuditRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpInformalLegalPersonAudit(Name alias, Table<FpInformalLegalPersonAuditRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица версионирования fp_informal_legal_person"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_informal_legal_person_audit</code> table
     * reference
     */
    public FpInformalLegalPersonAudit(String alias) {
        this(DSL.name(alias), FP_INFORMAL_LEGAL_PERSON_AUDIT);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_informal_legal_person_audit</code> table
     * reference
     */
    public FpInformalLegalPersonAudit(Name alias) {
        this(alias, FP_INFORMAL_LEGAL_PERSON_AUDIT);
    }

    /**
     * Create a
     * <code>passport_international.fp_informal_legal_person_audit</code> table
     * reference
     */
    public FpInformalLegalPersonAudit() {
        this(DSL.name("fp_informal_legal_person_audit"), null);
    }

    public <O extends Record> FpInformalLegalPersonAudit(Table<O> child, ForeignKey<O, FpInformalLegalPersonAuditRecord> key) {
        super(child, key, FP_INFORMAL_LEGAL_PERSON_AUDIT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.FP_INFORMAL_LEGAL_PERSON_AUDIT_CORRECTION_LOG_IX, Indexes.FP_INFORMAL_LEGAL_PERSON_AUDIT_EFF_DTTM_IX, Indexes.FP_INFORMAL_LEGAL_PERSON_AUDIT_EXP_DTTM_IX, Indexes.FP_INFORMAL_LEGAL_PERSON_AUDIT_RECORD_ID_IX);
    }

    @Override
    public Identity<FpInformalLegalPersonAuditRecord, Long> getIdentity() {
        return (Identity<FpInformalLegalPersonAuditRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpInformalLegalPersonAuditRecord> getPrimaryKey() {
        return Keys.FP_INFORMAL_LEGAL_PERSON_AUDIT_PK;
    }

    @Override
    public List<ForeignKey<FpInformalLegalPersonAuditRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_INFORMAL_LEGAL_PERSON_AUDIT__FP_INFORMAL_LEGAL_PERSON_REF_FK, Keys.FP_INFORMAL_LEGAL_PERSON_AUDIT__FP_INFORMAL_LEGAL_PERSON_CORRECTION_LOG_FK);
    }

    private transient FpInformalLegalPerson _fpInformalLegalPerson;
    private transient CorrectionLog _correctionLog;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_informal_legal_person</code> table.
     */
    public FpInformalLegalPerson fpInformalLegalPerson() {
        if (_fpInformalLegalPerson == null)
            _fpInformalLegalPerson = new FpInformalLegalPerson(this, Keys.FP_INFORMAL_LEGAL_PERSON_AUDIT__FP_INFORMAL_LEGAL_PERSON_REF_FK);

        return _fpInformalLegalPerson;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.correction_log</code> table.
     */
    public CorrectionLog correctionLog() {
        if (_correctionLog == null)
            _correctionLog = new CorrectionLog(this, Keys.FP_INFORMAL_LEGAL_PERSON_AUDIT__FP_INFORMAL_LEGAL_PERSON_CORRECTION_LOG_FK);

        return _correctionLog;
    }

    @Override
    public FpInformalLegalPersonAudit as(String alias) {
        return new FpInformalLegalPersonAudit(DSL.name(alias), this);
    }

    @Override
    public FpInformalLegalPersonAudit as(Name alias) {
        return new FpInformalLegalPersonAudit(alias, this);
    }

    @Override
    public FpInformalLegalPersonAudit as(Table<?> alias) {
        return new FpInformalLegalPersonAudit(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpInformalLegalPersonAudit rename(String name) {
        return new FpInformalLegalPersonAudit(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpInformalLegalPersonAudit rename(Name name) {
        return new FpInformalLegalPersonAudit(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpInformalLegalPersonAudit rename(Table<?> name) {
        return new FpInformalLegalPersonAudit(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, Long, Long, String, OffsetDateTime, OffsetDateTime, String, String, String, LocalDate, String, String, Long, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super Long, ? super Long, ? super Long, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super String, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}