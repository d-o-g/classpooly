package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 14:01
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class LongItem extends Item<Long> {

    private long value;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.value = stream.readLong();
    }

    @Override
    public byte getItemType() {
        return ITEM_LONG;
    }

    @Override
    public Long getValue() {
        return value;
    }
}
