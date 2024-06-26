/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpSignalInformationRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function6;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row6;
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
 * Таблица по учету сигналов
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpSignalInformation extends TableImpl<FpSignalInformationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.fp_signal_information</code>
     */
    public static final FpSignalInformation FP_SIGNAL_INFORMATION = new FpSignalInformation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpSignalInformationRecord> getRecordType() {
        return FpSignalInformationRecord.class;
    }

    /**
     * The column
     * <code>passport_international.fp_signal_information.correlation_id</code>.
     * Идентификатор сообщения
     */
    public final TableField<FpSignalInformationRecord, UUID> CORRELATION_ID = createField(DSL.name("correlation_id"), SQLDataType.UUID.nullable(false), this, "Идентификатор сообщения");

    /**
     * The column
     * <code>passport_international.fp_signal_information.fp_case_id</code>.
     * Идентификатор дела
     */
    public final TableField<FpSignalInformationRecord, Long> FP_CASE_ID = createField(DSL.name("fp_case_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.fp_signal_information.signal_id</code>.
     * Идентификатор сигнала
     */
    public final TableField<FpSignalInformationRecord, Long> SIGNAL_ID = createField(DSL.name("signal_id"), SQLDataType.BIGINT, this, "Идентификатор сигнала");

    /**
     * The column
     * <code>passport_international.fp_signal_information.create_dttm</code>.
     * Время вставки записи в таблицу
     */
    public final TableField<FpSignalInformationRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время вставки записи в таблицу");

    /**
     * The column
     * <code>passport_international.fp_signal_information.modify_dttm</code>.
     * Время модификации записи
     */
    public final TableField<FpSignalInformationRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Время модификации записи");

    /**
     * The column
     * <code>passport_international.fp_signal_information.operation_code</code>.
     * Код операции API (CREATE/CANCEL)
     */
    public final TableField<FpSignalInformationRecord, String> OPERATION_CODE = createField(DSL.name("operation_code"), SQLDataType.VARCHAR(50).nullable(false), this, "Код операции API (CREATE/CANCEL)");

    private FpSignalInformation(Name alias, Table<FpSignalInformationRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpSignalInformation(Name alias, Table<FpSignalInformationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица по учету сигналов"), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_signal_information</code> table reference
     */
    public FpSignalInformation(String alias) {
        this(DSL.name(alias), FP_SIGNAL_INFORMATION);
    }

    /**
     * Create an aliased
     * <code>passport_international.fp_signal_information</code> table reference
     */
    public FpSignalInformation(Name alias) {
        this(alias, FP_SIGNAL_INFORMATION);
    }

    /**
     * Create a <code>passport_international.fp_signal_information</code> table
     * reference
     */
    public FpSignalInformation() {
        this(DSL.name("fp_signal_information"), null);
    }

    public <O extends Record> FpSignalInformation(Table<O> child, ForeignKey<O, FpSignalInformationRecord> key) {
        super(child, key, FP_SIGNAL_INFORMATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public UniqueKey<FpSignalInformationRecord> getPrimaryKey() {
        return Keys.FP_SIGNAL_INFORMATION_PKEY;
    }

    @Override
    public List<ForeignKey<FpSignalInformationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_SIGNAL_INFORMATION__FP_SIGNAL_INFORMATION_FP_CASE_ID_FKEY);
    }

    private transient FpCase _fpCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_SIGNAL_INFORMATION__FP_SIGNAL_INFORMATION_FP_CASE_ID_FKEY);

        return _fpCase;
    }

    @Override
    public FpSignalInformation as(String alias) {
        return new FpSignalInformation(DSL.name(alias), this);
    }

    @Override
    public FpSignalInformation as(Name alias) {
        return new FpSignalInformation(alias, this);
    }

    @Override
    public FpSignalInformation as(Table<?> alias) {
        return new FpSignalInformation(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpSignalInformation rename(String name) {
        return new FpSignalInformation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpSignalInformation rename(Name name) {
        return new FpSignalInformation(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpSignalInformation rename(Table<?> name) {
        return new FpSignalInformation(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<UUID, Long, Long, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super UUID, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super UUID, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
