/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CorePersonDocumentRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Index;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * Установочные данные ФЛ и ДУЛ для дела.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CorePersonDocument extends TableImpl<CorePersonDocumentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.core_person_document</code>
     */
    public static final CorePersonDocument CORE_PERSON_DOCUMENT = new CorePersonDocument();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CorePersonDocumentRecord> getRecordType() {
        return CorePersonDocumentRecord.class;
    }

    /**
     * The column
     * <code>passport_international.core_person_document.core_person_document_id</code>.
     * Идентификатор
     */
    public final TableField<CorePersonDocumentRecord, Long> CORE_PERSON_DOCUMENT_ID = createField(DSL.name("core_person_document_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.core_person_document.type_id</code>. Тип ДУЛ
     * (НСИ)
     */
    public final TableField<CorePersonDocumentRecord, Long> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.BIGINT.nullable(false), this, "Тип ДУЛ (НСИ)");

    /**
     * The column
     * <code>passport_international.core_person_document.src_id</code>. Источник
     */
    public final TableField<CorePersonDocumentRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Источник");

    /**
     * The column
     * <code>passport_international.core_person_document.doc_no</code>. Номер
     * ДУЛ.
     */
    public final TableField<CorePersonDocumentRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128).nullable(false), this, "Номер ДУЛ.");

    /**
     * The column
     * <code>passport_international.core_person_document.series_code</code>.
     * Серия ДУЛ
     */
    public final TableField<CorePersonDocumentRecord, String> SERIES_CODE = createField(DSL.name("series_code"), SQLDataType.VARCHAR(128), this, "Серия ДУЛ");

    /**
     * The column
     * <code>passport_international.core_person_document.first_name</code>. Имя
     * заявителя.
     */
    public final TableField<CorePersonDocumentRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(256).nullable(false), this, "Имя заявителя.");

    /**
     * The column
     * <code>passport_international.core_person_document.last_name</code>.
     * Фамилия заявителя.
     */
    public final TableField<CorePersonDocumentRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(256).nullable(false), this, "Фамилия заявителя.");

    /**
     * The column
     * <code>passport_international.core_person_document.middle_name</code>.
     * Отчество заявителя.
     */
    public final TableField<CorePersonDocumentRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(256), this, "Отчество заявителя.");

    /**
     * The column
     * <code>passport_international.core_person_document.birthday_dt</code>.
     * Дата рождения заявителя.
     */
    public final TableField<CorePersonDocumentRecord, LocalDate> BIRTHDAY_DT = createField(DSL.name("birthday_dt"), SQLDataType.LOCALDATE, this, "Дата рождения заявителя.");

    /**
     * The column
     * <code>passport_international.core_person_document.create_dttm</code>.
     * Дата время вставки записи
     */
    public final TableField<CorePersonDocumentRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи");

    /**
     * The column
     * <code>passport_international.core_person_document.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<CorePersonDocumentRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.core_person_document.action_ind</code>.
     * Индикатор операции dml(i-insert,d-delete,u-update)
     */
    public final TableField<CorePersonDocumentRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции dml(i-insert,d-delete,u-update)");

    /**
     * The column
     * <code>passport_international.core_person_document.citizenship_id</code>.
     * Гражданство
     */
    public final TableField<CorePersonDocumentRecord, Long> CITIZENSHIP_ID = createField(DSL.name("citizenship_id"), SQLDataType.BIGINT, this, "Гражданство");

    /**
     * The column
     * <code>passport_international.core_person_document.gender_id</code>. Пол
     */
    public final TableField<CorePersonDocumentRecord, Long> GENDER_ID = createField(DSL.name("gender_id"), SQLDataType.BIGINT, this, "Пол");

    /**
     * The column
     * <code>passport_international.core_person_document.person_id</code>.
     * Ссылка на идентификатор в ЕСФЛ
     */
    public final TableField<CorePersonDocumentRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::integer"), SQLDataType.BIGINT)), this, "Ссылка на идентификатор в ЕСФЛ");

    /**
     * The column
     * <code>passport_international.core_person_document.issue_dt</code>. Дата
     * выдачи ДУЛ
     */
    public final TableField<CorePersonDocumentRecord, LocalDate> ISSUE_DT = createField(DSL.name("issue_dt"), SQLDataType.LOCALDATE, this, "Дата выдачи ДУЛ");

    /**
     * The column
     * <code>passport_international.core_person_document.issue_place_desc</code>.
     * Кем выдан ДУЛ
     */
    public final TableField<CorePersonDocumentRecord, String> ISSUE_PLACE_DESC = createField(DSL.name("issue_place_desc"), SQLDataType.CLOB, this, "Кем выдан ДУЛ");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_place_desc</code>.
     * Место рождения
     */
    public final TableField<CorePersonDocumentRecord, String> BIRTH_PLACE_DESC = createField(DSL.name("birth_place_desc"), SQLDataType.CLOB, this, "Место рождения");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_date_integrity</code>.
     */
    public final TableField<CorePersonDocumentRecord, Integer> BIRTH_DATE_INTEGRITY = createField(DSL.name("birth_date_integrity"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("3"), SQLDataType.INTEGER)), this, "");

    /**
     * The column
     * <code>passport_international.core_person_document.last_name_lat</code>.
     * Фамилия заявителя, латиница.
     */
    public final TableField<CorePersonDocumentRecord, String> LAST_NAME_LAT = createField(DSL.name("last_name_lat"), SQLDataType.VARCHAR(256), this, "Фамилия заявителя, латиница.");

    /**
     * The column
     * <code>passport_international.core_person_document.first_name_lat</code>.
     * Имя заявителя, латиница.
     */
    public final TableField<CorePersonDocumentRecord, String> FIRST_NAME_LAT = createField(DSL.name("first_name_lat"), SQLDataType.VARCHAR(256), this, "Имя заявителя, латиница.");

    /**
     * The column
     * <code>passport_international.core_person_document.middle_name_lat</code>.
     * Отчество заявителя, латиница.
     */
    public final TableField<CorePersonDocumentRecord, String> MIDDLE_NAME_LAT = createField(DSL.name("middle_name_lat"), SQLDataType.VARCHAR(256), this, "Отчество заявителя, латиница.");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_country_id</code>.
     * Идентификатор страны рождения (НСИ)
     */
    public final TableField<CorePersonDocumentRecord, Long> BIRTH_COUNTRY_ID = createField(DSL.name("birth_country_id"), SQLDataType.BIGINT, this, "Идентификатор страны рождения (НСИ)");

    /**
     * The column
     * <code>passport_international.core_person_document.snils_code</code>.
     * СНИЛС физ лица
     */
    public final TableField<CorePersonDocumentRecord, String> SNILS_CODE = createField(DSL.name("snils_code"), SQLDataType.VARCHAR(128), this, "СНИЛС физ лица");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_place_region_desc</code>.
     * Место рождения: регион
     */
    public final TableField<CorePersonDocumentRecord, String> BIRTH_PLACE_REGION_DESC = createField(DSL.name("birth_place_region_desc"), SQLDataType.CLOB, this, "Место рождения: регион");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_place_area_desc</code>.
     * Место рождения: район
     */
    public final TableField<CorePersonDocumentRecord, String> BIRTH_PLACE_AREA_DESC = createField(DSL.name("birth_place_area_desc"), SQLDataType.CLOB, this, "Место рождения: район");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_place_city_desc</code>.
     * Место рождения: город
     */
    public final TableField<CorePersonDocumentRecord, String> BIRTH_PLACE_CITY_DESC = createField(DSL.name("birth_place_city_desc"), SQLDataType.CLOB, this, "Место рождения: город");

    /**
     * The column
     * <code>passport_international.core_person_document.birth_place_locality_desc</code>.
     * Место рождения: населённый пункт
     */
    public final TableField<CorePersonDocumentRecord, String> BIRTH_PLACE_LOCALITY_DESC = createField(DSL.name("birth_place_locality_desc"), SQLDataType.CLOB, this, "Место рождения: населённый пункт");

    /**
     * The column
     * <code>passport_international.core_person_document.authority_code</code>.
     * Код подразделения, выдавшего документ
     */
    public final TableField<CorePersonDocumentRecord, String> AUTHORITY_CODE = createField(DSL.name("authority_code"), SQLDataType.VARCHAR(128).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Код подразделения, выдавшего документ");

    /**
     * The column
     * <code>passport_international.core_person_document.valid_to_dt</code>.
     * Дата окончания действия ДУЛ
     */
    public final TableField<CorePersonDocumentRecord, LocalDate> VALID_TO_DT = createField(DSL.name("valid_to_dt"), SQLDataType.LOCALDATE, this, "Дата окончания действия ДУЛ");

    /**
     * The column
     * <code>passport_international.core_person_document.extended_to_dt</code>.
     * Продлен по
     */
    public final TableField<CorePersonDocumentRecord, LocalDate> EXTENDED_TO_DT = createField(DSL.name("extended_to_dt"), SQLDataType.LOCALDATE, this, "Продлен по");

    /**
     * The column
     * <code>passport_international.core_person_document.version</code>.
     * Реализация оптимистической блокировки
     */
    public final TableField<CorePersonDocumentRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.INTEGER)), this, "Реализация оптимистической блокировки");

    private CorePersonDocument(Name alias, Table<CorePersonDocumentRecord> aliased) {
        this(alias, aliased, null);
    }

    private CorePersonDocument(Name alias, Table<CorePersonDocumentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Установочные данные ФЛ и ДУЛ для дела."), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.core_person_document</code> table reference
     */
    public CorePersonDocument(String alias) {
        this(DSL.name(alias), CORE_PERSON_DOCUMENT);
    }

    /**
     * Create an aliased
     * <code>passport_international.core_person_document</code> table reference
     */
    public CorePersonDocument(Name alias) {
        this(alias, CORE_PERSON_DOCUMENT);
    }

    /**
     * Create a <code>passport_international.core_person_document</code> table
     * reference
     */
    public CorePersonDocument() {
        this(DSL.name("core_person_document"), null);
    }

    public <O extends Record> CorePersonDocument(Table<O> child, ForeignKey<O, CorePersonDocumentRecord> key) {
        super(child, key, CORE_PERSON_DOCUMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CORE_PERSON_1_IX, Indexes.CORE_PERSON_2_IX, Indexes.CORE_PERSON_DOCUMENT_MODIFY_DTTM_IX, Indexes.CPD_CITIZENSHIP_ID_IX, Indexes.CPD_MIDDLE_NAME_IX, Indexes.CPDOCUMENT_BIRTHDAY_IX, Indexes.CPDOCUMENT_FIRST_NAME_IX, Indexes.CPDOCUMENT_LAST_NAME_IX);
    }

    @Override
    public Identity<CorePersonDocumentRecord, Long> getIdentity() {
        return (Identity<CorePersonDocumentRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<CorePersonDocumentRecord> getPrimaryKey() {
        return Keys.CORE_PERSON_DOCUMENT_ID_PK;
    }

    @Override
    public CorePersonDocument as(String alias) {
        return new CorePersonDocument(DSL.name(alias), this);
    }

    @Override
    public CorePersonDocument as(Name alias) {
        return new CorePersonDocument(alias, this);
    }

    @Override
    public CorePersonDocument as(Table<?> alias) {
        return new CorePersonDocument(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonDocument rename(String name) {
        return new CorePersonDocument(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonDocument rename(Name name) {
        return new CorePersonDocument(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CorePersonDocument rename(Table<?> name) {
        return new CorePersonDocument(name.getQualifiedName(), null);
    }
}
