package com.classpooly;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.List;

/**
 * Project: ClassPooly
 * Date: 30-03-2015
 * Time: 12:06
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class BytecodeMember {

    public String owner, name, desc, key;
    public int access;
    public List<Attribute> attributes;

    public class Attribute {

        public int name;

        public Attribute(final DataInputStream stream) throws IOException {
            this.name = stream.readUnsignedShort();
        }
    }
}
