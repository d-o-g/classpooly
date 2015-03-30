package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;

public class UTF8Item extends Item<String> {

	private String value;

	@Override
	public void read(DataInputStream stream) throws IOException {
		this.value = stream.readUTF();
	}

	@Override
	public byte getType() {
		return ITEM_UTF_8;
	}

	@Override
	public String getValue() {
		return value;
	}

}
