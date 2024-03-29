/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.TechnicalDefectRecord;

import java.time.LocalDate;
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
 * Бланки загран паспортов, признанные браком печати
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TechnicalDefect extends TableImpl<TechnicalDefectRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.technical_defect</code>
     */
    public static final TechnicalDefect TECHNICAL_DEFECT = new TechnicalDefect();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TechnicalDefectRecord> getRecordType() {
        return TechnicalDefectRecord.class;
    }

    /**
     * The column
     * <code>passport_international.technical_defect.defect_id</code>.
     * Идентификатор записи в таблице
     */
    public final TableField<TechnicalDefectRecord, Long> DEFECT_ID = createField(DSL.name("defect_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор записи в таблице");

    /**
     * The column
     * <code>passport_international.technical_defect.core_case_id</code>.
     * Идентификатор базового дела ГИСМУ
     */
    public final TableField<TechnicalDefectRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор базового дела ГИСМУ");

    /**
     * The column
     * <code>passport_international.technical_defect.blank_series_code</code>.
     * Серия документа
     */
    public final TableField<TechnicalDefectRecord, String> BLANK_SERIES_CODE = createField(DSL.name("blank_series_code"), SQLDataType.VARCHAR(128).nullable(false), this, "Серия документа");

    /**
     * The column
     * <code>passport_international.technical_defect.blank_number_code</code>.
     * Номер документа
     */
    public final TableField<TechnicalDefectRecord, String> BLANK_NUMBER_CODE = createField(DSL.name("blank_number_code"), SQLDataType.VARCHAR(128).nullable(false), this, "Номер документа");

    /**
     * The column <code>passport_international.technical_defect.type_id</code>.
     * Тип документа
     */
    public final TableField<TechnicalDefectRecord, Long> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.BIGINT.nullable(false), this, "Тип документа");

    /**
     * The column
     * <code>passport_international.technical_defect.status_id</code>. Статус
     * документа
     */
    public final TableField<TechnicalDefectRecord, Long> STATUS_ID = createField(DSL.name("status_id"), SQLDataType.BIGINT.nullable(false), this, "Статус документа");

    /**
     * The column
     * <code>passport_international.technical_defect.invalid_dt</code>. Дата
     * объявления бланка тех. браком
     */
    public final TableField<TechnicalDefectRecord, LocalDate> INVALID_DT = createField(DSL.name("invalid_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата объявления бланка тех. браком");

    /**
     * The column
     * <code>passport_international.technical_defect.create_user</code>.
     * Пользователь, создавший запись
     */
    public final TableField<TechnicalDefectRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR(255).nullable(false), this, "Пользователь, создавший запись");

    /**
     * The column
     * <code>passport_international.technical_defect.create_dttm</code>. Дата
     * создания записи
     */
    public final TableField<TechnicalDefectRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата создания записи");

    /**
     * The column
     * <code>passport_international.technical_defect.modify_dttm</code>. Дата
     * последнего изменения записи
     */
    public final TableField<TechnicalDefectRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата последнего изменения записи");

    /**
     * The column
     * <code>passport_international.technical_defect.blank_destroyed</code>.
     * Признак "уничтожен"
     */
    public final TableField<TechnicalDefectRecord, Boolean> BLANK_DESTROYED = createField(DSL.name("blank_destroyed"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Признак \"уничтожен\"");

    /**
     * The column
     * <code>passport_international.technical_defect.core_document_id</code>.
     * Поле для линкования таблиц"
     */
    public final TableField<TechnicalDefectRecord, Long> CORE_DOCUMENT_ID = createField(DSL.name("core_document_id"), SQLDataType.BIGINT, this, "Поле для линкования таблиц\"");

    private TechnicalDefect(Name alias, Table<TechnicalDefectRecord> aliased) {
        this(alias, aliased, null);
    }

    private TechnicalDefect(Name alias, Table<TechnicalDefectRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Бланки загран паспортов, признанные браком печати"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.technical_defect</code>
     * table reference
     */
    public TechnicalDefect(String alias) {
        this(DSL.name(alias), TECHNICAL_DEFECT);
    }

    /**
     * Create an aliased <code>passport_international.technical_defect</code>
     * table reference
     */
    public TechnicalDefect(Name alias) {
        this(alias, TECHNICAL_DEFECT);
    }

    /**
     * Create a <code>passport_international.technical_defect</code> table
     * reference
     */
    public TechnicalDefect() {
        this(DSL.name("technical_defect"), null);
    }

    public <O extends Record> TechnicalDefect(Table<O> child, ForeignKey<O, TechnicalDefectRecord> key) {
        super(child, key, TECHNICAL_DEFECT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<TechnicalDefectRecord, Long> getIdentity() {
        return (Identity<TechnicalDefectRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<TechnicalDefectRecord> getPrimaryKey() {
        return Keys.TECHNICAL_DEFECT_PKEY;
    }

    @Override
    public List<ForeignKey<TechnicalDefectRecord, ?>> getReferences() {
        return Arrays.asList(Keys.TECHNICAL_DEFECT__TECHNICAL_DEFECT_CORE_PERSON_DOCUMENT);
    }

    private transient CoreDocument _coreDocument;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_document</code> table.
     */
    public CoreDocument coreDocument() {
        if (_coreDocument == null)
            _coreDocument = new CoreDocument(this, Keys.TECHNICAL_DEFECT__TECHNICAL_DEFECT_CORE_PERSON_DOCUMENT);

        return _coreDocument;
    }

    @Override
    public TechnicalDefect as(String alias) {
        return new TechnicalDefect(DSL.name(alias), this);
    }

    @Override
    public TechnicalDefect as(Name alias) {
        return new TechnicalDefect(alias, this);
    }

    @Override
    public TechnicalDefect as(Table<?> alias) {
        return new TechnicalDefect(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public TechnicalDefect rename(String name) {
        return new TechnicalDefect(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public TechnicalDefect rename(Name name) {
        return new TechnicalDefect(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public TechnicalDefect rename(Table<?> name) {
        return new TechnicalDefect(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, String, String, Long, Long, LocalDate, String, OffsetDateTime, OffsetDateTime, Boolean, Long> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super Long, ? super String, ? super String, ? super Long, ? super Long, ? super LocalDate, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Boolean, ? super Long, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super Long, ? super String, ? super String, ? super Long, ? super Long, ? super LocalDate, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super Boolean, ? super Long, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
