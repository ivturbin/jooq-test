/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.ViewExternalInteractionRecord;

import java.time.OffsetDateTime;
import java.util.UUID;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function17;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row17;
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
public class ViewExternalInteraction extends TableImpl<ViewExternalInteractionRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.view_external_interaction</code>
     */
    public static final ViewExternalInteraction VIEW_EXTERNAL_INTERACTION = new ViewExternalInteraction();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ViewExternalInteractionRecord> getRecordType() {
        return ViewExternalInteractionRecord.class;
    }

    /**
     * The column
     * <code>passport_international.view_external_interaction.external_interaction_id</code>.
     */
    public final TableField<ViewExternalInteractionRecord, Long> EXTERNAL_INTERACTION_ID = createField(DSL.name("external_interaction_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.core_case_id</code>.
     */
    public final TableField<ViewExternalInteractionRecord, Long> CORE_CASE_ID = createField(DSL.name("core_case_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.system_id</code>.
     */
    public final TableField<ViewExternalInteractionRecord, Long> SYSTEM_ID = createField(DSL.name("system_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.interaction_type_id</code>.
     */
    public final TableField<ViewExternalInteractionRecord, Long> INTERACTION_TYPE_ID = createField(DSL.name("interaction_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.create_dt</code>.
     */
    public final TableField<ViewExternalInteractionRecord, OffsetDateTime> CREATE_DT = createField(DSL.name("create_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.request_dt</code>.
     */
    public final TableField<ViewExternalInteractionRecord, OffsetDateTime> REQUEST_DT = createField(DSL.name("request_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.response_dt</code>.
     */
    public final TableField<ViewExternalInteractionRecord, OffsetDateTime> RESPONSE_DT = createField(DSL.name("response_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.check_dt</code>.
     */
    public final TableField<ViewExternalInteractionRecord, OffsetDateTime> CHECK_DT = createField(DSL.name("check_dt"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.response_cval</code>.
     */
    public final TableField<ViewExternalInteractionRecord, String> RESPONSE_CVAL = createField(DSL.name("response_cval"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.version</code>.
     */
    public final TableField<ViewExternalInteractionRecord, Integer> VERSION = createField(DSL.name("version"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.create_dttm</code>.
     */
    public final TableField<ViewExternalInteractionRecord, OffsetDateTime> CREATE_DTTM = createField(DSL.name("create_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.modify_dttm</code>.
     */
    public final TableField<ViewExternalInteractionRecord, OffsetDateTime> MODIFY_DTTM = createField(DSL.name("modify_dttm"), SQLDataType.TIMESTAMPWITHTIMEZONE(6), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.action_ind</code>.
     */
    public final TableField<ViewExternalInteractionRecord, String> ACTION_IND = createField(DSL.name("action_ind"), SQLDataType.VARCHAR(1), this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.request_cval</code>.
     */
    public final TableField<ViewExternalInteractionRecord, String> REQUEST_CVAL = createField(DSL.name("request_cval"), SQLDataType.CLOB, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.interaction_other_type_id</code>.
     */
    public final TableField<ViewExternalInteractionRecord, Long> INTERACTION_OTHER_TYPE_ID = createField(DSL.name("interaction_other_type_id"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.response_file_uid</code>.
     */
    public final TableField<ViewExternalInteractionRecord, UUID> RESPONSE_FILE_UID = createField(DSL.name("response_file_uid"), SQLDataType.UUID, this, "");

    /**
     * The column
     * <code>passport_international.view_external_interaction.short_answer_cval</code>.
     */
    public final TableField<ViewExternalInteractionRecord, String> SHORT_ANSWER_CVAL = createField(DSL.name("short_answer_cval"), SQLDataType.VARCHAR(256), this, "");

    private ViewExternalInteraction(Name alias, Table<ViewExternalInteractionRecord> aliased) {
        this(alias, aliased, null);
    }

    private ViewExternalInteraction(Name alias, Table<ViewExternalInteractionRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "view_external_interaction" as  SELECT external_interaction.external_interaction_id,
         external_interaction.core_case_id,
         external_interaction.system_id,
         external_interaction.interaction_type_id,
         external_interaction.create_dt,
         external_interaction.request_dt,
         external_interaction.response_dt,
         external_interaction.check_dt,
         external_interaction.response_cval,
         external_interaction.version,
         external_interaction.create_dttm,
         external_interaction.modify_dttm,
         external_interaction.action_ind,
         external_interaction.request_cval,
         external_interaction.interaction_subtype_id AS interaction_other_type_id,
         external_interaction.response_file_uuid AS response_file_uid,
         external_interaction.short_smev_answer_cval AS short_answer_cval
        FROM external_interaction;
        """));
    }

    /**
     * Create an aliased
     * <code>passport_international.view_external_interaction</code> table
     * reference
     */
    public ViewExternalInteraction(String alias) {
        this(DSL.name(alias), VIEW_EXTERNAL_INTERACTION);
    }

    /**
     * Create an aliased
     * <code>passport_international.view_external_interaction</code> table
     * reference
     */
    public ViewExternalInteraction(Name alias) {
        this(alias, VIEW_EXTERNAL_INTERACTION);
    }

    /**
     * Create a <code>passport_international.view_external_interaction</code>
     * table reference
     */
    public ViewExternalInteraction() {
        this(DSL.name("view_external_interaction"), null);
    }

    public <O extends Record> ViewExternalInteraction(Table<O> child, ForeignKey<O, ViewExternalInteractionRecord> key) {
        super(child, key, VIEW_EXTERNAL_INTERACTION);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public ViewExternalInteraction as(String alias) {
        return new ViewExternalInteraction(DSL.name(alias), this);
    }

    @Override
    public ViewExternalInteraction as(Name alias) {
        return new ViewExternalInteraction(alias, this);
    }

    @Override
    public ViewExternalInteraction as(Table<?> alias) {
        return new ViewExternalInteraction(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewExternalInteraction rename(String name) {
        return new ViewExternalInteraction(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewExternalInteraction rename(Name name) {
        return new ViewExternalInteraction(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public ViewExternalInteraction rename(Table<?> name) {
        return new ViewExternalInteraction(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row17 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Long, Long, Long, OffsetDateTime, OffsetDateTime, OffsetDateTime, OffsetDateTime, String, Integer, OffsetDateTime, OffsetDateTime, String, String, Long, UUID, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function17<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Integer, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super Long, ? super UUID, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function17<? super Long, ? super Long, ? super Long, ? super Long, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super Integer, ? super OffsetDateTime, ? super OffsetDateTime, ? super String, ? super String, ? super Long, ? super UUID, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}