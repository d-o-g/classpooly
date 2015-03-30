package com.classpooly.constantpool;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.classpooly.constantpool.Item;
import com.classpooly.constantpool.UTF8Item;

/**
 * Project: ClassPooly
 * Date: 30-03-2015
 * Time: 11:58
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 */
public class ConstantPool {

    public final List<Item> items;

    public ConstantPool(final DataInputStream stream) throws IOException {
        final int size = stream.readUnsignedShort();
        this.items = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            final byte info = (byte) stream.readUnsignedByte();
            final Item item = getItem(info);
            if (item == null)
                continue;
            //throw new InternalError("unknown_item: " + info);
            if (item.getItemType() == Item.ITEM_DOUBLE || item.getItemType() == Item.ITEM_LONG)
                i++; //2w
            item.read(stream); //TODO
            items.add(i, item);
        }
    }
	
	private Item getItem(byte item) {
		switch(item) {
		case Item.ITEM_UTF_8:
			return new UTF8Item();
		}
		return null;
	}

    /*public enum Item {

        UTF8(1) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                System.out.println(stream.readUTF());
            }
        },

        INTEGER(3) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readInt();
            }
        },

        FLOAT(4) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readFloat();
            }
        },

        LONG(5) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readLong();
            }
        },

        DOUBLE(6) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readDouble();
            }
        },

        CLASS(7) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
            }
        },

        STRING(8) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
            }
        },

        FIELDREF(9) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
                stream.readUnsignedShort();
            }
        },

        METHODREF(10) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
                stream.readUnsignedShort();
            }
        },

        INTERFACE_METHODREF(11) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
                stream.readUnsignedShort();
            }
        },

        NAME_AND_TYPE(12) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
                stream.readUnsignedShort();
            }
        },

        METHOD_HANDLE(15) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
                stream.readUnsignedShort();
            }
        },

        METHOD_TYPE(16) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
            }
        },

        INVOKE_DYNAMIC(18) {
            @Override
            public void read(DataInputStream stream) throws IOException {
                stream.readUnsignedShort();
                stream.readUnsignedShort();
            }
        };

        private final int value;

        private Item(final int value) {
            this.value = value;
        }

        private static Item get(final int value) {
            for (final Item attr : values()) {
                if (attr.value != value)
                    continue;
                return attr;
            }
            return null;
        }

        public abstract void read(final DataInputStream stream) throws IOException;
    }*/
}
