/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Indexes;
import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.CoreCaseRecord;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
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
 * Базовый класс дела о предоставлении услуги
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreCase extends TableImpl<CoreCaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>passport_international.core_case</code>
     */
    public static final CoreCase CORE_CASE = new CoreCase();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CoreCaseRecord> getRecordType() {
        return CoreCaseRecord.class;
    }

    /**
     * The column <code>passport_international.core_case.core_case_id</code>.
     * Идентификатор базового дела ГИСМУ
     */
    public final TableField<CoreCaseRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("next_core_case_id()"), SQLDataType.BIGINT)), this, "Идентификатор базового дела ГИСМУ");

    /**
     * The column <code>passport_international.core_case.version</code>.
     * Реализация оптимистической блокировки
     */
    public final TableField<CoreCaseRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER.nullable(false), this, "Реализация оптимистической блокировки");

    /**
     * The column <code>passport_international.core_case.invalid_id</code>.
     * Признак корректности дела: 0 - корректное, 1 - отменено, 2 - скрытое
     */
    public final TableField<CoreCaseRecord, Long> INVALID_ID = createField(DSL.name("invalid_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'0'::bigint"), SQLDataType.BIGINT)), this, "Признак корректности дела: 0 - корректное, 1 - отменено, 2 - скрытое");

    /**
     * The column
     * <code>passport_international.core_case.in_checklist_bool</code>.
     * Заявитель находится в контрольном списке, если 1
     */
    public final TableField<CoreCaseRecord, Boolean> IN_CHECKLIST_BOOL = createField(DSL.name("in_checklist_bool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Заявитель находится в контрольном списке, если 1");

    /**
     * The column
     * <code>passport_international.core_case.data_corrected_code_nval</code>.
     * Признак корректировки основных объектов учета дела. Битовая маска: 1 -
     * УД/ДУЛ ФЛ, 2 - УД/ДОС ЮЛ, 4 - адрес ФЛ, 8 - адрес ЮЛ
     */
    public final TableField<CoreCaseRecord, BigDecimal> DATA_CORRECTED_CODE_NVAL = createField(DSL.name("data_corrected_code_nval"), SQLDataType.NUMERIC.nullable(false), this, "Признак корректировки основных объектов учета дела. Битовая маска: 1 - УД/ДУЛ ФЛ, 2 - УД/ДОС ЮЛ, 4 - адрес ФЛ, 8 - адрес ЮЛ");

    /**
     * The column <code>passport_international.core_case.from_draft_bool</code>.
     * Дело создано из черновика заявления (очищаемая таблица EXS_DRAFT_CASE),
     * если 1
     */
    public final TableField<CoreCaseRecord, Boolean> FROM_DRAFT_BOOL = createField(DSL.name("from_draft_bool"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Дело создано из черновика заявления (очищаемая таблица EXS_DRAFT_CASE), если 1");

    /**
     * The column <code>passport_international.core_case.case_type_id</code>.
     * Тип дела
     */
    public final TableField<CoreCaseRecord, Long> CASE_TYPE_ID = createField(DSL.name("case_type_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Тип дела");

    /**
     * The column <code>passport_international.core_case.department_id</code>.
     * Подразделение в котором заводили дело
     */
    public final TableField<CoreCaseRecord, Long> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Подразделение в котором заводили дело");

    /**
     * The column <code>passport_international.core_case.case_status_id</code>.
     * Статус дела
     */
    public final TableField<CoreCaseRecord, Long> CASE_STATUS_ID = createField(DSL.name("case_status_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Статус дела");

    /**
     * The column
     * <code>passport_international.core_case.create_supplier_id</code>.
     * Идентификатор поставщика, в системе которого создано дело
     */
    public final TableField<CoreCaseRecord, Long> CREATE_SUPPLIER_ID = createField(DSL.name("create_supplier_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Идентификатор поставщика, в системе которого создано дело");

    /**
     * The column
     * <code>passport_international.core_case.reception_supplier_id</code>.
     * Идентификатор поставщика данных для дела
     */
    public final TableField<CoreCaseRecord, Long> RECEPTION_SUPPLIER_ID = createField(DSL.name("reception_supplier_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Идентификатор поставщика данных для дела");

    /**
     * The column <code>passport_international.core_case.reception_dt</code>.
     * Дата и время приема заявления
     */
    public final TableField<CoreCaseRecord, LocalDate> RECEPTION_DT = createField(DSL.name("reception_dt"), SQLDataType.LOCALDATE, this, "Дата и время приема заявления");

    /**
     * The column <code>passport_international.core_case.invalid_dt</code>. Дата
     * инвалидации дела
     */
    public final TableField<CoreCaseRecord, LocalDate> INVALID_DT = createField(DSL.name("invalid_dt"), SQLDataType.LOCALDATE, this, "Дата инвалидации дела");

    /**
     * The column <code>passport_international.core_case.cessation_dt</code>.
     * Дата прекращения дела
     */
    public final TableField<CoreCaseRecord, LocalDate> CESSATION_DT = createField(DSL.name("cessation_dt"), SQLDataType.LOCALDATE, this, "Дата прекращения дела");

    /**
     * The column <code>passport_international.core_case.parent_case_id</code>.
     * Идентификатор родительского дела
     */
    public final TableField<CoreCaseRecord, Long> PARENT_CASE_ID = createField(DSL.name("parent_case_id"), SQLDataType.BIGINT, this, "Идентификатор родительского дела");

    /**
     * The column
     * <code>passport_international.core_case.cessation_reason_id</code>.
     * Причина прекращения дела
     */
    public final TableField<CoreCaseRecord, Long> CESSATION_REASON_ID = createField(DSL.name("cessation_reason_id"), SQLDataType.BIGINT, this, "Причина прекращения дела");

    /**
     * The column <code>passport_international.core_case.cessation_user</code>.
     * Пользователь, прекративший дело
     */
    public final TableField<CoreCaseRecord, String> CESSATION_USER = createField(DSL.name("cessation_user"), SQLDataType.VARCHAR(255), this, "Пользователь, прекративший дело");

    /**
     * The column <code>passport_international.core_case.invalid_user</code>.
     * Пользователь, инвалидировавший дело
     */
    public final TableField<CoreCaseRecord, String> INVALID_USER = createField(DSL.name("invalid_user"), SQLDataType.VARCHAR(255), this, "Пользователь, инвалидировавший дело");

    /**
     * The column <code>passport_international.core_case.case_no</code>. Номер
     * дела
     */
    public final TableField<CoreCaseRecord, String> CASE_NO = createField(DSL.name("case_no"), SQLDataType.VARCHAR(128).nullable(false), this, "Номер дела");

    /**
     * The column <code>passport_international.core_case.case_arc_no</code>.
     * Архивный номер дела
     */
    public final TableField<CoreCaseRecord, String> CASE_ARC_NO = createField(DSL.name("case_arc_no"), SQLDataType.VARCHAR(128), this, "Архивный номер дела");

    /**
     * The column
     * <code>passport_international.core_case.cessation_basis_desc</code>.
     * Основание прекращения дела
     */
    public final TableField<CoreCaseRecord, String> CESSATION_BASIS_DESC = createField(DSL.name("cessation_basis_desc"), SQLDataType.CLOB, this, "Основание прекращения дела");

    /**
     * The column <code>passport_international.core_case.comments_desc</code>.
     * Примечания
     */
    public final TableField<CoreCaseRecord, String> COMMENTS_DESC = createField(DSL.name("comments_desc"), SQLDataType.CLOB, this, "Примечания");

    /**
     * The column <code>passport_international.core_case.case_reason_id</code>.
     * Причина оказания услуги
     */
    public final TableField<CoreCaseRecord, Long> CASE_REASON_ID = createField(DSL.name("case_reason_id"), SQLDataType.BIGINT, this, "Причина оказания услуги");

    /**
     * The column <code>passport_international.core_case.person_id</code>.
     * Физлицо, которому оказывается услуга
     */
    public final TableField<CoreCaseRecord, Long> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Физлицо, которому оказывается услуга");

    /**
     * The column <code>passport_international.core_case.cancelled_bool</code>.
     * Статус отменен (true) в результате отмены дела
     */
    public final TableField<CoreCaseRecord, Boolean> CANCELLED_BOOL = createField(DSL.name("cancelled_bool"), SQLDataType.BOOLEAN.nullable(false).defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "Статус отменен (true) в результате отмены дела");

    /**
     * The column <code>passport_international.core_case.src_id</code>. Источник
     */
    public final TableField<CoreCaseRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Источник");

    /**
     * The column <code>passport_international.core_case.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public final TableField<CoreCaseRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время вставки записи в таблицу");

    /**
     * The column <code>passport_international.core_case.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public final TableField<CoreCaseRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).nullable(false).defaultValue(DSL.field(DSL.raw("now()"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата время последнего изменения записи");

    /**
     * The column <code>passport_international.core_case.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public final TableField<CoreCaseRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1).nullable(false).defaultValue(DSL.field(DSL.raw("'I'::character varying"), SQLDataType.VARCHAR)), this, "Индикатор операции DML(I-insert,D-delete,U-update)");

    /**
     * The column <code>passport_international.core_case.eff_dttm</code>. Дата
     * начала действия периода
     */
    public final TableField<CoreCaseRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("'1899-12-31 23:30:17+02:30:17'::timestamp with time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата начала действия периода");

    /**
     * The column <code>passport_international.core_case.exp_dttm</code>. Дата
     * окончания действия периода
     */
    public final TableField<CoreCaseRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6).defaultValue(DSL.field(DSL.raw("'9999-12-31 00:00:00+03'::timestamp with time zone"), SQLDataType.TIMESTAMPWITHTIMEZONE)), this, "Дата окончания действия периода");

    /**
     * The column <code>passport_international.core_case.create_user</code>.
     * Пользователь создавший запись
     */
    public final TableField<CoreCaseRecord, String> CREATE_USER = createField(DSL.name("create_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь создавший запись");

    /**
     * The column <code>passport_international.core_case.update_user</code>.
     * Пользователь обновивший запись
     */
    public final TableField<CoreCaseRecord, String> UPDATE_USER = createField(DSL.name("update_user"), SQLDataType.VARCHAR(255).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Пользователь обновивший запись");

    /**
     * The column
     * <code>passport_international.core_case.person_status_id</code>. Статус
     * состояния физического лица
     */
    public final TableField<CoreCaseRecord, Long> PERSON_STATUS_ID = createField(DSL.name("person_status_id"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("'-1'::bigint"), SQLDataType.BIGINT)), this, "Статус состояния физического лица");

    /**
     * The column <code>passport_international.core_case.department_code</code>.
     * Код департамента
     */
    public final TableField<CoreCaseRecord, String> DEPARTMENT_CODE = createField(DSL.name("department_code"), SQLDataType.VARCHAR(128).nullable(false).defaultValue(DSL.field(DSL.raw("'N/D'::character varying"), SQLDataType.VARCHAR)), this, "Код департамента");

    /**
     * The column
     * <code>passport_international.core_case.person_document_id</code>.
     * Идентификатор УД
     */
    public final TableField<CoreCaseRecord, Long> PERSON_DOCUMENT_ID = createField(DSL.name("person_document_id"), SQLDataType.BIGINT.nullable(false), this, "Идентификатор УД");

    /**
     * The column <code>passport_international.core_case.region_id</code>.
     * Регион
     */
    public final TableField<CoreCaseRecord, Long> REGION_ID = createField(DSL.name("region_id"), SQLDataType.BIGINT, this, "Регион");

    /**
     * The column <code>passport_international.core_case.application_no</code>.
     * Номер заявления (Для загруженных)
     */
    public final TableField<CoreCaseRecord, String> APPLICATION_NO = createField(DSL.name("application_no"), SQLDataType.VARCHAR(128), this, "Номер заявления (Для загруженных)");

    /**
     * The column <code>passport_international.core_case.source_case_id</code>.
     * Идентификатор дела в источнике
     */
    public final TableField<CoreCaseRecord, String> SOURCE_CASE_ID = createField(DSL.name("source_case_id"), SQLDataType.VARCHAR(128), this, "Идентификатор дела в источнике");

    /**
     * The column <code>passport_international.core_case.source_id</code>.
     * Идентификатор источника
     */
    public final TableField<CoreCaseRecord, Long> SOURCE_ID = createField(DSL.name("source_id"), SQLDataType.BIGINT, this, "Идентификатор источника");

    /**
     * The column <code>passport_international.core_case.federal_id</code>.
     * Идентификатор дела в ФУ
     */
    public final TableField<CoreCaseRecord, String> FEDERAL_ID = createField(DSL.name("federal_id"), SQLDataType.VARCHAR(128), this, "Идентификатор дела в ФУ");

    private CoreCase(Name alias, Table<CoreCaseRecord> aliased) {
        this(alias, aliased, null);
    }

    private CoreCase(Name alias, Table<CoreCaseRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("Базовый класс дела о предоставлении услуги"), TableOptions.table());
    }

    /**
     * Create an aliased <code>passport_international.core_case</code> table
     * reference
     */
    public CoreCase(String alias) {
        this(DSL.name(alias), CORE_CASE);
    }

    /**
     * Create an aliased <code>passport_international.core_case</code> table
     * reference
     */
    public CoreCase(Name alias) {
        this(alias, CORE_CASE);
    }

    /**
     * Create a <code>passport_international.core_case</code> table reference
     */
    public CoreCase() {
        this(DSL.name("core_case"), null);
    }

    public <O extends Record> CoreCase(Table<O> child, ForeignKey<O, CoreCaseRecord> key) {
        super(child, key, CORE_CASE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public List<Index> getIndexes() {
        return Arrays.asList(Indexes.CC_CESSATION_REASON_ID_IX, Indexes.CC_PERSON_DOCUMENT_ID_UK, Indexes.CCASE_DEPARTMENT_ID_IX, Indexes.CCASE_PARENT_CASE_ID_IX, Indexes.CORE_CASE_2_IX, Indexes.CORE_CASE_3_IX, Indexes.CORE_CASE_4_IX, Indexes.CORE_CASE_5_IX, Indexes.CORE_CASE_6_IX, Indexes.CORE_CASE_CASE_REASON_ID_IX, Indexes.CORE_CASE_CASE_STATUS_ID_IX, Indexes.CORE_CASE_CASETYPECRTDATE, Indexes.CORE_CASE_MODIFY_DTTM_IX, Indexes.CORE_CASE_PERSON_STATUS_ID_IX, Indexes.CORE_CASE_RECEPTION_DT_IX, Indexes.CORE_CASE_REGION_DEPARTMENT_IX, Indexes.CORE_CASE_REGION_IX, Indexes.CORE_CASE_SOURCE_CASE_ID_IX, Indexes.SOURCE_CASE_ID_UK);
    }

    @Override
    public UniqueKey<CoreCaseRecord> getPrimaryKey() {
        return Keys.CORE_CASE_PK;
    }

    @Override
    public List<ForeignKey<CoreCaseRecord, ?>> getReferences() {
        return Arrays.asList(Keys.CORE_CASE__CORE_CASE_SELF_PARENTID_FK, Keys.CORE_CASE__PERSON_DOCUMENT_ID_FK);
    }

    private transient CoreCase _coreCase;
    private transient CorePersonDocument _corePersonDocument;

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_case</code> table.
     */
    public CoreCase coreCase() {
        if (_coreCase == null)
            _coreCase = new CoreCase(this, Keys.CORE_CASE__CORE_CASE_SELF_PARENTID_FK);

        return _coreCase;
    }

    /**
     * Get the implicit join path to the
     * <code>passport_international.core_person_document</code> table.
     */
    public CorePersonDocument corePersonDocument() {
        if (_corePersonDocument == null)
            _corePersonDocument = new CorePersonDocument(this, Keys.CORE_CASE__PERSON_DOCUMENT_ID_FK);

        return _corePersonDocument;
    }

    @Override
    public CoreCase as(String alias) {
        return new CoreCase(DSL.name(alias), this);
    }

    @Override
    public CoreCase as(Name alias) {
        return new CoreCase(alias, this);
    }

    @Override
    public CoreCase as(Table<?> alias) {
        return new CoreCase(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreCase rename(String name) {
        return new CoreCase(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreCase rename(Name name) {
        return new CoreCase(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public CoreCase rename(Table<?> name) {
        return new CoreCase(name.getQualifiedName(), null);
    }
}
