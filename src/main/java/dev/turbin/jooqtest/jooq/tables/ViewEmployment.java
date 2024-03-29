/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewEmploymentRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function19;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row19;
import org.jooq.Schema;
import org.jooq.SelectField;
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
public class ViewEmployment extends TableImpl<ViewEmploymentRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_employment</code>
     */
    public static final ViewEmployment VIEW_EMPLOYMENT = new ViewEmployment();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewEmploymentRecord> getRecordType() {
        return ViewEmploymentRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_employment.employment_id</code>.
     * идентификатор.
     */
    public final TableField<ViewEmploymentRecord, Long> EMPLOYMENT_ID = createField(DSL.name("employment_id"), SQLDataType.BIGINT, this, "идентификатор.");

    /**
     * The column <code>passport_international.view_employment.version</code>.
     * реализация оптимистической блокировки
     */
    public final TableField<ViewEmploymentRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER, this, "реализация оптимистической блокировки");

    /**
     * The column <code>passport_international.view_employment.start_dt</code>.
     * дата начала трудовой деятельности
     */
    public final TableField<ViewEmploymentRecord, LocalDate> START_DT = createField(DSL.name("start_dt"), SQLDataType.LOCALDATE, this, "дата начала трудовой деятельности");

    /**
     * The column <code>passport_international.view_employment.end_dt</code>.
     * дата окончания трудовой деятельности
     */
    public final TableField<ViewEmploymentRecord, LocalDate> END_DT = createField(DSL.name("end_dt"), SQLDataType.LOCALDATE, this, "дата окончания трудовой деятельности");

    /**
     * The column
     * <code>passport_international.view_employment.work_type_id</code>. тип
     * деятельности
     */
    public final TableField<ViewEmploymentRecord, Long> WORK_TYPE_ID = createField(DSL.name("work_type_id"), SQLDataType.BIGINT, this, "тип деятельности");

    /**
     * The column
     * <code>passport_international.view_employment.organization_name</code>.
     * наименование организации.
     */
    public final TableField<ViewEmploymentRecord, String> ORGANIZATION_NAME = createField(DSL.name("organization_name"), SQLDataType.VARCHAR(256), this, "наименование организации.");

    /**
     * The column
     * <code>passport_international.view_employment.organization_address</code>.
     * адрес организации.
     */
    public final TableField<ViewEmploymentRecord, String> ORGANIZATION_ADDRESS = createField(DSL.name("organization_address"), SQLDataType.CLOB, this, "адрес организации.");

    /**
     * The column
     * <code>passport_international.view_employment.position_name</code>.
     * должность.
     */
    public final TableField<ViewEmploymentRecord, String> POSITION_NAME = createField(DSL.name("position_name"), SQLDataType.VARCHAR(256), this, "должность.");

    /**
     * The column <code>passport_international.view_employment.src_id</code>.
     */
    public final TableField<ViewEmploymentRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_employment.create_dttm</code>.
     */
    public final TableField<ViewEmploymentRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_employment.modify_dttm</code>.
     */
    public final TableField<ViewEmploymentRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_employment.action_ind</code>.
     */
    public final TableField<ViewEmploymentRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column <code>passport_international.view_employment.eff_dttm</code>.
     */
    public final TableField<ViewEmploymentRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>passport_international.view_employment.exp_dttm</code>.
     */
    public final TableField<ViewEmploymentRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column <code>passport_international.view_employment.fax_cval</code>.
     */
    public final TableField<ViewEmploymentRecord, String> FAX_CVAL = createField(DSL.name("fax_cval"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>passport_international.view_employment.email</code>.
     */
    public final TableField<ViewEmploymentRecord, String> EMAIL = createField(DSL.name("email"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_employment.phone_cval</code>.
     */
    public final TableField<ViewEmploymentRecord, String> PHONE_CVAL = createField(DSL.name("phone_cval"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_employment.work_now_bool</code>.
     */
    public final TableField<ViewEmploymentRecord, Boolean> WORK_NOW_BOOL = createField(DSL.name("work_now_bool"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column
     * <code>passport_international.view_employment.no_employment_bool</code>.
     */
    public final TableField<ViewEmploymentRecord, Boolean> NO_EMPLOYMENT_BOOL = createField(DSL.name("no_employment_bool"), SQLDataType.BOOLEAN, this, "");

    private ViewEmployment(Name alias, Table<ViewEmploymentRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewEmployment(Name alias, Table<ViewEmploymentRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_employment" as  SELECT employment.employment_id,
         employment.version,
         employment.start_dt,
         employment.end_dt,
         employment.work_type_id,
         employment.organization_name,
         employment.organization_address,
         employment.position_name,
         employment.src_id,
         employment.create_dttm,
         employment.modify_dttm,
         employment.action_ind,
         employment.eff_dttm,
         employment.exp_dttm,
         employment.empl_fax_cval AS fax_cval,
         employment.empl_email AS email,
         employment.empl_phone AS phone_cval,
         employment.till_now AS work_now_bool,
         employment.unemployment AS no_employment_bool
        FROM employment;
        """));
    }

    /**
     * Create an aliased <code>passport_international.view_employment</code>
     * table reference
     */
    public ViewEmployment(String alias) {
        this(DSL.name(alias), VIEW_EMPLOYMENT);
    }

    /**
     * Create an aliased <code>passport_international.view_employment</code>
     * table reference
     */
    public ViewEmployment(Name alias) {
        this(alias, VIEW_EMPLOYMENT);
    }

    /**
     * Create a <code>passport_international.view_employment</code> table
     * reference
     */
    public ViewEmployment() {
        this(DSL.name("view_employment"), null);
    }

    public <O extends Record> ViewEmployment(Table<O> child, ForeignKey<O, ViewEmploymentRecord> key) {
        super(child, key, VIEW_EMPLOYMENT);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewEmployment as(String alias) {
        return new ViewEmployment(DSL.name(alias), this);
    }

    @Override
    public ViewEmployment as(Name alias) {
        return new ViewEmployment(alias, this);
    }

    @Override
    public ViewEmployment as(Table<?> alias) {
        return new ViewEmployment(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewEmployment rename(String name) {
        return new ViewEmployment(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewEmployment rename(Name name) {
        return new ViewEmployment(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewEmployment rename(Table<?> name) {
        return new ViewEmployment(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row19 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row19<Long, Integer, LocalDate, LocalDate, Long, String, String, String, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, String, String, String, Boolean, Boolean> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function19<? super Long, ? super Integer, ? super LocalDate, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function19<? super Long, ? super Integer, ? super LocalDate, ? super LocalDate, ? super Long, ? super String, ? super String, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super String, ? super Boolean, ? super Boolean, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
