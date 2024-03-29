/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewCorePersonHidden;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCorePersonHiddenRecord extends TableRecordImpl<ViewCorePersonHiddenRecord> implements Record6<Long, Boolean, LocalDate, OffsetDateTime, OffsetDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_core_person_hidden.core_person_hidden_id</code>.
     */
    public void setCorePersonHiddenId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_person_hidden.core_person_hidden_id</code>.
     */
    public Long getCorePersonHiddenId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_person_hidden.hidden_status_bool</code>.
     */
    public void setHiddenStatusBool(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_person_hidden.hidden_status_bool</code>.
     */
    public Boolean getHiddenStatusBool() {
        return (Boolean) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_person_hidden.start_dt</code>.
     */
    public void setStartDt(LocalDate value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_person_hidden.start_dt</code>.
     */
    public LocalDate getStartDt() {
        return (LocalDate) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_person_hidden.create_dttm</code>.
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_person_hidden.create_dttm</code>.
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_person_hidden.modify_dttm</code>.
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_person_hidden.modify_dttm</code>.
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_person_hidden.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_person_hidden.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(5);
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<Long, Boolean, LocalDate, OffsetDateTime, OffsetDateTime, String> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<Long, Boolean, LocalDate, OffsetDateTime, OffsetDateTime, String> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN.CORE_PERSON_HIDDEN_ID;
    }

    @Override
    public Field<Boolean> field2() {
        return ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN.HIDDEN_STATUS_BOOL;
    }

    @Override
    public Field<LocalDate> field3() {
        return ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN.START_DT;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN.MODIFY_DTTM;
    }

    @Override
    public Field<String> field6() {
        return ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN.ACTION_IND;
    }

    @Override
    public Long component1() {
        return getCorePersonHiddenId();
    }

    @Override
    public Boolean component2() {
        return getHiddenStatusBool();
    }

    @Override
    public LocalDate component3() {
        return getStartDt();
    }

    @Override
    public OffsetDateTime component4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component5() {
        return getModifyDttm();
    }

    @Override
    public String component6() {
        return getActionInd();
    }

    @Override
    public Long value1() {
        return getCorePersonHiddenId();
    }

    @Override
    public Boolean value2() {
        return getHiddenStatusBool();
    }

    @Override
    public LocalDate value3() {
        return getStartDt();
    }

    @Override
    public OffsetDateTime value4() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value5() {
        return getModifyDttm();
    }

    @Override
    public String value6() {
        return getActionInd();
    }

    @Override
    public ViewCorePersonHiddenRecord value1(Long value) {
        setCorePersonHiddenId(value);
        return this;
    }

    @Override
    public ViewCorePersonHiddenRecord value2(Boolean value) {
        setHiddenStatusBool(value);
        return this;
    }

    @Override
    public ViewCorePersonHiddenRecord value3(LocalDate value) {
        setStartDt(value);
        return this;
    }

    @Override
    public ViewCorePersonHiddenRecord value4(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public ViewCorePersonHiddenRecord value5(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public ViewCorePersonHiddenRecord value6(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public ViewCorePersonHiddenRecord values(Long value1, Boolean value2, LocalDate value3, OffsetDateTime value4, OffsetDateTime value5, String value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewCorePersonHiddenRecord
     */
    public ViewCorePersonHiddenRecord() {
        super(ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN);
    }

    /**
     * Create a detached, initialised ViewCorePersonHiddenRecord
     */
    public ViewCorePersonHiddenRecord(Long corePersonHiddenId, Boolean hiddenStatusBool, LocalDate startDt, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd) {
        super(ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN);

        setCorePersonHiddenId(corePersonHiddenId);
        setHiddenStatusBool(hiddenStatusBool);
        setStartDt(startDt);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        resetChangedOnNotNull();
    }
}
