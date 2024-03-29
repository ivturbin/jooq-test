/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewCoreResponse;

import java.time.OffsetDateTime;
import java.util.UUID;

import org.jooq.Field;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCoreResponseRecord extends TableRecordImpl<ViewCoreResponseRecord> implements Record7<Long, Long, UUID, String, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_core_response.core_response_id</code>.
     */
    public void setCoreResponseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.core_response_id</code>.
     */
    public Long getCoreResponseId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_response.core_request_id</code>.
     */
    public void setCoreRequestId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.core_request_id</code>.
     */
    public Long getCoreRequestId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_response.request_uid</code>.
     */
    public void setRequestUid(UUID value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.request_uid</code>.
     */
    public UUID getRequestUid() {
        return (UUID) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_response.response_value_cval</code>.
     */
    public void setResponseValueCval(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.response_value_cval</code>.
     */
    public String getResponseValueCval() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_response.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_response.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_response.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_response.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<Long, Long, UUID, String, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<Long, Long, UUID, String, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.CORE_RESPONSE_ID;
    }

    @Override
    public Field<Long> field2() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.CORE_REQUEST_ID;
    }

    @Override
    public Field<UUID> field3() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.REQUEST_UID;
    }

    @Override
    public Field<String> field4() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.RESPONSE_VALUE_CVAL;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.MODIFY_DTTM;
    }

    @Override
    public Field<String> field7() {
        return ViewCoreResponse.VIEW_CORE_RESPONSE.ACTION_IND;
    }

    @Override
    public Long component1() {
        return getCoreResponseId();
    }

    @Override
    public Long component2() {
        return getCoreRequestId();
    }

    @Override
    public UUID component3() {
        return getRequestUid();
    }

    @Override
    public String component4() {
        return getResponseValueCval();
    }

    @Override
    public OffsetDateTime component5() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component6() {
        return getModifyDttm();
    }

    @Override
    public String component7() {
        return getActionInd();
    }

    @Override
    public Long value1() {
        return getCoreResponseId();
    }

    @Override
    public Long value2() {
        return getCoreRequestId();
    }

    @Override
    public UUID value3() {
        return getRequestUid();
    }

    @Override
    public String value4() {
        return getResponseValueCval();
    }

    @Override
    public OffsetDateTime value5() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value6() {
        return getModifyDttm();
    }

    @Override
    public String value7() {
        return getActionInd();
    }

    @Override
    public ViewCoreResponseRecord value1(Long value) {
        setCoreResponseId(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord value2(Long value) {
        setCoreRequestId(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord value3(UUID value) {
        setRequestUid(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord value4(String value) {
        setResponseValueCval(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord value5(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord value6(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord value7(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public ViewCoreResponseRecord values(Long value1, Long value2, UUID value3, String value4, OffsetDateTime value5, OffsetDateTime value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewCoreResponseRecord
     */
    public ViewCoreResponseRecord() {
        super(ViewCoreResponse.VIEW_CORE_RESPONSE);
    }

    /**
     * Create a detached, initialised ViewCoreResponseRecord
     */
    public ViewCoreResponseRecord(Long coreResponseId, Long coreRequestId, UUID requestUid, String responseValueCval, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd) {
        super(ViewCoreResponse.VIEW_CORE_RESPONSE);

        setCoreResponseId(coreResponseId);
        setCoreRequestId(coreRequestId);
        setRequestUid(requestUid);
        setResponseValueCval(responseValueCval);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        resetChangedOnNotNull();
    }
}