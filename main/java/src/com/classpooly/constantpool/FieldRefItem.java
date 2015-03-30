package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 16:42
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class FieldRefItem extends Item<String> {

    private int nameIndex;
    private int descIndex;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.nameIndex = stream.readUnsignedShort();
        this.descIndex = stream.readUnsignedShort();
    }

    @Override
    public byte getType() {
        return ITEM_FIELD_REF;
    }

    @Override
    public String getValue() {
        return null;
    }
}
