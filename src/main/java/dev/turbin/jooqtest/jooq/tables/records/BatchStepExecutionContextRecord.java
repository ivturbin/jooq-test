/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.BatchStepExecutionContext;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record3;
import org.jooq.Row3;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BatchStepExecutionContextRecord extends UpdatableRecordImpl<BatchStepExecutionContextRecord> implements Record3<Long, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.batch_step_execution_context.step_execution_id</code>.
     */
    public void setStepExecutionId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.batch_step_execution_context.step_execution_id</code>.
     */
    public Long getStepExecutionId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.batch_step_execution_context.short_context</code>.
     */
    public void setShortContext(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.batch_step_execution_context.short_context</code>.
     */
    public String getShortContext() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.batch_step_execution_context.serialized_context</code>.
     */
    public void setSerializedContext(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.batch_step_execution_context.serialized_context</code>.
     */
    public String getSerializedContext() {
        return (String) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record3 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row3<Long, String, String> fieldsRow() {
        return (Row3) super.fieldsRow();
    }

    @Override
    public Row3<Long, String, String> valuesRow() {
        return (Row3) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT.STEP_EXECUTION_ID;
    }

    @Override
    public Field<String> field2() {
        return BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT.SHORT_CONTEXT;
    }

    @Override
    public Field<String> field3() {
        return BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT.SERIALIZED_CONTEXT;
    }

    @Override
    public Long component1() {
        return getStepExecutionId();
    }

    @Override
    public String component2() {
        return getShortContext();
    }

    @Override
    public String component3() {
        return getSerializedContext();
    }

    @Override
    public Long value1() {
        return getStepExecutionId();
    }

    @Override
    public String value2() {
        return getShortContext();
    }

    @Override
    public String value3() {
        return getSerializedContext();
    }

    @Override
    public BatchStepExecutionContextRecord value1(Long value) {
        setStepExecutionId(value);
        return this;
    }

    @Override
    public BatchStepExecutionContextRecord value2(String value) {
        setShortContext(value);
        return this;
    }

    @Override
    public BatchStepExecutionContextRecord value3(String value) {
        setSerializedContext(value);
        return this;
    }

    @Override
    public BatchStepExecutionContextRecord values(Long value1, String value2, String value3) {
        value1(value1);
        value2(value2);
        value3(value3);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BatchStepExecutionContextRecord
     */
    public BatchStepExecutionContextRecord() {
        super(BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT);
    }

    /**
     * Create a detached, initialised BatchStepExecutionContextRecord
     */
    public BatchStepExecutionContextRecord(Long stepExecutionId, String shortContext, String serializedContext) {
        super(BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT);

        setStepExecutionId(stepExecutionId);
        setShortContext(shortContext);
        setSerializedContext(serializedContext);
        resetChangedOnNotNull();
    }
}
