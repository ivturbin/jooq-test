/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.ViewCoreDoc;

import java.time.LocalDate;
import java.time.OffsetDateTime;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ViewCoreDocRecord extends TableRecordImpl<ViewCoreDocRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.view_core_doc.core_case_id</code>.
     */
    public void setCoreCaseId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.core_case_id</code>.
     */
    public Long getCoreCaseId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.core_doc_id</code>.
     */
    public void setCoreDocId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.core_doc_id</code>.
     */
    public Long getCoreDocId() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.version</code>.
     * Реализация оптимистической блокировки
     */
    public void setVersion(Integer value) {
        set(2, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.version</code>.
     * Реализация оптимистической блокировки
     */
    public Integer getVersion() {
        return (Integer) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.invalid_bool</code>.
     */
    public void setInvalidBool(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.invalid_bool</code>.
     */
    public Boolean getInvalidBool() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.type_id</code>. Тип
     * документа
     */
    public void setTypeId(Long value) {
        set(4, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.type_id</code>. Тип
     * документа
     */
    public Long getTypeId() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.status_id</code>.
     * Статус документа
     */
    public void setStatusId(Long value) {
        set(5, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.status_id</code>.
     * Статус документа
     */
    public Long getStatusId() {
        return (Long) get(5);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.change_dt</code>.
     * Дата изменений
     */
    public void setChangeDt(LocalDate value) {
        set(6, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.change_dt</code>.
     * Дата изменений
     */
    public LocalDate getChangeDt() {
        return (LocalDate) get(6);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.doc_no</code>.
     * Номер документа
     */
    public void setDocNo(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.doc_no</code>.
     * Номер документа
     */
    public String getDocNo() {
        return (String) get(7);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.series_code</code>.
     * Серия документа
     */
    public void setSeriesCode(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.series_code</code>.
     * Серия документа
     */
    public String getSeriesCode() {
        return (String) get(8);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.issued_dt</code>.
     * Дата выдачи
     */
    public void setIssuedDt(LocalDate value) {
        set(9, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.issued_dt</code>.
     * Дата выдачи
     */
    public LocalDate getIssuedDt() {
        return (LocalDate) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.extend_to_dt</code>. Продлен
     * до
     */
    public void setExtendToDt(LocalDate value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.extend_to_dt</code>. Продлен
     * до
     */
    public LocalDate getExtendToDt() {
        return (LocalDate) get(10);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.valid_from_dt</code>.
     * Действителен с
     */
    public void setValidFromDt(LocalDate value) {
        set(11, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.valid_from_dt</code>.
     * Действителен с
     */
    public LocalDate getValidFromDt() {
        return (LocalDate) get(11);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.valid_to_dt</code>.
     * Действителен по
     */
    public void setValidToDt(LocalDate value) {
        set(12, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.valid_to_dt</code>.
     * Действителен по
     */
    public LocalDate getValidToDt() {
        return (LocalDate) get(12);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.destruction_dt</code>. Дата
     * уничтожения документа
     */
    public void setDestructionDt(LocalDate value) {
        set(13, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.destruction_dt</code>. Дата
     * уничтожения документа
     */
    public LocalDate getDestructionDt() {
        return (LocalDate) get(13);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.invalid_dt</code>.
     * Дата инвалидации записи
     */
    public void setInvalidDt(LocalDate value) {
        set(14, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.invalid_dt</code>.
     * Дата инвалидации записи
     */
    public LocalDate getInvalidDt() {
        return (LocalDate) get(14);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.invalid_user</code>.
     * Пользователь, инвалидировавший запись
     */
    public void setInvalidUser(String value) {
        set(15, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.invalid_user</code>.
     * Пользователь, инвалидировавший запись
     */
    public String getInvalidUser() {
        return (String) get(15);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.authority_organ_id</code>.
     * Орган, выдавший документ
     */
    public void setAuthorityOrganId(Long value) {
        set(16, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.authority_organ_id</code>.
     * Орган, выдавший документ
     */
    public Long getAuthorityOrganId() {
        return (Long) get(16);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.new_core_doc_id</code>.
     */
    public void setNewCoreDocId(Long value) {
        set(17, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.new_core_doc_id</code>.
     */
    public Long getNewCoreDocId() {
        return (Long) get(17);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.blank_series_code</code>.
     * Серия бланка
     */
    public void setBlankSeriesCode(String value) {
        set(18, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.blank_series_code</code>.
     * Серия бланка
     */
    public String getBlankSeriesCode() {
        return (String) get(18);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.blank_number_code</code>.
     * Номер бланка
     */
    public void setBlankNumberCode(String value) {
        set(19, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.blank_number_code</code>.
     * Номер бланка
     */
    public String getBlankNumberCode() {
        return (String) get(19);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.authority_code</code>. Код
     * подразделения, выдавшего документ
     */
    public void setAuthorityCode(String value) {
        set(20, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.authority_code</code>. Код
     * подразделения, выдавшего документ
     */
    public String getAuthorityCode() {
        return (String) get(20);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.series_doc_no_hash_cval</code>.
     * Хэш серии и номера документа
     */
    public void setSeriesDocNoHashCval(String value) {
        set(21, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.series_doc_no_hash_cval</code>.
     * Хэш серии и номера документа
     */
    public String getSeriesDocNoHashCval() {
        return (String) get(21);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.series_doc_no_hash_strict_cval</code>.
     * Строгий хэш серии и номера документа
     */
    public void setSeriesDocNoHashStrictCval(String value) {
        set(22, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.series_doc_no_hash_strict_cval</code>.
     * Строгий хэш серии и номера документа
     */
    public String getSeriesDocNoHashStrictCval() {
        return (String) get(22);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.doc_birth_place_desc</code>.
     * Место рождения, как указано в документе
     */
    public void setDocBirthPlaceDesc(String value) {
        set(23, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.doc_birth_place_desc</code>.
     * Место рождения, как указано в документе
     */
    public String getDocBirthPlaceDesc() {
        return (String) get(23);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.authority_desc</code>. Кем
     * выдан документ
     */
    public void setAuthorityDesc(String value) {
        set(24, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.authority_desc</code>. Кем
     * выдан документ
     */
    public String getAuthorityDesc() {
        return (String) get(24);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.authorized_officer_cval</code>.
     * Должностное лицо, уполномоченное выдавать документ
     */
    public void setAuthorizedOfficerCval(String value) {
        set(25, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.authorized_officer_cval</code>.
     * Должностное лицо, уполномоченное выдавать документ
     */
    public String getAuthorizedOfficerCval() {
        return (String) get(25);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.parent_authority_organ_id</code>.
     * Головное подразделение органа, выдавшего документ
     */
    public void setParentAuthorityOrganId(Long value) {
        set(26, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.parent_authority_organ_id</code>.
     * Головное подразделение органа, выдавшего документ
     */
    public Long getParentAuthorityOrganId() {
        return (Long) get(26);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.person_id</code>.
     * Связь физического лица и документа
     */
    public void setPersonId(Long value) {
        set(27, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.person_id</code>.
     * Связь физического лица и документа
     */
    public Long getPersonId() {
        return (Long) get(27);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.src_id</code>.
     * Источник
     */
    public void setSrcId(Long value) {
        set(28, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.src_id</code>.
     * Источник
     */
    public Long getSrcId() {
        return (Long) get(28);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.create_dttm</code>.
     * Дата время вставки записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(29, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.create_dttm</code>.
     * Дата время вставки записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(29);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.modify_dttm</code>.
     * Дата время последнего иземения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(30, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.modify_dttm</code>.
     * Дата время последнего иземения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(30);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.action_ind</code>.
     * Индикатор действия
     */
    public void setActionInd(String value) {
        set(31, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.action_ind</code>.
     * Индикатор действия
     */
    public String getActionInd() {
        return (String) get(31);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.eff_dttm</code>.
     * Дата начала действия периода
     */
    public void setEffDttm(OffsetDateTime value) {
        set(32, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.eff_dttm</code>.
     * Дата начала действия периода
     */
    public OffsetDateTime getEffDttm() {
        return (OffsetDateTime) get(32);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.exp_dttm</code>.
     * Дата окончания действия периода
     */
    public void setExpDttm(OffsetDateTime value) {
        set(33, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.exp_dttm</code>.
     * Дата окончания действия периода
     */
    public OffsetDateTime getExpDttm() {
        return (OffsetDateTime) get(33);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.create_user</code>.
     * Пользователь, создавший запись
     */
    public void setCreateUser(String value) {
        set(34, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.create_user</code>.
     * Пользователь, создавший запись
     */
    public String getCreateUser() {
        return (String) get(34);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.update_user</code>.
     * Пользователь, сделавший изменение
     */
    public void setUpdateUser(String value) {
        set(35, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.update_user</code>.
     * Пользователь, сделавший изменение
     */
    public String getUpdateUser() {
        return (String) get(35);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.correction_reason_cval</code>.
     * Причина коррекции
     */
    public void setCorrectionReasonCval(String value) {
        set(36, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.correction_reason_cval</code>.
     * Причина коррекции
     */
    public String getCorrectionReasonCval() {
        return (String) get(36);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.sex_cval</code>.
     */
    public void setSexCval(String value) {
        set(37, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.sex_cval</code>.
     */
    public String getSexCval() {
        return (String) get(37);
    }

    /**
     * Setter for <code>passport_international.view_core_doc.birth_dt</code>.
     * Дата рождения
     */
    public void setBirthDt(LocalDate value) {
        set(38, value);
    }

    /**
     * Getter for <code>passport_international.view_core_doc.birth_dt</code>.
     * Дата рождения
     */
    public LocalDate getBirthDt() {
        return (LocalDate) get(38);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.destruction_act_id</code>.
     * Индефикатор акта об уничтожении
     */
    public void setDestructionActId(Long value) {
        set(39, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.destruction_act_id</code>.
     * Индефикатор акта об уничтожении
     */
    public Long getDestructionActId() {
        return (Long) get(39);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.core_person_doc_id</code>.
     */
    public void setCorePersonDocId(Long value) {
        set(40, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.core_person_doc_id</code>.
     */
    public Long getCorePersonDocId() {
        return (Long) get(40);
    }

    /**
     * Setter for
     * <code>passport_international.view_core_doc.invalid_case_id</code>.
     * Идентификатор дела о недействительности
     */
    public void setInvalidCaseId(Long value) {
        set(41, value);
    }

    /**
     * Getter for
     * <code>passport_international.view_core_doc.invalid_case_id</code>.
     * Идентификатор дела о недействительности
     */
    public Long getInvalidCaseId() {
        return (Long) get(41);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ViewCoreDocRecord
     */
    public ViewCoreDocRecord() {
        super(ViewCoreDoc.VIEW_CORE_DOC);
    }

    /**
     * Create a detached, initialised ViewCoreDocRecord
     */
    public ViewCoreDocRecord(Long coreCaseId, Long coreDocId, Integer version, Boolean invalidBool, Long typeId, Long statusId, LocalDate changeDt, String docNo, String seriesCode, LocalDate issuedDt, LocalDate extendToDt, LocalDate validFromDt, LocalDate validToDt, LocalDate destructionDt, LocalDate invalidDt, String invalidUser, Long authorityOrganId, Long newCoreDocId, String blankSeriesCode, String blankNumberCode, String authorityCode, String seriesDocNoHashCval, String seriesDocNoHashStrictCval, String docBirthPlaceDesc, String authorityDesc, String authorizedOfficerCval, Long parentAuthorityOrganId, Long personId, Long srcId, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, OffsetDateTime effDttm, OffsetDateTime expDttm, String createUser, String updateUser, String correctionReasonCval, String sexCval, LocalDate birthDt, Long destructionActId, Long corePersonDocId, Long invalidCaseId) {
        super(ViewCoreDoc.VIEW_CORE_DOC);

        setCoreCaseId(coreCaseId);
        setCoreDocId(coreDocId);
        setVersion(version);
        setInvalidBool(invalidBool);
        setTypeId(typeId);
        setStatusId(statusId);
        setChangeDt(changeDt);
        setDocNo(docNo);
        setSeriesCode(seriesCode);
        setIssuedDt(issuedDt);
        setExtendToDt(extendToDt);
        setValidFromDt(validFromDt);
        setValidToDt(validToDt);
        setDestructionDt(destructionDt);
        setInvalidDt(invalidDt);
        setInvalidUser(invalidUser);
        setAuthorityOrganId(authorityOrganId);
        setNewCoreDocId(newCoreDocId);
        setBlankSeriesCode(blankSeriesCode);
        setBlankNumberCode(blankNumberCode);
        setAuthorityCode(authorityCode);
        setSeriesDocNoHashCval(seriesDocNoHashCval);
        setSeriesDocNoHashStrictCval(seriesDocNoHashStrictCval);
        setDocBirthPlaceDesc(docBirthPlaceDesc);
        setAuthorityDesc(authorityDesc);
        setAuthorizedOfficerCval(authorizedOfficerCval);
        setParentAuthorityOrganId(parentAuthorityOrganId);
        setPersonId(personId);
        setSrcId(srcId);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setEffDttm(effDttm);
        setExpDttm(expDttm);
        setCreateUser(createUser);
        setUpdateUser(updateUser);
        setCorrectionReasonCval(correctionReasonCval);
        setSexCval(sexCval);
        setBirthDt(birthDt);
        setDestructionActId(destructionActId);
        setCorePersonDocId(corePersonDocId);
        setInvalidCaseId(invalidCaseId);
        resetChangedOnNotNull();
    }
}