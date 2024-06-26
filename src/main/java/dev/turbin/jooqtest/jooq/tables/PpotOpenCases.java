/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.PpotOpenCasesRecord;

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
 * Открытые дела в системе ППОТ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PpotOpenCases extends TableImpl<PpotOpenCasesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.ppot_open_cases</code>
     */
    public static final PpotOpenCases PPOT_OPEN_CASES = new PpotOpenCases();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PpotOpenCasesRecord> getRecordType() {
        return PpotOpenCasesRecord.class;
    }

    /**
     * The column
     * <code>passport_international.ppot_open_cases.ppot_open_case_id</code>.
     * Идентификатор
     */
    public final TableField<PpotOpenCasesRecord, Long> PPOT_OPEN_CASE_ID = createField(DSL.name("ppot_open_case_id"), SQLDataType.BIGINT.nullable(false).identity(true), this, "Идентификатор");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.source_system_id</code>.
     * Идентификатор системы источник
     */
    public final TableField<PpotOpenCasesRecord, Long> SOURCE_SYSTEM_ID = createField(DSL.name("source_system_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор системы источник");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_source_id</code>.
     * Идентификатор дела в системе источник
     */
    public final TableField<PpotOpenCasesRecord, Long> CASE_SOURCE_ID = createField(DSL.name("case_source_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор дела в системе источник");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_type_id</code>. Тип
     * дела
     */
    public final TableField<PpotOpenCasesRecord, Long> CASE_TYPE_ID = createField(DSL.name("case_type_id"), SQLDataType.BIGINT.nullable(false), this, "Тип дела");

    /**
     * The column <code>passport_international.ppot_open_cases.case_no</code>.
     * Номер дела
     */
    public final TableField<PpotOpenCasesRecord, String> CASE_NO = createField(DSL.name("case_no"), SQLDataType.VARCHAR(256), this, "Номер дела");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_department_id</code>.
     * Департамент, где заведено дело
     */
    public final TableField<PpotOpenCasesRecord, Long> CASE_DEPARTMENT_ID = createField(DSL.name("case_department_id"), SQLDataType.BIGINT.nullable(false), this, "Департамент, где заведено дело");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_create_supplier_id</code>.
     * Идентификатор поставщика, в системе которого создано дело
     */
    public final TableField<PpotOpenCasesRecord, Long> CASE_CREATE_SUPPLIER_ID = createField(DSL.name("case_create_supplier_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор поставщика, в системе которого создано дело");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_reception_supplier_id</code>.
     * Идентификатор поставщика данных для дела
     */
    public final TableField<PpotOpenCasesRecord, Long> CASE_RECEPTION_SUPPLIER_ID = createField(DSL.name("case_reception_supplier_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор поставщика данных для дела");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_reception_dt</code>.
     * Дата приема заявления
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> CASE_RECEPTION_DT = createField(DSL.name("case_reception_dt"), SQLDataType.LOCALDATE, this, "Дата приема заявления");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_create_dt</code>. Дата
     * создания записи
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> CASE_CREATE_DT = createField(DSL.name("case_create_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата создания записи");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.case_update_dt</code>. Дата
     * последнего изменения записи
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> CASE_UPDATE_DT = createField(DSL.name("case_update_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата последнего изменения записи");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_type_id</code>. Тип
     * документа
     */
    public final TableField<PpotOpenCasesRecord, Long> DOC_TYPE_ID = createField(DSL.name("doc_type_id"), SQLDataType.BIGINT.nullable(false), this, "Тип документа");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_status_id</code>. Статус
     * документа
     */
    public final TableField<PpotOpenCasesRecord, Long> DOC_STATUS_ID = createField(DSL.name("doc_status_id"), SQLDataType.BIGINT.nullable(false), this, "Статус документа");

    /**
     * The column <code>passport_international.ppot_open_cases.doc_no</code>.
     * Номер документа
     */
    public final TableField<PpotOpenCasesRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128).nullable(false), this, "Номер документа");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_series_code</code>.
     * Серия документа
     */
    public final TableField<PpotOpenCasesRecord, String> DOC_SERIES_CODE = createField(DSL.name("doc_series_code"), SQLDataType.VARCHAR(128), this, "Серия документа");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_issued_dt</code>. Дата
     * выдачи
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> DOC_ISSUED_DT = createField(DSL.name("doc_issued_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата выдачи");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_valid_from_dt</code>.
     * Действителен с
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> DOC_VALID_FROM_DT = createField(DSL.name("doc_valid_from_dt"), SQLDataType.LOCALDATE, this, "Действителен с");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_valid_to_dt</code>.
     * Действителен по
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> DOC_VALID_TO_DT = createField(DSL.name("doc_valid_to_dt"), SQLDataType.LOCALDATE, this, "Действителен по");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_birth_place_cval</code>.
     * Дата последнего изменения записи
     */
    public final TableField<PpotOpenCasesRecord, String> DOC_BIRTH_PLACE_CVAL = createField(DSL.name("doc_birth_place_cval"), SQLDataType.CLOB, this, "Дата последнего изменения записи");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_authority_id</code>.
     * Орган, выдавший документ
     */
    public final TableField<PpotOpenCasesRecord, Long> DOC_AUTHORITY_ID = createField(DSL.name("doc_authority_id"), SQLDataType.BIGINT, this, "Орган, выдавший документ");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_authority_code</code>.
     * Код подразделения, выдавшего документ
     */
    public final TableField<PpotOpenCasesRecord, String> DOC_AUTHORITY_CODE = createField(DSL.name("doc_authority_code"), SQLDataType.VARCHAR(256), this, "Код подразделения, выдавшего документ");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.doc_authority_cval</code>.
     * Кем выдан документ
     */
    public final TableField<PpotOpenCasesRecord, String> DOC_AUTHORITY_CVAL = createField(DSL.name("doc_authority_cval"), SQLDataType.CLOB, this, "Кем выдан документ");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_first_name</code>.
     * Имя
     */
    public final TableField<PpotOpenCasesRecord, String> PERSON_FIRST_NAME = createField(DSL.name("person_first_name"), SQLDataType.VARCHAR(256).nullable(false), this, "Имя");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_last_name</code>.
     * Фамилия
     */
    public final TableField<PpotOpenCasesRecord, String> PERSON_LAST_NAME = createField(DSL.name("person_last_name"), SQLDataType.VARCHAR(256).nullable(false), this, "Фамилия");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_middle_name</code>.
     * Отчество
     */
    public final TableField<PpotOpenCasesRecord, String> PERSON_MIDDLE_NAME = createField(DSL.name("person_middle_name"), SQLDataType.VARCHAR(256), this, "Отчество");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_first_name_lat</code>.
     * Имя на латинице
     */
    public final TableField<PpotOpenCasesRecord, String> PERSON_FIRST_NAME_LAT = createField(DSL.name("person_first_name_lat"), SQLDataType.VARCHAR(256), this, "Имя на латинице");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_last_name_lat</code>.
     * Фамилия на латинице
     */
    public final TableField<PpotOpenCasesRecord, String> PERSON_LAST_NAME_LAT = createField(DSL.name("person_last_name_lat"), SQLDataType.VARCHAR(256), this, "Фамилия на латинице");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_middle_name_lat</code>.
     * Отчество на латинице
     */
    public final TableField<PpotOpenCasesRecord, String> PERSON_MIDDLE_NAME_LAT = createField(DSL.name("person_middle_name_lat"), SQLDataType.VARCHAR(256), this, "Отчество на латинице");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_gender_id</code>. Пол
     */
    public final TableField<PpotOpenCasesRecord, Long> PERSON_GENDER_ID = createField(DSL.name("person_gender_id"), SQLDataType.BIGINT, this, "Пол");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_birth_dt</code>. Дата
     * рождения
     */
    public final TableField<PpotOpenCasesRecord, LocalDate> PERSON_BIRTH_DT = createField(DSL.name("person_birth_dt"), SQLDataType.LOCALDATE.nullable(false), this, "Дата рождения");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_birth_dt_integrity</code>.
     * Полнота даты рождения: 0 - отсутствует, 1 - год, 2 - год и месяц, 3 -
     * полная дата
     */
    public final TableField<PpotOpenCasesRecord, Long> PERSON_BIRTH_DT_INTEGRITY = createField(DSL.name("person_birth_dt_integrity"), SQLDataType.BIGINT.nullable(false), this, "Полнота даты рождения: 0 - отсутствует, 1 - год, 2 - год и месяц, 3 - полная дата");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.person_birth_country_id</code>.
     * Страна рождения
     */
    public final TableField<PpotOpenCasesRecord, Long> PERSON_BIRTH_COUNTRY_ID = createField(DSL.name("person_birth_country_id"), SQLDataType.BIGINT.nullable(false), this, "Страна рождения");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.create_dttm</code>.
     */
    public final TableField<PpotOpenCasesRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.action_ind</code>.
     */
    public final TableField<PpotOpenCasesRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.core_case_id</code>.
     */
    public final TableField<PpotOpenCasesRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.ppot_open_cases.modify_dttm</code>.
     */
    public final TableField<PpotOpenCasesRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "");

    private PpotOpenCases(Name alias, Table<PpotOpenCasesRecord> aliased) {
        this(alias, aliased, null);
    }

    private PpotOpenCases(Name alias, Table<PpotOpenCasesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Открытые дела в системе ППОТ."), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.ppot_open_cases</code>
     * table reference
     */
    public PpotOpenCases(String alias) {
        this(DSL.name(alias), PPOT_OPEN_CASES);
    }

    /**
     * Create an aliased <code>passport_international.ppot_open_cases</code>
     * table reference
     */
    public PpotOpenCases(Name alias) {
        this(alias, PPOT_OPEN_CASES);
    }

    /**
     * Create a <code>passport_international.ppot_open_cases</code> table
     * reference
     */
    public PpotOpenCases() {
        this(DSL.name("ppot_open_cases"), null);
    }

    public <O extends Record> PpotOpenCases(Table<O> child, ForeignKey<O, PpotOpenCasesRecord> key) {
        super(child, key, PPOT_OPEN_CASES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.PPOT_OPEN_CASES_SOURCE_UX);
    }

    @Override
    public Identity<PpotOpenCasesRecord, Long> getIdentity() {
        return (Identity<PpotOpenCasesRecord, Long>) super.getIdentity();
    }

    @Override
    public UniqueKey<PpotOpenCasesRecord> getPrimaryKey() {
        return Keys.PPOT_OPEN_CASE_ID_PK;
    }

    @Override
    public PpotOpenCases as(String alias) {
        return new PpotOpenCases(DSL.name(alias), this);
    }

    @Override
    public PpotOpenCases as(Name alias) {
        return new PpotOpenCases(alias, this);
    }

    @Override
    public PpotOpenCases as(Table<?> alias) {
        return new PpotOpenCases(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public PpotOpenCases rename(String name) {
        return new PpotOpenCases(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PpotOpenCases rename(Name name) {
        return new PpotOpenCases(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public PpotOpenCases rename(Table<?> name) {
        return new PpotOpenCases(name.getQualifiedName(), null);
    }
}
