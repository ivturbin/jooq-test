/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaRejectionCaseRecord;

import java.time.LocalDate;
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
public class ViewFpaRejectionCase extends TableImpl<ViewFpaRejectionCaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_rejection_case</code>
     */
    public static final ViewFpaRejectionCase VIEW_FPA_REJECTION_CASE = new ViewFpaRejectionCase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaRejectionCaseRecord> getRecordType() {
        return ViewFpaRejectionCaseRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.fpa_rejection_case_id</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, Long> FPA_REJECTION_CASE_ID = createField(DSL.name("fpa_rejection_case_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.reason_id</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, Long> REASON_ID = createField(DSL.name("reason_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.sign_user_id</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, String> SIGN_USER_ID = createField(DSL.name("sign_user_id"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.issue_dt</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, LocalDate> ISSUE_DT = createField(DSL.name("issue_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.src_id</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.create_dttm</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.modify_dttm</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.action_ind</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.eff_dttm</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_rejection_case.exp_dttm</code>.
     */
    public final TableField<ViewFpaRejectionCaseRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private ViewFpaRejectionCase(Name alias, Table<ViewFpaRejectionCaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaRejectionCase(Name alias, Table<ViewFpaRejectionCaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_rejection_case" as  SELECT fp_decline_get_application_case.fp_decline_get_application_case_id AS fpa_rejection_case_id,
         fp_decline_get_application_case.reason_id,
         fp_decline_get_application_case.signer_user AS sign_user_id,
         fp_decline_get_application_case.issued_dt AS issue_dt,
         fp_decline_get_application_case.src_id,
         fp_decline_get_application_case.create_dttm,
         fp_decline_get_application_case.modify_dttm,
         fp_decline_get_application_case.action_ind,
         fp_decline_get_application_case.eff_dttm,
         fp_decline_get_application_case.exp_dttm
        FROM fp_decline_get_application_case;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_rejection_case</code> table
     * reference
     */
    public ViewFpaRejectionCase(String alias) {
        this(DSL.name(alias), VIEW_FPA_REJECTION_CASE);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_rejection_case</code> table
     * reference
     */
    public ViewFpaRejectionCase(Name alias) {
        this(alias, VIEW_FPA_REJECTION_CASE);
    }

    /**
     * Create a <code>passport_international.view_fpa_rejection_case</code>
     * table reference
     */
    public ViewFpaRejectionCase() {
        this(DSL.name("view_fpa_rejection_case"), null);
    }

    public <O extends Record> ViewFpaRejectionCase(Table<O> child, ForeignKey<O, ViewFpaRejectionCaseRecord> key) {
        super(child, key, VIEW_FPA_REJECTION_CASE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaRejectionCase as(String alias) {
        return new ViewFpaRejectionCase(DSL.name(alias), this);
    }

    @Override
    public ViewFpaRejectionCase as(Name alias) {
        return new ViewFpaRejectionCase(alias, this);
    }

    @Override
    public ViewFpaRejectionCase as(Table<?> alias) {
        return new ViewFpaRejectionCase(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaRejectionCase rename(String name) {
        return new ViewFpaRejectionCase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaRejectionCase rename(Name name) {
        return new ViewFpaRejectionCase(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaRejectionCase rename(Table<?> name) {
        return new ViewFpaRejectionCase(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, String, LocalDate, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super String, ? super LocalDate, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super String, ? super LocalDate, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
