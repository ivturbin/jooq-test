/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewCharge;

import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewChargeRecord extends TableRecordImpl<ViewChargeRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.view_charge.charge_id</code>.
     * Идентификатор записи
     */
    public void setChargeId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.charge_id</code>.
     * Идентификатор записи
     */
    public Long getChargeId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.view_charge.core_case_id</code>.
     */
    public void setCoreCaseId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.core_case_id</code>.
     */
    public Long getCoreCaseId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.supplier_bill_uin</code>.
     * Уникальный идентификатор начисления (УИН)
     */
    public void setSupplierBillUin(String value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.supplier_bill_uin</code>.
     * Уникальный идентификатор начисления (УИН)
     */
    public String getSupplierBillUin() {
        return (String) get(2);
    }

    /**
     * Setter for <code>passport_international.view_charge.status_code</code>.
     * Статус начисления
     */
    public void setStatusCode(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.status_code</code>.
     * Статус начисления
     */
    public String getStatusCode() {
        return (String) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.amount_rub_coin</code>.
     * Рассчитанная сумма начисления в копейках
     */
    public void setAmountRubCoin(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.amount_rub_coin</code>.
     * Рассчитанная сумма начисления в копейках
     */
    public Long getAmountRubCoin() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.balance_rub_coin</code>.
     * Оставшаяся сумма к оплате в копейках
     */
    public void setBalanceRubCoin(Long value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.balance_rub_coin</code>.
     * Оставшаяся сумма к оплате в копейках
     */
    public Long getBalanceRubCoin() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>passport_international.view_charge.create_dttm</code>.
     * Дата время вставки записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.create_dttm</code>.
     * Дата время вставки записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for <code>passport_international.view_charge.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for <code>passport_international.view_charge.action_ind</code>.
     * Индикатор действия
     */
    public void setActionInd(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.action_ind</code>.
     * Индикатор действия
     */
    public String getActionInd() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.view_charge.version</code>.
     */
    public void setVersion(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_kind_code</code>.
     */
    public void setPayerKindCode(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_kind_code</code>.
     */
    public String getPayerKindCode() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_person_id</code>.
     */
    public void setPayerPersonId(Long value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_person_id</code>.
     */
    public Long getPayerPersonId() {
        return (Long) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_full_name</code>.
     */
    public void setPayerFullName(String value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_full_name</code>.
     */
    public String getPayerFullName() {
        return (String) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_doc_type_code</code>.
     */
    public void setPayerDocTypeCode(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_doc_type_code</code>.
     */
    public String getPayerDocTypeCode() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_doc_series_code</code>.
     */
    public void setPayerDocSeriesCode(String value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_doc_series_code</code>.
     */
    public String getPayerDocSeriesCode() {
        return (String) get(14);
    }

    /**
     * Setter for <code>passport_international.view_charge.payer_doc_no</code>.
     */
    public void setPayerDocNo(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.payer_doc_no</code>.
     */
    public String getPayerDocNo() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_account_no</code>.
     */
    public void setPayerAccountNo(String value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_account_no</code>.
     */
    public String getPayerAccountNo() {
        return (String) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_bank_name</code>.
     */
    public void setPayerBankName(String value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_bank_name</code>.
     */
    public String getPayerBankName() {
        return (String) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_bank_bik</code>.
     */
    public void setPayerBankBik(String value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_bank_bik</code>.
     */
    public String getPayerBankBik() {
        return (String) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_doc_type_id</code>.
     * Идентификатор типа документа удостоверяющего личность плательщика (НСИ)
     */
    public void setPayerDocTypeId(Long value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_doc_type_id</code>.
     * Идентификатор типа документа удостоверяющего личность плательщика (НСИ)
     */
    public Long getPayerDocTypeId() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>passport_international.view_charge.purpose_name</code>.
     * Назначение платежа
     */
    public void setPurposeName(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.purpose_name</code>.
     * Назначение платежа
     */
    public String getPurposeName() {
        return (String) get(20);
    }

    /**
     * Setter for <code>passport_international.view_charge.kbk</code>. Код
     * бюджетной классификации (КБK)
     */
    public void setKbk(String value) {
        set(21, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.kbk</code>. Код
     * бюджетной классификации (КБK)
     */
    public String getKbk() {
        return (String) get(21);
    }

    /**
     * Setter for
     * <code>passport_international.view_charge.payer_identifier_key</code>.
     * Уникальный идентификатор плательщика
     */
    public void setPayerIdentifierKey(String value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_charge.payer_identifier_key</code>.
     * Уникальный идентификатор плательщика
     */
    public String getPayerIdentifierKey() {
        return (String) get(22);
    }

    /**
     * Setter for <code>passport_international.view_charge.type_cval</code>. Тип
     * начисления
     */
    public void setTypeCval(String value) {
        set(23, value);
    }

    /**
     * Getter for <code>passport_international.view_charge.type_cval</code>. Тип
     * начисления
     */
    public String getTypeCval() {
        return (String) get(23);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewChargeRecord
     */
    public ViewChargeRecord() {
        super(ViewCharge.VIEW_CHARGE);
    }

    /**
     * Create a detached, initialised ViewChargeRecord
     */
    public ViewChargeRecord(Long chargeId, Long coreCaseId, String supplierBillUin, String statusCode, Long amountRubCoin, Long balanceRubCoin, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, Integer version, String payerKindCode, Long payerPersonId, String payerFullName, String payerDocTypeCode, String payerDocSeriesCode, String payerDocNo, String payerAccountNo, String payerBankName, String payerBankBik, Long payerDocTypeId, String purposeName, String kbk, String payerIdentifierKey, String typeCval) {
        super(ViewCharge.VIEW_CHARGE);

        setChargeId(chargeId);
        setCoreCaseId(coreCaseId);
        setSupplierBillUin(supplierBillUin);
        setStatusCode(statusCode);
        setAmountRubCoin(amountRubCoin);
        setBalanceRubCoin(balanceRubCoin);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setVersion(version);
        setPayerKindCode(payerKindCode);
        setPayerPersonId(payerPersonId);
        setPayerFullName(payerFullName);
        setPayerDocTypeCode(payerDocTypeCode);
        setPayerDocSeriesCode(payerDocSeriesCode);
        setPayerDocNo(payerDocNo);
        setPayerAccountNo(payerAccountNo);
        setPayerBankName(payerBankName);
        setPayerBankBik(payerBankBik);
        setPayerDocTypeId(payerDocTypeId);
        setPurposeName(purposeName);
        setKbk(kbk);
        setPayerIdentifierKey(payerIdentifierKey);
        setTypeCval(typeCval);
        resetChangedOnNotNull();
    }
}
