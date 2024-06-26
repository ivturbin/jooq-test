/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq.tables.records;


import dev.turbin.jooqtest.jooq.tables.CoreMrcodMessage;

import java.time.OffsetDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record11;
import org.jooq.Row11;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * Таблица для запросов МРЦОД
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CoreMrcodMessageRecord extends UpdatableRecordImpl<CoreMrcodMessageRecord> implements Record11<Long, String, Long, Long, Long, String, String, OffsetDateTime, OffsetDateTime, String, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.mrcod_message_id</code>.
     * Идентификатор записи сообщения МРЦОД
     */
    public void setMrcodMessageId(Long value) {
        set(0, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.mrcod_message_id</code>.
     * Идентификатор записи сообщения МРЦОД
     */
    public Long getMrcodMessageId() {
        return (Long) get(0);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.mrcod_interaction_id_key</code>.
     * Внутренний идентификатор взаимодействия
     */
    public void setMrcodInteractionIdKey(String value) {
        set(1, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.mrcod_interaction_id_key</code>.
     * Внутренний идентификатор взаимодействия
     */
    public String getMrcodInteractionIdKey() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.core_case_id</code>.
     * Идентификатор дела
     */
    public void setCoreCaseId(Long value) {
        set(2, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.core_case_id</code>.
     * Идентификатор дела
     */
    public Long getCoreCaseId() {
        return (Long) get(2);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.sender_id</code>.
     * Идентификатор системы отправителя сообщения
     */
    public void setSenderId(Long value) {
        set(3, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.sender_id</code>.
     * Идентификатор системы отправителя сообщения
     */
    public Long getSenderId() {
        return (Long) get(3);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.receiver_id</code>.
     * Идентификатор системы получателя сообщения
     */
    public void setReceiverId(Long value) {
        set(4, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.receiver_id</code>.
     * Идентификатор системы получателя сообщения
     */
    public Long getReceiverId() {
        return (Long) get(4);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.message_type_name</code>.
     * Тип сообщения
     */
    public void setMessageTypeName(String value) {
        set(5, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.message_type_name</code>.
     * Тип сообщения
     */
    public String getMessageTypeName() {
        return (String) get(5);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.message_content_desc</code>.
     * Тело сообщения в формате XML
     */
    public void setMessageContentDesc(String value) {
        set(6, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.message_content_desc</code>.
     * Тело сообщения в формате XML
     */
    public String getMessageContentDesc() {
        return (String) get(6);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.create_dttm</code>. Дата
     * время добавления записи
     */
    public void setCreateDttm(OffsetDateTime value) {
        set(7, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.create_dttm</code>. Дата
     * время добавления записи
     */
    public OffsetDateTime getCreateDttm() {
        return (OffsetDateTime) get(7);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public void setModifyDttm(OffsetDateTime value) {
        set(8, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.modify_dttm</code>. Дата
     * время последнего изменения записи
     */
    public OffsetDateTime getModifyDttm() {
        return (OffsetDateTime) get(8);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.action_ind</code>.
     * Индикатор действия
     */
    public void setActionInd(String value) {
        set(9, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.action_ind</code>.
     * Индикатор действия
     */
    public String getActionInd() {
        return (String) get(9);
    }

    /**
     * Setter for
     * <code>passport_international.core_mrcod_message.request_id</code>.
     * Идентификатор сообщения МРЦОД
     */
    public void setRequestId(String value) {
        set(10, value);
    }

    /**
     * Getter for
     * <code>passport_international.core_mrcod_message.request_id</code>.
     * Идентификатор сообщения МРЦОД
     */
    public String getRequestId() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row11<Long, String, Long, Long, Long, String, String, OffsetDateTime, OffsetDateTime, String, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    @Override
    public Row11<Long, String, Long, Long, Long, String, String, OffsetDateTime, OffsetDateTime, String, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    @Override
    public Field<Long> field1() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.MRCOD_MESSAGE_ID;
    }

    @Override
    public Field<String> field2() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.MRCOD_INTERACTION_ID_KEY;
    }

    @Override
    public Field<Long> field3() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.CORE_CASE_ID;
    }

    @Override
    public Field<Long> field4() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.SENDER_ID;
    }

    @Override
    public Field<Long> field5() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.RECEIVER_ID;
    }

    @Override
    public Field<String> field6() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.MESSAGE_TYPE_NAME;
    }

    @Override
    public Field<String> field7() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.MESSAGE_CONTENT_DESC;
    }

    @Override
    public Field<OffsetDateTime> field8() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.CREATE_DTTM;
    }

    @Override
    public Field<OffsetDateTime> field9() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.MODIFY_DTTM;
    }

    @Override
    public Field<String> field10() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.ACTION_IND;
    }

    @Override
    public Field<String> field11() {
        return CoreMrcodMessage.CORE_MRCOD_MESSAGE.REQUEST_ID;
    }

    @Override
    public Long component1() {
        return getMrcodMessageId();
    }

    @Override
    public String component2() {
        return getMrcodInteractionIdKey();
    }

    @Override
    public Long component3() {
        return getCoreCaseId();
    }

    @Override
    public Long component4() {
        return getSenderId();
    }

    @Override
    public Long component5() {
        return getReceiverId();
    }

    @Override
    public String component6() {
        return getMessageTypeName();
    }

    @Override
    public String component7() {
        return getMessageContentDesc();
    }

    @Override
    public OffsetDateTime component8() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime component9() {
        return getModifyDttm();
    }

    @Override
    public String component10() {
        return getActionInd();
    }

    @Override
    public String component11() {
        return getRequestId();
    }

    @Override
    public Long value1() {
        return getMrcodMessageId();
    }

    @Override
    public String value2() {
        return getMrcodInteractionIdKey();
    }

    @Override
    public Long value3() {
        return getCoreCaseId();
    }

    @Override
    public Long value4() {
        return getSenderId();
    }

    @Override
    public Long value5() {
        return getReceiverId();
    }

    @Override
    public String value6() {
        return getMessageTypeName();
    }

    @Override
    public String value7() {
        return getMessageContentDesc();
    }

    @Override
    public OffsetDateTime value8() {
        return getCreateDttm();
    }

    @Override
    public OffsetDateTime value9() {
        return getModifyDttm();
    }

    @Override
    public String value10() {
        return getActionInd();
    }

    @Override
    public String value11() {
        return getRequestId();
    }

    @Override
    public CoreMrcodMessageRecord value1(Long value) {
        setMrcodMessageId(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value2(String value) {
        setMrcodInteractionIdKey(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value3(Long value) {
        setCoreCaseId(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value4(Long value) {
        setSenderId(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value5(Long value) {
        setReceiverId(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value6(String value) {
        setMessageTypeName(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value7(String value) {
        setMessageContentDesc(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value8(OffsetDateTime value) {
        setCreateDttm(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value9(OffsetDateTime value) {
        setModifyDttm(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value10(String value) {
        setActionInd(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord value11(String value) {
        setRequestId(value);
        return this;
    }

    @Override
    public CoreMrcodMessageRecord values(Long value1, String value2, Long value3, Long value4, Long value5, String value6, String value7, OffsetDateTime value8, OffsetDateTime value9, String value10, String value11) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CoreMrcodMessageRecord
     */
    public CoreMrcodMessageRecord() {
        super(CoreMrcodMessage.CORE_MRCOD_MESSAGE);
    }

    /**
     * Create a detached, initialised CoreMrcodMessageRecord
     */
    public CoreMrcodMessageRecord(Long mrcodMessageId, String mrcodInteractionIdKey, Long coreCaseId, Long senderId, Long receiverId, String messageTypeName, String messageContentDesc, OffsetDateTime createDttm, OffsetDateTime modifyDttm, String actionInd, String requestId) {
        super(CoreMrcodMessage.CORE_MRCOD_MESSAGE);

        setMrcodMessageId(mrcodMessageId);
        setMrcodInteractionIdKey(mrcodInteractionIdKey);
        setCoreCaseId(coreCaseId);
        setSenderId(senderId);
        setReceiverId(receiverId);
        setMessageTypeName(messageTypeName);
        setMessageContentDesc(messageContentDesc);
        setCreateDttm(createDttm);
        setModifyDttm(modifyDttm);
        setActionInd(actionInd);
        setRequestId(requestId);
        resetChangedOnNotNull();
    }
}
