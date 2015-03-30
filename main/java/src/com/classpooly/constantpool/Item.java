package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

public abstract class Item<T> {

	public static final byte ITEM_UTF_8         =  0x1;
	public static final byte ITEM_INTEGER       =  0x3;
	public static final byte ITEM_FLOAT         =  0x4;
	public static final byte ITEM_LONG          =  0x5;
	public static final byte ITEM_DOUBLE        =  0x6;
	public static final byte ITEM_CLASS_REF     =  0x7;
	public static final byte ITEM_STRING_REF    =  0x8;
	public static final byte ITEM_FIELD_REF     =  0x9;
	public static final byte ITEM_METHOD_REF    =  0xA;
	public static final byte ITEM_INTERFACE_REF =  0xB;
	public static final byte ITEM_NAME_TYPE_REF =  0xC;
	public static final byte ITEM_METHOD_HANDLE =  0xF;
	public static final byte ITEM_METHOD_TYPE   = 0x10;
	public static final byte ITEM_INVOKEDYNAMIC = 0x12;
	
	public abstract void read(DataInputStream stream) throws IOException;
	
	public abstract byte getType();

	public abstract T getValue();
}
