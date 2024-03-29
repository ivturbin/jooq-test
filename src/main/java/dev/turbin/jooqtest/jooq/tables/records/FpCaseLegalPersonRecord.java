/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.FpCaseLegalPerson;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Record2;
import org.jooq.Row17;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица связи законных представителей с делом
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FpCaseLegalPersonRecord extends UpdatableRecordImpl<FpCaseLegalPersonRecord> implements Record17<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, LocalDate, String, Boolean, LocalDate, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.fp_case_id</code>. id
     * базового дела
     */
    public void setFpCaseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.fp_case_id</code>. id
     * базового дела
     */
    public Long getFpCaseId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.core_person_document_id</code>.
     * id документа законного представителя
     */
    public void setCorePersonDocumentId(Long value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.core_person_document_id</code>.
     * id документа законного представителя
     */
    public Long getCorePersonDocumentId() {
        return (Long) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public void setSrcId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.src_id</code>.
     * Идентификатор источника с которого получены информация
     */
    public Long getSrcId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.create_dttm</code>.
     * Дата время вставки записи в таблицу
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.modify_dttm</code>.
     * Дата время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public void setActionInd(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.action_ind</code>.
     * Индикатор операции DML(I-insert,D-delete,U-update)
     */
    public String getActionInd() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setEffDttm(OffsetDateTime value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.eff_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public void setExpDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.exp_dttm</code>. Поля
     * отображения периода действия технической истории
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.relation_type</code>.
     * Степень родства
     */
    public void setRelationType(Long value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.relation_type</code>.
     * Степень родства
     */
    public Long getRelationType() {
        return (Long) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.type_doc</code>. Тип
     * документа подтверждающего права законого представителя
     */
    public void setTypeDoc(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.type_doc</code>. Тип
     * документа подтверждающего права законого представителя
     */
    public String getTypeDoc() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.series</code>. Серия
     * документа подтверждающего права законого представителя
     */
    public void setSeries(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.series</code>. Серия
     * документа подтверждающего права законого представителя
     */
    public String getSeries() {
        return (String) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.doc_no</code>. Номер
     * документа подтверждающего права законого представителя
     */
    public void setDocNo(String value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.doc_no</code>. Номер
     * документа подтверждающего права законого представителя
     */
    public String getDocNo() {
        return (String) get(11);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.issue_dt</code>. Дата
     * выдачи документа подтверждающего права законого представителя
     */
    public void setIssueDt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.issue_dt</code>. Дата
     * выдачи документа подтверждающего права законого представителя
     */
    public LocalDate getIssueDt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.given_by</code>. Орган
     * выдавший документ подтверждающий права законого представителя
     */
    public void setGivenBy(String value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.given_by</code>. Орган
     * выдавший документ подтверждающий права законого представителя
     */
    public String getGivenBy() {
        return (String) get(13);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.is_main_bool</code>.
     * Является ли законный предствитель основным в деле
     */
    public void setIsMainBool(Boolean value) {
        set(14, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.is_main_bool</code>.
     * Является ли законный предствитель основным в деле
     */
    public Boolean getIsMainBool() {
        return (Boolean) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.issue_act_dt</code>.
     * Дата оформления актовой записи
     */
    public void setIssueActDt(LocalDate value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.issue_act_dt</code>.
     * Дата оформления актовой записи
     */
    public LocalDate getIssueActDt() {
        return (LocalDate) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.fp_case_legal_person.act_no</code>. Номер
     * актовой записи
     */
    public void setActNo(String value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.fp_case_legal_person.act_no</code>. Номер
     * актовой записи
     */
    public String getActNo() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row17<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, LocalDate, String, Boolean, LocalDate, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    @Override
    public Row17<Long, Long, Long, OffsetDateTime, OffsetDateTime, String, OffsetDateTime, OffsetDateTime, Long, String, String, String, LocalDate, String, Boolean, LocalDate, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.FP_CASE_ID;
    }

    @Override
    public Field<Long> field2() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.CORE_PERSON_DOCUMENT_ID;
    }

    @Override
    public Field<Long> field3() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.SRC_ID;
    }

    @Override
    public Field<OffsetDateTime> field4() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field5() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.MODIFY_DTTM;
    }

    @Override
    public Field<String> field6() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.ACTION_IND;
    }

    @Override
    public Field<OffsetDateTime> field7() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.EFF_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.EXP_DTTM;
    }

    @Override
    public Field<Long> field9() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.RELATION_TYPE;
    }

    @Override
    public Field<String> field10() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.TYPE_DOC;
    }

    @Override
    public Field<String> field11() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.SERIES;
    }

    @Override
    public Field<String> field12() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.DOC_NO;
    }

    @Override
    public Field<LocalDate> field13() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.ISSUE_DT;
    }

    @Override
    public Field<String> field14() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.GIVEN_BY;
    }

    @Override
    public Field<Boolean> field15() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.IS_MAIN_BOOL;
    }

    @Override
    public Field<LocalDate> field16() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.ISSUE_ACT_DT;
    }

    @Override
    public Field<String> field17() {
        return FpCaseLegalPerson.FP_CASE_LEGAL_PERSON.ACT_NO;
    }

    @Override
    public Long component1() {
        return getFpCaseId();
    }

    @Override
    public Long component2() {
        return getCorePersonDocumentId();
    }

    @Override
    public Long component3() {
        return getSrcId();
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
    public OffsetDateTime component7() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime component8() {
        return getExpDttm();
    }

    @Override
    public Long component9() {
        return getRelationType();
    }

    @Override
    public String component10() {
        return getTypeDoc();
    }

    @Override
    public String component11() {
        return getSeries();
    }

    @Override
    public String component12() {
        return getDocNo();
    }

    @Override
    public LocalDate component13() {
        return getIssueDt();
    }

    @Override
    public String component14() {
        return getGivenBy();
    }

    @Override
    public Boolean component15() {
        return getIsMainBool();
    }

    @Override
    public LocalDate component16() {
        return getIssueActDt();
    }

    @Override
    public String component17() {
        return getActNo();
    }

    @Override
    public Long value1() {
        return getFpCaseId();
    }

    @Override
    public Long value2() {
        return getCorePersonDocumentId();
    }

    @Override
    public Long value3() {
        return getSrcId();
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
    public OffsetDateTime value7() {
        return getEffDttm();
    }

    @Override
    public OffsetDateTime value8() {
        return getExpDttm();
    }

    @Override
    public Long value9() {
        return getRelationType();
    }

    @Override
    public String value10() {
        return getTypeDoc();
    }

    @Override
    public String value11() {
        return getSeries();
    }

    @Override
    public String value12() {
        return getDocNo();
    }

    @Override
    public LocalDate value13() {
        return getIssueDt();
    }

    @Override
    public String value14() {
        return getGivenBy();
    }

    @Override
    public Boolean value15() {
        return getIsMainBool();
    }

    @Override
    public LocalDate value16() {
        return getIssueActDt();
    }

    @Override
    public String value17() {
        return getActNo();
    }

    @Override
    public FpCaseLegalPersonRecord value1(Long value) {
        setFpCaseId(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value2(Long value) {
        setCorePersonDocumentId(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value3(Long value) {
        setSrcId(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value4(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value5(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value6(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value7(OffsetDateTime value) {
        setEffDttm(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value8(OffsetDateTime value) {
        setExpDttm(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value9(Long value) {
        setRelationType(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value10(String value) {
        setTypeDoc(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value11(String value) {
        setSeries(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value12(String value) {
        setDocNo(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value13(LocalDate value) {
        setIssueDt(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value14(String value) {
        setGivenBy(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value15(Boolean value) {
        setIsMainBool(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value16(LocalDate value) {
        setIssueActDt(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord value17(String value) {
        setActNo(value);
        return this;
    }

    @Override
    public FpCaseLegalPersonRecord values(Long value1, Long value2, Long value3, OffsetDateTime value4, OffsetDateTime value5, String value6, OffsetDateTime value7, OffsetDateTime value8, Long value9, String value10, String value11, String value12, LocalDate value13, String value14, Boolean value15, LocalDate value16, String value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FpCaseLegalPersonRecord
     */
    public FpCaseLegalPersonRecord() {
        super(FpCaseLegalPerson.FP_CASE_LEGAL_PERSON);
    }

    /**
     * Create a detached, initialised FpCaseLegalPersonRecord
     */
    public FpCaseLegalPersonRecord(Long fpCaseId, Long corePersonDocumentId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, Long relationType, String typeDoc, String series, String docNo, LocalDate issueDt, String givenBy, Boolean isMainBool, LocalDate issueActDt, String actNo) {
        super(FpCaseLegalPerson.FP_CASE_LEGAL_PERSON);

        setFpCaseId(fpCaseId);
        setCorePersonDocumentId(corePersonDocumentId);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setRelationType(relationType);
        setTypeDoc(typeDoc);
        setSeries(series);
        setDocNo(docNo);
        setIssueDt(issueDt);
        setGivenBy(givenBy);
        setIsMainBool(isMainBool);
        setIssueActDt(issueActDt);
        setActNo(actNo);
        resetChangedOnNotNull();
    }
}