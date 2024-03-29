/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseLegalPersonRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
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
 * Таблица связи законных представителей с делом
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseLegalPerson extends TableImpl<FpCaseLegalPersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_legal_person</code>
     */
    public static final FpCaseLegalPerson FP_CASE_LEGAL_PERSON = new FpCaseLegalPerson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseLegalPersonRecord> getRecordType() {
        return FpCaseLegalPersonRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.fp_case_id</code>. id
     * базового дела
     */
    public final TableField<FpCaseLegalPersonRecord, Long> FP_CASE_ID = createField(DSL.name("fp_case_id"), SQLDataType.BIGINT.nullable(false), this, "id базового дела");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.core_person_document_id</code>.
     * id документа законного представителя
     */
    public final TableField<FpCaseLegalPersonRecord, Long> CORE_PERSON_DOCUMENT_ID = createField(DSL.name("core_person_document_id"), SQLDataType.BIGINT.nullable(false), this, "id документа законного представителя");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<FpCaseLegalPersonRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<FpCaseLegalPersonRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<FpCaseLegalPersonRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<FpCaseLegalPersonRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<FpCaseLegalPersonRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<FpCaseLegalPersonRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.relation_type</code>.
     * Степень родства
     */
    public final TableField<FpCaseLegalPersonRecord, Long> RELATION_TYPE = createField(DSL.name("relation_type"), SQLDataType.BIGINT, this, "Степень родства");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.type_doc</code>. Тип
     * документа подтверждающего права законого представителя
     */
    public final TableField<FpCaseLegalPersonRecord, String> TYPE_DOC = createField(DSL.name("type_doc"), SQLDataType.CLOB, this, "Тип документа подтверждающего права законого представителя");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.series</code>. Серия
     * документа подтверждающего права законого представителя
     */
    public final TableField<FpCaseLegalPersonRecord, String> SERIES = createField(DSL.name("series"), SQLDataType.VARCHAR(128), this, "Серия документа подтверждающего права законого представителя");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.doc_no</code>. Номер
     * документа подтверждающего права законого представителя
     */
    public final TableField<FpCaseLegalPersonRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128), this, "Номер документа подтверждающего права законого представителя");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.issue_dt</code>. Дата
     * выдачи документа подтверждающего права законого представителя
     */
    public final TableField<FpCaseLegalPersonRecord, LocalDate> ISSUE_DT = createField(DSL.name("issue_dt"), SQLDataType.LOCALDATE, this, "Дата выдачи документа подтверждающего права законого представителя");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.given_by</code>. Орган
     * выдавший документ подтверждающий права законого представителя
     */
    public final TableField<FpCaseLegalPersonRecord, String> GIVEN_BY = createField(DSL.name("given_by"), SQLDataType.VARCHAR(256), this, "Орган выдавший документ подтверждающий права законого представителя");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.is_main_bool</code>.
     * Является ли законный предствитель основным в деле
     */
    public final TableField<FpCaseLegalPersonRecord, Boolean> IS_MAIN_BOOL = createField(DSL.name("is_main_bool"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Является ли законный предствитель основным в деле");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.issue_act_dt</code>.
     * Дата оформления актовой записи
     */
    public final TableField<FpCaseLegalPersonRecord, LocalDate> ISSUE_ACT_DT = createField(DSL.name("issue_act_dt"), SQLDataType.LOCALDATE, this, "Дата оформления актовой записи");

    /**
     * The column
     * <code>passport_international.fp_case_legal_person.act_no</code>. Номер
     * актовой записи
     */
    public final TableField<FpCaseLegalPersonRecord, String> ACT_NO = createField(DSL.name("act_no"), SQLDataType.VARCHAR(128), this, "Номер актовой записи");

    private FpCaseLegalPerson(Name alias, Table<FpCaseLegalPersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseLegalPerson(Name alias, Table<FpCaseLegalPersonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица связи законных представителей с делом"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_legal_person</code> table reference
     */
    public FpCaseLegalPerson(String alias) {
        this(DSL.name(alias), FP_CASE_LEGAL_PERSON);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_legal_person</code> table reference
     */
    public FpCaseLegalPerson(Name alias) {
        this(alias, FP_CASE_LEGAL_PERSON);
    }

    /**
     * Create a <code>passport_international.fp_case_legal_person</code> table
     * reference
     */
    public FpCaseLegalPerson() {
        this(DSL.name("fp_case_legal_person"), null);
    }

    public <O extends Record> FpCaseLegalPerson(Table<O> child, ForeignKey<O, FpCaseLegalPersonRecord> key) {
        super(child, key, FP_CASE_LEGAL_PERSON);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public UniqueKey<FpCaseLegalPersonRecord> getPrimaryKey() {
        return Keys.FP_CASE_LEGAL_PERSON_PK;
    }

    @Override
    public List<ForeignKey<FpCaseLegalPersonRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_LEGAL_PERSON__FP_CASE_LEGAL_PERSON_FP_CASE_FK, Keys.FP_CASE_LEGAL_PERSON__FP_CASE_LEGAL_PERSON_CORE_PERSON_DOCUMENT_FK);
    }

    private transient FpCase _fpCase;
    private transient CorePersonDocument _corePersonDocument;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_CASE_LEGAL_PERSON__FP_CASE_LEGAL_PERSON_FP_CASE_FK);

        return _fpCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_person_document</code> table.
     */
    public CorePersonDocument corePersonDocument() {
        if (_corePersonDocument == null)
            _corePersonDocument = new CorePersonDocument(this, Keys.FP_CASE_LEGAL_PERSON__FP_CASE_LEGAL_PERSON_CORE_PERSON_DOCUMENT_FK);

        return _corePersonDocument;
    }

    @Override
    public FpCaseLegalPerson as(String alias) {
        return new FpCaseLegalPerson(DSL.name(alias), this);
    }

    @Override
    public FpCaseLegalPerson as(Name alias) {
        return new FpCaseLegalPerson(alias, this);
    }

    @Override
    public FpCaseLegalPerson as(Table<?> alias) {
        return new FpCaseLegalPerson(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseLegalPerson rename(String name) {
        return new FpCaseLegalPerson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseLegalPerson rename(Name name) {
        return new FpCaseLegalPerson(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseLegalPerson rename(Table<?> name) {
        return new FpCaseLegalPerson(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, LocalDate, String, Boolean, LocalDate, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function17<? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super Boolean, ? super LocalDate, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super Boolean, ? super LocalDate, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
