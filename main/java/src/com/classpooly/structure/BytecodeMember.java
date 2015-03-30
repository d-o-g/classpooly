package com.classpooly.structure;

import com.classpooly.constantpool.attribute.Attribute;

import java.util.List;

/**
 * Project: ClassPooly
 * Date: 30-03-2015
 * Time: 12:06
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class BytecodeMember {

    public String ownerName, name, desc, key;
    public BytecodeClass owner;
    public int access;
    public List<Attribute> attributes;

}
