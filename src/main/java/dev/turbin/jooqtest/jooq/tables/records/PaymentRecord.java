/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.Payment;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Информация о платежах
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PaymentRecord extends UpdatableRecordImpl<PaymentRecord> implements Record18<Long, String, Long, Long, String, OffsetDateTime, String, String, String, String, String, Boolean, LocalDate, OffsetDateTime, OffsetDateTime, String, Integer, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>passport_international.payment.payment_id</code>.
     * Идентификатор записи
     */
    public void setPaymentId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>passport_international.payment.payment_id</code>.
     * Идентификатор записи
     */
    public Long getPaymentId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.payment.payment_key</code>.
     * Уникальный идентификатор платежа (УИП)
     */
    public void setPaymentKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.payment.payment_key</code>.
     * Уникальный идентификатор платежа (УИП)
     */
    public String getPaymentKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>passport_international.payment.core_case_id</code>.
     * Идентификатор дела к которому относится платеж
     */
    public void setCoreCaseId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.payment.core_case_id</code>.
     * Идентификатор дела к которому относится платеж
     */
    public Long getCoreCaseId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>passport_international.payment.amount_rub_coin</code>.
     * Сумма начисления в копейках
     */
    public void setAmountRubCoin(Long value) {
        set(3, value);
    }

    /**
     * Getter for <code>passport_international.payment.amount_rub_coin</code>.
     * Сумма начисления в копейках
     */
    public Long getAmountRubCoin() {
        return (Long) get(3);
    }

    /**
     * Setter for <code>passport_international.payment.purpose_name</code>.
     * Назначение платежа
     */
    public void setPurposeName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.payment.purpose_name</code>.
     * Назначение платежа
     */
    public String getPurposeName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>passport_international.payment.payment_dttm</code>. Дата
     * соверешения платежа
     */
    public void setPaymentDttm(OffsetDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.payment.payment_dttm</code>. Дата
     * соверешения платежа
     */
    public OffsetDateTime getPaymentDttm() {
        return (OffsetDateTime) get(5);
    }

    /**
     * Setter for <code>passport_international.payment.kbk</code>. Код бюджетной
     * классификации (КБК)
     */
    public void setKbk(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.payment.kbk</code>. Код бюджетной
     * классификации (КБК)
     */
    public String getKbk() {
        return (String) get(6);
    }

    /**
     * Setter for <code>passport_international.payment.oktmo</code>. Код по
     * общероссийскому классификатору территорий муниципальных образований
     * (ОКТМО)
     */
    public void setOktmo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.payment.oktmo</code>. Код по
     * общероссийскому классификатору территорий муниципальных образований
     * (ОКТМО)
     */
    public String getOktmo() {
        return (String) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.payment.transaction_kind_cval</code>. Вид
     * операции Возможные значения: `01` – платежное поручение `06` – инкассовое
     * поручение `16` – платежный ордер
     */
    public void setTransactionKindCval(String value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.payment.transaction_kind_cval</code>. Вид
     * операции Возможные значения: `01` – платежное поручение `06` – инкассовое
     * поручение `16` – платежный ордер
     */
    public String getTransactionKindCval() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.payment.supplier_bill_uin</code>.
     * Уникальный идентификатор начисления (УИН), когда платёж сквитирован
     */
    public void setSupplierBillUin(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.payment.supplier_bill_uin</code>.
     * Уникальный идентификатор начисления (УИН), когда платёж сквитирован
     */
    public String getSupplierBillUin() {
        return (String) get(9);
    }

    /**
     * Setter for <code>passport_international.payment.tax_document_no</code>.
     * Поле номер 108: Показатель номера документа
     */
    public void setTaxDocumentNo(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>passport_international.payment.tax_document_no</code>.
     * Поле номер 108: Показатель номера документа
     */
    public String getTaxDocumentNo() {
        return (String) get(10);
    }

    /**
     * Setter for <code>passport_international.payment.status_bool</code>.
     * Статус платежа true - оплачен, false - не оплачен
     */
    public void setStatusBool(Boolean value) {
        set(11, value);
    }

    /**
     * Getter for <code>passport_international.payment.status_bool</code>.
     * Статус платежа true - оплачен, false - не оплачен
     */
    public Boolean getStatusBool() {
        return (Boolean) get(11);
    }

    /**
     * Setter for <code>passport_international.payment.tax_document_dt</code>.
     * Поле номер 109: Показатель даты документа
     */
    public void setTaxDocumentDt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for <code>passport_international.payment.tax_document_dt</code>.
     * Поле номер 109: Показатель даты документа
     */
    public LocalDate getTaxDocumentDt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for <code>passport_international.payment.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(13, value);
    }

    /**
     * Getter for <code>passport_international.payment.create_dttm</code>. Дата
     * время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(13);
    }

    /**
     * Setter for <code>passport_international.payment.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(14, value);
    }

    /**
     * Getter for <code>passport_international.payment.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(14);
    }

    /**
     * Setter for <code>passport_international.payment.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>passport_international.payment.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(15);
    }

    /**
     * Setter for <code>passport_international.payment.version</code>.
     */
    public void setVersion(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>passport_international.payment.version</code>.
     */
    public Integer getVersion() {
        return (Integer) get(16);
    }

    /**
     * Setter for <code>passport_international.payment.bill_status_ind</code>.
     * Статус квитирования. 1 - Сквитировано *2 - Предварительно сквитировано *
     * 3 - Не сквитировано * 4 - Сквитировано с отсутствующим в системе платежом
     * * 5 - Принудительно сквитировано с платежом 
     */
    public void setBillStatusInd(String value) {
        set(17, value);
    }

    /**
     * Getter for <code>passport_international.payment.bill_status_ind</code>.
     * Статус квитирования. 1 - Сквитировано *2 - Предварительно сквитировано *
     * 3 - Не сквитировано * 4 - Сквитировано с отсутствующим в системе платежом
     * * 5 - Принудительно сквитировано с платежом 
     */
    public String getBillStatusInd() {
        return (String) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<Long, String, Long, Long, String, OffsetDateTime, String, String, String, String, String, Boolean, LocalDate, OffsetDateTime, OffsetDateTime, String, Integer, String> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<Long, String, Long, Long, String, OffsetDateTime, String, String, String, String, String, Boolean, LocalDate, OffsetDateTime, OffsetDateTime, String, Integer, String> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return Payment.PAYMENT.PAYMENT_ID;
    }

    @Override
    public Field<String> field2() {
        return Payment.PAYMENT.PAYMENT_KEY;
    }

    @Override
    public Field<Long> field3() {
        return Payment.PAYMENT.CORE_CASE_ID;
    }

    @Override
    public Field<Long> field4() {
        return Payment.PAYMENT.AMOUNT_RUB_COIN;
    }

    @Override
    public Field<String> field5() {
        return Payment.PAYMENT.PURPOSE_NAME;
    }

    @Override
    public Field<OffsetDateTime> field6() {
        return Payment.PAYMENT.PAYMENT_DTTM;
    }

    @Override
    public Field<String> field7() {
        return Payment.PAYMENT.KBK;
    }

    @Override
    public Field<String> field8() {
        return Payment.PAYMENT.OKTMO;
    }

    @Override
    public Field<String> field9() {
        return Payment.PAYMENT.TRANSACTION_KIND_CVAL;
    }

    @Override
    public Field<String> field10() {
        return Payment.PAYMENT.SUPPLIER_BILL_UIN;
    }

    @Override
    public Field<String> field11() {
        return Payment.PAYMENT.TAX_DOCUMENT_NO;
    }

    @Override
    public Field<Boolean> field12() {
        return Payment.PAYMENT.STATUS_BOOL;
    }

    @Override
    public Field<LocalDate> field13() {
        return Payment.PAYMENT.TAX_DOCUMENT_DT;
    }

    @Override
    public Field<OffsetDateTime> field14() {
        return Payment.PAYMENT.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field15() {
        return Payment.PAYMENT.MODIFY_DTTM;
    }

    @Override
    public Field<String> field16() {
        return Payment.PAYMENT.ACTION_IND;
    }

    @Override
    public Field<Integer> field17() {
        return Payment.PAYMENT.VERSION;
    }

    @Override
    public Field<String> field18() {
        return Payment.PAYMENT.BILL_STATUS_IND;
    }

    @Override
    public Long component1() {
        return getPaymentId();
    }

    @Override
    public String component2() {
        return getPaymentKey();
    }

    @Override
    public Long component3() {
        return getCoreCaseId();
    }

    @Override
    public Long component4() {
        return getAmountRubCoin();
    }

    @Override
    public String component5() {
        return getPurposeName();
    }

    @Override
    public OffsetDateTime component6() {
        return getPaymentDttm();
    }

    @Override
    public String component7() {
        return getKbk();
    }

    @Override
    public String component8() {
        return getOktmo();
    }

    @Override
    public String component9() {
        return getTransactionKindCval();
    }

    @Override
    public String component10() {
        return getSupplierBillUin();
    }

    @Override
    public String component11() {
        return getTaxDocumentNo();
    }

    @Override
    public Boolean component12() {
        return getStatusBool();
    }

    @Override
    public LocalDate component13() {
        return getTaxDocumentDt();
    }

    @Override
    public OffsetDateTime component14() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component15() {
        return getModifyDttm();
    }

    @Override
    public String component16() {
        return getActionInd();
    }

    @Override
    public Integer component17() {
        return getVersion();
    }

    @Override
    public String component18() {
        return getBillStatusInd();
    }

    @Override
    public Long value1() {
        return getPaymentId();
    }

    @Override
    public String value2() {
        return getPaymentKey();
    }

    @Override
    public Long value3() {
        return getCoreCaseId();
    }

    @Override
    public Long value4() {
        return getAmountRubCoin();
    }

    @Override
    public String value5() {
        return getPurposeName();
    }

    @Override
    public OffsetDateTime value6() {
        return getPaymentDttm();
    }

    @Override
    public String value7() {
        return getKbk();
    }

    @Override
    public String value8() {
        return getOktmo();
    }

    @Override
    public String value9() {
        return getTransactionKindCval();
    }

    @Override
    public String value10() {
        return getSupplierBillUin();
    }

    @Override
    public String value11() {
        return getTaxDocumentNo();
    }

    @Override
    public Boolean value12() {
        return getStatusBool();
    }

    @Override
    public LocalDate value13() {
        return getTaxDocumentDt();
    }

    @Override
    public OffsetDateTime value14() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value15() {
        return getModifyDttm();
    }

    @Override
    public String value16() {
        return getActionInd();
    }

    @Override
    public Integer value17() {
        return getVersion();
    }

    @Override
    public String value18() {
        return getBillStatusInd();
    }

    @Override
    public PaymentRecord value1(Long value) {
        setPaymentId(value);
        return this;
    }

    @Override
    public PaymentRecord value2(String value) {
        setPaymentKey(value);
        return this;
    }

    @Override
    public PaymentRecord value3(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public PaymentRecord value4(Long value) {
        setAmountRubCoin(value);
        return this;
    }

    @Override
    public PaymentRecord value5(String value) {
        setPurposeName(value);
        return this;
    }

    @Override
    public PaymentRecord value6(OffsetDateTime value) {
        setPaymentDttm(value);
        return this;
    }

    @Override
    public PaymentRecord value7(String value) {
        setKbk(value);
        return this;
    }

    @Override
    public PaymentRecord value8(String value) {
        setOktmo(value);
        return this;
    }

    @Override
    public PaymentRecord value9(String value) {
        setTransactionKindCval(value);
        return this;
    }

    @Override
    public PaymentRecord value10(String value) {
        setSupplierBillUin(value);
        return this;
    }

    @Override
    public PaymentRecord value11(String value) {
        setTaxDocumentNo(value);
        return this;
    }

    @Override
    public PaymentRecord value12(Boolean value) {
        setStatusBool(value);
        return this;
    }

    @Override
    public PaymentRecord value13(LocalDate value) {
        setTaxDocumentDt(value);
        return this;
    }

    @Override
    public PaymentRecord value14(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public PaymentRecord value15(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public PaymentRecord value16(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public PaymentRecord value17(Integer value) {
        setVersion(value);
        return this;
    }

    @Override
    public PaymentRecord value18(String value) {
        setBillStatusInd(value);
        return this;
    }

    @Override
    public PaymentRecord values(Long value1, String value2, Long value3, Long value4, String value5, OffsetDateTime value6, String value7, String value8, String value9, String value10, String value11, Boolean value12, LocalDate value13, OffsetDateTime value14, OffsetDateTime value15, String value16, Integer value17, String value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PaymentRecord
     */
    public PaymentRecord() {
        super(Payment.PAYMENT);
    }

    /**
     * Create a detached, initialised PaymentRecord
     */
    public PaymentRecord(Long paymentId, String paymentKey, Long coreCaseId, Long amountRubCoin, String purposeName, OffsetDateTime paymentDttm, String kbk, String oktmo, String transactionKindCval, String supplierBillUin, String taxDocumentNo, Boolean statusBool, LocalDate taxDocumentDt, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, Integer version, String billStatusInd) {
        super(Payment.PAYMENT);

        setPaymentId(paymentId);
        setPaymentKey(paymentKey);
        setCoreCaseId(coreCaseId);
        setAmountRubCoin(amountRubCoin);
        setPurposeName(purposeName);
        setPaymentDttm(paymentDttm);
        setKbk(kbk);
        setOktmo(oktmo);
        setTransactionKindCval(transactionKindCval);
        setSupplierBillUin(supplierBillUin);
        setTaxDocumentNo(taxDocumentNo);
        setStatusBool(statusBool);
        setTaxDocumentDt(taxDocumentDt);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setVersion(version);
        setBillStatusInd(billStatusInd);
        resetChangedOnNotNull();
    }
}
