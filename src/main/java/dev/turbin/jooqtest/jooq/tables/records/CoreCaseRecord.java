/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CoreCase;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Базовый класс дела о предоставлении услуги
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreCaseRecord extends UpdatableRecordImpl<CoreCaseRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.core_case.core_case_id</code>.
     * Идентификатор базового дела ГИСМУ
     */
    public void setCoreCaseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.core_case.core_case_id</code>.
     * Идентификатор базового дела ГИСМУ
     */
    public Long getCoreCaseId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.core_case.version</code>.
     * Реализация оптимистической блокировки
     */
    public void setVersion(Integer value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.core_case.version</code>.
     * Реализация оптимистической блокировки
     */
    public Integer getVersion() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>passport_international.core_case.invalid_id</code>.
     * Признак корректности дела: 0 - корректное, 1 - отменено, 2 - скрытое
     */
    public void setInvalidId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.core_case.invalid_id</code>.
     * Признак корректности дела: 0 - корректное, 1 - отменено, 2 - скрытое
     */
    public Long getInvalidId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.in_checklist_bool</code>.
     * Заявитель находится в контрольном списке, если 1
     */
    public void setInChecklistBool(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.in_checklist_bool</code>.
     * Заявитель находится в контрольном списке, если 1
     */
    public Boolean getInChecklistBool() {
        return (Boolean) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.data_corrected_code_nval</code>.
     * Признак корректировки основных объектов учета дела. Битовая маска: 1 -
     * УД/ДУЛ ФЛ, 2 - УД/ДОС ЮЛ, 4 - адрес ФЛ, 8 - адрес ЮЛ
     */
    public void setDataCorrectedCodeNval(BigDecimal value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.data_corrected_code_nval</code>.
     * Признак корректировки основных объектов учета дела. Битовая маска: 1 -
     * УД/ДУЛ ФЛ, 2 - УД/ДОС ЮЛ, 4 - адрес ФЛ, 8 - адрес ЮЛ
     */
    public BigDecimal getDataCorrectedCodeNval() {
        return (BigDecimal) get(4);
    }

    /**
     * Setter for <code>passport_international.core_case.from_draft_bool</code>.
     * Дело создано из черновика заявления (очищаемая таблица EXS_DRAFT_CASE),
     * если 1
     */
    public void setFromDraftBool(Boolean value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.core_case.from_draft_bool</code>.
     * Дело создано из черновика заявления (очищаемая таблица EXS_DRAFT_CASE),
     * если 1
     */
    public Boolean getFromDraftBool() {
        return (Boolean) get(5);
    }

    /**
     * Setter for <code>passport_international.core_case.case_type_id</code>.
     * Тип дела
     */
    public void setCaseTypeId(Long value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.core_case.case_type_id</code>.
     * Тип дела
     */
    public Long getCaseTypeId() {
        return (Long) get(6);
    }

    /**
     * Setter for <code>passport_international.core_case.department_id</code>.
     * Подразделение в котором заводили дело
     */
    public void setDepartmentId(Long value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.core_case.department_id</code>.
     * Подразделение в котором заводили дело
     */
    public Long getDepartmentId() {
        return (Long) get(7);
    }

    /**
     * Setter for <code>passport_international.core_case.case_status_id</code>.
     * Статус дела
     */
    public void setCaseStatusId(Long value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.core_case.case_status_id</code>.
     * Статус дела
     */
    public Long getCaseStatusId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.create_supplier_id</code>.
     * Идентификатор поставщика, в системе которого создано дело
     */
    public void setCreateSupplierId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.create_supplier_id</code>.
     * Идентификатор поставщика, в системе которого создано дело
     */
    public Long getCreateSupplierId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.reception_supplier_id</code>.
     * Идентификатор поставщика данных для дела
     */
    public void setReceptionSupplierId(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.reception_supplier_id</code>.
     * Идентификатор поставщика данных для дела
     */
    public Long getReceptionSupplierId() {
        return (Long) get(10);
    }

    /**
     * Setter for <code>passport_international.core_case.reception_dt</code>.
     * Дата и время приема заявления
     */
    public void setReceptionDt(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for <code>passport_international.core_case.reception_dt</code>.
     * Дата и время приема заявления
     */
    public LocalDate getReceptionDt() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for <code>passport_international.core_case.invalid_dt</code>. Дата
     * инвалидации дела
     */
    public void setInvalidDt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for <code>passport_international.core_case.invalid_dt</code>. Дата
     * инвалидации дела
     */
    public LocalDate getInvalidDt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>passport_international.core_case.cessation_dt</code>.
     * Дата прекращения дела
     */
    public void setCessationDt(LocalDate value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.core_case.cessation_dt</code>.
     * Дата прекращения дела
     */
    public LocalDate getCessationDt() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for <code>passport_international.core_case.parent_case_id</code>.
     * Идентификатор родительского дела
     */
    public void setParentCaseId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>passport_international.core_case.parent_case_id</code>.
     * Идентификатор родительского дела
     */
    public Long getParentCaseId() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.cessation_reason_id</code>.
     * Причина прекращения дела
     */
    public void setCessationReasonId(Long value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.cessation_reason_id</code>.
     * Причина прекращения дела
     */
    public Long getCessationReasonId() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>passport_international.core_case.cessation_user</code>.
     * Пользователь, прекративший дело
     */
    public void setCessationUser(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>passport_international.core_case.cessation_user</code>.
     * Пользователь, прекративший дело
     */
    public String getCessationUser() {
        return (String) get(16);
    }

    /**
     * Setter for <code>passport_international.core_case.invalid_user</code>.
     * Пользователь, инвалидировавший дело
     */
    public void setInvalidUser(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>passport_international.core_case.invalid_user</code>.
     * Пользователь, инвалидировавший дело
     */
    public String getInvalidUser() {
        return (String) get(17);
    }

    /**
     * Setter for <code>passport_international.core_case.case_no</code>. Номер
     * дела
     */
    public void setCaseNo(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>passport_international.core_case.case_no</code>. Номер
     * дела
     */
    public String getCaseNo() {
        return (String) get(18);
    }

    /**
     * Setter for <code>passport_international.core_case.case_arc_no</code>.
     * Архивный номер дела
     */
    public void setCaseArcNo(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>passport_international.core_case.case_arc_no</code>.
     * Архивный номер дела
     */
    public String getCaseArcNo() {
        return (String) get(19);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.cessation_basis_desc</code>.
     * Основание прекращения дела
     */
    public void setCessationBasisDesc(String value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.cessation_basis_desc</code>.
     * Основание прекращения дела
     */
    public String getCessationBasisDesc() {
        return (String) get(20);
    }

    /**
     * Setter for <code>passport_international.core_case.comments_desc</code>.
     * Примечания
     */
    public void setCommentsDesc(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>passport_international.core_case.comments_desc</code>.
     * Примечания
     */
    public String getCommentsDesc() {
        return (String) get(21);
    }

    /**
     * Setter for <code>passport_international.core_case.case_reason_id</code>.
     * Причина оказания услуги
     */
    public void setCaseReasonId(Long value) {
        set(22, value);
    }

    /**
     * Getter for <code>passport_international.core_case.case_reason_id</code>.
     * Причина оказания услуги
     */
    public Long getCaseReasonId() {
        return (Long) get(22);
    }

    /**
     * Setter for <code>passport_international.core_case.person_id</code>.
     * Физлицо, которому оказывается услуга
     */
    public void setPersonId(Long value) {
        set(23, value);
    }

    /**
     * Getter for <code>passport_international.core_case.person_id</code>.
     * Физлицо, которому оказывается услуга
     */
    public Long getPersonId() {
        return (Long) get(23);
    }

    /**
     * Setter for <code>passport_international.core_case.cancelled_bool</code>.
     * Статус отменен (true) в результате отмены дела
     */
    public void setCancelledBool(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for <code>passport_international.core_case.cancelled_bool</code>.
     * Статус отменен (true) в результате отмены дела
     */
    public Boolean getCancelledBool() {
        return (Boolean) get(24);
    }

    /**
     * Setter for <code>passport_international.core_case.src_id</code>. Источник
     */
    public void setSrcId(Long value) {
        set(25, value);
    }

    /**
     * Getter for <code>passport_international.core_case.src_id</code>. Источник
     */
    public Long getSrcId() {
        return (Long) get(25);
    }

    /**
     * Setter for <code>passport_international.core_case.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(26, value);
    }

    /**
     * Getter for <code>passport_international.core_case.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(26);
    }

    /**
     * Setter for <code>passport_international.core_case.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(27, value);
    }

    /**
     * Getter for <code>passport_international.core_case.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(27);
    }

    /**
     * Setter for <code>passport_international.core_case.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(28, value);
    }

    /**
     * Getter for <code>passport_international.core_case.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(28);
    }

    /**
     * Setter for <code>passport_international.core_case.eff_dttm</code>. Дата
     * начала действия периода
     */
    public void setEffDttm(OffsetDateTime value) {
        set(29, value);
    }

    /**
     * Getter for <code>passport_international.core_case.eff_dttm</code>. Дата
     * начала действия периода
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(29);
    }

    /**
     * Setter for <code>passport_international.core_case.exp_dttm</code>. Дата
     * окончания действия периода
     */
    public void setExpDttm(OffsetDateTime value) {
        set(30, value);
    }

    /**
     * Getter for <code>passport_international.core_case.exp_dttm</code>. Дата
     * окончания действия периода
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(30);
    }

    /**
     * Setter for <code>passport_international.core_case.create_user</code>.
     * Пользователь создавший запись
     */
    public void setCreateUser(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>passport_international.core_case.create_user</code>.
     * Пользователь создавший запись
     */
    public String getCreateUser() {
        return (String) get(31);
    }

    /**
     * Setter for <code>passport_international.core_case.update_user</code>.
     * Пользователь обновивший запись
     */
    public void setUpdateUser(String value) {
        set(32, value);
    }

    /**
     * Getter for <code>passport_international.core_case.update_user</code>.
     * Пользователь обновивший запись
     */
    public String getUpdateUser() {
        return (String) get(32);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.person_status_id</code>. Статус
     * состояния физического лица
     */
    public void setPersonStatusId(Long value) {
        set(33, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.person_status_id</code>. Статус
     * состояния физического лица
     */
    public Long getPersonStatusId() {
        return (Long) get(33);
    }

    /**
     * Setter for <code>passport_international.core_case.department_code</code>.
     * Код департамента
     */
    public void setDepartmentCode(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>passport_international.core_case.department_code</code>.
     * Код департамента
     */
    public String getDepartmentCode() {
        return (String) get(34);
    }

    /**
     * Setter for
     * <code>passport_international.core_case.person_document_id</code>.
     * Идентификатор УД
     */
    public void setPersonDocumentId(Long value) {
        set(35, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_case.person_document_id</code>.
     * Идентификатор УД
     */
    public Long getPersonDocumentId() {
        return (Long) get(35);
    }

    /**
     * Setter for <code>passport_international.core_case.region_id</code>.
     * Регион
     */
    public void setRegionId(Long value) {
        set(36, value);
    }

    /**
     * Getter for <code>passport_international.core_case.region_id</code>.
     * Регион
     */
    public Long getRegionId() {
        return (Long) get(36);
    }

    /**
     * Setter for <code>passport_international.core_case.application_no</code>.
     * Номер заявления (Для загруженных)
     */
    public void setApplicationNo(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>passport_international.core_case.application_no</code>.
     * Номер заявления (Для загруженных)
     */
    public String getApplicationNo() {
        return (String) get(37);
    }

    /**
     * Setter for <code>passport_international.core_case.source_case_id</code>.
     * Идентификатор дела в источнике
     */
    public void setSourceCaseId(String value) {
        set(38, value);
    }

    /**
     * Getter for <code>passport_international.core_case.source_case_id</code>.
     * Идентификатор дела в источнике
     */
    public String getSourceCaseId() {
        return (String) get(38);
    }

    /**
     * Setter for <code>passport_international.core_case.source_id</code>.
     * Идентификатор источника
     */
    public void setSourceId(Long value) {
        set(39, value);
    }

    /**
     * Getter for <code>passport_international.core_case.source_id</code>.
     * Идентификатор источника
     */
    public Long getSourceId() {
        return (Long) get(39);
    }

    /**
     * Setter for <code>passport_international.core_case.federal_id</code>.
     * Идентификатор дела в ФУ
     */
    public void setFederalId(String value) {
        set(40, value);
    }

    /**
     * Getter for <code>passport_international.core_case.federal_id</code>.
     * Идентификатор дела в ФУ
     */
    public String getFederalId() {
        return (String) get(40);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreCaseRecord
     */
    public CoreCaseRecord() {
        super(CoreCase.CORE_CASE);
    }

    /**
     * Create a detached, initialised CoreCaseRecord
     */
    public CoreCaseRecord(Long coreCaseId, Integer version, Long invalidId, Boolean inChecklistBool, BigDecimal dataCorrectedCodeNval, Boolean fromDraftBool, Long caseTypeId, Long departmentId, Long caseStatusId, Long createSupplierId, Long receptionSupplierId, LocalDate receptionDt, LocalDate invalidDt, LocalDate cessationDt, Long parentCaseId, Long cessationReasonId, String cessationUser, String invalidUser, String caseNo, String caseArcNo, String cessationBasisDesc, String commentsDesc, Long caseReasonId, Long personId, Boolean cancelledBool, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, String createUser, String updateUser, Long personStatusId, String departmentCode, Long personDocumentId, Long regionId, String applicationNo, String sourceCaseId, Long sourceId, String federalId) {
        super(CoreCase.CORE_CASE);

        setCoreCaseId(coreCaseId);
        setVersion(version);
        setInvalidId(invalidId);
        setInChecklistBool(inChecklistBool);
        setDataCorrectedCodeNval(dataCorrectedCodeNval);
        setFromDraftBool(fromDraftBool);
        setCaseTypeId(caseTypeId);
        setDepartmentId(departmentId);
        setCaseStatusId(caseStatusId);
        setCreateSupplierId(createSupplierId);
        setReceptionSupplierId(receptionSupplierId);
        setReceptionDt(receptionDt);
        setInvalidDt(invalidDt);
        setCessationDt(cessationDt);
        setParentCaseId(parentCaseId);
        setCessationReasonId(cessationReasonId);
        setCessationUser(cessationUser);
        setInvalidUser(invalidUser);
        setCaseNo(caseNo);
        setCaseArcNo(caseArcNo);
        setCessationBasisDesc(cessationBasisDesc);
        setCommentsDesc(commentsDesc);
        setCaseReasonId(caseReasonId);
        setPersonId(personId);
        setCancelledBool(cancelledBool);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setCreateUser(createUser);
        setUpdateUser(updateUser);
        setPersonStatusId(personStatusId);
        setDepartmentCode(departmentCode);
        setPersonDocumentId(personDocumentId);
        setRegionId(regionId);
        setApplicationNo(applicationNo);
        setSourceCaseId(sourceCaseId);
        setSourceId(sourceId);
        setFederalId(federalId);
        resetChangedOnNotNull();
    }
}
