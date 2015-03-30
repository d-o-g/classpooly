package com.classpooly;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Project: ClassPooly
 * Date: 30-03-2015
 * Time: 12:03
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class BytecodeField extends BytecodeMember {

    public BytecodeField(final DataInputStream stream) throws IOException {
        super.access             =      stream.readUnsignedShort();
        final int name           =      stream.readUnsignedShort();
        final int desc           =      stream.readUnsignedShort();
        final int attributeCount =      stream.readUnsignedShort();
        super.attributes         = new ArrayList<>(attributeCount);
        for (int i = 0; i < attributeCount; i++)
            super.attributes.add(new Attribute(stream));
    }
}
