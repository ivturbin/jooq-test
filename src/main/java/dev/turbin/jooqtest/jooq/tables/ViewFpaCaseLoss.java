/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaCaseLossRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function14;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row14;
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
public class ViewFpaCaseLoss extends TableImpl<ViewFpaCaseLossRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_case_loss</code>
     */
    public static final ViewFpaCaseLoss VIEW_FPA_CASE_LOSS = new ViewFpaCaseLoss();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaCaseLossRecord> getRecordType() {
        return ViewFpaCaseLossRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.fpa_case_loss_id</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, Long> FPA_CASE_LOSS_ID = createField(DSL.name("fpa_case_loss_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.lost_dt</code>. Дата
     * утраты
     */
    public final TableField<ViewFpaCaseLossRecord, LocalDate> LOST_DT = createField(DSL.name("lost_dt"), SQLDataType.LOCALDATE, this, "Дата утраты");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.lost_certificate_dt</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, LocalDate> LOST_CERTIFICATE_DT = createField(DSL.name("lost_certificate_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.fpa_case_issue_id</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, Long> FPA_CASE_ISSUE_ID = createField(DSL.name("fpa_case_issue_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.lost_certificate_number_no</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, String> LOST_CERTIFICATE_NUMBER_NO = createField(DSL.name("lost_certificate_number_no"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.lost_reason_desc</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, String> LOST_REASON_DESC = createField(DSL.name("lost_reason_desc"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.lost_certificate_authority_cval</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, String> LOST_CERTIFICATE_AUTHORITY_CVAL = createField(DSL.name("lost_certificate_authority_cval"), SQLDataType.VARCHAR(500), this, "");

    /**
     * The column <code>passport_international.view_fpa_case_loss.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<ViewFpaCaseLossRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public final TableField<ViewFpaCaseLossRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<ViewFpaCaseLossRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewFpaCaseLossRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewFpaCaseLossRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<ViewFpaCaseLossRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.view_fpa_case_loss.sign_user_id</code>.
     */
    public final TableField<ViewFpaCaseLossRecord, Long> SIGN_USER_ID = createField(DSL.name("sign_user_id"), SQLDataType.BIGINT, this, "");

    private ViewFpaCaseLoss(Name alias, Table<ViewFpaCaseLossRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaCaseLoss(Name alias, Table<ViewFpaCaseLossRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_case_loss" as  SELECT fp_case_loss.loss_id AS fpa_case_loss_id,
         fp_case_loss.lost_dt,
         fp_case_loss.lost_cert_dt AS lost_certificate_dt,
         fp_case_loss.fp_case_issuance_id AS fpa_case_issue_id,
         fp_case_loss.lost_cert_number AS lost_certificate_number_no,
         fp_case_loss.lost_reason AS lost_reason_desc,
         fp_case_loss.lost_cert_authority AS lost_certificate_authority_cval,
         fp_case_loss.src_id,
         fp_case_loss.create_dttm,
         fp_case_loss.modify_dttm,
         fp_case_loss.eff_dttm,
         fp_case_loss.exp_dttm,
         fp_case_loss.action_ind,
         fp_case_loss.signer_user_id AS sign_user_id
        FROM fp_case_loss;
        """));
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_case_loss</code>
     * table reference
     */
    public ViewFpaCaseLoss(String alias) {
        this(DSL.name(alias), VIEW_FPA_CASE_LOSS);
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_case_loss</code>
     * table reference
     */
    public ViewFpaCaseLoss(Name alias) {
        this(alias, VIEW_FPA_CASE_LOSS);
    }

    /**
     * Create a <code>passport_international.view_fpa_case_loss</code> table
     * reference
     */
    public ViewFpaCaseLoss() {
        this(DSL.name("view_fpa_case_loss"), null);
    }

    public <O extends Record> ViewFpaCaseLoss(Table<O> child, ForeignKey<O, ViewFpaCaseLossRecord> key) {
        super(child, key, VIEW_FPA_CASE_LOSS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaCaseLoss as(String alias) {
        return new ViewFpaCaseLoss(DSL.name(alias), this);
    }

    @Override
    public ViewFpaCaseLoss as(Name alias) {
        return new ViewFpaCaseLoss(alias, this);
    }

    @Override
    public ViewFpaCaseLoss as(Table<?> alias) {
        return new ViewFpaCaseLoss(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCaseLoss rename(String name) {
        return new ViewFpaCaseLoss(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCaseLoss rename(Name name) {
        return new ViewFpaCaseLoss(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaCaseLoss rename(Table<?> name) {
        return new ViewFpaCaseLoss(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<Long, LocalDate, LocalDate, Long, String, String, String, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Long> fieldsRow() {
        return (Row14) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function14<? super Long, ? super LocalDate, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function14<? super Long, ? super LocalDate, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}