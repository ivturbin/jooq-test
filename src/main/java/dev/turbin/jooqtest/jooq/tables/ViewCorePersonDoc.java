/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewCorePersonDocRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCorePersonDoc extends TableImpl<ViewCorePersonDocRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_core_person_doc</code>
     */
    public static final ViewCorePersonDoc VIEW_CORE_PERSON_DOC = new ViewCorePersonDoc();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewCorePersonDocRecord> getRecordType() {
        return ViewCorePersonDocRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_core_person_doc.core_person_doc_id</code>.
     */
    public final TableField<ViewCorePersonDocRecord, Long> CORE_PERSON_DOC_ID = createField(DSL.name("core_person_doc_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.type_id</code>. Тип ДУЛ
     * (НСИ)
     */
    public final TableField<ViewCorePersonDocRecord, Long> TYPE_ID = createField(DSL.name("type_id"), SQLDataType.BIGINT, this, "Тип ДУЛ (НСИ)");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.src_id</code>. Источник
     */
    public final TableField<ViewCorePersonDocRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "Источник");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.doc_no</code>. Номер
     * ДУЛ.
     */
    public final TableField<ViewCorePersonDocRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128), this, "Номер ДУЛ.");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.series_code</code>.
     * Серия ДУЛ
     */
    public final TableField<ViewCorePersonDocRecord, String> SERIES_CODE = createField(DSL.name("series_code"), SQLDataType.VARCHAR(128), this, "Серия ДУЛ");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.first_name</code>. Имя
     * заявителя.
     */
    public final TableField<ViewCorePersonDocRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(256), this, "Имя заявителя.");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.last_name</code>.
     * Фамилия заявителя.
     */
    public final TableField<ViewCorePersonDocRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(256), this, "Фамилия заявителя.");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.middle_name</code>.
     * Отчество заявителя.
     */
    public final TableField<ViewCorePersonDocRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(256), this, "Отчество заявителя.");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birthday_dt</code>.
     * Дата рождения заявителя.
     */
    public final TableField<ViewCorePersonDocRecord, LocalDate> BIRTHDAY_DT = createField(DSL.name("birthday_dt"), SQLDataType.LOCALDATE, this, "Дата рождения заявителя.");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.create_dttm</code>.
     * Дата время вставки записи
     */
    public final TableField<ViewCorePersonDocRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время вставки записи");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<ViewCorePersonDocRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "Дата время последнего изменения записи");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.action_ind</code>.
     * Индикатор операции dml(i-insert,d-delete,u-update)
     */
    public final TableField<ViewCorePersonDocRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "Индикатор операции dml(i-insert,d-delete,u-update)");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.citizenship_id</code>.
     * Гражданство
     */
    public final TableField<ViewCorePersonDocRecord, Long> CITIZENSHIP_ID = createField(DSL.name("citizenship_id"), SQLDataType.BIGINT, this, "Гражданство");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.sex_id</code>.
     */
    public final TableField<ViewCorePersonDocRecord, Long> SEX_ID = createField(DSL.name("sex_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.person_id</code>.
     * Ссылка на идентификатор в ЕСФЛ
     */
    public final TableField<ViewCorePersonDocRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT, this, "Ссылка на идентификатор в ЕСФЛ");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.issue_dt</code>. Кем
     * выдан ДУЛ
     */
    public final TableField<ViewCorePersonDocRecord, LocalDate> ISSUE_DT = createField(DSL.name("issue_dt"), SQLDataType.LOCALDATE, this, "Кем выдан ДУЛ");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.valid_to_dt</code>.
     * Дата окончания действия ДУЛ
     */
    public final TableField<ViewCorePersonDocRecord, LocalDate> VALID_TO_DT = createField(DSL.name("valid_to_dt"), SQLDataType.LOCALDATE, this, "Дата окончания действия ДУЛ");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.issue_place_desc</code>.
     * Дата выдачи ДУЛ
     */
    public final TableField<ViewCorePersonDocRecord, String> ISSUE_PLACE_DESC = createField(DSL.name("issue_place_desc"), SQLDataType.CLOB, this, "Дата выдачи ДУЛ");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_place_desc</code>.
     * Место рождения
     */
    public final TableField<ViewCorePersonDocRecord, String> BIRTH_PLACE_DESC = createField(DSL.name("birth_place_desc"), SQLDataType.CLOB, this, "Место рождения");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_date_integrity_version</code>.
     */
    public final TableField<ViewCorePersonDocRecord, Integer> BIRTH_DATE_INTEGRITY_VERSION = createField(DSL.name("birth_date_integrity_version"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.last_name_en</code>.
     */
    public final TableField<ViewCorePersonDocRecord, String> LAST_NAME_EN = createField(DSL.name("last_name_en"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.first_name_en</code>.
     */
    public final TableField<ViewCorePersonDocRecord, String> FIRST_NAME_EN = createField(DSL.name("first_name_en"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.middle_name_en</code>.
     */
    public final TableField<ViewCorePersonDocRecord, String> MIDDLE_NAME_EN = createField(DSL.name("middle_name_en"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_country_id</code>.
     * Идентификатор страны рождения (НСИ)
     */
    public final TableField<ViewCorePersonDocRecord, Long> BIRTH_COUNTRY_ID = createField(DSL.name("birth_country_id"), SQLDataType.BIGINT, this, "Идентификатор страны рождения (НСИ)");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.snils_code</code>.
     * СНИЛС физ лица
     */
    public final TableField<ViewCorePersonDocRecord, String> SNILS_CODE = createField(DSL.name("snils_code"), SQLDataType.VARCHAR(128), this, "СНИЛС физ лица");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_place_region_desc</code>.
     * Место рождения: регион
     */
    public final TableField<ViewCorePersonDocRecord, String> BIRTH_PLACE_REGION_DESC = createField(DSL.name("birth_place_region_desc"), SQLDataType.CLOB, this, "Место рождения: регион");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_place_area_desc</code>.
     * Место рождения: район
     */
    public final TableField<ViewCorePersonDocRecord, String> BIRTH_PLACE_AREA_DESC = createField(DSL.name("birth_place_area_desc"), SQLDataType.CLOB, this, "Место рождения: район");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_place_city_desc</code>.
     * Место рождения: город
     */
    public final TableField<ViewCorePersonDocRecord, String> BIRTH_PLACE_CITY_DESC = createField(DSL.name("birth_place_city_desc"), SQLDataType.CLOB, this, "Место рождения: город");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.birth_place_local_desc</code>.
     */
    public final TableField<ViewCorePersonDocRecord, String> BIRTH_PLACE_LOCAL_DESC = createField(DSL.name("birth_place_local_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_core_person_doc.authority_code</code>.
     * Код подразделения, выдавшего документ
     */
    public final TableField<ViewCorePersonDocRecord, String> AUTHORITY_CODE = createField(DSL.name("authority_code"), SQLDataType.VARCHAR(128), this, "Код подразделения, выдавшего документ");

    private ViewCorePersonDoc(Name alias, Table<ViewCorePersonDocRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewCorePersonDoc(Name alias, Table<ViewCorePersonDocRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_core_person_doc" as  SELECT core_person_document.core_person_document_id AS core_person_doc_id,
         core_person_document.type_id,
         core_person_document.src_id,
         core_person_document.doc_no,
         core_person_document.series_code,
         core_person_document.first_name,
         core_person_document.last_name,
         core_person_document.middle_name,
         core_person_document.birthday_dt,
         core_person_document.create_dttm,
         core_person_document.modify_dttm,
         core_person_document.action_ind,
         core_person_document.citizenship_id,
         core_person_document.gender_id AS sex_id,
         core_person_document.person_id,
         core_person_document.issue_dt,
         core_person_document.valid_to_dt,
         core_person_document.issue_place_desc,
         core_person_document.birth_place_desc,
         core_person_document.birth_date_integrity AS birth_date_integrity_version,
         core_person_document.last_name_lat AS last_name_en,
         core_person_document.first_name_lat AS first_name_en,
         core_person_document.middle_name_lat AS middle_name_en,
         core_person_document.birth_country_id,
         core_person_document.snils_code,
         core_person_document.birth_place_region_desc,
         core_person_document.birth_place_area_desc,
         core_person_document.birth_place_city_desc,
         core_person_document.birth_place_locality_desc AS birth_place_local_desc,
         core_person_document.authority_code
        FROM core_person_document;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_core_person_doc</code> table reference
     */
    public ViewCorePersonDoc(String alias) {
        this(DSL.name(alias), VIEW_CORE_PERSON_DOC);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_core_person_doc</code> table reference
     */
    public ViewCorePersonDoc(Name alias) {
        this(alias, VIEW_CORE_PERSON_DOC);
    }

    /**
     * Create a <code>passport_international.view_core_person_doc</code> table
     * reference
     */
    public ViewCorePersonDoc() {
        this(DSL.name("view_core_person_doc"), null);
    }

    public <O extends Record> ViewCorePersonDoc(Table<O> child, ForeignKey<O, ViewCorePersonDocRecord> key) {
        super(child, key, VIEW_CORE_PERSON_DOC);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewCorePersonDoc as(String alias) {
        return new ViewCorePersonDoc(DSL.name(alias), this);
    }

    @Override
    public ViewCorePersonDoc as(Name alias) {
        return new ViewCorePersonDoc(alias, this);
    }

    @Override
    public ViewCorePersonDoc as(Table<?> alias) {
        return new ViewCorePersonDoc(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCorePersonDoc rename(String name) {
        return new ViewCorePersonDoc(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCorePersonDoc rename(Name name) {
        return new ViewCorePersonDoc(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCorePersonDoc rename(Table<?> name) {
        return new ViewCorePersonDoc(name.getQualifiedName(), null);
    }
}
