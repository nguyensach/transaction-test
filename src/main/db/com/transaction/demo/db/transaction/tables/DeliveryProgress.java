/*
 * This file is generated by jOOQ.
 */
package com.transaction.demo.db.transaction.tables;


import com.transaction.demo.db.transaction.Keys;
import com.transaction.demo.db.transaction.TransactionTest;
import com.transaction.demo.db.transaction.tables.records.DeliveryProgressRecord;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row6;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DeliveryProgress extends TableImpl<DeliveryProgressRecord> {

    private static final long serialVersionUID = 1104468520;

    /**
     * The reference instance of <code>transaction_test.delivery_progress</code>
     */
    public static final DeliveryProgress DELIVERY_PROGRESS = new DeliveryProgress();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DeliveryProgressRecord> getRecordType() {
        return DeliveryProgressRecord.class;
    }

    /**
     * The column <code>transaction_test.delivery_progress.delivery_content_id</code>.
     */
    public final TableField<DeliveryProgressRecord, String> DELIVERY_CONTENT_ID = createField(DSL.name("delivery_content_id"), org.jooq.impl.SQLDataType.VARCHAR(255).nullable(false).defaultValue(org.jooq.impl.DSL.inline("", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>transaction_test.delivery_progress.send_unit_total</code>.
     */
    public final TableField<DeliveryProgressRecord, UInteger> SEND_UNIT_TOTAL = createField(DSL.name("send_unit_total"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>transaction_test.delivery_progress.send_unit_sent</code>.
     */
    public final TableField<DeliveryProgressRecord, UInteger> SEND_UNIT_SENT = createField(DSL.name("send_unit_sent"), org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false).defaultValue(org.jooq.impl.DSL.inline("0", org.jooq.impl.SQLDataType.INTEGERUNSIGNED)), this, "");

    /**
     * The column <code>transaction_test.delivery_progress.created_at</code>.
     */
    public final TableField<DeliveryProgressRecord, LocalDateTime> CREATED_AT = createField(DSL.name("created_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>transaction_test.delivery_progress.updated_at</code>.
     */
    public final TableField<DeliveryProgressRecord, LocalDateTime> UPDATED_AT = createField(DSL.name("updated_at"), org.jooq.impl.SQLDataType.LOCALDATETIME.nullable(false), this, "");

    /**
     * The column <code>transaction_test.delivery_progress.deleted_at</code>.
     */
    public final TableField<DeliveryProgressRecord, LocalDateTime> DELETED_AT = createField(DSL.name("deleted_at"), org.jooq.impl.SQLDataType.LOCALDATETIME, this, "");

    /**
     * Create a <code>transaction_test.delivery_progress</code> table reference
     */
    public DeliveryProgress() {
        this(DSL.name("delivery_progress"), null);
    }

    /**
     * Create an aliased <code>transaction_test.delivery_progress</code> table reference
     */
    public DeliveryProgress(String alias) {
        this(DSL.name(alias), DELIVERY_PROGRESS);
    }

    /**
     * Create an aliased <code>transaction_test.delivery_progress</code> table reference
     */
    public DeliveryProgress(Name alias) {
        this(alias, DELIVERY_PROGRESS);
    }

    private DeliveryProgress(Name alias, Table<DeliveryProgressRecord> aliased) {
        this(alias, aliased, null);
    }

    private DeliveryProgress(Name alias, Table<DeliveryProgressRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> DeliveryProgress(Table<O> child, ForeignKey<O, DeliveryProgressRecord> key) {
        super(child, key, DELIVERY_PROGRESS);
    }

    @Override
    public Schema getSchema() {
        return TransactionTest.TRANSACTION_TEST;
    }

    @Override
    public UniqueKey<DeliveryProgressRecord> getPrimaryKey() {
        return Keys.KEY_DELIVERY_PROGRESS_PRIMARY;
    }

    @Override
    public List<UniqueKey<DeliveryProgressRecord>> getKeys() {
        return Arrays.<UniqueKey<DeliveryProgressRecord>>asList(Keys.KEY_DELIVERY_PROGRESS_PRIMARY);
    }

    @Override
    public DeliveryProgress as(String alias) {
        return new DeliveryProgress(DSL.name(alias), this);
    }

    @Override
    public DeliveryProgress as(Name alias) {
        return new DeliveryProgress(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public DeliveryProgress rename(String name) {
        return new DeliveryProgress(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DeliveryProgress rename(Name name) {
        return new DeliveryProgress(name, null);
    }

    // -------------------------------------------------------------------------
    // Row6 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row6<String, UInteger, UInteger, LocalDateTime, LocalDateTime, LocalDateTime> fieldsRow() {
        return (Row6) super.fieldsRow();
    }
}