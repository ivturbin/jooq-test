/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewCoreUploadApplicationRecord;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function21;
import org.jooq.JSONB;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row21;
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
public class ViewCoreUploadApplication extends TableImpl<ViewCoreUploadApplicationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_core_upload_application</code>
     */
    public static final ViewCoreUploadApplication VIEW_CORE_UPLOAD_APPLICATION = new ViewCoreUploadApplication();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewCoreUploadApplicationRecord> getRecordType() {
        return ViewCoreUploadApplicationRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_core_upload_application.core_upload_application_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> CORE_UPLOAD_APPLICATION_ID = createField(DSL.name("core_upload_application_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.application_no</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> APPLICATION_NO = createField(DSL.name("application_no"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.case_type_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> CASE_TYPE_ID = createField(DSL.name("case_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.reception_dt</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, LocalDate> RECEPTION_DT = createField(DSL.name("reception_dt"), SQLDataType.LOCALDATE, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.last_name</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> LAST_NAME = createField(DSL.name("last_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.first_name</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> FIRST_NAME = createField(DSL.name("first_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.middle_name</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> MIDDLE_NAME = createField(DSL.name("middle_name"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.series_code</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> SERIES_CODE = createField(DSL.name("series_code"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.doc_no</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> DOC_NO = createField(DSL.name("doc_no"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.supplier_category_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> SUPPLIER_CATEGORY_ID = createField(DSL.name("supplier_category_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.supplier_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> SUPPLIER_ID = createField(DSL.name("supplier_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.department_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> DEPARTMENT_ID = createField(DSL.name("department_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.application_cval</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> APPLICATION_CVAL = createField(DSL.name("application_cval"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.application_status_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> APPLICATION_STATUS_ID = createField(DSL.name("application_status_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.handle_user</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> HANDLE_USER = createField(DSL.name("handle_user"), SQLDataType.VARCHAR(256), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.core_case_id</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.create_dttm</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.modify_dttm</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.action_ind</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.rejection_reason_desc</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, String> REJECTION_REASON_DESC = createField(DSL.name("rejection_reason_desc"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_core_upload_application.precase_json</code>.
     */
    public final TableField<ViewCoreUploadApplicationRecord, JSONB> PRECASE_JSON = createField(DSL.name("precase_json"), SQLDataType.JSONB, this, "");

    private ViewCoreUploadApplication(Name alias, Table<ViewCoreUploadApplicationRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewCoreUploadApplication(Name alias, Table<ViewCoreUploadApplicationRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_core_upload_application" as  SELECT core_uploaded_application.core_uploaded_application_id AS core_upload_application_id,
         core_uploaded_application.application_no,
         core_uploaded_application.case_type_id,
         core_uploaded_application.reception_dt,
         core_uploaded_application.last_name,
         core_uploaded_application.first_name,
         core_uploaded_application.middle_name,
         core_uploaded_application.series_code,
         core_uploaded_application.doc_no,
         core_uploaded_application.supplier_category_id,
         core_uploaded_application.supplier_id,
         core_uploaded_application.department_id,
         core_uploaded_application.application_cval,
         core_uploaded_application.application_status_id,
         core_uploaded_application.processed_user AS handle_user,
         core_uploaded_application.core_case_id,
         core_uploaded_application.create_dttm,
         core_uploaded_application.modify_dttm,
         core_uploaded_application.action_ind,
         core_uploaded_application.rejection_reason_desc,
         core_uploaded_application.precase_json
        FROM core_uploaded_application;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_core_upload_application</code> table
     * reference
     */
    public ViewCoreUploadApplication(String alias) {
        this(DSL.name(alias), VIEW_CORE_UPLOAD_APPLICATION);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_core_upload_application</code> table
     * reference
     */
    public ViewCoreUploadApplication(Name alias) {
        this(alias, VIEW_CORE_UPLOAD_APPLICATION);
    }

    /**
     * Create a <code>passport_international.view_core_upload_application</code>
     * table reference
     */
    public ViewCoreUploadApplication() {
        this(DSL.name("view_core_upload_application"), null);
    }

    public <O extends Record> ViewCoreUploadApplication(Table<O> child, ForeignKey<O, ViewCoreUploadApplicationRecord> key) {
        super(child, key, VIEW_CORE_UPLOAD_APPLICATION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewCoreUploadApplication as(String alias) {
        return new ViewCoreUploadApplication(DSL.name(alias), this);
    }

    @Override
    public ViewCoreUploadApplication as(Name alias) {
        return new ViewCoreUploadApplication(alias, this);
    }

    @Override
    public ViewCoreUploadApplication as(Table<?> alias) {
        return new ViewCoreUploadApplication(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCoreUploadApplication rename(String name) {
        return new ViewCoreUploadApplication(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCoreUploadApplication rename(Name name) {
        return new ViewCoreUploadApplication(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewCoreUploadApplication rename(Table<?> name) {
        return new ViewCoreUploadApplication(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row21 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row21<Long, String, Long, LocalDate, String, String, String, String, String, Long, Long, Long, String, Long, String, Long, OffsetDateTime, OffsetDateTime, String, String, JSONB> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function21<? super Long, ? super String, ? super Long, ? super LocalDate, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super JSONB, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function21<? super Long, ? super String, ? super Long, ? super LocalDate, ? super String, ? super String, ? super String, ? super String, ? super String, ? super Long, ? super Long, ? super Long, ? super String, ? super Long, ? super String, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super JSONB, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
