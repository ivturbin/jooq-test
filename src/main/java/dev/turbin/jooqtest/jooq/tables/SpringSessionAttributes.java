/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables;


import dev.turbin.jooqtest.jooq.Keys;
import dev.turbin.jooqtest.jooq.PassportInternational;
import dev.turbin.jooqtest.jooq.tables.records.SpringSessionAttributesRecord;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function3;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row3;
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
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class SpringSessionAttributes extends TableImpl<SpringSessionAttributesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>passport_international.spring_session_attributes</code>
     */
    public static final SpringSessionAttributes SPRING_SESSION_ATTRIBUTES = new SpringSessionAttributes();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SpringSessionAttributesRecord> getRecordType() {
        return SpringSessionAttributesRecord.class;
    }

    /**
     * The column
     * <code>passport_international.spring_session_attributes.session_primary_id</code>.
     */
    public final TableField<SpringSessionAttributesRecord, String> SESSION_PRIMARY_ID = createField(DSL.name("session_primary_id"), SQLDataType.CHAR(36).nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.spring_session_attributes.attribute_name</code>.
     */
    public final TableField<SpringSessionAttributesRecord, String> ATTRIBUTE_NAME = createField(DSL.name("attribute_name"), SQLDataType.VARCHAR(200).nullable(false), this, "");

    /**
     * The column
     * <code>passport_international.spring_session_attributes.attribute_bytes</code>.
     */
    public final TableField<SpringSessionAttributesRecord, byte[]> ATTRIBUTE_BYTES = createField(DSL.name("attribute_bytes"), SQLDataType.BLOB.nullable(false), this, "");

    private SpringSessionAttributes(Name alias, Table<SpringSessionAttributesRecord> aliased) {
        this(alias, aliased, null);
    }

    private SpringSessionAttributes(Name alias, Table<SpringSessionAttributesRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased
     * <code>passport_international.spring_session_attributes</code> table
     * reference
     */
    public SpringSessionAttributes(String alias) {
        this(DSL.name(alias), SPRING_SESSION_ATTRIBUTES);
    }

    /**
     * Create an aliased
     * <code>passport_international.spring_session_attributes</code> table
     * reference
     */
    public SpringSessionAttributes(Name alias) {
        this(alias, SPRING_SESSION_ATTRIBUTES);
    }

    /**
     * Create a <code>passport_international.spring_session_attributes</code>
     * table reference
     */
    public SpringSessionAttributes() {
        this(DSL.name("spring_session_attributes"), null);
    }

    public <O extends Record> SpringSessionAttributes(Table<O> child, ForeignKey<O, SpringSessionAttributesRecord> key) {
        super(child, key, SPRING_SESSION_ATTRIBUTES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PassportInternational.PASSPORT_INTERNATIONAL;
    }

    @Override
    public UniqueKey<SpringSessionAttributesRecord> getPrimaryKey() {
        return Keys.SPRING_SESSION_ATTRIBUTES_PK;
    }

    @Override
    public List<ForeignKey<SpringSessionAttributesRecord, ?>> getReferences() {
        return Arrays.asList(Keys.SPRING_SESSION_ATTRIBUTES__SPRING_SESSION_ATTRIBUTES_FK);
    }

    private transient SpringSession _springSession;

    /**
     * Get the implicit join path to the
     * <code>passport_international.spring_session</code> table.
     */
    public SpringSession springSession() {
        if (_springSession == null)
            _springSession = new SpringSession(this, Keys.SPRING_SESSION_ATTRIBUTES__SPRING_SESSION_ATTRIBUTES_FK);

        return _springSession;
    }

    @Override
    public SpringSessionAttributes as(String alias) {
        return new SpringSessionAttributes(DSL.name(alias), this);
    }

    @Override
    public SpringSessionAttributes as(Name alias) {
        return new SpringSessionAttributes(alias, this);
    }

    @Override
    public SpringSessionAttributes as(Table<?> alias) {
        return new SpringSessionAttributes(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public SpringSessionAttributes rename(String name) {
        return new SpringSessionAttributes(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpringSessionAttributes rename(Name name) {
        return new SpringSessionAttributes(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public SpringSessionAttributes rename(Table<?> name) {
        return new SpringSessionAttributes(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row3 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row3<String, String, byte[]> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function3<? super String, ? super String, ? super byte[], ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function3<? super String, ? super String, ? super byte[], ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
