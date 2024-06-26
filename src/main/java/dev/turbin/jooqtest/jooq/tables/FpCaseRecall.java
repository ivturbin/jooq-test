/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseRecallRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
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
 * Дело об изъятии заграничного паспорта
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseRecall extends TableImpl<FpCaseRecallRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_recall</code>
     */
    public static final FpCaseRecall FP_CASE_RECALL = new FpCaseRecall();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseRecallRecord> getRecordType() {
        return FpCaseRecallRecord.class;
    }

    /**
     * The column <code>passport_international.fp_case_recall.recall_id</code>.
     * Идентификатор
     */
    public final TableField<FpCaseRecallRecord, Long> RECALL_ID = createField(DSL.name("recall_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.fp_case_recall.fp_case_issuance_id</code>.
     * Дело по выдаче заграничного паспорта
     */
    public final TableField<FpCaseRecallRecord, Long> FP_CASE_ISSUANCE_ID = createField(DSL.name("fp_case_issuance_id"), SQLDataType.BIGINT, this, "Дело по выдаче заграничного паспорта");

    /**
     * The column
     * <code>passport_international.fp_case_recall.recall_reason_id</code>.
     * Причина изъятия
     */
    public final TableField<FpCaseRecallRecord, Long> RECALL_REASON_ID = createField(DSL.name("recall_reason_id"), SQLDataType.BIGINT.nullable(false), this, "Причина изъятия");

    /**
     * The column <code>passport_international.fp_case_recall.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<FpCaseRecallRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.fp_case_recall.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public final TableField<FpCaseRecallRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.fp_case_recall.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<FpCaseRecallRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.fp_case_recall.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<FpCaseRecallRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column <code>passport_international.fp_case_recall.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<FpCaseRecallRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column <code>passport_international.fp_case_recall.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<FpCaseRecallRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_case_recall.handover_date</code>. Дата
     * принятия паспорта на хранение
     */
    public final TableField<FpCaseRecallRecord, LocalDate> HANDOVER_DATE = createField(DSL.name("handover_date"), SQLDataType.LOCALDATE, this, "Дата принятия паспорта на хранение");

    private FpCaseRecall(Name alias, Table<FpCaseRecallRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseRecall(Name alias, Table<FpCaseRecallRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Дело об изъятии заграничного паспорта"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_case_recall</code>
     * table reference
     */
    public FpCaseRecall(String alias) {
        this(DSL.name(alias), FP_CASE_RECALL);
    }

    /**
     * Create an aliased <code>passport_international.fp_case_recall</code>
     * table reference
     */
    public FpCaseRecall(Name alias) {
        this(alias, FP_CASE_RECALL);
    }

    /**
     * Create a <code>passport_international.fp_case_recall</code> table
     * reference
     */
    public FpCaseRecall() {
        this(DSL.name("fp_case_recall"), null);
    }

    public <O extends Record> FpCaseRecall(Table<O> child, ForeignKey<O, FpCaseRecallRecord> key) {
        super(child, key, FP_CASE_RECALL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FP_CASE_RECALL_FP_CASE_ISS_ID, Indexes.IDX_FP_CASE_RECALL_RECALL_REASON);
    }

    @Override
    public UniqueKey<FpCaseRecallRecord> getPrimaryKey() {
        return Keys.PK_FP_CASE_RECALL;
    }

    @Override
    public List<ForeignKey<FpCaseRecallRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_RECALL__FK_FP_CASE_RECALL_FP_CASE, Keys.FP_CASE_RECALL__FK_FP_CASE_RECALL_FP_CASE_ISSUANCE);
    }

    private transient FpCase _fpCase;
    private transient FpCaseIssuance _fpCaseIssuance;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_CASE_RECALL__FK_FP_CASE_RECALL_FP_CASE);

        return _fpCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case_issuance</code> table.
     */
    public FpCaseIssuance fpCaseIssuance() {
        if (_fpCaseIssuance == null)
            _fpCaseIssuance = new FpCaseIssuance(this, Keys.FP_CASE_RECALL__FK_FP_CASE_RECALL_FP_CASE_ISSUANCE);

        return _fpCaseIssuance;
    }

    @Override
    public FpCaseRecall as(String alias) {
        return new FpCaseRecall(DSL.name(alias), this);
    }

    @Override
    public FpCaseRecall as(Name alias) {
        return new FpCaseRecall(alias, this);
    }

    @Override
    public FpCaseRecall as(Table<?> alias) {
        return new FpCaseRecall(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRecall rename(String name) {
        return new FpCaseRecall(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRecall rename(Name name) {
        return new FpCaseRecall(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseRecall rename(Table<?> name) {
        return new FpCaseRecall(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, LocalDate> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super LocalDate, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
