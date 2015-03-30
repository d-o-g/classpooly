package com.classpooly;

import com.classpooly.exceptions.BytecodeClassFormatError;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project: ClassPooly
 * Date: 30-03-2015
 * Time: 11:53
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class BytecodeClass {

    public List<BytecodeField> fields;
    public int minorVersion;
    public int majorVersion;
    public int access;
    public ConstantPool constantPool;

    public BytecodeClass(final DataInputStream stream) throws IOException {
        final int magic = stream.readInt();
        if (magic != 0xCAFEBABE)
            throw new BytecodeClassFormatError("Invalid format.");
        this.minorVersion       =  stream.readUnsignedShort(); //the minor version of this class
        this.majorVersion       =  stream.readUnsignedShort(); //the major version of this class
        this.constantPool       =    new ConstantPool(stream); //the constant pool of this class
        this.access             =  stream.readUnsignedShort(); //the access permission flags of this class
        final int thisClass     =  stream.readUnsignedShort(); //the classfile index
        final int superClass    =  stream.readUnsignedShort(); //the superclass index
        final int implCount     =  stream.readUnsignedShort(); //interface count
        final int[] interfaces  =          new int[implCount]; //the interface indices
        final int fieldCount    =  stream.readUnsignedShort();
        this.fields             = new ArrayList<>(fieldCount);
        for (int i = 0; i < fieldCount; i++)
            this.fields.add(new BytecodeField(stream));
        final int methodCount   =  stream.readUnsignedShort();
    }
}
