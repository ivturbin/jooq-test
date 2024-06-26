/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaCaseRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
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
public class ViewFpaCase extends TableImpl<ViewFpaCaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_case</code>
     */
    public static final ViewFpaCase VIEW_FPA_CASE = new ViewFpaCase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaCaseRecord> getRecordType() {
        return ViewFpaCaseRecord.class;
    }

    /**
     * The column <code>passport_international.view_fpa_case.fpa_case_id</code>.
     */
    public final TableField<ViewFpaCaseRecord, Long> FPA_CASE_ID = createField(DSL.name("fpa_case_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>passport_international.view_fpa_case.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<ViewFpaCaseRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "Идентификатор источника с которого получены информация");

    /**
     * The column <code>passport_international.view_fpa_case.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<ViewFpaCaseRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column <code>passport_international.view_fpa_case.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<ViewFpaCaseRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.view_fpa_case.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<ViewFpaCaseRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column <code>passport_international.view_fpa_case.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<ViewFpaCaseRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column <code>passport_international.view_fpa_case.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<ViewFpaCaseRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.view_fpa_case.type_case_id</code>. Тип дела
     */
    public final TableField<ViewFpaCaseRecord, Long> TYPE_CASE_ID = createField(DSL.name("type_case_id"), SQLDataType.BIGINT, this, "Тип дела");

    /**
     * The column
     * <code>passport_international.view_fpa_case.status_case_id</code>. Статус
     * дела
     */
    public final TableField<ViewFpaCaseRecord, Long> STATUS_CASE_ID = createField(DSL.name("status_case_id"), SQLDataType.BIGINT, this, "Статус дела");

    /**
     * The column <code>passport_international.view_fpa_case.core_doc_id</code>.
     */
    public final TableField<ViewFpaCaseRecord, Long> CORE_DOC_ID = createField(DSL.name("core_doc_id"), SQLDataType.BIGINT, this, "");

    private ViewFpaCase(Name alias, Table<ViewFpaCaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaCase(Name alias, Table<ViewFpaCaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_case" as  SELECT fp_case.fp_case_id AS fpa_case_id,
         fp_case.src_id,
         fp_case.create_dttm,
         fp_case.modify_dttm,
         fp_case.eff_dttm,
         fp_case.exp_dttm,
         fp_case.action_ind,
         fp_case.type_case_id,
         fp_case.status_case_id,
         fp_case.core_document_id AS core_doc_id
        FROM fp_case;
        """));
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_case</code> table
     * reference
     */
    public ViewFpaCase(String alias) {
        this(DSL.name(alias), VIEW_FPA_CASE);
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_case</code> table
     * reference
     */
    public ViewFpaCase(Name alias) {
        this(alias, VIEW_FPA_CASE);
    }

    /**
     * Create a <code>passport_international.view_fpa_case</code> table
     * reference
     */
    public ViewFpaCase() {
        this(DSL.name("view_fpa_case"), null);
    }

    public <O extends Record> ViewFpaCase(Table<O> child, ForeignKey<O, ViewFpaCaseRecord> key) {
        super(child, key, VIEW_FPA_CASE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaCase as(String alias) {
        return new ViewFpaCase(DSL.name(alias), this);
    }

    @Override
    public ViewFpaCase as(Name alias) {
        return new ViewFpaCase(alias, this);
    }

    @Override
    public ViewFpaCase as(Table<?> alias) {
        return new ViewFpaCase(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCase rename(String name) {
        return new ViewFpaCase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCase rename(Name name) {
        return new ViewFpaCase(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCase rename(Table<?> name) {
        return new ViewFpaCase(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long, Long, Long> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super Long, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
