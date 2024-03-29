/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpCaseIssueRecallRecord;

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
 * Дело о выдаче изъятого заграничного паспорта
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseIssueRecall extends TableImpl<FpCaseIssueRecallRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_case_issue_recall</code>
     */
    public static final FpCaseIssueRecall FP_CASE_ISSUE_RECALL = new FpCaseIssueRecall();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpCaseIssueRecallRecord> getRecordType() {
        return FpCaseIssueRecallRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.issue_recall_id</code>.
     * Идентификатор
     */
    public final TableField<FpCaseIssueRecallRecord, Long> ISSUE_RECALL_ID = createField(DSL.name("issue_recall_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.issue_recall_reason_id</code>.
     * Причина выдачи изъятого заграничного паспорта
     */
    public final TableField<FpCaseIssueRecallRecord, Long> ISSUE_RECALL_REASON_ID = createField(DSL.name("issue_recall_reason_id"), SQLDataType.BIGINT.nullable(false), this, "Причина выдачи изъятого заграничного паспорта");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.fp_case_recall_id</code>.
     * Дело по изъятию заграничного паспорта
     */
    public final TableField<FpCaseIssueRecallRecord, Long> FP_CASE_RECALL_ID = createField(DSL.name("fp_case_recall_id"), SQLDataType.BIGINT, this, "Дело по изъятию заграничного паспорта");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<FpCaseIssueRecallRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<FpCaseIssueRecallRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<FpCaseIssueRecallRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<FpCaseIssueRecallRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<FpCaseIssueRecallRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public final TableField<FpCaseIssueRecallRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_case_issue_recall.restore_date</code>.
     * Дата выдачи паспорта, переданного на хранение
     */
    public final TableField<FpCaseIssueRecallRecord, LocalDate> RESTORE_DATE = createField(DSL.name("restore_date"), SQLDataType.LOCALDATE, this, "Дата выдачи паспорта, переданного на хранение");

    private FpCaseIssueRecall(Name alias, Table<FpCaseIssueRecallRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpCaseIssueRecall(Name alias, Table<FpCaseIssueRecallRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Дело о выдаче изъятого заграничного паспорта"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_issue_recall</code> table reference
     */
    public FpCaseIssueRecall(String alias) {
        this(DSL.name(alias), FP_CASE_ISSUE_RECALL);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_case_issue_recall</code> table reference
     */
    public FpCaseIssueRecall(Name alias) {
        this(alias, FP_CASE_ISSUE_RECALL);
    }

    /**
     * Create a <code>passport_international.fp_case_issue_recall</code> table
     * reference
     */
    public FpCaseIssueRecall() {
        this(DSL.name("fp_case_issue_recall"), null);
    }

    public <O extends Record> FpCaseIssueRecall(Table<O> child, ForeignKey<O, FpCaseIssueRecallRecord> key) {
        super(child, key, FP_CASE_ISSUE_RECALL);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FP_CASE_ISS_RECALL_FP_CASE_REC, Indexes.IDX_FP_CASE_ISSRE_CALL_REASON_ID);
    }

    @Override
    public UniqueKey<FpCaseIssueRecallRecord> getPrimaryKey() {
        return Keys.PK_FP_CASE_ISS_RECALL;
    }

    @Override
    public List<ForeignKey<FpCaseIssueRecallRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CASE_ISSUE_RECALL__FK_FP_CASE_ISS_RECALL_FP_CASE, Keys.FP_CASE_ISSUE_RECALL__FK_FP_CASE_ISS_RECALL_FP_CASE_REC);
    }

    private transient FpCase _fpCase;
    private transient FpCaseRecall _fpCaseRecall;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_CASE_ISSUE_RECALL__FK_FP_CASE_ISS_RECALL_FP_CASE);

        return _fpCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case_recall</code> table.
     */
    public FpCaseRecall fpCaseRecall() {
        if (_fpCaseRecall == null)
            _fpCaseRecall = new FpCaseRecall(this, Keys.FP_CASE_ISSUE_RECALL__FK_FP_CASE_ISS_RECALL_FP_CASE_REC);

        return _fpCaseRecall;
    }

    @Override
    public FpCaseIssueRecall as(String alias) {
        return new FpCaseIssueRecall(DSL.name(alias), this);
    }

    @Override
    public FpCaseIssueRecall as(Name alias) {
        return new FpCaseIssueRecall(alias, this);
    }

    @Override
    public FpCaseIssueRecall as(Table<?> alias) {
        return new FpCaseIssueRecall(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseIssueRecall rename(String name) {
        return new FpCaseIssueRecall(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseIssueRecall rename(Name name) {
        return new FpCaseIssueRecall(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpCaseIssueRecall rename(Table<?> name) {
        return new FpCaseIssueRecall(name.getQualifiedName(), null);
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
