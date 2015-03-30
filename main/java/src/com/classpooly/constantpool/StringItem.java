package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 16:27
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class StringItem extends Item<Integer> {

    private Integer value;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.value = stream.readUnsignedShort();
    }

    @Override
    public byte getType() {
        return ITEM_STRING_REF;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
