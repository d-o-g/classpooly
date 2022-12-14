package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 14:02
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class DoubleItem extends Item<Double> {

    private double value;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.value = stream.readDouble();
    }

    @Override
    public byte getType() {
        return ITEM_LONG;
    }

    @Override
    public Double getValue() {
        return value;
    }
}
