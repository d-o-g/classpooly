package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 16:26
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class MethodTypeItem extends Item<Integer> {

    private Integer value;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.value = stream.readUnsignedShort();
    }

    @Override
    public byte getType() {
        return ITEM_METHOD_TYPE;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
