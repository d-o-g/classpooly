package com.classpooly.classpool;

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

    public int value;

    @Override
    public void read(DataInputStream stream) throws IOException {

    }

    @Override
    public byte getItemType() {
        return ITEM_INTEGER;
    }

    @Override
    public Integer getValue() {
        return value;
    }
}
