/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpChildDataRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function20;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row20;
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
 * Список детей
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpChildData extends TableImpl<FpChildDataRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_child_data</code>
     */
    public static final FpChildData FP_CHILD_DATA = new FpChildData();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpChildDataRecord> getRecordType() {
        return FpChildDataRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_child_data.fp_child_data_id</code>.
     * Идентификатор
     */
    public final TableField<FpChildDataRecord, Long> FP_CHILD_DATA_ID = createField(DSL.name("fp_child_data_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column <code>passport_international.fp_child_data.version</code>.
     * Реализация оптимистической блокировки
     */
    public final TableField<FpChildDataRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "Реализация оптимистической блокировки");

    /**
     * The column <code>passport_international.fp_child_data.fp_case_id</code>.
     * Дело о выдаче заграничного паспорта
     */
    public final TableField<FpChildDataRecord, Long> FP_CASE_ID = createField(DSL.name("fp_case_id"), SQLDataType.BIGINT, this, "Дело о выдаче заграничного паспорта");

    /**
     * The column <code>passport_international.fp_child_data.birth_dt</code>.
     * Дата рождения ребенка
     */
    public final TableField<FpChildDataRecord, LocalDate> BIRTH_DT = createField(DSL.name("birth_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата рождения ребенка");

    /**
     * The column
     * <code>passport_international.fp_child_data.birth_country_id</code>.
     * Страна рождения
     */
    public final TableField<FpChildDataRecord, Long> BIRTH_COUNTRY_ID = createField(DSL.name("birth_country_id"), SQLDataType.BIGINT, this, "Страна рождения");

    /**
     * The column <code>passport_international.fp_child_data.first_name</code>.
     * Имя ребенка
     */
    public final TableField<FpChildDataRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(128).nullable(false), this, "Имя ребенка");

    /**
     * The column
     * <code>passport_international.fp_child_data.first_name_lat</code>. Имя
     * ребенка на латинице
     */
    public final TableField<FpChildDataRecord, String> FIRST_NAME_LAT = createField(DSL.name("first_name_lat"), SQLDataType.VARCHAR(128).nullable(false), this, "Имя ребенка на латинице");

    /**
     * The column <code>passport_international.fp_child_data.last_name</code>.
     * Фамилия ребенка
     */
    public final TableField<FpChildDataRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(128).nullable(false), this, "Фамилия ребенка");

    /**
     * The column
     * <code>passport_international.fp_child_data.last_name_lat</code>. Фамилия
     * ребенка на латинице
     */
    public final TableField<FpChildDataRecord, String> LAST_NAME_LAT = createField(DSL.name("last_name_lat"), SQLDataType.VARCHAR(128).nullable(false), this, "Фамилия ребенка на латинице");

    /**
     * The column <code>passport_international.fp_child_data.middle_name</code>.
     * Отчество ребенка
     */
    public final TableField<FpChildDataRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(128), this, "Отчество ребенка");

    /**
     * The column <code>passport_international.fp_child_data.birth_place</code>.
     * Место рождения
     */
    public final TableField<FpChildDataRecord, String> BIRTH_PLACE = createField(DSL.name("birth_place"), SQLDataType.VARCHAR(200), this, "Место рождения");

    /**
     * The column <code>passport_international.fp_child_data.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public final TableField<FpChildDataRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Идентификатор источника с которого получены информация");

    /**
     * The column <code>passport_international.fp_child_data.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<FpChildDataRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column <code>passport_international.fp_child_data.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<FpChildDataRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.fp_child_data.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<FpChildDataRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column <code>passport_international.fp_child_data.eff_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<FpChildDataRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column <code>passport_international.fp_child_data.exp_dttm</code>.
     * Поля отображения периода действия технической истории
     */
    public final TableField<FpChildDataRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Поля отображения периода действия технической истории");

    /**
     * The column <code>passport_international.fp_child_data.gender</code>. Пол
     */
    public final TableField<FpChildDataRecord, Long> GENDER = createField(DSL.name("gender"), SQLDataType.BIGINT, this, "Пол");

    /**
     * The column
     * <code>passport_international.fp_child_data.middle_name_lat</code>.
     */
    public final TableField<FpChildDataRecord, String> MIDDLE_NAME_LAT = createField(DSL.name("middle_name_lat"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.fp_child_data.child_printed</code>. Признак
     * печати информации о ребенке
     */
    public final TableField<FpChildDataRecord, Boolean> CHILD_PRINTED = createField(DSL.name("child_printed"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Признак печати информации о ребенке");

    private FpChildData(Name alias, Table<FpChildDataRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpChildData(Name alias, Table<FpChildDataRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Список детей"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_child_data</code> table
     * reference
     */
    public FpChildData(String alias) {
        this(DSL.name(alias), FP_CHILD_DATA);
    }

    /**
     * Create an aliased <code>passport_international.fp_child_data</code> table
     * reference
     */
    public FpChildData(Name alias) {
        this(alias, FP_CHILD_DATA);
    }

    /**
     * Create a <code>passport_international.fp_child_data</code> table
     * reference
     */
    public FpChildData() {
        this(DSL.name("fp_child_data"), null);
    }

    public <O extends Record> FpChildData(Table<O> child, ForeignKey<O, FpChildDataRecord> key) {
        super(child, key, FP_CHILD_DATA);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.IDX_FP_CHILD_DATA_BIRTH_CNTRY, Indexes.IDX_FP_CHILD_DATA_FP_CASE_ID);
    }

    @Override
    public Identity<FpChildDataRecord, Long> getIdentity() {
        return (Identity<FpChildDataRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpChildDataRecord> getPrimaryKey() {
        return Keys.PK_FP_CHILD_DATA;
    }

    @Override
    public List<ForeignKey<FpChildDataRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_CHILD_DATA__FK_FP_CHILD_DATA_FP_CASE);
    }

    private transient FpCase _fpCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_CHILD_DATA__FK_FP_CHILD_DATA_FP_CASE);

        return _fpCase;
    }

    @Override
    public FpChildData as(String alias) {
        return new FpChildData(DSL.name(alias), this);
    }

    @Override
    public FpChildData as(Name alias) {
        return new FpChildData(alias, this);
    }

    @Override
    public FpChildData as(Table<?> alias) {
        return new FpChildData(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpChildData rename(String name) {
        return new FpChildData(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpChildData rename(Name name) {
        return new FpChildData(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpChildData rename(Table<?> name) {
        return new FpChildData(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row20 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row20<Long, Integer, Long, LocalDate, Long, String, String, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, Boolean> fieldsRow() {
        return (Row20) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function20<? super Long, ? super Integer, ? super Long, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function20<? super Long, ? super Integer, ? super Long, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? super String, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
