/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaDecisionRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row18;
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
public class ViewFpaDecision extends TableImpl<ViewFpaDecisionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_decision</code>
     */
    public static final ViewFpaDecision VIEW_FPA_DECISION = new ViewFpaDecision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaDecisionRecord> getRecordType() {
        return ViewFpaDecisionRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_decision.fpa_decision_id</code>.
     */
    public final TableField<ViewFpaDecisionRecord, Long> FPA_DECISION_ID = createField(DSL.name("fpa_decision_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.decision_dt</code>. Дата
     * принятия решения
     */
    public final TableField<ViewFpaDecisionRecord, LocalDate> DECISION_DT = createField(DSL.name("decision_dt"), SQLDataType.LOCALDATE, this, "Дата принятия решения");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.create_dt</code>. Дата
     * создания записи
     */
    public final TableField<ViewFpaDecisionRecord, LocalDate> CREATE_DT = createField(DSL.name("create_dt"), SQLDataType.LOCALDATE, this, "Дата создания записи");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.decision_user</code>.
     */
    public final TableField<ViewFpaDecisionRecord, String> DECISION_USER = createField(DSL.name("decision_user"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>passport_international.view_fpa_decision.type_id</code>.
     * Тип решения
     */
    public final TableField<ViewFpaDecisionRecord, Long> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.BIGINT, this, "Тип решения");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.basis_id</code>. Тип
     * основания для решения
     */
    public final TableField<ViewFpaDecisionRecord, Long> BASIS_ID = createField(DSL.name("basis_id"), SQLDataType.BIGINT, this, "Тип основания для решения");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.check_fsb_id</code>. Орган
     * ФСБ, осуществивший проверку
     */
    public final TableField<ViewFpaDecisionRecord, Long> CHECK_FSB_ID = createField(DSL.name("check_fsb_id"), SQLDataType.BIGINT, this, "Орган ФСБ, осуществивший проверку");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.decision_no</code>.
     */
    public final TableField<ViewFpaDecisionRecord, String> DECISION_NO = createField(DSL.name("decision_no"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.comment_desc</code>.
     */
    public final TableField<ViewFpaDecisionRecord, String> COMMENT_DESC = createField(DSL.name("comment_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>passport_international.view_fpa_decision.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<ViewFpaDecisionRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public final TableField<ViewFpaDecisionRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<ViewFpaDecisionRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<ViewFpaDecisionRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewFpaDecisionRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<ViewFpaDecisionRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.restrict_from_dt</code>.
     */
    public final TableField<ViewFpaDecisionRecord, LocalDate> RESTRICT_FROM_DT = createField(DSL.name("restrict_from_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.restrict_to_dt</code>.
     */
    public final TableField<ViewFpaDecisionRecord, LocalDate> RESTRICT_TO_DT = createField(DSL.name("restrict_to_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_decision.organ_decision_cval</code>.
     */
    public final TableField<ViewFpaDecisionRecord, String> ORGAN_DECISION_CVAL = createField(DSL.name("organ_decision_cval"), SQLDataType.VARCHAR(512), this, "");

    private ViewFpaDecision(Name alias, Table<ViewFpaDecisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaDecision(Name alias, Table<ViewFpaDecisionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_decision" as  SELECT fp_decision.decision_id AS fpa_decision_id,
         fp_decision.decision_dt,
         fp_decision.create_dt,
         fp_decision.user_login AS decision_user,
         fp_decision.type_id,
         fp_decision.basis_id,
         fp_decision.check_fsb_id,
         fp_decision.decision_number AS decision_no,
         fp_decision.comments AS comment_desc,
         fp_decision.src_id,
         fp_decision.create_dttm,
         fp_decision.modify_dttm,
         fp_decision.action_ind,
         fp_decision.eff_dttm,
         fp_decision.exp_dttm,
         fp_decision.restrict_from_dt,
         fp_decision.restrict_to_dt,
         fp_decision.organ_by_decision AS organ_decision_cval
        FROM fp_decision;
        """));
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_decision</code>
     * table reference
     */
    public ViewFpaDecision(String alias) {
        this(DSL.name(alias), VIEW_FPA_DECISION);
    }

    /**
     * Create an aliased <code>passport_international.view_fpa_decision</code>
     * table reference
     */
    public ViewFpaDecision(Name alias) {
        this(alias, VIEW_FPA_DECISION);
    }

    /**
     * Create a <code>passport_international.view_fpa_decision</code> table
     * reference
     */
    public ViewFpaDecision() {
        this(DSL.name("view_fpa_decision"), null);
    }

    public <O extends Record> ViewFpaDecision(Table<O> child, ForeignKey<O, ViewFpaDecisionRecord> key) {
        super(child, key, VIEW_FPA_DECISION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaDecision as(String alias) {
        return new ViewFpaDecision(DSL.name(alias), this);
    }

    @Override
    public ViewFpaDecision as(Name alias) {
        return new ViewFpaDecision(alias, this);
    }

    @Override
    public ViewFpaDecision as(Table<?> alias) {
        return new ViewFpaDecision(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaDecision rename(String name) {
        return new ViewFpaDecision(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaDecision rename(Name name) {
        return new ViewFpaDecision(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaDecision rename(Table<?> name) {
        return new ViewFpaDecision(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row18 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, LocalDate, LocalDate, String, Long, Long, Long, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate, LocalDate, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function18<? super Long, ? super LocalDate, ? super LocalDate, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? super LocalDate, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function18<? super Long, ? super LocalDate, ? super LocalDate, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? super LocalDate, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
