/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreSmevRequestRecord;

import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function13;
import org.jooq.Identity;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row13;
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
 * Таблица для запросов от smev
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreSmevRequest extends TableImpl<CoreSmevRequestRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_smev_request</code>
     */
    public static final CoreSmevRequest CORE_SMEV_REQUEST = new CoreSmevRequest();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreSmevRequestRecord> getRecordType() {
        return CoreSmevRequestRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_smev_request.smev_request_id</code>.
     * Идентификатор
     */
    public final TableField<CoreSmevRequestRecord, Long> SMEV_REQUEST_ID = createField(DSL.name("smev_request_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.core_smev_request.message_uid</code>. UUID
     * сообщения
     */
    public final TableField<CoreSmevRequestRecord, UUID> MESSAGE_UID = createField(DSL.name("message_uid"), SQLDataType.UUID, this, "UUID сообщения");

    /**
     * The column
     * <code>passport_international.core_smev_request.status_id</code>. Статус
     */
    public final TableField<CoreSmevRequestRecord, Long> STATUS_ID = createField(DSL.name("status_id"), SQLDataType.BIGINT.defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Статус");

    /**
     * The column
     * <code>passport_international.core_smev_request.sender_name</code>. Имя
     * отправителя
     */
    public final TableField<CoreSmevRequestRecord, String> SENDER_NAME = createField(DSL.name("sender_name"), SQLDataType.VARCHAR(256), this, "Имя отправителя");

    /**
     * The column
     * <code>passport_international.core_smev_request.content_dvalue</code>.
     * Тело сообщения в формате xml
     */
    public final TableField<CoreSmevRequestRecord, String> CONTENT_DVALUE = createField(DSL.name("content_dvalue"), SQLDataType.CLOB, this, "Тело сообщения в формате xml");

    /**
     * The column
     * <code>passport_international.core_smev_request.create_dttm</code>. Дата
     * время вставки записи
     */
    public final TableField<CoreSmevRequestRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи");

    /**
     * The column
     * <code>passport_international.core_smev_request.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<CoreSmevRequestRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.core_smev_request.action_ind</code>.
     * Индикатор действия
     */
    public final TableField<CoreSmevRequestRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор действия");

    /**
     * The column
     * <code>passport_international.core_smev_request.core_case_id</code>.
     * Идентификатор дела
     */
    public final TableField<CoreSmevRequestRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT, this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.core_smev_request.client_uid</code>.
     * Идентифкатор запроса
     */
    public final TableField<CoreSmevRequestRecord, UUID> CLIENT_UID = createField(DSL.name("client_uid"), SQLDataType.UUID, this, "Идентифкатор запроса");

    /**
     * The column
     * <code>passport_international.core_smev_request.initiator_bool</code>.
     * True, если инициатором запроса является сервис ГИСМУ, false - ПВВ
     */
    public final TableField<CoreSmevRequestRecord, Boolean> INITIATOR_BOOL = createField(DSL.name("initiator_bool"), SQLDataType.BOOLEAN, this, "True, если инициатором запроса является сервис ГИСМУ, false - ПВВ");

    /**
     * The column
     * <code>passport_international.core_smev_request.external_interaction_id</code>.
     * Идентификатор внешнего взаимодействия
     */
    public final TableField<CoreSmevRequestRecord, Long> EXTERNAL_INTERACTION_ID = createField(DSL.name("external_interaction_id"), SQLDataType.BIGINT, this, "Идентификатор внешнего взаимодействия");

    /**
     * The column
     * <code>passport_international.core_smev_request.type_name</code>. Тип
     * запроса СМЭВ
     */
    public final TableField<CoreSmevRequestRecord, String> TYPE_NAME = createField(DSL.name("type_name"), SQLDataType.VARCHAR(256).defaultValue(DSL.field(DSL.raw("'DEFAULT'::character varying"), SQLDataType.VARCHAR)), this, "Тип запроса СМЭВ");

    private CoreSmevRequest(Name alias, Table<CoreSmevRequestRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreSmevRequest(Name alias, Table<CoreSmevRequestRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Таблица для запросов от smev"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_smev_request</code>
     * table reference
     */
    public CoreSmevRequest(String alias) {
        this(DSL.name(alias), CORE_SMEV_REQUEST);
    }

    /**
     * Create an aliased <code>passport_international.core_smev_request</code>
     * table reference
     */
    public CoreSmevRequest(Name alias) {
        this(alias, CORE_SMEV_REQUEST);
    }

    /**
     * Create a <code>passport_international.core_smev_request</code> table
     * reference
     */
    public CoreSmevRequest() {
        this(DSL.name("core_smev_request"), null);
    }

    public <O extends Record> CoreSmevRequest(Table<O> child, ForeignKey<O, CoreSmevRequestRecord> key) {
        super(child, key, CORE_SMEV_REQUEST);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public Identity<CoreSmevRequestRecord, Long> getIdentity() {
        return (Identity<CoreSmevRequestRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreSmevRequestRecord> getPrimaryKey() {
        return Keys.CORE_SMEV_REQUEST_PK;
    }

    @Override
    public List<ForeignKey<CoreSmevRequestRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_SMEV_REQUEST__CORE_SMEV_REQUEST_EXTERNAL_INTERACTION_FK);
    }

    private transient ExternalInteraction _externalInteraction;

    /**
     * Get the implicit join path to the
     * <code>passport_international.external_interaction</code> table.
     */
    public ExternalInteraction externalInteraction() {
        if (_externalInteraction == null)
            _externalInteraction = new ExternalInteraction(this, Keys.CORE_SMEV_REQUEST__CORE_SMEV_REQUEST_EXTERNAL_INTERACTION_FK);

        return _externalInteraction;
    }

    @Override
    public CoreSmevRequest as(String alias) {
        return new CoreSmevRequest(DSL.name(alias), this);
    }

    @Override
    public CoreSmevRequest as(Name alias) {
        return new CoreSmevRequest(alias, this);
    }

    @Override
    public CoreSmevRequest as(Table<?> alias) {
        return new CoreSmevRequest(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSmevRequest rename(String name) {
        return new CoreSmevRequest(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSmevRequest rename(Name name) {
        return new CoreSmevRequest(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreSmevRequest rename(Table<?> name) {
        return new CoreSmevRequest(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row13 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row13<Long, UUID, Long, String, String, OffsetDateTime, OffsetDateTime, String, Long, UUID, Boolean, Long, String> fieldsRow() {
        return (Row13) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function13<? super Long, ? super UUID, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super UUID, ? super Boolean, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function13<? super Long, ? super UUID, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super UUID, ? super Boolean, ? super Long, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
