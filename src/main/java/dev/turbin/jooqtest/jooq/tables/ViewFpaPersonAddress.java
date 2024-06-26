/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewFpaPersonAddressRecord;

import java.time.OffsetDateTime;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function10;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row10;
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
public class ViewFpaPersonAddress extends TableImpl<ViewFpaPersonAddressRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_fpa_person_address</code>
     */
    public static final ViewFpaPersonAddress VIEW_FPA_PERSON_ADDRESS = new ViewFpaPersonAddress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewFpaPersonAddressRecord> getRecordType() {
        return ViewFpaPersonAddressRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.fpa_person_address_id</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, Long> FPA_PERSON_ADDRESS_ID = createField(DSL.name("fpa_person_address_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.core_person_address_id</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, Long> CORE_PERSON_ADDRESS_ID = createField(DSL.name("core_person_address_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.address_type_id</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, Long> ADDRESS_TYPE_ID = createField(DSL.name("address_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.core_person_doc_id</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, Long> CORE_PERSON_DOC_ID = createField(DSL.name("core_person_doc_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.src_id</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, Long> SRC_ID = createField(DSL.name("src_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.create_dttm</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.modify_dttm</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.action_ind</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.eff_dttm</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, OffsetDateTime> EFF_DTTM = createField(DSL.name("eff_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_fpa_person_address.exp_dttm</code>.
     */
    public final TableField<ViewFpaPersonAddressRecord, OffsetDateTime> EXP_DTTM = createField(DSL.name("exp_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    private ViewFpaPersonAddress(Name alias, Table<ViewFpaPersonAddressRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewFpaPersonAddress(Name alias, Table<ViewFpaPersonAddressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_fpa_person_address" as  SELECT fp_person_address.fp_person_address_id AS fpa_person_address_id,
         fp_person_address.core_person_address_id,
         fp_person_address.address_type_id,
         fp_person_address.person_document_id AS core_person_doc_id,
         fp_person_address.src_id,
         fp_person_address.create_dttm,
         fp_person_address.modify_dttm,
         fp_person_address.action_ind,
         fp_person_address.eff_dttm,
         fp_person_address.exp_dttm
        FROM fp_person_address;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_person_address</code> table
     * reference
     */
    public ViewFpaPersonAddress(String alias) {
        this(DSL.name(alias), VIEW_FPA_PERSON_ADDRESS);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_fpa_person_address</code> table
     * reference
     */
    public ViewFpaPersonAddress(Name alias) {
        this(alias, VIEW_FPA_PERSON_ADDRESS);
    }

    /**
     * Create a <code>passport_international.view_fpa_person_address</code>
     * table reference
     */
    public ViewFpaPersonAddress() {
        this(DSL.name("view_fpa_person_address"), null);
    }

    public <O extends Record> ViewFpaPersonAddress(Table<O> child, ForeignKey<O, ViewFpaPersonAddressRecord> key) {
        super(child, key, VIEW_FPA_PERSON_ADDRESS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewFpaPersonAddress as(String alias) {
        return new ViewFpaPersonAddress(DSL.name(alias), this);
    }

    @Override
    public ViewFpaPersonAddress as(Name alias) {
        return new ViewFpaPersonAddress(alias, this);
    }

    @Override
    public ViewFpaPersonAddress as(Table<?> alias) {
        return new ViewFpaPersonAddress(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaPersonAddress rename(String name) {
        return new ViewFpaPersonAddress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaPersonAddress rename(Name name) {
        return new ViewFpaPersonAddress(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewFpaPersonAddress rename(Table<?> name) {
        return new ViewFpaPersonAddress(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row10 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row10<Long, Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function10<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function10<? super Long, ? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super OffsetDateTime, ? super OffsetDateTime, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
