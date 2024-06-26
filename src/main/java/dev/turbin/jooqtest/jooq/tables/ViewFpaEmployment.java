/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaEmploymentRecord;

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
public class ViewFpaEmployment extends TableImpl<ViewFpaEmploymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_employment</code>
     */
    public static final ViewFpaEmployment VIEW_FPA_EMPLOYMENT = new ViewFpaEmployment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaEmploymentRecord> getRecordType() {
        return ViewFpaEmploymentRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_employment.fpa_case_issue_id</code>.
     */
    public final TableField<ViewFpaEmploymentRecord, Long> FPA_CASE_ISSUE_ID = createField(DSL.name("fpa_case_issue_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<ViewFpaEmploymentRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public final TableField<ViewFpaEmploymentRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<ViewFpaEmploymentRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewFpaEmploymentRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewFpaEmploymentRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<ViewFpaEmploymentRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.employment_order_id</code>.
     */
    public final TableField<ViewFpaEmploymentRecord, Long> EMPLOYMENT_ORDER_ID = createField(DSL.name("employment_order_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.employment_id</code>.
     */
    public final TableField<ViewFpaEmploymentRecord, Long> EMPLOYMENT_ID = createField(DSL.name("employment_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_employment.fpa_employment_id</code>.
     */
    public final TableField<ViewFpaEmploymentRecord, Long> FPA_EMPLOYMENT_ID = createField(DSL.name("fpa_employment_id"), SQLDataType.BIGINT, this, "");

    private ViewFpaEmployment(Name alias, Table<ViewFpaEmploymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaEmployment(Name alias, Table<ViewFpaEmploymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_employment" as  SELECT fp_employment.fp_case_issuance_id AS fpa_case_issue_id,
         fp_employment.src_id,
         fp_employment.create_dttm,
         fp_employment.modify_dttm,
         fp_employment.exp_dttm,
         fp_employment.eff_dttm,
         fp_employment.action_ind,
         fp_employment.employments_order AS employment_order_id,
         fp_employment.employments_id AS employment_id,
         fp_employment.id AS fpa_employment_id
        FROM fp_employment;
        """));
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_employment</code>
     * table reference
     */
    public ViewFpaEmployment(String alias) {
        this(DSL.name(alias), VIEW_FPA_EMPLOYMENT);
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_employment</code>
     * table reference
     */
    public ViewFpaEmployment(Name alias) {
        this(alias, VIEW_FPA_EMPLOYMENT);
    }

    /**
     * Create a <code>passport_international.view_fpa_employment</code> table
     * reference
     */
    public ViewFpaEmployment() {
        this(DSL.name("view_fpa_employment"), null);
    }

    public <O extends Record> ViewFpaEmployment(Table<O> child, ForeignKey<O, ViewFpaEmploymentRecord> key) {
        super(child, key, VIEW_FPA_EMPLOYMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaEmployment as(String alias) {
        return new ViewFpaEmployment(DSL.name(alias), this);
    }

    @Override
    public ViewFpaEmployment as(Name alias) {
        return new ViewFpaEmployment(alias, this);
    }

    @Override
    public ViewFpaEmployment as(Table<?> alias) {
        return new ViewFpaEmployment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaEmployment rename(String name) {
        return new ViewFpaEmployment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaEmployment rename(Name name) {
        return new ViewFpaEmployment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaEmployment rename(Table<?> name) {
        return new ViewFpaEmployment(name.getQualifiedName(), null);
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
