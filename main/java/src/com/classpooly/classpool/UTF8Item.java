package com.classpooly.classpool;

import java.io.DataInputStream;
import java.io.IOException;

public class UTF8Item extends Item<String> {

	private String value;

	@Override
	public void read(DataInputStream stream) throws IOException {
		this.value = stream.readUTF();
	}

	@Override
	public byte getItemType() {
		return ITEM_UTF_8;
	}

	@Override
	public String getValue() {
		return value;
	}

}
