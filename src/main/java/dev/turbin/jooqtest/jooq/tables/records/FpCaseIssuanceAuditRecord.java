/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCaseIssuanceAudit;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица версионирования fp_case_issuance
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseIssuanceAuditRecord extends UpdatableRecordImpl<FpCaseIssuanceAuditRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.fp_case_issuance_audit.id</code>.
     * Идентификатор "fp_case_issuance_audit" с данными коррекции
     */
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.fp_case_issuance_audit.id</code>.
     * Идентификатор "fp_case_issuance_audit" с данными коррекции
     */
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public void setRecordId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.record_id</code>.
     * Внешний ключ на запись в таблице-мастере
     */
    public Long getRecordId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public void setCorrectionLogId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.correction_log_id</code>.
     * Идентификатор лога коррекции дела
     */
    public Long getCorrectionLogId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public void setUpdateUser(String value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.update_user</code>.
     * Пользователь, скорректировавший дело
     */
    public String getUpdateUser() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public void setEffDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.eff_dttm</code>. Дата
     * начала действия версии
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public void setExpDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.exp_dttm</code>. Дата
     * окончания действия версии
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.preferential_category</code>.
     */
    public void setPreferentialCategory(Boolean value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.preferential_category</code>.
     */
    public Boolean getPreferentialCategory() {
        return (Boolean) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.application_place_id</code>.
     */
    public void setApplicationPlaceId(Long value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.application_place_id</code>.
     */
    public Long getApplicationPlaceId() {
        return (Long) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.secret_access_id</code>.
     */
    public void setSecretAccessId(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.secret_access_id</code>.
     */
    public Long getSecretAccessId() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.contract_obligation_id</code>.
     */
    public void setContractObligationId(Long value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.contract_obligation_id</code>.
     */
    public Long getContractObligationId() {
        return (Long) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.application_reason_id</code>.
     */
    public void setApplicationReasonId(Long value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.application_reason_id</code>.
     */
    public Long getApplicationReasonId() {
        return (Long) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.application_urgent_reason_id</code>.
     */
    public void setApplicationUrgentReasonId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.application_urgent_reason_id</code>.
     */
    public Long getApplicationUrgentReasonId() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.addit_citizenship_id</code>.
     */
    public void setAdditCitizenshipId(Long value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.addit_citizenship_id</code>.
     */
    public Long getAdditCitizenshipId() {
        return (Long) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.target_country_id</code>.
     */
    public void setTargetCountryId(Long value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.target_country_id</code>.
     */
    public Long getTargetCountryId() {
        return (Long) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.applicant_category_id</code>.
     */
    public void setApplicantCategoryId(Long value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.applicant_category_id</code>.
     */
    public Long getApplicantCategoryId() {
        return (Long) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.issue_dt</code>.
     */
    public void setIssueDt(LocalDate value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.issue_dt</code>.
     */
    public LocalDate getIssueDt() {
        return (LocalDate) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.secret_access_dt</code>.
     */
    public void setSecretAccessDt(LocalDate value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.secret_access_dt</code>.
     */
    public LocalDate getSecretAccessDt() {
        return (LocalDate) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.contract_obligation_dt</code>.
     */
    public void setContractObligationDt(LocalDate value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.contract_obligation_dt</code>.
     */
    public LocalDate getContractObligationDt() {
        return (LocalDate) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.blank_receipt_dt</code>.
     */
    public void setBlankReceiptDt(LocalDate value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.blank_receipt_dt</code>.
     */
    public LocalDate getBlankReceiptDt() {
        return (LocalDate) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.secret_access_org_name</code>.
     */
    public void setSecretAccessOrgName(String value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.secret_access_org_name</code>.
     */
    public String getSecretAccessOrgName() {
        return (String) get(19);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.contract_obligation_org_name</code>.
     */
    public void setContractObligationOrgName(String value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.contract_obligation_org_name</code>.
     */
    public String getContractObligationOrgName() {
        return (String) get(20);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.signer</code>.
     */
    public void setSigner(String value) {
        set(21, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.signer</code>.
     */
    public String getSigner() {
        return (String) get(21);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.reason_issue_id</code>.
     */
    public void setReasonIssueId(Long value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.reason_issue_id</code>.
     */
    public Long getReasonIssueId() {
        return (Long) get(22);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.convicted</code>.
     */
    public void setConvicted(Boolean value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.convicted</code>.
     */
    public Boolean getConvicted() {
        return (Boolean) get(23);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.military_contract</code>.
     */
    public void setMilitaryContract(Boolean value) {
        set(24, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.military_contract</code>.
     */
    public Boolean getMilitaryContract() {
        return (Boolean) get(24);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.suspect</code>.
     */
    public void setSuspect(Boolean value) {
        set(25, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.suspect</code>.
     */
    public Boolean getSuspect() {
        return (Boolean) get(25);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.court_obligation_avoided</code>.
     */
    public void setCourtObligationAvoided(Boolean value) {
        set(26, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.court_obligation_avoided</code>.
     */
    public Boolean getCourtObligationAvoided() {
        return (Boolean) get(26);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.bankrupt</code>.
     */
    public void setBankrupt(Boolean value) {
        set(27, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.bankrupt</code>.
     */
    public Boolean getBankrupt() {
        return (Boolean) get(27);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_issuance_audit.type_applicant_id</code>.
     */
    public void setTypeApplicantId(Long value) {
        set(28, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_issuance_audit.type_applicant_id</code>.
     */
    public Long getTypeApplicantId() {
        return (Long) get(28);
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
     * Create a detached FpCaseIssuanceAuditRecord
     */
    public FpCaseIssuanceAuditRecord() {
        super(FpCaseIssuanceAudit.FP_CASE_ISSUANCE_AUDIT);
    }

    /**
     * Create a detached, initialised FpCaseIssuanceAuditRecord
     */
    public FpCaseIssuanceAuditRecord(Long id, Long recordId, Long correctionLogId, String updateUser, OffsetDateTime effDttm, OffsetDateTime expDttm, Boolean preferentialCategory, Long applicationPlaceId, Long secretAccessId, Long contractObligationId, Long applicationReasonId, Long applicationUrgentReasonId, Long additCitizenshipId, Long targetCountryId, Long applicantCategoryId, LocalDate issueDt, LocalDate secretAccessDt, LocalDate contractObligationDt, LocalDate blankReceiptDt, String secretAccessOrgName, String contractObligationOrgName, String signer, Long reasonIssueId, Boolean convicted, Boolean militaryContract, Boolean suspect, Boolean courtObligationAvoided, Boolean bankrupt, Long typeApplicantId) {
        super(FpCaseIssuanceAudit.FP_CASE_ISSUANCE_AUDIT);

        setId(id);
        setRecordId(recordId);
        setCorrectionLogId(correctionLogId);
        setUpdateUser(updateUser);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setPreferentialCategory(preferentialCategory);
        setApplicationPlaceId(applicationPlaceId);
        setSecretAccessId(secretAccessId);
        setContractObligationId(contractObligationId);
        setApplicationReasonId(applicationReasonId);
        setApplicationUrgentReasonId(applicationUrgentReasonId);
        setAdditCitizenshipId(additCitizenshipId);
        setTargetCountryId(targetCountryId);
        setApplicantCategoryId(applicantCategoryId);
        setIssueDt(issueDt);
        setSecretAccessDt(secretAccessDt);
        setContractObligationDt(contractObligationDt);
        setBlankReceiptDt(blankReceiptDt);
        setSecretAccessOrgName(secretAccessOrgName);
        setContractObligationOrgName(contractObligationOrgName);
        setSigner(signer);
        setReasonIssueId(reasonIssueId);
        setConvicted(convicted);
        setMilitaryContract(militaryContract);
        setSuspect(suspect);
        setCourtObligationAvoided(courtObligationAvoided);
        setBankrupt(bankrupt);
        setTypeApplicantId(typeApplicantId);
        resetChangedOnNotNull();
    }
}