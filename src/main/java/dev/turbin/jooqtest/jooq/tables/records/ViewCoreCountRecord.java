/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewCoreCount;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCoreCountRecord extends TableRecordImpl<ViewCoreCountRecord> implements Record9<Long, String, String, Integer, String, Long, LocalDateTime, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_core_count.core_count_id</code>.
     */
    public void setCoreCountId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.core_count_id</code>.
     */
    public Long getCoreCountId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.department_code</code>.
     */
    public void setDepartmentCode(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.department_code</code>.
     */
    public String getDepartmentCode() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.region_code</code>.
     */
    public void setRegionCode(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.region_code</code>.
     */
    public String getRegionCode() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.issue_year_version</code>.
     */
    public void setIssueYearVersion(Integer value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.issue_year_version</code>.
     */
    public Integer getIssueYearVersion() {
        return (Integer) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.operation_code</code>.
     */
    public void setOperationCode(String value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.operation_code</code>.
     */
    public String getOperationCode() {
        return (String) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.last_serial_no_id</code>.
     */
    public void setLastSerialNoId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.last_serial_no_id</code>.
     */
    public Long getLastSerialNoId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.create_dttm</code>.
     */
    public void setCreateDttm(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.create_dttm</code>.
     */
    public LocalDateTime getCreateDttm() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.modify_dttm</code>.
     */
    public void setModifyDttm(LocalDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.modify_dttm</code>.
     */
    public LocalDateTime getModifyDttm() {
        return (LocalDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_count.action_ind</code>.
     */
    public void setActionInd(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_count.action_ind</code>.
     */
    public String getActionInd() {
        return (String) get(8);
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<Long, String, String, Integer, String, Long, LocalDateTime, LocalDateTime, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<Long, String, String, Integer, String, Long, LocalDateTime, LocalDateTime, String> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return ViewCoreCount.VIEW_CORE_COUNT.CORE_COUNT_ID;
    }

    @Override
    public Field<String> field2() {
        return ViewCoreCount.VIEW_CORE_COUNT.DEPARTMENT_CODE;
    }

    @Override
    public Field<String> field3() {
        return ViewCoreCount.VIEW_CORE_COUNT.REGION_CODE;
    }

    @Override
    public Field<Integer> field4() {
        return ViewCoreCount.VIEW_CORE_COUNT.ISSUE_YEAR_VERSION;
    }

    @Override
    public Field<String> field5() {
        return ViewCoreCount.VIEW_CORE_COUNT.OPERATION_CODE;
    }

    @Override
    public Field<Long> field6() {
        return ViewCoreCount.VIEW_CORE_COUNT.LAST_SERIAL_NO_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return ViewCoreCount.VIEW_CORE_COUNT.CREATE_DTTM;
    }

    @Override
    public Field<LocalDateTime> field8() {
        return ViewCoreCount.VIEW_CORE_COUNT.MODIFY_DTTM;
    }

    @Override
    public Field<String> field9() {
        return ViewCoreCount.VIEW_CORE_COUNT.ACTION_IND;
    }

    @Override
    public Long component1() {
        return getCoreCountId();
    }

    @Override
    public String component2() {
        return getDepartmentCode();
    }

    @Override
    public String component3() {
        return getRegionCode();
    }

    @Override
    public Integer component4() {
        return getIssueYearVersion();
    }

    @Override
    public String component5() {
        return getOperationCode();
    }

    @Override
    public Long component6() {
        return getLastSerialNoId();
    }

    @Override
    public LocalDateTime component7() {
        return getCreateDttm();
    }

    @Override
    public LocalDateTime component8() {
        return getModifyDttm();
    }

    @Override
    public String component9() {
        return getActionInd();
    }

    @Override
    public Long value1() {
        return getCoreCountId();
    }

    @Override
    public String value2() {
        return getDepartmentCode();
    }

    @Override
    public String value3() {
        return getRegionCode();
    }

    @Override
    public Integer value4() {
        return getIssueYearVersion();
    }

    @Override
    public String value5() {
        return getOperationCode();
    }

    @Override
    public Long value6() {
        return getLastSerialNoId();
    }

    @Override
    public LocalDateTime value7() {
        return getCreateDttm();
    }

    @Override
    public LocalDateTime value8() {
        return getModifyDttm();
    }

    @Override
    public String value9() {
        return getActionInd();
    }

    @Override
    public ViewCoreCountRecord value1(Long value) {
        setCoreCountId(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value2(String value) {
        setDepartmentCode(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value3(String value) {
        setRegionCode(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value4(Integer value) {
        setIssueYearVersion(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value5(String value) {
        setOperationCode(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value6(Long value) {
        setLastSerialNoId(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value7(LocalDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value8(LocalDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord value9(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public ViewCoreCountRecord values(Long value1, String value2, String value3, Integer value4, String value5, Long value6, LocalDateTime value7, LocalDateTime value8, String value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewCoreCountRecord
     */
    public ViewCoreCountRecord() {
        super(ViewCoreCount.VIEW_CORE_COUNT);
    }

    /**
     * Create a detached, initialised ViewCoreCountRecord
     */
    public ViewCoreCountRecord(Long coreCountId, String departmentCode, String regionCode, Integer issueYearVersion, String operationCode, Long lastSerialNoId, LocalDateTime createDttm, LocalDateTime modifyDttm, String actionInd) {
        super(ViewCoreCount.VIEW_CORE_COUNT);

        setCoreCountId(coreCountId);
        setDepartmentCode(departmentCode);
        setRegionCode(regionCode);
        setIssueYearVersion(issueYearVersion);
        setOperationCode(operationCode);
        setLastSerialNoId(lastSerialNoId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        resetChangedOnNotNull();
    }
}
