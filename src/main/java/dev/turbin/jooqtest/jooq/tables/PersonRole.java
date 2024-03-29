/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.PersonRoleRecord;

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
 * Роль ФЛ в деле
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonRole extends TableImpl<PersonRoleRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>passport_international.person_role</code>
     */
    public static final PersonRole PERSON_ROLE = new PersonRole();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PersonRoleRecord> getRecordType() {
        return PersonRoleRecord.class;
    }

    /**
     * The column
     * <code>passport_international.person_role.person_role_id</code>.
     * Идентификатор записи в таблице
     */
    public final TableField<PersonRoleRecord, Long> PERSON_ROLE_ID = createField(DSL.name("person_role_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор записи в таблице");

    /**
     * The column <code>passport_international.person_role.core_case_id</code>.
     * Идентификатор дела
     */
    public final TableField<PersonRoleRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.person_role.core_person_doc_id</code>.
     * Идентификатор ДУЛ ФЛ
     */
    public final TableField<PersonRoleRecord, Long> CORE_PERSON_DOC_ID = createField(DSL.name("core_person_doc_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор ДУЛ ФЛ");

    /**
     * The column
     * <code>passport_international.person_role.core_person_role_id</code>. Роль
     * ФЛ в деле
     */
    public final TableField<PersonRoleRecord, Long> CORE_PERSON_ROLE_ID = createField(DSL.name("core_person_role_id"), SQLDataType.BIGINT.nullable(false), this, "Роль ФЛ в деле");

    /**
     * The column <code>passport_international.person_role.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<PersonRoleRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column <code>passport_international.person_role.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<PersonRoleRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.person_role.action_ind</code>.
     * Индикатор операции dml(i-insert,d-delete,u-update)
     */
    public final TableField<PersonRoleRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции dml(i-insert,d-delete,u-update)");

    /**
     * The column <code>passport_international.person_role.eff_dttm</code>. Поля
     * отображения периода действия технической истории.
     */
    public final TableField<PersonRoleRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории.");

    /**
     * The column <code>passport_international.person_role.exp_dttm</code>. Поля
     * отображения периода действия технической истории.
     */
    public final TableField<PersonRoleRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории.");

    /**
     * The column <code>passport_international.person_role.person_id</code>.
     * Связь ФЛ и ДУЛ
     */
    public final TableField<PersonRoleRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT.nullable(false), this, "Связь ФЛ и ДУЛ");

    private PersonRole(Name alias, Table<PersonRoleRecord> aliased) {
        this(alias, aliased, null);
    }

    private PersonRole(Name alias, Table<PersonRoleRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Роль ФЛ в деле"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.person_role</code> table
     * reference
     */
    public PersonRole(String alias) {
        this(DSL.name(alias), PERSON_ROLE);
    }

    /**
     * Create an aliased <code>passport_international.person_role</code> table
     * reference
     */
    public PersonRole(Name alias) {
        this(alias, PERSON_ROLE);
    }

    /**
     * Create a <code>passport_international.person_role</code> table reference
     */
    public PersonRole() {
        this(DSL.name("person_role"), null);
    }

    public <O extends Record> PersonRole(Table<O> child, ForeignKey<O, PersonRoleRecord> key) {
        super(child, key, PERSON_ROLE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PERSON_ROLE_CORE_CASE_IX, Indexes.PERSON_ROLE_CORE_PERSON_DOCUMENT_IX, Indexes.PERSON_ROLE_PERSON_ID_IX);
    }

    @Override
    public Identity<PersonRoleRecord, Long> getIdentity() {
        return (Identity<PersonRoleRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PersonRoleRecord> getPrimaryKey() {
        return Keys.PERSON_ROLE_PK;
    }

    @Override
    public List<ForeignKey<PersonRoleRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PERSON_ROLE__PERSON_ROLE_CORE_CASE_FK, Keys.PERSON_ROLE__PERSON_ROLE_CPD_FK);
    }

    private transient CoreCase _coreCase;
    private transient CorePersonDocument _corePersonDocument;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.PERSON_ROLE__PERSON_ROLE_CORE_CASE_FK);

        return _coreCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_person_document</code> table.
     */
    public CorePersonDocument corePersonDocument() {
        if (_corePersonDocument == null)
            _corePersonDocument = new CorePersonDocument(this, Keys.PERSON_ROLE__PERSON_ROLE_CPD_FK);

        return _corePersonDocument;
    }

    @Override
    public PersonRole as(String alias) {
        return new PersonRole(DSL.name(alias), this);
    }

    @Override
    public PersonRole as(Name alias) {
        return new PersonRole(alias, this);
    }

    @Override
    public PersonRole as(Table<?> alias) {
        return new PersonRole(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PersonRole rename(String name) {
        return new PersonRole(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersonRole rename(Name name) {
        return new PersonRole(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PersonRole rename(Table<?> name) {
        return new PersonRole(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
