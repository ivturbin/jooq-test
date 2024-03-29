/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaBaseRestrictRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
public class ViewFpaBaseRestrict extends TableImpl<ViewFpaBaseRestrictRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_base_restrict</code>
     */
    public static final ViewFpaBaseRestrict VIEW_FPA_BASE_RESTRICT = new ViewFpaBaseRestrict();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaBaseRestrictRecord> getRecordType() {
        return ViewFpaBaseRestrictRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.fpa_base_restrict_id</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, Long> FPA_BASE_RESTRICT_ID = createField(DSL.name("fpa_base_restrict_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.category_id</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, Long> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.status_basis_id</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, Long> STATUS_BASIS_ID = createField(DSL.name("status_basis_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.court_name_id</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, Long> COURT_NAME_ID = createField(DSL.name("court_name_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.court_decision_no</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, String> COURT_DECISION_NO = createField(DSL.name("court_decision_no"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.court_decision_dt</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, LocalDate> COURT_DECISION_DT = createField(DSL.name("court_decision_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.comment_desc</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, String> COMMENT_DESC = createField(DSL.name("comment_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.action_ind</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.create_dttm</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.modify_dttm</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.eff_dttm</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_base_restrict.exp_dttm</code>.
     */
    public final TableField<ViewFpaBaseRestrictRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private ViewFpaBaseRestrict(Name alias, Table<ViewFpaBaseRestrictRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaBaseRestrict(Name alias, Table<ViewFpaBaseRestrictRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_base_restrict" as  SELECT fp_base_restrict.fp_base_restrict_id AS fpa_base_restrict_id,
         fp_base_restrict.category_id,
         fp_base_restrict.status_basis_id,
         fp_base_restrict.court_name_id,
         fp_base_restrict.court_decision_no,
         fp_base_restrict.court_decision_dt,
         fp_base_restrict.comment_desc,
         fp_base_restrict.action_ind,
         fp_base_restrict.create_dttm,
         fp_base_restrict.modify_dttm,
         fp_base_restrict.eff_dttm,
         fp_base_restrict.exp_dttm
        FROM fp_base_restrict;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_base_restrict</code> table
     * reference
     */
    public ViewFpaBaseRestrict(String alias) {
        this(DSL.name(alias), VIEW_FPA_BASE_RESTRICT);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_base_restrict</code> table
     * reference
     */
    public ViewFpaBaseRestrict(Name alias) {
        this(alias, VIEW_FPA_BASE_RESTRICT);
    }

    /**
     * Create a <code>passport_international.view_fpa_base_restrict</code> table
     * reference
     */
    public ViewFpaBaseRestrict() {
        this(DSL.name("view_fpa_base_restrict"), null);
    }

    public <O extends Record> ViewFpaBaseRestrict(Table<O> child, ForeignKey<O, ViewFpaBaseRestrictRecord> key) {
        super(child, key, VIEW_FPA_BASE_RESTRICT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaBaseRestrict as(String alias) {
        return new ViewFpaBaseRestrict(DSL.name(alias), this);
    }

    @Override
    public ViewFpaBaseRestrict as(Name alias) {
        return new ViewFpaBaseRestrict(alias, this);
    }

    @Override
    public ViewFpaBaseRestrict as(Table<?> alias) {
        return new ViewFpaBaseRestrict(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaBaseRestrict rename(String name) {
        return new ViewFpaBaseRestrict(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaBaseRestrict rename(Name name) {
        return new ViewFpaBaseRestrict(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaBaseRestrict rename(Table<?> name) {
        return new ViewFpaBaseRestrict(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, Long, Long, String, LocalDate, String, String, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super LocalDate, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super Long, ? super Long, ? super Long, ? super String, ? super LocalDate, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
