/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpTranslateNameHistoryRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
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
 * Таблица учета изменений транслитерации имени
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpTranslateNameHistory extends TableImpl<FpTranslateNameHistoryRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_translate_name_history</code>
     */
    public static final FpTranslateNameHistory FP_TRANSLATE_NAME_HISTORY = new FpTranslateNameHistory();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpTranslateNameHistoryRecord> getRecordType() {
        return FpTranslateNameHistoryRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.fp_case_id</code>.
     * Базовое дело
     */
    public final TableField<FpTranslateNameHistoryRecord, Long> FP_CASE_ID = createField(DSL.name("fp_case_id"), SQLDataType.BIGINT.nullable(false), this, "Базовое дело");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.translate_name_id</code>.
     * Запись о транслитерации имени
     */
    public final TableField<FpTranslateNameHistoryRecord, Long> TRANSLATE_NAME_ID = createField(DSL.name("translate_name_id"), SQLDataType.BIGINT.nullable(false), this, "Запись о транслитерации имени");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.translate_order</code>.
     * Порядковый номер изменеия
     */
    public final TableField<FpTranslateNameHistoryRecord, Long> TRANSLATE_ORDER = createField(DSL.name("translate_order"), SQLDataType.BIGINT.nullable(false), this, "Порядковый номер изменеия");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<FpTranslateNameHistoryRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Идентификатор источника с которого получены информация");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<FpTranslateNameHistoryRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<FpTranslateNameHistoryRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<FpTranslateNameHistoryRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<FpTranslateNameHistoryRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column
     * <code>passport_international.fp_translate_name_history.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<FpTranslateNameHistoryRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    private FpTranslateNameHistory(Name alias, Table<FpTranslateNameHistoryRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpTranslateNameHistory(Name alias, Table<FpTranslateNameHistoryRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица учета изменений транслитерации имени"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_translate_name_history</code> table
     * reference
     */
    public FpTranslateNameHistory(String alias) {
        this(DSL.name(alias), FP_TRANSLATE_NAME_HISTORY);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_translate_name_history</code> table
     * reference
     */
    public FpTranslateNameHistory(Name alias) {
        this(alias, FP_TRANSLATE_NAME_HISTORY);
    }

    /**
     * Create a <code>passport_international.fp_translate_name_history</code>
     * table reference
     */
    public FpTranslateNameHistory() {
        this(DSL.name("fp_translate_name_history"), null);
    }

    public <O extends Record> FpTranslateNameHistory(Table<O> child, ForeignKey<O, FpTranslateNameHistoryRecord> key) {
        super(child, key, FP_TRANSLATE_NAME_HISTORY);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public UniqueKey<FpTranslateNameHistoryRecord> getPrimaryKey() {
        return Keys.FP_TRANSLATE_NAME_HISTORY_PK;
    }

    @Override
    public List<ForeignKey<FpTranslateNameHistoryRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_TRANSLATE_NAME_HISTORY__FP_TRANSLATE_NAME_HISTORY_FP_CASE_FK, Keys.FP_TRANSLATE_NAME_HISTORY__FP_TRANSLATE_NAME_HISTORY_TRANSLATE_NAME_FK);
    }

    private transient FpCase _fpCase;
    private transient FpTranslateName _fpTranslateName;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_TRANSLATE_NAME_HISTORY__FP_TRANSLATE_NAME_HISTORY_FP_CASE_FK);

        return _fpCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_translate_name</code> table.
     */
    public FpTranslateName fpTranslateName() {
        if (_fpTranslateName == null)
            _fpTranslateName = new FpTranslateName(this, Keys.FP_TRANSLATE_NAME_HISTORY__FP_TRANSLATE_NAME_HISTORY_TRANSLATE_NAME_FK);

        return _fpTranslateName;
    }

    @Override
    public FpTranslateNameHistory as(String alias) {
        return new FpTranslateNameHistory(DSL.name(alias), this);
    }

    @Override
    public FpTranslateNameHistory as(Name alias) {
        return new FpTranslateNameHistory(alias, this);
    }

    @Override
    public FpTranslateNameHistory as(Table<?> alias) {
        return new FpTranslateNameHistory(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameHistory rename(String name) {
        return new FpTranslateNameHistory(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameHistory rename(Name name) {
        return new FpTranslateNameHistory(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateNameHistory rename(Table<?> name) {
        return new FpTranslateNameHistory(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}