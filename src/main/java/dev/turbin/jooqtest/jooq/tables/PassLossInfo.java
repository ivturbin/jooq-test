/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.PassLossInfoRecord;

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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PassLossInfo extends TableImpl<PassLossInfoRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.pass_loss_info</code>
     */
    public static final PassLossInfo PASS_LOSS_INFO = new PassLossInfo();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PassLossInfoRecord> getRecordType() {
        return PassLossInfoRecord.class;
    }

    /**
     * The column <code>passport_international.pass_loss_info.id</code>.
     */
    public final TableField<PassLossInfoRecord, Long> ID = createField(DSL.name("id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "");

    /**
     * The column
     * <code>passport_international.pass_loss_info.core_document_id</code>.
     * Идентификатор выходящего документа
     */
    public final TableField<PassLossInfoRecord, Long> CORE_DOCUMENT_ID = createField(DSL.name("core_document_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор выходящего документа");

    /**
     * The column <code>passport_international.pass_loss_info.lost_date</code>.
     * Дата утери документа
     */
    public final TableField<PassLossInfoRecord, LocalDate> LOST_DATE = createField(DSL.name("lost_date"), SQLDataType.LOCALDATE, this, "Дата утери документа");

    /**
     * The column <code>passport_international.pass_loss_info.executor</code>.
     * Пользователь, который обьявил паспорт утраченным (фамилия)
     */
    public final TableField<PassLossInfoRecord, String> EXECUTOR = createField(DSL.name("executor"), SQLDataType.VARCHAR(255), this, "Пользователь, который обьявил паспорт утраченным (фамилия)");

    /**
     * The column
     * <code>passport_international.pass_loss_info.lost_reason</code>. Описание
     * причины утери
     */
    public final TableField<PassLossInfoRecord, String> LOST_REASON = createField(DSL.name("lost_reason"), SQLDataType.VARCHAR(255), this, "Описание причины утери");

    /**
     * The column
     * <code>passport_international.pass_loss_info.lost_cert_authority</code>.
     * Название подразделения оформившего утерю
     */
    public final TableField<PassLossInfoRecord, String> LOST_CERT_AUTHORITY = createField(DSL.name("lost_cert_authority"), SQLDataType.VARCHAR(255), this, "Название подразделения оформившего утерю");

    /**
     * The column <code>passport_international.pass_loss_info.src_id</code>.
     */
    public final TableField<PassLossInfoRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "");

    /**
     * The column
     * <code>passport_international.pass_loss_info.create_dttm</code>.
     */
    public final TableField<PassLossInfoRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.pass_loss_info.modify_dttm</code>.
     */
    public final TableField<PassLossInfoRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column <code>passport_international.pass_loss_info.action_ind</code>.
     */
    public final TableField<PassLossInfoRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>passport_international.pass_loss_info.eff_dttm</code>.
     */
    public final TableField<PassLossInfoRecord, LocalDate> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("'1900-01-01'::date"), SQLDataType.LOCALDATE)), this, "");

    /**
     * The column <code>passport_international.pass_loss_info.exp_dttm</code>.
     */
    public final TableField<PassLossInfoRecord, LocalDate> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.LOCALDATE.nullable(false).defaultValue(DSL.field(DSL.raw("'2999-12-31'::date"), SQLDataType.LOCALDATE)), this, "");

    private PassLossInfo(Name alias, Table<PassLossInfoRecord> aliased) {
        this(alias, aliased, null);
    }

    private PassLossInfo(Name alias, Table<PassLossInfoRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.pass_loss_info</code>
     * table reference
     */
    public PassLossInfo(String alias) {
        this(DSL.name(alias), PASS_LOSS_INFO);
    }

    /**
     * Create an aliased <code>passport_international.pass_loss_info</code>
     * table reference
     */
    public PassLossInfo(Name alias) {
        this(alias, PASS_LOSS_INFO);
    }

    /**
     * Create a <code>passport_international.pass_loss_info</code> table
     * reference
     */
    public PassLossInfo() {
        this(DSL.name("pass_loss_info"), null);
    }

    public <O extends Record> PassLossInfo(Table<O> child, ForeignKey<O, PassLossInfoRecord> key) {
        super(child, key, PASS_LOSS_INFO);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<PassLossInfoRecord, Long> getIdentity() {
        return (Identity<PassLossInfoRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PassLossInfoRecord> getPrimaryKey() {
        return Keys.PASS_LOSS_INFO_PKEY;
    }

    @Override
    public List<ForeignKey<PassLossInfoRecord, ?>> getReferences() {
        return Arrays.asList(Keys.PASS_LOSS_INFO__FPA_CORE_DOCUMENT_LOSS_INFO);
    }

    private transient CoreDocument _coreDocument;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_document</code> table.
     */
    public CoreDocument coreDocument() {
        if (_coreDocument == null)
            _coreDocument = new CoreDocument(this, Keys.PASS_LOSS_INFO__FPA_CORE_DOCUMENT_LOSS_INFO);

        return _coreDocument;
    }

    @Override
    public PassLossInfo as(String alias) {
        return new PassLossInfo(DSL.name(alias), this);
    }

    @Override
    public PassLossInfo as(Name alias) {
        return new PassLossInfo(alias, this);
    }

    @Override
    public PassLossInfo as(Table<?> alias) {
        return new PassLossInfo(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PassLossInfo rename(String name) {
        return new PassLossInfo(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PassLossInfo rename(Name name) {
        return new PassLossInfo(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PassLossInfo rename(Table<?> name) {
        return new PassLossInfo(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Long, Long, LocalDate, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, LocalDate, LocalDate> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function12<? super Long, ? super Long, ? super LocalDate, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super LocalDate, ? super LocalDate, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function12<? super Long, ? super Long, ? super LocalDate, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super LocalDate, ? super LocalDate, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
