/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpTranslateNameRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function12;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row12;
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
 * Запись об транслитерации имени
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpTranslateName extends TableImpl<FpTranslateNameRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_translate_name</code>
     */
    public static final FpTranslateName FP_TRANSLATE_NAME = new FpTranslateName();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpTranslateNameRecord> getRecordType() {
        return FpTranslateNameRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_translate_name.translate_name_id</code>.
     * Индефикатор записи
     */
    public final TableField<FpTranslateNameRecord, Long> TRANSLATE_NAME_ID = createField(DSL.name("translate_name_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Индефикатор записи");

    /**
     * The column
     * <code>passport_international.fp_translate_name.first_name</code>.
     * Обновленное имя
     */
    public final TableField<FpTranslateNameRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(256), this, "Обновленное имя");

    /**
     * The column
     * <code>passport_international.fp_translate_name.middle_name</code>.
     * Обновленное отчество
     */
    public final TableField<FpTranslateNameRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(256), this, "Обновленное отчество");

    /**
     * The column
     * <code>passport_international.fp_translate_name.last_name</code>.
     * Обновленая фамилия
     */
    public final TableField<FpTranslateNameRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(256), this, "Обновленая фамилия");

    /**
     * The column
     * <code>passport_international.fp_translate_name.reason_translate</code>.
     * Причина изменения транслитерации
     */
    public final TableField<FpTranslateNameRecord, String> REASON_TRANSLATE = createField(DSL.name("reason_translate"), SQLDataType.VARCHAR(512), this, "Причина изменения транслитерации");

    /**
     * The column <code>passport_international.fp_translate_name.src_id</code>.
     */
    public final TableField<FpTranslateNameRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name.create_dttm</code>.
     */
    public final TableField<FpTranslateNameRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name.modify_dttm</code>.
     */
    public final TableField<FpTranslateNameRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name.action_ind</code>.
     */
    public final TableField<FpTranslateNameRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name.eff_dttm</code>.
     */
    public final TableField<FpTranslateNameRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name.exp_dttm</code>.
     */
    public final TableField<FpTranslateNameRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.fp_translate_name.person_id</code>. Ссылка
     * на идентификатор в ЕСФЛ
     */
    public final TableField<FpTranslateNameRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "Ссылка на идентификатор в ЕСФЛ");

    private FpTranslateName(Name alias, Table<FpTranslateNameRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpTranslateName(Name alias, Table<FpTranslateNameRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Запись об транслитерации имени"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_translate_name</code>
     * table reference
     */
    public FpTranslateName(String alias) {
        this(DSL.name(alias), FP_TRANSLATE_NAME);
    }

    /**
     * Create an aliased <code>passport_international.fp_translate_name</code>
     * table reference
     */
    public FpTranslateName(Name alias) {
        this(alias, FP_TRANSLATE_NAME);
    }

    /**
     * Create a <code>passport_international.fp_translate_name</code> table
     * reference
     */
    public FpTranslateName() {
        this(DSL.name("fp_translate_name"), null);
    }

    public <O extends Record> FpTranslateName(Table<O> child, ForeignKey<O, FpTranslateNameRecord> key) {
        super(child, key, FP_TRANSLATE_NAME);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<FpTranslateNameRecord, Long> getIdentity() {
        return (Identity<FpTranslateNameRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<FpTranslateNameRecord> getPrimaryKey() {
        return Keys.FP_TRANSLATE_NAME_PK;
    }

    @Override
    public List<UniqueKey<FpTranslateNameRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.FP_TRANSLATE_NAME_PERSON_ID_KEY);
    }

    @Override
    public FpTranslateName as(String alias) {
        return new FpTranslateName(DSL.name(alias), this);
    }

    @Override
    public FpTranslateName as(Name alias) {
        return new FpTranslateName(alias, this);
    }

    @Override
    public FpTranslateName as(Table<?> alias) {
        return new FpTranslateName(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateName rename(String name) {
        return new FpTranslateName(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateName rename(Name name) {
        return new FpTranslateName(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpTranslateName rename(Table<?> name) {
        return new FpTranslateName(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, String, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
