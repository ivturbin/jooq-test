/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaCaseLegalPersonRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function15;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row15;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewFpaCaseLegalPerson extends TableImpl<ViewFpaCaseLegalPersonRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_case_legal_person</code>
     */
    public static final ViewFpaCaseLegalPerson VIEW_FPA_CASE_LEGAL_PERSON = new ViewFpaCaseLegalPerson();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaCaseLegalPersonRecord> getRecordType() {
        return ViewFpaCaseLegalPersonRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.fpa_case_legal_person_id</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, Long> FPA_CASE_LEGAL_PERSON_ID = createField(DSL.name("fpa_case_legal_person_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.core_person_doc_id</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, Long> CORE_PERSON_DOC_ID = createField(DSL.name("core_person_doc_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.relation_type_id</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, Long> RELATION_TYPE_ID = createField(DSL.name("relation_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.type_doc_cval</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, String> TYPE_DOC_CVAL = createField(DSL.name("type_doc_cval"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.series_code</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, String> SERIES_CODE = createField(DSL.name("series_code"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.doc_no</code>.
     * Номер документа подтверждающего права законого представителя
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128), this, "Номер документа подтверждающего права законого представителя");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.issue_dt</code>.
     * Дата выдачи документа подтверждающего права законого представителя
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, LocalDate> ISSUE_DT = createField(DSL.name("issue_dt"), SQLDataType.LOCALDATE, this, "Дата выдачи документа подтверждающего права законого представителя");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.given_name</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, String> GIVEN_NAME = createField(DSL.name("given_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_legal_person.main_bool</code>.
     */
    public final TableField<ViewFpaCaseLegalPersonRecord, Boolean> MAIN_BOOL = createField(DSL.name("main_bool"), SQLDataType.BOOLEAN, this, "");

    private ViewFpaCaseLegalPerson(Name alias, Table<ViewFpaCaseLegalPersonRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaCaseLegalPerson(Name alias, Table<ViewFpaCaseLegalPersonRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_case_legal_person" as  SELECT fp_case_legal_person.fp_case_id AS fpa_case_legal_person_id,
         fp_case_legal_person.core_person_document_id AS core_person_doc_id,
         fp_case_legal_person.src_id,
         fp_case_legal_person.create_dttm,
         fp_case_legal_person.modify_dttm,
         fp_case_legal_person.eff_dttm,
         fp_case_legal_person.exp_dttm,
         fp_case_legal_person.action_ind,
         fp_case_legal_person.relation_type AS relation_type_id,
         fp_case_legal_person.type_doc AS type_doc_cval,
         fp_case_legal_person.series AS series_code,
         fp_case_legal_person.doc_no,
         fp_case_legal_person.issue_dt,
         fp_case_legal_person.given_by AS given_name,
         fp_case_legal_person.is_main_bool AS main_bool
        FROM fp_case_legal_person;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_case_legal_person</code> table
     * reference
     */
    public ViewFpaCaseLegalPerson(String alias) {
        this(DSL.name(alias), VIEW_FPA_CASE_LEGAL_PERSON);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_case_legal_person</code> table
     * reference
     */
    public ViewFpaCaseLegalPerson(Name alias) {
        this(alias, VIEW_FPA_CASE_LEGAL_PERSON);
    }

    /**
     * Create a <code>passport_international.view_fpa_case_legal_person</code>
     * table reference
     */
    public ViewFpaCaseLegalPerson() {
        this(DSL.name("view_fpa_case_legal_person"), null);
    }

    public <O extends Record> ViewFpaCaseLegalPerson(Table<O> child, ForeignKey<O, ViewFpaCaseLegalPersonRecord> key) {
        super(child, key, VIEW_FPA_CASE_LEGAL_PERSON);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaCaseLegalPerson as(String alias) {
        return new ViewFpaCaseLegalPerson(DSL.name(alias), this);
    }

    @Override
    public ViewFpaCaseLegalPerson as(Name alias) {
        return new ViewFpaCaseLegalPerson(alias, this);
    }

    @Override
    public ViewFpaCaseLegalPerson as(Table<?> alias) {
        return new ViewFpaCaseLegalPerson(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCaseLegalPerson rename(String name) {
        return new ViewFpaCaseLegalPerson(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCaseLegalPerson rename(Name name) {
        return new ViewFpaCaseLegalPerson(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCaseLegalPerson rename(Table<?> name) {
        return new ViewFpaCaseLegalPerson(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row15 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row15<Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long, String, String, String, LocalDate, String, Boolean> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function15<? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function15<? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super String, ? super String, ? super String, ? super LocalDate, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
