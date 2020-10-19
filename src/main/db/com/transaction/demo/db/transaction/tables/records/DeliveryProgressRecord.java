/*
 * This file is generated by jOOQ.
 */
package com.transaction.demo.db.transaction.tables.records;


import com.transaction.demo.db.transaction.tables.DeliveryProgress;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record6;
import org.jooq.Row6;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeliveryProgressRecord extends UpdatableRecordImpl<DeliveryProgressRecord> implements Record6<String, UInteger, UInteger, LocalDateTime, LocalDateTime, LocalDateTime> {

    private static final long serialVersionUID = -74092182;

    /**
     * Setter for <code>transaction_test.delivery_progress.delivery_content_id</code>.
     */
    public void setDeliveryContentId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>transaction_test.delivery_progress.delivery_content_id</code>.
     */
    public String getDeliveryContentId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>transaction_test.delivery_progress.send_unit_total</code>.
     */
    public void setSendUnitTotal(UInteger value) {
        set(1, value);
    }

    /**
     * Getter for <code>transaction_test.delivery_progress.send_unit_total</code>.
     */
    public UInteger getSendUnitTotal() {
        return (UInteger) get(1);
    }

    /**
     * Setter for <code>transaction_test.delivery_progress.send_unit_sent</code>.
     */
    public void setSendUnitSent(UInteger value) {
        set(2, value);
    }

    /**
     * Getter for <code>transaction_test.delivery_progress.send_unit_sent</code>.
     */
    public UInteger getSendUnitSent() {
        return (UInteger) get(2);
    }

    /**
     * Setter for <code>transaction_test.delivery_progress.created_at</code>.
     */
    public void setCreatedAt(LocalDateTime value) {
        set(3, value);
    }

    /**
     * Getter for <code>transaction_test.delivery_progress.created_at</code>.
     */
    public LocalDateTime getCreatedAt() {
        return (LocalDateTime) get(3);
    }

    /**
     * Setter for <code>transaction_test.delivery_progress.updated_at</code>.
     */
    public void setUpdatedAt(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>transaction_test.delivery_progress.updated_at</code>.
     */
    public LocalDateTime getUpdatedAt() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>transaction_test.delivery_progress.deleted_at</code>.
     */
    public void setDeletedAt(LocalDateTime value) {
        set(5, value);
    }

    /**
     * Getter for <code>transaction_test.delivery_progress.deleted_at</code>.
     */
    public LocalDateTime getDeletedAt() {
        return (LocalDateTime) get(5);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record6 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, UInteger, UInteger, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }

    @Override
    public Row6<String, UInteger, UInteger, LocalDateTime, LocalDateTime, LocalDateTime> valuesRow() {
        return (Row6) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return DeliveryProgress.DELIVERY_PROGRESS.DELIVERY_CONTENT_ID;
    }

    @Override
    public Field<UInteger> field2() {
        return DeliveryProgress.DELIVERY_PROGRESS.SEND_UNIT_TOTAL;
    }

    @Override
    public Field<UInteger> field3() {
        return DeliveryProgress.DELIVERY_PROGRESS.SEND_UNIT_SENT;
    }

    @Override
    public Field<LocalDateTime> field4() {
        return DeliveryProgress.DELIVERY_PROGRESS.CREATED_AT;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return DeliveryProgress.DELIVERY_PROGRESS.UPDATED_AT;
    }

    @Override
    public Field<LocalDateTime> field6() {
        return DeliveryProgress.DELIVERY_PROGRESS.DELETED_AT;
    }

    @Override
    public String component1() {
        return getDeliveryContentId();
    }

    @Override
    public UInteger component2() {
        return getSendUnitTotal();
    }

    @Override
    public UInteger component3() {
        return getSendUnitSent();
    }

    @Override
    public LocalDateTime component4() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime component5() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime component6() {
        return getDeletedAt();
    }

    @Override
    public String value1() {
        return getDeliveryContentId();
    }

    @Override
    public UInteger value2() {
        return getSendUnitTotal();
    }

    @Override
    public UInteger value3() {
        return getSendUnitSent();
    }

    @Override
    public LocalDateTime value4() {
        return getCreatedAt();
    }

    @Override
    public LocalDateTime value5() {
        return getUpdatedAt();
    }

    @Override
    public LocalDateTime value6() {
        return getDeletedAt();
    }

    @Override
    public DeliveryProgressRecord value1(String value) {
        setDeliveryContentId(value);
        return this;
    }

    @Override
    public DeliveryProgressRecord value2(UInteger value) {
        setSendUnitTotal(value);
        return this;
    }

    @Override
    public DeliveryProgressRecord value3(UInteger value) {
        setSendUnitSent(value);
        return this;
    }

    @Override
    public DeliveryProgressRecord value4(LocalDateTime value) {
        setCreatedAt(value);
        return this;
    }

    @Override
    public DeliveryProgressRecord value5(LocalDateTime value) {
        setUpdatedAt(value);
        return this;
    }

    @Override
    public DeliveryProgressRecord value6(LocalDateTime value) {
        setDeletedAt(value);
        return this;
    }

    @Override
    public DeliveryProgressRecord values(String value1, UInteger value2, UInteger value3, LocalDateTime value4, LocalDateTime value5, LocalDateTime value6) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeliveryProgressRecord
     */
    public DeliveryProgressRecord() {
        super(DeliveryProgress.DELIVERY_PROGRESS);
    }

    /**
     * Create a detached, initialised DeliveryProgressRecord
     */
    public DeliveryProgressRecord(String deliveryContentId, UInteger sendUnitTotal, UInteger sendUnitSent, LocalDateTime createdAt, LocalDateTime updatedAt, LocalDateTime deletedAt) {
        super(DeliveryProgress.DELIVERY_PROGRESS);

        set(0, deliveryContentId);
        set(1, sendUnitTotal);
        set(2, sendUnitSent);
        set(3, createdAt);
        set(4, updatedAt);
        set(5, deletedAt);
    }
}
