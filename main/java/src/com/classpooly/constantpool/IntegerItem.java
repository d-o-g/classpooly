package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 13:58
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class IntegerItem extends Item<Integer> {

    private int value;

    @Override
    public void read(DataInputStream stream) throws IOException {
        value = stream.readInt();
    }

    @Override
    public byte getType() {
        return ITEM_INTEGER;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
