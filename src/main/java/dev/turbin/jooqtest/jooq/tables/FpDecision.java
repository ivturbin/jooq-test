/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpDecisionRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function18;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row18;
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
 * Решение по делу модуля ЗП
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpDecision extends TableImpl<FpDecisionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>passport_international.fp_decision</code>
     */
    public static final FpDecision FP_DECISION = new FpDecision();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpDecisionRecord> getRecordType() {
        return FpDecisionRecord.class;
    }

    /**
     * The column <code>passport_international.fp_decision.decision_id</code>.
     * Дело, по которому принято решение
     */
    public final TableField<FpDecisionRecord, Long> DECISION_ID = createField(DSL.name("decision_id"), SQLDataType.BIGINT.nullable(false), this, "Дело, по которому принято решение");

    /**
     * The column <code>passport_international.fp_decision.decision_dt</code>.
     * Дата принятия решения
     */
    public final TableField<FpDecisionRecord, LocalDate> DECISION_DT = createField(DSL.name("decision_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата принятия решения");

    /**
     * The column <code>passport_international.fp_decision.create_dt</code>.
     * Дата создания записи
     */
    public final TableField<FpDecisionRecord, LocalDate> CREATE_DT = createField(DSL.name("create_dt"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("('now'::text)::date"), SQLDataType.LOCALDATE)), this, "Дата создания записи");

    /**
     * The column <code>passport_international.fp_decision.user_login</code>.
     * Пользователь, принявший решение по делу
     */
    public final TableField<FpDecisionRecord, String> USER_LOGIN = createField(DSL.name("user_login"), SQLDataType.VARCHAR(255).nullable(false), this, "Пользователь, принявший решение по делу");

    /**
     * The column <code>passport_international.fp_decision.type_id</code>. Тип
     * решения
     */
    public final TableField<FpDecisionRecord, Long> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.BIGINT.nullable(false), this, "Тип решения");

    /**
     * The column <code>passport_international.fp_decision.basis_id</code>. Тип
     * основания для решения
     */
    public final TableField<FpDecisionRecord, Long> BASIS_ID = createField(DSL.name("basis_id"), SQLDataType.BIGINT, this, "Тип основания для решения");

    /**
     * The column <code>passport_international.fp_decision.check_fsb_id</code>.
     * Орган ФСБ, осуществивший проверку
     */
    public final TableField<FpDecisionRecord, Long> CHECK_FSB_ID = createField(DSL.name("check_fsb_id"), SQLDataType.BIGINT, this, "Орган ФСБ, осуществивший проверку");

    /**
     * The column
     * <code>passport_international.fp_decision.decision_number</code>. Номер
     * решения
     */
    public final TableField<FpDecisionRecord, String> DECISION_NUMBER = createField(DSL.name("decision_number"), SQLDataType.VARCHAR(128), this, "Номер решения");

    /**
     * The column <code>passport_international.fp_decision.comments</code>.
     * Комментарий
     */
    public final TableField<FpDecisionRecord, String> COMMENTS = createField(DSL.name("comments"), SQLDataType.CLOB, this, "Комментарий");

    /**
     * The column <code>passport_international.fp_decision.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<FpDecisionRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Идентификатор источника с которого получены информация");

    /**
     * The column <code>passport_international.fp_decision.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<FpDecisionRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column <code>passport_international.fp_decision.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<FpDecisionRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.fp_decision.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<FpDecisionRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column <code>passport_international.fp_decision.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<FpDecisionRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column <code>passport_international.fp_decision.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<FpDecisionRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_decision.restrict_from_dt</code>.
     */
    public final TableField<FpDecisionRecord, LocalDate> RESTRICT_FROM_DT = createField(DSL.name("restrict_from_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.fp_decision.restrict_to_dt</code>.
     */
    public final TableField<FpDecisionRecord, LocalDate> RESTRICT_TO_DT = createField(DSL.name("restrict_to_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.fp_decision.organ_by_decision</code>.
     */
    public final TableField<FpDecisionRecord, String> ORGAN_BY_DECISION = createField(DSL.name("organ_by_decision"), SQLDataType.VARCHAR(512), this, "");

    private FpDecision(Name alias, Table<FpDecisionRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpDecision(Name alias, Table<FpDecisionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Решение по делу модуля ЗП"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_decision</code> table
     * reference
     */
    public FpDecision(String alias) {
        this(DSL.name(alias), FP_DECISION);
    }

    /**
     * Create an aliased <code>passport_international.fp_decision</code> table
     * reference
     */
    public FpDecision(Name alias) {
        this(alias, FP_DECISION);
    }

    /**
     * Create a <code>passport_international.fp_decision</code> table reference
     */
    public FpDecision() {
        this(DSL.name("fp_decision"), null);
    }

    public <O extends Record> FpDecision(Table<O> child, ForeignKey<O, FpDecisionRecord> key) {
        super(child, key, FP_DECISION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FP_DECISION_BASIS_ID, Indexes.IDX_FP_DECISION_CHECK_FSB_ID, Indexes.IDX_FP_DECISION_TYPE_ID, Indexes.IDX_FP_DECISION_USER_ID);
    }

    @Override
    public UniqueKey<FpDecisionRecord> getPrimaryKey() {
        return Keys.PK_FP_DECISION;
    }

    @Override
    public List<ForeignKey<FpDecisionRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_DECISION__FK_FP_DECISION_FP_CASE);
    }

    private transient FpCase _fpCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_DECISION__FK_FP_DECISION_FP_CASE);

        return _fpCase;
    }

    @Override
    public FpDecision as(String alias) {
        return new FpDecision(DSL.name(alias), this);
    }

    @Override
    public FpDecision as(Name alias) {
        return new FpDecision(alias, this);
    }

    @Override
    public FpDecision as(Table<?> alias) {
        return new FpDecision(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpDecision rename(String name) {
        return new FpDecision(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpDecision rename(Name name) {
        return new FpDecision(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpDecision rename(Table<?> name) {
        return new FpDecision(name.getQualifiedName(), null);
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
