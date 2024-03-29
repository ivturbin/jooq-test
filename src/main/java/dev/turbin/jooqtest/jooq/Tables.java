/*
 * This file is generated by jOOQ.
 */
package dev.turbin.jooqtest.jooq;


import dev.turbin.jooqtest.jooq.tables.AsrpFpaChildRestrict;
import dev.turbin.jooqtest.jooq.tables.AsrpFpaChildRestrictAudit;
import dev.turbin.jooqtest.jooq.tables.AsrpFpaExtraInfo;
import dev.turbin.jooqtest.jooq.tables.AsrpFpaExtraInfoAudit;
import dev.turbin.jooqtest.jooq.tables.AsrpFpaKidsInfo;
import dev.turbin.jooqtest.jooq.tables.AsrpFpaKidsInfoAudit;
import dev.turbin.jooqtest.jooq.tables.BackgroundTask;
import dev.turbin.jooqtest.jooq.tables.BatchJobExecution;
import dev.turbin.jooqtest.jooq.tables.BatchJobExecutionContext;
import dev.turbin.jooqtest.jooq.tables.BatchJobExecutionParams;
import dev.turbin.jooqtest.jooq.tables.BatchJobInstance;
import dev.turbin.jooqtest.jooq.tables.BatchStepExecution;
import dev.turbin.jooqtest.jooq.tables.BatchStepExecutionContext;
import dev.turbin.jooqtest.jooq.tables.Charge;
import dev.turbin.jooqtest.jooq.tables.CoreAddress;
import dev.turbin.jooqtest.jooq.tables.CoreCase;
import dev.turbin.jooqtest.jooq.tables.CoreCaseAudit;
import dev.turbin.jooqtest.jooq.tables.CoreCaseTemp;
import dev.turbin.jooqtest.jooq.tables.CoreComment;
import dev.turbin.jooqtest.jooq.tables.CoreCommentAudit;
import dev.turbin.jooqtest.jooq.tables.CoreContactInfo;
import dev.turbin.jooqtest.jooq.tables.CoreContactInfoAudit;
import dev.turbin.jooqtest.jooq.tables.CoreCounter;
import dev.turbin.jooqtest.jooq.tables.CoreDocument;
import dev.turbin.jooqtest.jooq.tables.CoreDocumentAudit;
import dev.turbin.jooqtest.jooq.tables.CoreFileStorage;
import dev.turbin.jooqtest.jooq.tables.CoreFileStorageAudit;
import dev.turbin.jooqtest.jooq.tables.CoreMrcodMessage;
import dev.turbin.jooqtest.jooq.tables.CorePersonAddress;
import dev.turbin.jooqtest.jooq.tables.CorePersonAddressAudit;
import dev.turbin.jooqtest.jooq.tables.CorePersonDocument;
import dev.turbin.jooqtest.jooq.tables.CorePersonDocumentAudit;
import dev.turbin.jooqtest.jooq.tables.CorePersonDocumentExBirthRecord;
import dev.turbin.jooqtest.jooq.tables.CorePersonHiding;
import dev.turbin.jooqtest.jooq.tables.CoreProcedure;
import dev.turbin.jooqtest.jooq.tables.CoreSmevRequest;
import dev.turbin.jooqtest.jooq.tables.CoreSmevResponse;
import dev.turbin.jooqtest.jooq.tables.CoreUploadedApplication;
import dev.turbin.jooqtest.jooq.tables.CorrectionLog;
import dev.turbin.jooqtest.jooq.tables.Databasechangelog;
import dev.turbin.jooqtest.jooq.tables.Databasechangeloglock;
import dev.turbin.jooqtest.jooq.tables.DestructionAct;
import dev.turbin.jooqtest.jooq.tables.DestructionActHistory;
import dev.turbin.jooqtest.jooq.tables.Employment;
import dev.turbin.jooqtest.jooq.tables.EmploymentAudit;
import dev.turbin.jooqtest.jooq.tables.ErnError;
import dev.turbin.jooqtest.jooq.tables.ExportHistorySrc;
import dev.turbin.jooqtest.jooq.tables.ExternalInteraction;
import dev.turbin.jooqtest.jooq.tables.FileCorrectionLog;
import dev.turbin.jooqtest.jooq.tables.ForeignServiceErrors;
import dev.turbin.jooqtest.jooq.tables.FpBaseRestrict;
import dev.turbin.jooqtest.jooq.tables.FpBaseRestrictAudit;
import dev.turbin.jooqtest.jooq.tables.FpCancelRestrictCase;
import dev.turbin.jooqtest.jooq.tables.FpCancelRestrictCaseAudit;
import dev.turbin.jooqtest.jooq.tables.FpCase;
import dev.turbin.jooqtest.jooq.tables.FpCaseAlter;
import dev.turbin.jooqtest.jooq.tables.FpCaseAlterAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseInvalidation;
import dev.turbin.jooqtest.jooq.tables.FpCaseInvalidationAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseIssuance;
import dev.turbin.jooqtest.jooq.tables.FpCaseIssuanceAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseIssueRecall;
import dev.turbin.jooqtest.jooq.tables.FpCaseIssueRecallAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseLegalPerson;
import dev.turbin.jooqtest.jooq.tables.FpCaseLegalPersonAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseLoss;
import dev.turbin.jooqtest.jooq.tables.FpCaseLossAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseOtherLegalPerson;
import dev.turbin.jooqtest.jooq.tables.FpCaseRecall;
import dev.turbin.jooqtest.jooq.tables.FpCaseRecallAudit;
import dev.turbin.jooqtest.jooq.tables.FpCaseRestrict;
import dev.turbin.jooqtest.jooq.tables.FpCaseRestrictAudit;
import dev.turbin.jooqtest.jooq.tables.FpChildData;
import dev.turbin.jooqtest.jooq.tables.FpChildDataAudit;
import dev.turbin.jooqtest.jooq.tables.FpDecision;
import dev.turbin.jooqtest.jooq.tables.FpDecisionAudit;
import dev.turbin.jooqtest.jooq.tables.FpDeclineGetApplicationCase;
import dev.turbin.jooqtest.jooq.tables.FpDeclineGetApplicationCaseAudit;
import dev.turbin.jooqtest.jooq.tables.FpEmployment;
import dev.turbin.jooqtest.jooq.tables.FpEmploymentAudit;
import dev.turbin.jooqtest.jooq.tables.FpInformalLegalPerson;
import dev.turbin.jooqtest.jooq.tables.FpInformalLegalPersonAudit;
import dev.turbin.jooqtest.jooq.tables.FpPersonAddress;
import dev.turbin.jooqtest.jooq.tables.FpPersonAddressAudit;
import dev.turbin.jooqtest.jooq.tables.FpPersonChangeInfo;
import dev.turbin.jooqtest.jooq.tables.FpPersonChangeInfoAudit;
import dev.turbin.jooqtest.jooq.tables.FpPersonChangeInfoLink;
import dev.turbin.jooqtest.jooq.tables.FpPersonChangeInfoLinkAudit;
import dev.turbin.jooqtest.jooq.tables.FpPersonDocument;
import dev.turbin.jooqtest.jooq.tables.FpPersonDocumentAudit;
import dev.turbin.jooqtest.jooq.tables.FpPrint;
import dev.turbin.jooqtest.jooq.tables.FpRestrictInterval;
import dev.turbin.jooqtest.jooq.tables.FpRestrictIntervalAudit;
import dev.turbin.jooqtest.jooq.tables.FpSignalInformation;
import dev.turbin.jooqtest.jooq.tables.FpTranslateName;
import dev.turbin.jooqtest.jooq.tables.FpTranslateNameAudit;
import dev.turbin.jooqtest.jooq.tables.FpTranslateNameHistory;
import dev.turbin.jooqtest.jooq.tables.FpTranslateNameHistoryAudit;
import dev.turbin.jooqtest.jooq.tables.Measurement;
import dev.turbin.jooqtest.jooq.tables.NewBirthPlace;
import dev.turbin.jooqtest.jooq.tables.OrganizationInfo;
import dev.turbin.jooqtest.jooq.tables.OrganizationInfoAudit;
import dev.turbin.jooqtest.jooq.tables.PassLossInfo;
import dev.turbin.jooqtest.jooq.tables.Payment;
import dev.turbin.jooqtest.jooq.tables.PersonRole;
import dev.turbin.jooqtest.jooq.tables.PersonRoleAudit;
import dev.turbin.jooqtest.jooq.tables.PpotOpenCases;
import dev.turbin.jooqtest.jooq.tables.Shedlock;
import dev.turbin.jooqtest.jooq.tables.SpringSession;
import dev.turbin.jooqtest.jooq.tables.SpringSessionAttributes;
import dev.turbin.jooqtest.jooq.tables.TechnicalDefect;
import dev.turbin.jooqtest.jooq.tables.UploadedApplicationFile;
import dev.turbin.jooqtest.jooq.tables.UserTask;
import dev.turbin.jooqtest.jooq.tables.ViewCharge;
import dev.turbin.jooqtest.jooq.tables.ViewCoreAddress;
import dev.turbin.jooqtest.jooq.tables.ViewCoreCase;
import dev.turbin.jooqtest.jooq.tables.ViewCoreComment;
import dev.turbin.jooqtest.jooq.tables.ViewCoreContactInfo;
import dev.turbin.jooqtest.jooq.tables.ViewCoreCount;
import dev.turbin.jooqtest.jooq.tables.ViewCoreDoc;
import dev.turbin.jooqtest.jooq.tables.ViewCoreFileStorage;
import dev.turbin.jooqtest.jooq.tables.ViewCoreMrcodMessage;
import dev.turbin.jooqtest.jooq.tables.ViewCorePersonAddress;
import dev.turbin.jooqtest.jooq.tables.ViewCorePersonDoc;
import dev.turbin.jooqtest.jooq.tables.ViewCorePersonHidden;
import dev.turbin.jooqtest.jooq.tables.ViewCoreProcedure;
import dev.turbin.jooqtest.jooq.tables.ViewCoreRequest;
import dev.turbin.jooqtest.jooq.tables.ViewCoreResponse;
import dev.turbin.jooqtest.jooq.tables.ViewCoreUploadApplication;
import dev.turbin.jooqtest.jooq.tables.ViewDestructionAct;
import dev.turbin.jooqtest.jooq.tables.ViewDestructionActHistory;
import dev.turbin.jooqtest.jooq.tables.ViewEmployment;
import dev.turbin.jooqtest.jooq.tables.ViewExternalInteraction;
import dev.turbin.jooqtest.jooq.tables.ViewFpaBaseRestrict;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCancelRestrictCase;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCase;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseInvalid;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseIssue;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseIssueRequisition;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseLegalPerson;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseLoss;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseRequisition;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseRestrict;
import dev.turbin.jooqtest.jooq.tables.ViewFpaCaseValid;
import dev.turbin.jooqtest.jooq.tables.ViewFpaChildData;
import dev.turbin.jooqtest.jooq.tables.ViewFpaDecision;
import dev.turbin.jooqtest.jooq.tables.ViewFpaEmployment;
import dev.turbin.jooqtest.jooq.tables.ViewFpaLegalPersonRestrict;
import dev.turbin.jooqtest.jooq.tables.ViewFpaPersonAddress;
import dev.turbin.jooqtest.jooq.tables.ViewFpaPersonChangeInfo;
import dev.turbin.jooqtest.jooq.tables.ViewFpaPersonChangeInfoLink;
import dev.turbin.jooqtest.jooq.tables.ViewFpaPersonDoc;
import dev.turbin.jooqtest.jooq.tables.ViewFpaRejectionCase;
import dev.turbin.jooqtest.jooq.tables.ViewFpaRestrictInfo;
import dev.turbin.jooqtest.jooq.tables.ViewFpaTranslateName;
import dev.turbin.jooqtest.jooq.tables.ViewFpaTranslateNameHistory;
import dev.turbin.jooqtest.jooq.tables.ViewOrganizationInfo;
import dev.turbin.jooqtest.jooq.tables.ViewPayment;
import dev.turbin.jooqtest.jooq.tables.ViewUploadApplicationFile;


