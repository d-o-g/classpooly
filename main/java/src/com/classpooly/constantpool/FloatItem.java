package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 14:00
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class FloatItem extends Item<Float> {

    private float value;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.value = stream.readFloat();
    }

    @Override
    public byte getItemType() {
        return ITEM_FLOAT;
    }

    @Override
    public Float getValue() {
        return value;
    }
}
