package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 16:40
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class NameAndTypeItem extends Item<String> {

    private int nameIndex;
    private int typeIndex;

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.nameIndex = stream.readUnsignedShort();
        this.typeIndex = stream.readUnsignedShort();
    }

    @Override
    public byte getType() {
        return ITEM_NAME_TYPE_REF;
    }

    @Override
    public String getValue() {
        return null;
    }
}
