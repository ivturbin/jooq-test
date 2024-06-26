/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.FpPrintRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpPrint extends TableImpl<FpPrintRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>passport_international.fp_print</code>
     */
    public static final FpPrint FP_PRINT = new FpPrint();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FpPrintRecord> getRecordType() {
        return FpPrintRecord.class;
    }

    /**
     * The column <code>passport_international.fp_print.core_case_id</code>.
     */
    public final TableField<FpPrintRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>passport_international.fp_print.print_city</code>.
     */
    public final TableField<FpPrintRecord, String> PRINT_CITY = createField(DSL.name("print_city"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>passport_international.fp_print.print_region</code>.
     */
    public final TableField<FpPrintRecord, String> PRINT_REGION = createField(DSL.name("print_region"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>passport_international.fp_print.print_country</code>.
     */
    public final TableField<FpPrintRecord, Long> PRINT_COUNTRY = createField(DSL.name("print_country"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>passport_international.fp_print.create_dttm</code>.
     */
    public final TableField<FpPrintRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>passport_international.fp_print.create_user</code>.
     */
    public final TableField<FpPrintRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.CLOB, this, "");

    private FpPrint(Name alias, Table<FpPrintRecord> aliased) {
        this(alias, aliased, null);
    }

    private FpPrint(Name alias, Table<FpPrintRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.fp_print</code> table
     * reference
     */
    public FpPrint(String alias) {
        this(DSL.name(alias), FP_PRINT);
    }

    /**
     * Create an aliased <code>passport_international.fp_print</code> table
     * reference
     */
    public FpPrint(Name alias) {
        this(alias, FP_PRINT);
    }

    /**
     * Create a <code>passport_international.fp_print</code> table reference
     */
    public FpPrint() {
        this(DSL.name("fp_print"), null);
    }

    public <O extends Record> FpPrint(Table<O> child, ForeignKey<O, FpPrintRecord> key) {
        super(child, key, FP_PRINT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public UniqueKey<FpPrintRecord> getPrimaryKey() {
        return Keys.FP_PRINT_PKEY;
    }

    @Override
    public List<ForeignKey<FpPrintRecord, ?>> getReferences() {
        return Arrays.asList(Keys.FP_PRINT__FK_FP_PRINT_FP_CASE);
    }

    private transient FpCase _fpCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.fp_case</code> table.
     */
    public FpCase fpCase() {
        if (_fpCase == null)
            _fpCase = new FpCase(this, Keys.FP_PRINT__FK_FP_PRINT_FP_CASE);

        return _fpCase;
    }

    @Override
    public FpPrint as(String alias) {
        return new FpPrint(DSL.name(alias), this);
    }

    @Override
    public FpPrint as(Name alias) {
        return new FpPrint(alias, this);
    }

    @Override
    public FpPrint as(Table<?> alias) {
        return new FpPrint(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FpPrint rename(String name) {
        return new FpPrint(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpPrint rename(Name name) {
        return new FpPrint(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FpPrint rename(Table<?> name) {
        return new FpPrint(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, String, String, Long, OffsetDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function6<? super Long, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function6<? super Long, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
