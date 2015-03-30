package com.classpooly.constantpool.attribute;

import java.io.DataInputStream;
import java.io.IOException;

/**
 * Project: classpooly
 * Date: 30-03-2015
 * Time: 18:16
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class ExceptionAttribute extends Attribute {

    public int start, end, handlder, type;

    public ExceptionAttribute(DataInputStream stream) throws IOException {
        super(stream);
    }

    @Override
    public void read(DataInputStream stream) throws IOException {
        this.start    = stream.readUnsignedShort();
        this.end      = stream.readUnsignedShort();
        this.handlder = stream.readUnsignedShort();
        this.type     = stream.readUnsignedShort();
    }

    @Override
    public String getName() {
        return ATTRIBUTE_EXCEPTIONS;
    }
}