/**
 * Convenience access to all tables in passport_international.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * Ограничения выезда несовершеннолетнего из АС РП
     */
    public static final AsrpFpaChildRestrict ASRP_FPA_CHILD_RESTRICT = AsrpFpaChildRestrict.ASRP_FPA_CHILD_RESTRICT;

    /**
     * Таблица версионирования asrp_fpa_child_restrict
     */
    public static final AsrpFpaChildRestrictAudit ASRP_FPA_CHILD_RESTRICT_AUDIT = AsrpFpaChildRestrictAudit.ASRP_FPA_CHILD_RESTRICT_AUDIT;

    /**
     * The table <code>passport_international.asrp_fpa_extra_info</code>.
     */
    public static final AsrpFpaExtraInfo ASRP_FPA_EXTRA_INFO = AsrpFpaExtraInfo.ASRP_FPA_EXTRA_INFO;

    /**
     * Таблица версионирования asrp_fpa_extra_info
     */
    public static final AsrpFpaExtraInfoAudit ASRP_FPA_EXTRA_INFO_AUDIT = AsrpFpaExtraInfoAudit.ASRP_FPA_EXTRA_INFO_AUDIT;

    /**
     * The table <code>passport_international.asrp_fpa_kids_info</code>.
     */
    public static final AsrpFpaKidsInfo ASRP_FPA_KIDS_INFO = AsrpFpaKidsInfo.ASRP_FPA_KIDS_INFO;

    /**
     * Таблица версионирования asrp_fpa_kids_info
     */
    public static final AsrpFpaKidsInfoAudit ASRP_FPA_KIDS_INFO_AUDIT = AsrpFpaKidsInfoAudit.ASRP_FPA_KIDS_INFO_AUDIT;

    /**
     * Фоновая задача
     */
    public static final BackgroundTask BACKGROUND_TASK = BackgroundTask.BACKGROUND_TASK;

    /**
     * The table <code>passport_international.batch_job_execution</code>.
     */
    public static final BatchJobExecution BATCH_JOB_EXECUTION = BatchJobExecution.BATCH_JOB_EXECUTION;

    /**
     * The table
     * <code>passport_international.batch_job_execution_context</code>.
     */
    public static final BatchJobExecutionContext BATCH_JOB_EXECUTION_CONTEXT = BatchJobExecutionContext.BATCH_JOB_EXECUTION_CONTEXT;

    /**
     * The table <code>passport_international.batch_job_execution_params</code>.
     */
    public static final BatchJobExecutionParams BATCH_JOB_EXECUTION_PARAMS = BatchJobExecutionParams.BATCH_JOB_EXECUTION_PARAMS;

    /**
     * The table <code>passport_international.batch_job_instance</code>.
     */
    public static final BatchJobInstance BATCH_JOB_INSTANCE = BatchJobInstance.BATCH_JOB_INSTANCE;

    /**
     * The table <code>passport_international.batch_step_execution</code>.
     */
    public static final BatchStepExecution BATCH_STEP_EXECUTION = BatchStepExecution.BATCH_STEP_EXECUTION;

    /**
     * The table
     * <code>passport_international.batch_step_execution_context</code>.
     */
    public static final BatchStepExecutionContext BATCH_STEP_EXECUTION_CONTEXT = BatchStepExecutionContext.BATCH_STEP_EXECUTION_CONTEXT;

    /**
     * Начисление
     */
    public static final Charge CHARGE = Charge.CHARGE;

    /**
     * адрес
     */
    public static final CoreAddress CORE_ADDRESS = CoreAddress.CORE_ADDRESS;

    /**
     * Базовый класс дела о предоставлении услуги
     */
    public static final CoreCase CORE_CASE = CoreCase.CORE_CASE;

    /**
     * Таблица версионирования core_case
     */
    public static final CoreCaseAudit CORE_CASE_AUDIT = CoreCaseAudit.CORE_CASE_AUDIT;

    /**
     * Записи о предделах/черновиках дел
     */
    public static final CoreCaseTemp CORE_CASE_TEMP = CoreCaseTemp.CORE_CASE_TEMP;

    /**
     * Комментарии к делу
     */
    public static final CoreComment CORE_COMMENT = CoreComment.CORE_COMMENT;

    /**
     * Таблица версионирования core_comment
     */
    public static final CoreCommentAudit CORE_COMMENT_AUDIT = CoreCommentAudit.CORE_COMMENT_AUDIT;

    /**
     * Контактная информация заявителя
     */
    public static final CoreContactInfo CORE_CONTACT_INFO = CoreContactInfo.CORE_CONTACT_INFO;

    /**
     * Таблица версионирования core_contact_info
     */
    public static final CoreContactInfoAudit CORE_CONTACT_INFO_AUDIT = CoreContactInfoAudit.CORE_CONTACT_INFO_AUDIT;

    /**
     * Таблица счётчиков номеров дел
     */
    public static final CoreCounter CORE_COUNTER = CoreCounter.CORE_COUNTER;

    /**
     * Документ
     */
    public static final CoreDocument CORE_DOCUMENT = CoreDocument.CORE_DOCUMENT;

    /**
     * Таблица версионирования core_document
     */
    public static final CoreDocumentAudit CORE_DOCUMENT_AUDIT = CoreDocumentAudit.CORE_DOCUMENT_AUDIT;

    /**
     * Связанные файлы с делом
     */
    public static final CoreFileStorage CORE_FILE_STORAGE = CoreFileStorage.CORE_FILE_STORAGE;

    /**
     * Таблица версионирования core_file_storage
     */
    public static final CoreFileStorageAudit CORE_FILE_STORAGE_AUDIT = CoreFileStorageAudit.CORE_FILE_STORAGE_AUDIT;

    /**
     * Таблица для запросов МРЦОД
     */
    public static final CoreMrcodMessage CORE_MRCOD_MESSAGE = CoreMrcodMessage.CORE_MRCOD_MESSAGE;

    /**
     * Регистрация физического лица по адресу
     */
    public static final CorePersonAddress CORE_PERSON_ADDRESS = CorePersonAddress.CORE_PERSON_ADDRESS;

    /**
     * Таблица версионирования core_person_address
     */
    public static final CorePersonAddressAudit CORE_PERSON_ADDRESS_AUDIT = CorePersonAddressAudit.CORE_PERSON_ADDRESS_AUDIT;

    /**
     * Установочные данные ФЛ и ДУЛ для дела.
     */
    public static final CorePersonDocument CORE_PERSON_DOCUMENT = CorePersonDocument.CORE_PERSON_DOCUMENT;

    /**
     * Таблица версионирования core_person_document
     */
    public static final CorePersonDocumentAudit CORE_PERSON_DOCUMENT_AUDIT = CorePersonDocumentAudit.CORE_PERSON_DOCUMENT_AUDIT;

    /**
     * Таблица для хранения записей актов о рождении
     */
    public static final CorePersonDocumentExBirthRecord CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD = CorePersonDocumentExBirthRecord.CORE_PERSON_DOCUMENT_EX_BIRTH_RECORD;

    /**
     * Таблица сокрытых ФЛ
     */
    public static final CorePersonHiding CORE_PERSON_HIDING = CorePersonHiding.CORE_PERSON_HIDING;

    /**
     * Процедуры дела
     */
    public static final CoreProcedure CORE_PROCEDURE = CoreProcedure.CORE_PROCEDURE;

    /**
     * Таблица для запросов от smev
     */
    public static final CoreSmevRequest CORE_SMEV_REQUEST = CoreSmevRequest.CORE_SMEV_REQUEST;

    /**
     * Таблица для ответов smev
     */
    public static final CoreSmevResponse CORE_SMEV_RESPONSE = CoreSmevResponse.CORE_SMEV_RESPONSE;

    /**
     * Загруженные заявления
     */
    public static final CoreUploadedApplication CORE_UPLOADED_APPLICATION = CoreUploadedApplication.CORE_UPLOADED_APPLICATION;

    /**
     * Базовая таблица коррекции
     */
    public static final CorrectionLog CORRECTION_LOG = CorrectionLog.CORRECTION_LOG;

    /**
     * The table <code>passport_international.databasechangelog</code>.
     */
    public static final Databasechangelog DATABASECHANGELOG = Databasechangelog.DATABASECHANGELOG;

    /**
     * The table <code>passport_international.databasechangeloglock</code>.
     */
    public static final Databasechangeloglock DATABASECHANGELOGLOCK = Databasechangeloglock.DATABASECHANGELOGLOCK;

    /**
     * Акт уничтожения бланков заграна
     */
    public static final DestructionAct DESTRUCTION_ACT = DestructionAct.DESTRUCTION_ACT;

    /**
     * История актов уничтожения бланков заграна
     */
    public static final DestructionActHistory DESTRUCTION_ACT_HISTORY = DestructionActHistory.DESTRUCTION_ACT_HISTORY;

    /**
     * запись о трудовой деятельности.
     */
    public static final Employment EMPLOYMENT = Employment.EMPLOYMENT;

    /**
     * Таблица версионирования employment
     */
    public static final EmploymentAudit EMPLOYMENT_AUDIT = EmploymentAudit.EMPLOYMENT_AUDIT;

    /**
     * Сведения об ошибках, пришедших от ЕРН
     */
    public static final ErnError ERN_ERROR = ErnError.ERN_ERROR;

    /**
     * История выгрузок информации по делам во внешние системы (Смигрировано с
     * ППОТ)
     */
    public static final ExportHistorySrc EXPORT_HISTORY_SRC = ExportHistorySrc.EXPORT_HISTORY_SRC;

    /**
     * Таблица внешних взаимодействий
     */
    public static final ExternalInteraction EXTERNAL_INTERACTION = ExternalInteraction.EXTERNAL_INTERACTION;

    /**
     * Таблица ссылок на ФХ для документов-оснований коррекции
     */
    public static final FileCorrectionLog FILE_CORRECTION_LOG = FileCorrectionLog.FILE_CORRECTION_LOG;

    /**
     * Ошибки сторонних учетов
     */
    public static final ForeignServiceErrors FOREIGN_SERVICE_ERRORS = ForeignServiceErrors.FOREIGN_SERVICE_ERRORS;

    /**
     * Ограничение выезда
     */
    public static final FpBaseRestrict FP_BASE_RESTRICT = FpBaseRestrict.FP_BASE_RESTRICT;

    /**
     * Таблица версионирования fp_base_restrict
     */
    public static final FpBaseRestrictAudit FP_BASE_RESTRICT_AUDIT = FpBaseRestrictAudit.FP_BASE_RESTRICT_AUDIT;

    /**
     * Дело об отмене ограничений
     */
    public static final FpCancelRestrictCase FP_CANCEL_RESTRICT_CASE = FpCancelRestrictCase.FP_CANCEL_RESTRICT_CASE;

    /**
     * Таблица версионирования fp_cancel_restrict_case
     */
    public static final FpCancelRestrictCaseAudit FP_CANCEL_RESTRICT_CASE_AUDIT = FpCancelRestrictCaseAudit.FP_CANCEL_RESTRICT_CASE_AUDIT;

    /**
     * Базовая таблица дел модуля Заграничный паспорт
     */
    public static final FpCase FP_CASE = FpCase.FP_CASE;

    /**
     * Дело о внесении изменений в действующий заграничный паспорт
     */
    public static final FpCaseAlter FP_CASE_ALTER = FpCaseAlter.FP_CASE_ALTER;

    /**
     * Таблица версионирования fp_case_alter
     */
    public static final FpCaseAlterAudit FP_CASE_ALTER_AUDIT = FpCaseAlterAudit.FP_CASE_ALTER_AUDIT;

    /**
     * Таблица версионирования fp_case
     */
    public static final FpCaseAudit FP_CASE_AUDIT = FpCaseAudit.FP_CASE_AUDIT;

    /**
     * Дело об объявлении загранпаспорта недействительным
     */
    public static final FpCaseInvalidation FP_CASE_INVALIDATION = FpCaseInvalidation.FP_CASE_INVALIDATION;

    /**
     * Таблица версионирования fp_case_invalidation
     */
    public static final FpCaseInvalidationAudit FP_CASE_INVALIDATION_AUDIT = FpCaseInvalidationAudit.FP_CASE_INVALIDATION_AUDIT;

    /**
     * Дело о выдаче заграничного паспорта
     */
    public static final FpCaseIssuance FP_CASE_ISSUANCE = FpCaseIssuance.FP_CASE_ISSUANCE;

    /**
     * Таблица версионирования fp_case_issuance
     */
    public static final FpCaseIssuanceAudit FP_CASE_ISSUANCE_AUDIT = FpCaseIssuanceAudit.FP_CASE_ISSUANCE_AUDIT;

    /**
     * Дело о выдаче изъятого заграничного паспорта
     */
    public static final FpCaseIssueRecall FP_CASE_ISSUE_RECALL = FpCaseIssueRecall.FP_CASE_ISSUE_RECALL;

    /**
     * Таблица версионирования fp_case_issue_recall
     */
    public static final FpCaseIssueRecallAudit FP_CASE_ISSUE_RECALL_AUDIT = FpCaseIssueRecallAudit.FP_CASE_ISSUE_RECALL_AUDIT;

    /**
     * Таблица связи законных представителей с делом
     */
    public static final FpCaseLegalPerson FP_CASE_LEGAL_PERSON = FpCaseLegalPerson.FP_CASE_LEGAL_PERSON;

    /**
     * Таблица версионирования fp_case_legal_person
     */
    public static final FpCaseLegalPersonAudit FP_CASE_LEGAL_PERSON_AUDIT = FpCaseLegalPersonAudit.FP_CASE_LEGAL_PERSON_AUDIT;

    /**
     * Дело об утрате заграничного паспорта
     */
    public static final FpCaseLoss FP_CASE_LOSS = FpCaseLoss.FP_CASE_LOSS;

    /**
     * Таблица версионирования fp_case_loss
     */
    public static final FpCaseLossAudit FP_CASE_LOSS_AUDIT = FpCaseLossAudit.FP_CASE_LOSS_AUDIT;

    /**
     * Сведения о другом законном представителе, имеющем право на получение
     * паспорта
     */
    public static final FpCaseOtherLegalPerson FP_CASE_OTHER_LEGAL_PERSON = FpCaseOtherLegalPerson.FP_CASE_OTHER_LEGAL_PERSON;

    /**
     * Дело об изъятии заграничного паспорта
     */
    public static final FpCaseRecall FP_CASE_RECALL = FpCaseRecall.FP_CASE_RECALL;

    /**
     * Таблица версионирования fp_case_recall
     */
    public static final FpCaseRecallAudit FP_CASE_RECALL_AUDIT = FpCaseRecallAudit.FP_CASE_RECALL_AUDIT;

    /**
     * Сведения о накладываемом ограничении выезда
     */
    public static final FpCaseRestrict FP_CASE_RESTRICT = FpCaseRestrict.FP_CASE_RESTRICT;

    /**
     * Таблица версионирования fp_case_restrict
     */
    public static final FpCaseRestrictAudit FP_CASE_RESTRICT_AUDIT = FpCaseRestrictAudit.FP_CASE_RESTRICT_AUDIT;

    /**
     * Список детей
     */
    public static final FpChildData FP_CHILD_DATA = FpChildData.FP_CHILD_DATA;

    /**
     * Таблица версионирования fp_child_data
     */
    public static final FpChildDataAudit FP_CHILD_DATA_AUDIT = FpChildDataAudit.FP_CHILD_DATA_AUDIT;

    /**
     * Решение по делу модуля ЗП
     */
    public static final FpDecision FP_DECISION = FpDecision.FP_DECISION;

    /**
     * Таблица версионирования fp_decision
     */
    public static final FpDecisionAudit FP_DECISION_AUDIT = FpDecisionAudit.FP_DECISION_AUDIT;

    /**
     * Дело об отказе приеме документов
     */
    public static final FpDeclineGetApplicationCase FP_DECLINE_GET_APPLICATION_CASE = FpDeclineGetApplicationCase.FP_DECLINE_GET_APPLICATION_CASE;

    /**
     * Таблица версионирования fp_decline_get_application_case
     */
    public static final FpDeclineGetApplicationCaseAudit FP_DECLINE_GET_APPLICATION_CASE_AUDIT = FpDeclineGetApplicationCaseAudit.FP_DECLINE_GET_APPLICATION_CASE_AUDIT;

    /**
     * Трудовая деятельсность в заявлении ЗП
     */
    public static final FpEmployment FP_EMPLOYMENT = FpEmployment.FP_EMPLOYMENT;

    /**
     * Таблица версионирования fp_employment
     */
    public static final FpEmploymentAudit FP_EMPLOYMENT_AUDIT = FpEmploymentAudit.FP_EMPLOYMENT_AUDIT;

    /**
     * Данные законного представителя выезд с которым запрещен
     */
    public static final FpInformalLegalPerson FP_INFORMAL_LEGAL_PERSON = FpInformalLegalPerson.FP_INFORMAL_LEGAL_PERSON;

    /**
     * Таблица версионирования fp_informal_legal_person
     */
    public static final FpInformalLegalPersonAudit FP_INFORMAL_LEGAL_PERSON_AUDIT = FpInformalLegalPersonAudit.FP_INFORMAL_LEGAL_PERSON_AUDIT;

    /**
     * Адресс ФЛ в модуле заграна
     */
    public static final FpPersonAddress FP_PERSON_ADDRESS = FpPersonAddress.FP_PERSON_ADDRESS;

    /**
     * Таблица версионирования fp_person_address
     */
    public static final FpPersonAddressAudit FP_PERSON_ADDRESS_AUDIT = FpPersonAddressAudit.FP_PERSON_ADDRESS_AUDIT;

    /**
     * Сведения об изменении персональных данных
     */
    public static final FpPersonChangeInfo FP_PERSON_CHANGE_INFO = FpPersonChangeInfo.FP_PERSON_CHANGE_INFO;

    /**
     * Таблица версионирования fp_person_change_info
     */
    public static final FpPersonChangeInfoAudit FP_PERSON_CHANGE_INFO_AUDIT = FpPersonChangeInfoAudit.FP_PERSON_CHANGE_INFO_AUDIT;

    /**
     * Сведения об изменении персональных данных
     */
    public static final FpPersonChangeInfoLink FP_PERSON_CHANGE_INFO_LINK = FpPersonChangeInfoLink.FP_PERSON_CHANGE_INFO_LINK;

    /**
     * Таблица версионирования fp_person_change_info_link
     */
    public static final FpPersonChangeInfoLinkAudit FP_PERSON_CHANGE_INFO_LINK_AUDIT = FpPersonChangeInfoLinkAudit.FP_PERSON_CHANGE_INFO_LINK_AUDIT;

    /**
     * ДУЛ для модуля загранпаспорта
     */
    public static final FpPersonDocument FP_PERSON_DOCUMENT = FpPersonDocument.FP_PERSON_DOCUMENT;

    /**
     * Таблица версионирования fp_person_document
     */
    public static final FpPersonDocumentAudit FP_PERSON_DOCUMENT_AUDIT = FpPersonDocumentAudit.FP_PERSON_DOCUMENT_AUDIT;

    /**
     * The table <code>passport_international.fp_print</code>.
     */
    public static final FpPrint FP_PRINT = FpPrint.FP_PRINT;

    /**
     * Даты и страны ограниченные на выезд
     */
    public static final FpRestrictInterval FP_RESTRICT_INTERVAL = FpRestrictInterval.FP_RESTRICT_INTERVAL;

    /**
     * Таблица версионирования fp_restrict_interval
     */
    public static final FpRestrictIntervalAudit FP_RESTRICT_INTERVAL_AUDIT = FpRestrictIntervalAudit.FP_RESTRICT_INTERVAL_AUDIT;

    /**
     * Таблица по учету сигналов
     */
    public static final FpSignalInformation FP_SIGNAL_INFORMATION = FpSignalInformation.FP_SIGNAL_INFORMATION;

    /**
     * Запись об транслитерации имени
     */
    public static final FpTranslateName FP_TRANSLATE_NAME = FpTranslateName.FP_TRANSLATE_NAME;

    /**
     * Таблица версионирования fp_translate_name
     */
    public static final FpTranslateNameAudit FP_TRANSLATE_NAME_AUDIT = FpTranslateNameAudit.FP_TRANSLATE_NAME_AUDIT;

    /**
     * Таблица учета изменений транслитерации имени
     */
    public static final FpTranslateNameHistory FP_TRANSLATE_NAME_HISTORY = FpTranslateNameHistory.FP_TRANSLATE_NAME_HISTORY;

    /**
     * Таблица версионирования fp_translate_name_history
     */
    public static final FpTranslateNameHistoryAudit FP_TRANSLATE_NAME_HISTORY_AUDIT = FpTranslateNameHistoryAudit.FP_TRANSLATE_NAME_HISTORY_AUDIT;

    /**
     * The table <code>passport_international.measurement</code>.
     */
    public static final Measurement MEASUREMENT = Measurement.MEASUREMENT;

    /**
     * Сведения о новом месте рождения
     */
    public static final NewBirthPlace NEW_BIRTH_PLACE = NewBirthPlace.NEW_BIRTH_PLACE;

    /**
     * Таблица информации об организации.
     */
    public static final OrganizationInfo ORGANIZATION_INFO = OrganizationInfo.ORGANIZATION_INFO;

    /**
     * Таблица версионирования organization_info
     */
    public static final OrganizationInfoAudit ORGANIZATION_INFO_AUDIT = OrganizationInfoAudit.ORGANIZATION_INFO_AUDIT;

    /**
     * The table <code>passport_international.pass_loss_info</code>.
     */
    public static final PassLossInfo PASS_LOSS_INFO = PassLossInfo.PASS_LOSS_INFO;

    /**
     * Информация о платежах
     */
    public static final Payment PAYMENT = Payment.PAYMENT;

    /**
     * Роль ФЛ в деле
     */
    public static final PersonRole PERSON_ROLE = PersonRole.PERSON_ROLE;

    /**
     * Таблица версионирования person_role
     */
    public static final PersonRoleAudit PERSON_ROLE_AUDIT = PersonRoleAudit.PERSON_ROLE_AUDIT;

    /**
     * Открытые дела в системе ППОТ.
     */
    public static final PpotOpenCases PPOT_OPEN_CASES = PpotOpenCases.PPOT_OPEN_CASES;

    /**
     * The table <code>passport_international.shedlock</code>.
     */
    public static final Shedlock SHEDLOCK = Shedlock.SHEDLOCK;

    /**
     * The table <code>passport_international.spring_session</code>.
     */
    public static final SpringSession SPRING_SESSION = SpringSession.SPRING_SESSION;

    /**
     * The table <code>passport_international.spring_session_attributes</code>.
     */
    public static final SpringSessionAttributes SPRING_SESSION_ATTRIBUTES = SpringSessionAttributes.SPRING_SESSION_ATTRIBUTES;

    /**
     * Бланки загран паспортов, признанные браком печати
     */
    public static final TechnicalDefect TECHNICAL_DEFECT = TechnicalDefect.TECHNICAL_DEFECT;

    /**
     * Файлы (документы) для загруженных заявлений
     */
    public static final UploadedApplicationFile UPLOADED_APPLICATION_FILE = UploadedApplicationFile.UPLOADED_APPLICATION_FILE;

    /**
     * The table <code>passport_international.user_task</code>.
     */
    public static final UserTask USER_TASK = UserTask.USER_TASK;

    /**
     * The table <code>passport_international.view_charge</code>.
     */
    public static final ViewCharge VIEW_CHARGE = ViewCharge.VIEW_CHARGE;

    /**
     * The table <code>passport_international.view_core_address</code>.
     */
    public static final ViewCoreAddress VIEW_CORE_ADDRESS = ViewCoreAddress.VIEW_CORE_ADDRESS;

    /**
     * The table <code>passport_international.view_core_case</code>.
     */
    public static final ViewCoreCase VIEW_CORE_CASE = ViewCoreCase.VIEW_CORE_CASE;

    /**
     * The table <code>passport_international.view_core_comment</code>.
     */
    public static final ViewCoreComment VIEW_CORE_COMMENT = ViewCoreComment.VIEW_CORE_COMMENT;

    /**
     * The table <code>passport_international.view_core_contact_info</code>.
     */
    public static final ViewCoreContactInfo VIEW_CORE_CONTACT_INFO = ViewCoreContactInfo.VIEW_CORE_CONTACT_INFO;

    /**
     * The table <code>passport_international.view_core_count</code>.
     */
    public static final ViewCoreCount VIEW_CORE_COUNT = ViewCoreCount.VIEW_CORE_COUNT;

    /**
     * The table <code>passport_international.view_core_doc</code>.
     */
    public static final ViewCoreDoc VIEW_CORE_DOC = ViewCoreDoc.VIEW_CORE_DOC;

    /**
     * The table <code>passport_international.view_core_file_storage</code>.
     */
    public static final ViewCoreFileStorage VIEW_CORE_FILE_STORAGE = ViewCoreFileStorage.VIEW_CORE_FILE_STORAGE;

    /**
     * The table <code>passport_international.view_core_mrcod_message</code>.
     */
    public static final ViewCoreMrcodMessage VIEW_CORE_MRCOD_MESSAGE = ViewCoreMrcodMessage.VIEW_CORE_MRCOD_MESSAGE;

    /**
     * The table <code>passport_international.view_core_person_address</code>.
     */
    public static final ViewCorePersonAddress VIEW_CORE_PERSON_ADDRESS = ViewCorePersonAddress.VIEW_CORE_PERSON_ADDRESS;

    /**
     * The table <code>passport_international.view_core_person_doc</code>.
     */
    public static final ViewCorePersonDoc VIEW_CORE_PERSON_DOC = ViewCorePersonDoc.VIEW_CORE_PERSON_DOC;

    /**
     * The table <code>passport_international.view_core_person_hidden</code>.
     */
    public static final ViewCorePersonHidden VIEW_CORE_PERSON_HIDDEN = ViewCorePersonHidden.VIEW_CORE_PERSON_HIDDEN;

    /**
     * The table <code>passport_international.view_core_procedure</code>.
     */
    public static final ViewCoreProcedure VIEW_CORE_PROCEDURE = ViewCoreProcedure.VIEW_CORE_PROCEDURE;

    /**
     * The table <code>passport_international.view_core_request</code>.
     */
    public static final ViewCoreRequest VIEW_CORE_REQUEST = ViewCoreRequest.VIEW_CORE_REQUEST;

    /**
     * The table <code>passport_international.view_core_response</code>.
     */
    public static final ViewCoreResponse VIEW_CORE_RESPONSE = ViewCoreResponse.VIEW_CORE_RESPONSE;

    /**
     * The table
     * <code>passport_international.view_core_upload_application</code>.
     */
    public static final ViewCoreUploadApplication VIEW_CORE_UPLOAD_APPLICATION = ViewCoreUploadApplication.VIEW_CORE_UPLOAD_APPLICATION;

    /**
     * The table <code>passport_international.view_destruction_act</code>.
     */
    public static final ViewDestructionAct VIEW_DESTRUCTION_ACT = ViewDestructionAct.VIEW_DESTRUCTION_ACT;

    /**
     * The table
     * <code>passport_international.view_destruction_act_history</code>.
     */
    public static final ViewDestructionActHistory VIEW_DESTRUCTION_ACT_HISTORY = ViewDestructionActHistory.VIEW_DESTRUCTION_ACT_HISTORY;

    /**
     * The table <code>passport_international.view_employment</code>.
     */
    public static final ViewEmployment VIEW_EMPLOYMENT = ViewEmployment.VIEW_EMPLOYMENT;

    /**
     * The table <code>passport_international.view_external_interaction</code>.
     */
    public static final ViewExternalInteraction VIEW_EXTERNAL_INTERACTION = ViewExternalInteraction.VIEW_EXTERNAL_INTERACTION;

    /**
     * The table <code>passport_international.view_fpa_base_restrict</code>.
     */
    public static final ViewFpaBaseRestrict VIEW_FPA_BASE_RESTRICT = ViewFpaBaseRestrict.VIEW_FPA_BASE_RESTRICT;

    /**
     * The table
     * <code>passport_international.view_fpa_cancel_restrict_case</code>.
     */
    public static final ViewFpaCancelRestrictCase VIEW_FPA_CANCEL_RESTRICT_CASE = ViewFpaCancelRestrictCase.VIEW_FPA_CANCEL_RESTRICT_CASE;

    /**
     * The table <code>passport_international.view_fpa_case</code>.
     */
    public static final ViewFpaCase VIEW_FPA_CASE = ViewFpaCase.VIEW_FPA_CASE;

    /**
     * The table <code>passport_international.view_fpa_case_invalid</code>.
     */
    public static final ViewFpaCaseInvalid VIEW_FPA_CASE_INVALID = ViewFpaCaseInvalid.VIEW_FPA_CASE_INVALID;

    /**
     * The table <code>passport_international.view_fpa_case_issue</code>.
     */
    public static final ViewFpaCaseIssue VIEW_FPA_CASE_ISSUE = ViewFpaCaseIssue.VIEW_FPA_CASE_ISSUE;

    /**
     * The table
     * <code>passport_international.view_fpa_case_issue_requisition</code>.
     */
    public static final ViewFpaCaseIssueRequisition VIEW_FPA_CASE_ISSUE_REQUISITION = ViewFpaCaseIssueRequisition.VIEW_FPA_CASE_ISSUE_REQUISITION;

    /**
     * The table <code>passport_international.view_fpa_case_legal_person</code>.
     */
    public static final ViewFpaCaseLegalPerson VIEW_FPA_CASE_LEGAL_PERSON = ViewFpaCaseLegalPerson.VIEW_FPA_CASE_LEGAL_PERSON;

    /**
     * The table <code>passport_international.view_fpa_case_loss</code>.
     */
    public static final ViewFpaCaseLoss VIEW_FPA_CASE_LOSS = ViewFpaCaseLoss.VIEW_FPA_CASE_LOSS;

    /**
     * The table <code>passport_international.view_fpa_case_requisition</code>.
     */
    public static final ViewFpaCaseRequisition VIEW_FPA_CASE_REQUISITION = ViewFpaCaseRequisition.VIEW_FPA_CASE_REQUISITION;

    /**
     * The table <code>passport_international.view_fpa_case_restrict</code>.
     */
    public static final ViewFpaCaseRestrict VIEW_FPA_CASE_RESTRICT = ViewFpaCaseRestrict.VIEW_FPA_CASE_RESTRICT;

    /**
     * The table <code>passport_international.view_fpa_case_valid</code>.
     */
    public static final ViewFpaCaseValid VIEW_FPA_CASE_VALID = ViewFpaCaseValid.VIEW_FPA_CASE_VALID;

    /**
     * The table <code>passport_international.view_fpa_child_data</code>.
     */
    public static final ViewFpaChildData VIEW_FPA_CHILD_DATA = ViewFpaChildData.VIEW_FPA_CHILD_DATA;

    /**
     * The table <code>passport_international.view_fpa_decision</code>.
     */
    public static final ViewFpaDecision VIEW_FPA_DECISION = ViewFpaDecision.VIEW_FPA_DECISION;

    /**
     * The table <code>passport_international.view_fpa_employment</code>.
     */
    public static final ViewFpaEmployment VIEW_FPA_EMPLOYMENT = ViewFpaEmployment.VIEW_FPA_EMPLOYMENT;

    /**
     * The table
     * <code>passport_international.view_fpa_legal_person_restrict</code>.
     */
    public static final ViewFpaLegalPersonRestrict VIEW_FPA_LEGAL_PERSON_RESTRICT = ViewFpaLegalPersonRestrict.VIEW_FPA_LEGAL_PERSON_RESTRICT;

    /**
     * The table <code>passport_international.view_fpa_person_address</code>.
     */
    public static final ViewFpaPersonAddress VIEW_FPA_PERSON_ADDRESS = ViewFpaPersonAddress.VIEW_FPA_PERSON_ADDRESS;

    /**
     * The table
     * <code>passport_international.view_fpa_person_change_info</code>.
     */
    public static final ViewFpaPersonChangeInfo VIEW_FPA_PERSON_CHANGE_INFO = ViewFpaPersonChangeInfo.VIEW_FPA_PERSON_CHANGE_INFO;

    /**
     * The table
     * <code>passport_international.view_fpa_person_change_info_link</code>.
     */
    public static final ViewFpaPersonChangeInfoLink VIEW_FPA_PERSON_CHANGE_INFO_LINK = ViewFpaPersonChangeInfoLink.VIEW_FPA_PERSON_CHANGE_INFO_LINK;

    /**
     * The table <code>passport_international.view_fpa_person_doc</code>.
     */
    public static final ViewFpaPersonDoc VIEW_FPA_PERSON_DOC = ViewFpaPersonDoc.VIEW_FPA_PERSON_DOC;

    /**
     * The table <code>passport_international.view_fpa_rejection_case</code>.
     */
    public static final ViewFpaRejectionCase VIEW_FPA_REJECTION_CASE = ViewFpaRejectionCase.VIEW_FPA_REJECTION_CASE;

    /**
     * The table <code>passport_international.view_fpa_restrict_info</code>.
     */
    public static final ViewFpaRestrictInfo VIEW_FPA_RESTRICT_INFO = ViewFpaRestrictInfo.VIEW_FPA_RESTRICT_INFO;

    /**
     * The table <code>passport_international.view_fpa_translate_name</code>.
     */
    public static final ViewFpaTranslateName VIEW_FPA_TRANSLATE_NAME = ViewFpaTranslateName.VIEW_FPA_TRANSLATE_NAME;

    /**
     * The table
     * <code>passport_international.view_fpa_translate_name_history</code>.
     */
    public static final ViewFpaTranslateNameHistory VIEW_FPA_TRANSLATE_NAME_HISTORY = ViewFpaTranslateNameHistory.VIEW_FPA_TRANSLATE_NAME_HISTORY;

    /**
     * The table <code>passport_international.view_organization_info</code>.
     */
    public static final ViewOrganizationInfo VIEW_ORGANIZATION_INFO = ViewOrganizationInfo.VIEW_ORGANIZATION_INFO;

    /**
     * The table <code>passport_international.view_payment</code>.
     */
    public static final ViewPayment VIEW_PAYMENT = ViewPayment.VIEW_PAYMENT;

    /**
     * The table
     * <code>passport_international.view_upload_application_file</code>.
     */
    public static final ViewUploadApplicationFile VIEW_UPLOAD_APPLICATION_FILE = ViewUploadApplicationFile.VIEW_UPLOAD_APPLICATION_FILE;
}