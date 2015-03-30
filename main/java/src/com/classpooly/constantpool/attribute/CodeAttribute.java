package com.classpooly.constantpool.attribute;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 18:14
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class CodeAttribute extends Attribute {

    public int stack, locals;
    public byte[] code;
    public ExceptionAttribute[] exceptionTable;

    public CodeAttribute(DataInputStream stream) throws IOException {
        super(stream);
    }

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.stack          = stream.readUnsignedShort();
        this.locals         = stream.readUnsignedShort();
        this.code           = new byte[stream.readInt()];
        stream.readFully(code);
        this.exceptionTable = new ExceptionAttribute[stream.readUnsignedShort()];
        for (int i = 0; i < exceptionTable.length; i++) {
            final ExceptionAttribute attr = new ExceptionAttribute(stream);
            attr.read(stream);
            exceptionTable[i] = attr;
        }
    }

    @Override
    public String getName() {
        return ATTRIBUTE_CODE;
    }
}
