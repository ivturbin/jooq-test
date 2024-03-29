/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseIssue;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewFpaCaseIssueRecord extends TableRecordImpl<ViewFpaCaseIssueRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.fpa_case_issue_id</code>.
     */
    public void setFpaCaseIssueId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.fpa_case_issue_id</code>.
     */
    public Long getFpaCaseIssueId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.preferential_category_bool</code>.
     */
    public void setPreferentialCategoryBool(Boolean value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.preferential_category_bool</code>.
     */
    public Boolean getPreferentialCategoryBool() {
        return (Boolean) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.application_place_id</code>.
     * Тип места обращения
     */
    public void setApplicationPlaceId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.application_place_id</code>.
     * Тип места обращения
     */
    public Long getApplicationPlaceId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.secret_access_id</code>.
     * Имеется ли допуск к секретным сведениям
     */
    public void setSecretAccessId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.secret_access_id</code>.
     * Имеется ли допуск к секретным сведениям
     */
    public Long getSecretAccessId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.contract_due_id</code>.
     */
    public void setContractDueId(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.contract_due_id</code>.
     */
    public Long getContractDueId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.application_reason_id</code>.
     * Цель получения (ЗАПОЛНЕНИЕ ПОЛЯ ОТМЕНЕНО)
     */
    public void setApplicationReasonId(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.application_reason_id</code>.
     * Цель получения (ЗАПОЛНЕНИЕ ПОЛЯ ОТМЕНЕНО)
     */
    public Long getApplicationReasonId() {
        return (Long) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.application_urgency_reason_id</code>.
     */
    public void setApplicationUrgencyReasonId(Long value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.application_urgency_reason_id</code>.
     */
    public Long getApplicationUrgencyReasonId() {
        return (Long) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.additional_citizenship_id</code>.
     */
    public void setAdditionalCitizenshipId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.additional_citizenship_id</code>.
     */
    public Long getAdditionalCitizenshipId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.target_country_id</code>.
     * Страна выезда на ПМЖ
     */
    public void setTargetCountryId(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.target_country_id</code>.
     * Страна выезда на ПМЖ
     */
    public Long getTargetCountryId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.applicant_category_id</code>.
     * Категория заявителя
     */
    public void setApplicantCategoryId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.applicant_category_id</code>.
     * Категория заявителя
     */
    public Long getApplicantCategoryId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.issue_dt</code>. Дата
     * фактической выдачи паспорта
     */
    public void setIssueDt(LocalDate value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.issue_dt</code>. Дата
     * фактической выдачи паспорта
     */
    public LocalDate getIssueDt() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.secret_access_dt</code>.
     * Дата оформления допуска к секретным сведениям
     */
    public void setSecretAccessDt(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.secret_access_dt</code>.
     * Дата оформления допуска к секретным сведениям
     */
    public LocalDate getSecretAccessDt() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.contract_due_dt</code>.
     */
    public void setContractDueDt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.contract_due_dt</code>.
     */
    public LocalDate getContractDueDt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.blank_receipt_dt</code>.
     * Дата получения бланка
     */
    public void setBlankReceiptDt(LocalDate value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.blank_receipt_dt</code>.
     * Дата получения бланка
     */
    public LocalDate getBlankReceiptDt() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.secret_access_organization_name</code>.
     */
    public void setSecretAccessOrganizationName(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.secret_access_organization_name</code>.
     */
    public String getSecretAccessOrganizationName() {
        return (String) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.contract_due_organization_name</code>.
     */
    public void setContractDueOrganizationName(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.contract_due_organization_name</code>.
     */
    public String getContractDueOrganizationName() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(19);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(20);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(21, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(21);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.sign_user</code>.
     */
    public void setSignUser(String value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.sign_user</code>.
     */
    public String getSignUser() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.reason_issue_id</code>.
     * Причина выдачи заграна
     */
    public void setReasonIssueId(Long value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.reason_issue_id</code>.
     * Причина выдачи заграна
     */
    public Long getReasonIssueId() {
        return (Long) get(23);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.convicted_bool</code>.
     */
    public void setConvictedBool(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.convicted_bool</code>.
     */
    public Boolean getConvictedBool() {
        return (Boolean) get(24);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.military_contract_bool</code>.
     */
    public void setMilitaryContractBool(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.military_contract_bool</code>.
     */
    public Boolean getMilitaryContractBool() {
        return (Boolean) get(25);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.suspect_bool</code>.
     */
    public void setSuspectBool(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.suspect_bool</code>.
     */
    public Boolean getSuspectBool() {
        return (Boolean) get(26);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.court_due_violation_bool</code>.
     */
    public void setCourtDueViolationBool(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.court_due_violation_bool</code>.
     */
    public Boolean getCourtDueViolationBool() {
        return (Boolean) get(27);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.bankrupt_bool</code>.
     */
    public void setBankruptBool(Boolean value) {
        set(28, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.bankrupt_bool</code>.
     */
    public Boolean getBankruptBool() {
        return (Boolean) get(28);
    }

    /**
     * Setter for
     * <code>passport_international.view_fpa_case_issue.type_applicant_id</code>.
     * Вид заявления (от совершенолетнего или от несовершеннолетнего)
     */
    public void setTypeApplicantId(Long value) {
        set(29, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_fpa_case_issue.type_applicant_id</code>.
     * Вид заявления (от совершенолетнего или от несовершеннолетнего)
     */
    public Long getTypeApplicantId() {
        return (Long) get(29);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewFpaCaseIssueRecord
     */
    public ViewFpaCaseIssueRecord() {
        super(ViewFpaCaseIssue.VIEW_FPA_CASE_ISSUE);
    }

    /**
     * Create a detached, initialised ViewFpaCaseIssueRecord
     */
    public ViewFpaCaseIssueRecord(Long fpaCaseIssueId, Boolean preferentialCategoryBool, Long applicationPlaceId, Long secretAccessId, Long contractDueId, Long applicationReasonId, Long applicationUrgencyReasonId, Long additionalCitizenshipId, Long targetCountryId, Long applicantCategoryId, LocalDate issueDt, LocalDate secretAccessDt, LocalDate contractDueDt, LocalDate blankReceiptDt, String secretAccessOrganizationName, String contractDueOrganizationName, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, OffsetDateTime effDttm, OffsetDateTime expDttm, String actionInd, String signUser, Long reasonIssueId, Boolean convictedBool, Boolean militaryContractBool, Boolean suspectBool, Boolean courtDueViolationBool, Boolean bankruptBool, Long typeApplicantId) {
        super(ViewFpaCaseIssue.VIEW_FPA_CASE_ISSUE);

        setFpaCaseIssueId(fpaCaseIssueId);
        setPreferentialCategoryBool(preferentialCategoryBool);
        setApplicationPlaceId(applicationPlaceId);
        setSecretAccessId(secretAccessId);
        setContractDueId(contractDueId);
        setApplicationReasonId(applicationReasonId);
        setApplicationUrgencyReasonId(applicationUrgencyReasonId);
        setAdditionalCitizenshipId(additionalCitizenshipId);
        setTargetCountryId(targetCountryId);
        setApplicantCategoryId(applicantCategoryId);
        setIssueDt(issueDt);
        setSecretAccessDt(secretAccessDt);
        setContractDueDt(contractDueDt);
        setBlankReceiptDt(blankReceiptDt);
        setSecretAccessOrganizationName(secretAccessOrganizationName);
        setContractDueOrganizationName(contractDueOrganizationName);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setActionInd(actionInd);
        setSignUser(signUser);
        setReasonIssueId(reasonIssueId);
        setConvictedBool(convictedBool);
        setMilitaryContractBool(militaryContractBool);
        setSuspectBool(suspectBool);
        setCourtDueViolationBool(courtDueViolationBool);
        setBankruptBool(bankruptBool);
        setTypeApplicantId(typeApplicantId);
        resetChangedOnNotNull();
    }
}
