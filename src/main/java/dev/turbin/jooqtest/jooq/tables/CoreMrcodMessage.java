/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreMrcodMessageRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function11;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row11;
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
 * Таблица для запросов МРЦОД
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreMrcodMessage extends TableImpl<CoreMrcodMessageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_mrcod_message</code>
     */
    public static final CoreMrcodMessage CORE_MRCOD_MESSAGE = new CoreMrcodMessage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreMrcodMessageRecord> getRecordType() {
        return CoreMrcodMessageRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_mrcod_message.mrcod_message_id</code>.
     * Идентификатор записи сообщения МРЦОД
     */
    public final TableField<CoreMrcodMessageRecord, Long> MRCOD_MESSAGE_ID = createField(DSL.name("mrcod_message_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор записи сообщения МРЦОД");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.mrcod_interaction_id_key</code>.
     * Внутренний идентификатор взаимодействия
     */
    public final TableField<CoreMrcodMessageRecord, String> MRCOD_INTERACTION_ID_KEY = createField(DSL.name("mrcod_interaction_id_key"), SQLDataType.VARCHAR(256).nullable(false), this, "Внутренний идентификатор взаимодействия");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.core_case_id</code>.
     * Идентификатор дела
     */
    public final TableField<CoreMrcodMessageRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT, this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.sender_id</code>.
     * Идентификатор системы отправителя сообщения
     */
    public final TableField<CoreMrcodMessageRecord, Long> SENDER_ID = createField(DSL.name("sender_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор системы отправителя сообщения");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.receiver_id</code>.
     * Идентификатор системы получателя сообщения
     */
    public final TableField<CoreMrcodMessageRecord, Long> RECEIVER_ID = createField(DSL.name("receiver_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор системы получателя сообщения");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.message_type_name</code>.
     * Тип сообщения
     */
    public final TableField<CoreMrcodMessageRecord, String> MESSAGE_TYPE_NAME = createField(DSL.name("message_type_name"), SQLDataType.VARCHAR(256).nullable(false), this, "Тип сообщения");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.message_content_desc</code>.
     * Тело сообщения в формате XML
     */
    public final TableField<CoreMrcodMessageRecord, String> MESSAGE_CONTENT_DESC = createField(DSL.name("message_content_desc"), SQLDataType.CLOB, this, "Тело сообщения в формате XML");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.create_dttm</code>. Дата
     * время добавления записи
     */
    public final TableField<CoreMrcodMessageRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время добавления записи");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<CoreMrcodMessageRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.action_ind</code>.
     * Индикатор действия
     */
    public final TableField<CoreMrcodMessageRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор действия");

    /**
     * The column
     * <code>passport_international.core_mrcod_message.request_id</code>.
     * Идентификатор сообщения МРЦОД
     */
    public final TableField<CoreMrcodMessageRecord, String> REQUEST_ID = createField(DSL.name("request_id"), SQLDataType.VARCHAR(128), this, "Идентификатор сообщения МРЦОД");

    private CoreMrcodMessage(Name alias, Table<CoreMrcodMessageRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreMrcodMessage(Name alias, Table<CoreMrcodMessageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица для запросов МРЦОД"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_mrcod_message</code>
     * table reference
     */
    public CoreMrcodMessage(String alias) {
        this(DSL.name(alias), CORE_MRCOD_MESSAGE);
    }

    /**
     * Create an aliased <code>passport_international.core_mrcod_message</code>
     * table reference
     */
    public CoreMrcodMessage(Name alias) {
        this(alias, CORE_MRCOD_MESSAGE);
    }

    /**
     * Create a <code>passport_international.core_mrcod_message</code> table
     * reference
     */
    public CoreMrcodMessage() {
        this(DSL.name("core_mrcod_message"), null);
    }

    public <O extends Record> CoreMrcodMessage(Table<O> child, ForeignKey<O, CoreMrcodMessageRecord> key) {
        super(child, key, CORE_MRCOD_MESSAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<CoreMrcodMessageRecord, Long> getIdentity() {
        return (Identity<CoreMrcodMessageRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreMrcodMessageRecord> getPrimaryKey() {
        return Keys.CORE_MRCOD_MESSAGE_PK;
    }

    @Override
    public List<ForeignKey<CoreMrcodMessageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_MRCOD_MESSAGE__CORE_MRCOD_MESSAGE_CORE_CASE_FK);
    }

    private transient CoreCase _coreCase;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.CORE_MRCOD_MESSAGE__CORE_MRCOD_MESSAGE_CORE_CASE_FK);

        return _coreCase;
    }

    @Override
    public CoreMrcodMessage as(String alias) {
        return new CoreMrcodMessage(DSL.name(alias), this);
    }

    @Override
    public CoreMrcodMessage as(Name alias) {
        return new CoreMrcodMessage(alias, this);
    }

    @Override
    public CoreMrcodMessage as(Table<?> alias) {
        return new CoreMrcodMessage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreMrcodMessage rename(String name) {
        return new CoreMrcodMessage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreMrcodMessage rename(Name name) {
        return new CoreMrcodMessage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreMrcodMessage rename(Table<?> name) {
        return new CoreMrcodMessage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row11 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, Long, Long, Long, String, String, OffsetDateTime, OffsetDateTime, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function11<? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function11<? super Long, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
