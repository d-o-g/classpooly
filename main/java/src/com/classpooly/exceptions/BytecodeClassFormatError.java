package com.classpooly.exceptions;

import java.io.IOException;

/**
 * Project: ClassPooly
 * Date: 30-03-2015
 * Time: 11:55
 * Created by Dogerina.
 * Copyright under GPL license by Dogerina.
 * This exception is to be thrown if a class file has a bad format
 */
public class BytecodeClassFormatError extends IOException {
    public BytecodeClassFormatError(final String msg) {
        super(msg);
    }
}
