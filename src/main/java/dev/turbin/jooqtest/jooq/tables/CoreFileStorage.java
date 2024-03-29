/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreFileStorageRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
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
 * Связанные файлы с делом
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreFileStorage extends TableImpl<CoreFileStorageRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_file_storage</code>
     */
    public static final CoreFileStorage CORE_FILE_STORAGE = new CoreFileStorage();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreFileStorageRecord> getRecordType() {
        return CoreFileStorageRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_file_storage.core_file_storage_id</code>.
     * Идентификатор
     */
    public final TableField<CoreFileStorageRecord, Long> CORE_FILE_STORAGE_ID = createField(DSL.name("core_file_storage_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.core_file_storage.file_uid</code>. UID файла
     */
    public final TableField<CoreFileStorageRecord, UUID> FILE_UID = createField(DSL.name("file_uid"), SQLDataType.UUID, this, "UID файла");

    /**
     * The column
     * <code>passport_international.core_file_storage.file_type_id</code>. Тип
     * файла
     */
    public final TableField<CoreFileStorageRecord, Long> FILE_TYPE_ID = createField(DSL.name("file_type_id"), SQLDataType.BIGINT.nullable(false), this, "Тип файла");

    /**
     * The column <code>passport_international.core_file_storage.doc_no</code>.
     * Номер документа
     */
    public final TableField<CoreFileStorageRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128), this, "Номер документа");

    /**
     * The column
     * <code>passport_international.core_file_storage.file_desc</code>. Описание
     */
    public final TableField<CoreFileStorageRecord, String> FILE_DESC = createField(DSL.name("file_desc"), SQLDataType.CLOB, this, "Описание");

    /**
     * The column <code>passport_international.core_file_storage.file_dt</code>.
     * Дата документа
     */
    public final TableField<CoreFileStorageRecord, LocalDate> FILE_DT = createField(DSL.name("file_dt"), SQLDataType.LOCALDATE, this, "Дата документа");

    /**
     * The column
     * <code>passport_international.core_file_storage.core_case_id</code>.
     * Идентификатор дела
     */
    public final TableField<CoreFileStorageRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT, this, "Идентификатор дела");

    /**
     * The column
     * <code>passport_international.core_file_storage.create_user</code>. Логин
     * пользователя создавшего запись
     */
    public final TableField<CoreFileStorageRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR(255), this, "Логин пользователя создавшего запись");

    /**
     * The column
     * <code>passport_international.core_file_storage.modify_user</code>. Логин
     * пользователя изменившего запись
     */
    public final TableField<CoreFileStorageRecord, String> MODIFY_USER = createField(DSL.name("modify_user"), SQLDataType.VARCHAR(255), this, "Логин пользователя изменившего запись");

    /**
     * The column
     * <code>passport_international.core_file_storage.create_dttm</code>. Дата
     * время вставки записи
     */
    public final TableField<CoreFileStorageRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи");

    /**
     * The column
     * <code>passport_international.core_file_storage.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public final TableField<CoreFileStorageRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.core_file_storage.action_ind</code>.
     * Индикатор действия
     */
    public final TableField<CoreFileStorageRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор действия");

    /**
     * The column
     * <code>passport_international.core_file_storage.core_document_id</code>.
     * Ссылка на базовый документ
     */
    public final TableField<CoreFileStorageRecord, Long> CORE_DOCUMENT_ID = createField(DSL.name("core_document_id"), SQLDataType.BIGINT, this, "Ссылка на базовый документ");

    /**
     * The column
     * <code>passport_international.core_file_storage.migr_source_system_id</code>.
     * Идентификатор системы источник
     */
    public final TableField<CoreFileStorageRecord, Long> MIGR_SOURCE_SYSTEM_ID = createField(DSL.name("migr_source_system_id"), SQLDataType.BIGINT, this, "Идентификатор системы источник");

    /**
     * The column
     * <code>passport_international.core_file_storage.migr_source_id</code>.
     * Идентификатор в системе источник
     */
    public final TableField<CoreFileStorageRecord, Long> MIGR_SOURCE_ID = createField(DSL.name("migr_source_id"), SQLDataType.BIGINT, this, "Идентификатор в системе источник");

    /**
     * The column
     * <code>passport_international.core_file_storage.migr_file_link_cval</code>.
     * Ссылка на ФХ
     */
    public final TableField<CoreFileStorageRecord, String> MIGR_FILE_LINK_CVAL = createField(DSL.name("migr_file_link_cval"), SQLDataType.CLOB, this, "Ссылка на ФХ");

    /**
     * The column
     * <code>passport_international.core_file_storage.comment_desc</code>.
     * Описание комментария
     */
    public final TableField<CoreFileStorageRecord, String> COMMENT_DESC = createField(DSL.name("comment_desc"), SQLDataType.VARCHAR(128), this, "Описание комментария");

    private CoreFileStorage(Name alias, Table<CoreFileStorageRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreFileStorage(Name alias, Table<CoreFileStorageRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Связанные файлы с делом"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_file_storage</code>
     * table reference
     */
    public CoreFileStorage(String alias) {
        this(DSL.name(alias), CORE_FILE_STORAGE);
    }

    /**
     * Create an aliased <code>passport_international.core_file_storage</code>
     * table reference
     */
    public CoreFileStorage(Name alias) {
        this(alias, CORE_FILE_STORAGE);
    }

    /**
     * Create a <code>passport_international.core_file_storage</code> table
     * reference
     */
    public CoreFileStorage() {
        this(DSL.name("core_file_storage"), null);
    }

    public <O extends Record> CoreFileStorage(Table<O> child, ForeignKey<O, CoreFileStorageRecord> key) {
        super(child, key, CORE_FILE_STORAGE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_FILE_STORAGE_MIGR_IX);
    }

    @Override
    public Identity<CoreFileStorageRecord, Long> getIdentity() {
        return (Identity<CoreFileStorageRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CoreFileStorageRecord> getPrimaryKey() {
        return Keys.CORE_FILE_STORAGE_PK;
    }

    @Override
    public List<ForeignKey<CoreFileStorageRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_FILE_STORAGE__CORE_FILE_STORAGE_CORE_CASE_FK, Keys.CORE_FILE_STORAGE__CORE_FILE_STORAGE_CORE_DOCUMENT_ID_FK);
    }

    private transient CoreCase _coreCase;
    private transient CoreDocument _coreDocument;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.CORE_FILE_STORAGE__CORE_FILE_STORAGE_CORE_CASE_FK);

        return _coreCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_document</code> table.
     */
    public CoreDocument coreDocument() {
        if (_coreDocument == null)
            _coreDocument = new CoreDocument(this, Keys.CORE_FILE_STORAGE__CORE_FILE_STORAGE_CORE_DOCUMENT_ID_FK);

        return _coreDocument;
    }

    @Override
    public CoreFileStorage as(String alias) {
        return new CoreFileStorage(DSL.name(alias), this);
    }

    @Override
    public CoreFileStorage as(Name alias) {
        return new CoreFileStorage(alias, this);
    }

    @Override
    public CoreFileStorage as(Table<?> alias) {
        return new CoreFileStorage(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreFileStorage rename(String name) {
        return new CoreFileStorage(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreFileStorage rename(Name name) {
        return new CoreFileStorage(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreFileStorage rename(Table<?> name) {
        return new CoreFileStorage(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, UUID, Long, String, String, LocalDate, Long, String, String, OffsetDateTime, OffsetDateTime, String, Long, Long, Long, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function17<? super Long, ? super UUID, ? super Long, ? super String, ? super String, ? super LocalDate, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super Long, ? super UUID, ? super Long, ? super String, ? super String, ? super LocalDate, ? super Long, ? super String, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
